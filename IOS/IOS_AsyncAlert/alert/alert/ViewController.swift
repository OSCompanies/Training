//
//  ViewController.swift
//  alert
//
//  Created by on 2021/04/19.
//

import UIKit

class ViewController: UIViewController {
    
    //시간 관련
    let timeSelector: Selector = #selector(ViewController.updateTime)
    let interval = 1.0 // 시간 1초
    var selectTime = ""

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        Timer.scheduledTimer(timeInterval: interval, target: self, selector: timeSelector, userInfo: nil, repeats: true)
    }

    @IBOutlet weak var lblNowTime: UILabel! // 현재시간
    @IBOutlet weak var lblAlertTime: UILabel! //알람시간
    
    
    @IBAction func datePicker(_ sender: UIDatePicker) {
        let datePickerView = sender
        let formatter = DateFormatter()
        
        formatter.locale = Locale(identifier: "ko")
        formatter.dateFormat = "yyyy-MM-dd EEE a hh:mm"
        lblAlertTime.text = "선택시간 : \(formatter.string(from: datePickerView.date))"
        selectTime = formatter.string(from: datePickerView.date)
        
    }
    
    
    // Async Task 1초당 1번씩 구동
    @objc func updateTime(){
        let date = NSDate()
        let formatter = DateFormatter()
        
        formatter.locale = Locale(identifier: "ko")
        formatter.dateFormat = "yyyy-MM-dd EEE a hh:mm" // 년도-월-일 요일 오전/오후 시간:분
        
        lblNowTime.text = " 현재시간 : \(formatter.string(from: date as Date))"
        
        let currentTime = formatter.string(from: date as Date)
        if selectTime == currentTime{
            let alert = UIAlertController(title: "알림", message: "설정한 시간입니다", preferredStyle: UIAlertController.Style.alert)
            let alertAction = UIAlertAction(title: "네", style: UIAlertAction.Style.default, handler: {ACTION in
                self.selectTime = ""
            })
            alert.addAction(alertAction)
            present(alert, animated: true, completion: nil)
        }
        
    }
}

