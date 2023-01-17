[ 스피너 사용하기 ]

Spinner 객체를 사용해서 레이아웃에 스피너를 추기한다. XML레이아웃에서 <Spinner>요소를 사용한다. [activity_main.xml]
    
    <Spinner
        android:id="@+id/planets_spinner"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

선택 항목 목록으로 스피너를 채우려면 Activity 또는 Fragment 소스코드에 SpinnerAdapter를 지정해야 한다.

    * Spinner
    * SpinnerAdapter
    * AdapterView.OnItemSelectedListener

문자열 리소스 파일에 문자열 배열을 사용하여 스피너 선택항목을 만든다. [res/values/strings.xml]

    <resources>
        <string-array name="planets_array">
            <item>Mercury</item>
            <item>Venus</item>
            <item>Earth</item>
            <item>Mars</item>
            <item>Jupiter</item>
            <item>Saturn</item>
            <item>Uranus</item>
            <item>Neptune</item>
        </string-array>
    </resources>

Activity 또는 Fragment에 ArrayAdapter를 사용하여 스피너에 배열을 결합한다. [MainActivity]

    val spinner = findViewById<Spinner>(R.id.planets_spinner)

    ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item)
        .also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
    }

스피너 선택 응답 만들기

    val textVew = findViewById<TextView>(R.id.mTextView)

    spinner.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener {
        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            textVew.text = "선택된 행성은\n ${spinner.getItemAtPosition(position)} 입니다."
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
        }
    }