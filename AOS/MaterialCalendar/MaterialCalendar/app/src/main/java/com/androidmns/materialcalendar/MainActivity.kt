package com.androidmns.materialcalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import com.prolificinteractive.materialcalendarview.format.TitleFormatter
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendar()
    }

    fun calendar(){
        val materialCalendar : MaterialCalendarView = findViewById(R.id.calendar)

        var startTimeCalendar = Calendar.getInstance()
        var endTimeCalendar = Calendar.getInstance()

        val currentYear = startTimeCalendar.get(Calendar.YEAR)
        val currentMonth = startTimeCalendar.get(Calendar.MONTH)
        val currentDay = startTimeCalendar.get(Calendar.DATE)

        // 달력 설정
        materialCalendar.state().edit()
            .setFirstDayOfWeek(Calendar.SUNDAY) // 일 월 화 수 목 금 토
            .setMaximumDate(CalendarDay.from(currentYear, currentMonth, 31))
            .commit()

        // 최대 날짜 설정
        val enCalendarDay = CalendarDay(
                endTimeCalendar.get(Calendar.YEAR),
                endTimeCalendar.get(Calendar.MONTH),
                endTimeCalendar.get(Calendar.DATE)
        )


        val maxDecorator = MaxDecorator(enCalendarDay)
        val saturdayDecorator = SaturdayDecorator()
        val sundayDecorator = SundayDecorator()


       materialCalendar.addDecorators(
               saturdayDecorator, // 토요일
               sundayDecorator, // 일요일
               maxDecorator //최대날

       )

        // 딜략에서 선택한 날 Toast
        materialCalendar.setOnDateChangedListener { widget, date, selected ->
            var year = date.year.toString()
            var month = (date.month+1).toString()
            var date = date.day.toString()

            if (month.toInt() < 10) {
                month = "0$month"
            }
            if (date.toInt()  < 10) {
                date = "0$date"
            }

            var selectDayMsg : String = year + "년" + month + "월" + date + "일"

            runOnUiThread {
                Toast.makeText(this, selectDayMsg, Toast.LENGTH_SHORT).show()
            }
        }

        // 처음 달력 title format
        materialCalendar.setTitleFormatter(TitleFormatter {
            val simpleDateFormat = SimpleDateFormat("yyyy년 MM월", Locale.KOREA)
            simpleDateFormat.format(startTimeCalendar.time)
        })

        // 달력 넘길때 format
        materialCalendar.setOnMonthChangedListener { widget, date ->
            materialCalendar.setTitleFormatter(TitleFormatter {
                val simpleDateFormat = SimpleDateFormat("yyyy년 MM월", Locale.KOREA)
                simpleDateFormat.format(date.date)
            })

        }








    }


}