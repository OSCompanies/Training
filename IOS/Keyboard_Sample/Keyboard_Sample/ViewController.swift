//
//  ViewController.swift
//  Keyboard_Sample
//
//  Created by 양진호 on 2022/01/20.
//

import UIKit

class ViewController: UIViewController {

    
    // 텍스트필드 선택시 저절로 키보드가 올라갑니다.
    @IBOutlet weak var textfield: UITextField!
    @IBOutlet weak var Btn: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
    }
    
//
//    override func touchesBegan(_ touches: Set<UITouch>, with event: UIEvent?) {
//         self.view.endEditing(true)
//    }

    // NotificationCenter로 감지했을때 수행되는 함수
    @objc func keyboardWillShow(notification : NSNotification) {
        print("-----> keyboardWillShow() 호출(키보드 올라가요)")
    }
    
    // NotificationCenter로 감지했을때 수행되는 함수
    @objc func keyboardWillHide(notification : NSNotification) {
        print("-----> keyboardWillHide() 호출(키보드 내려가유)")
        
    }
    
    // 뷰가 화면에 표시되기 전에 수행됨
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(animated)
        // 키보드가 올라갔다는 것을 감지할 수 있음.
        NotificationCenter.default.addObserver(self, selector: #selector(keyboardWillShow(notification:)), name: UIResponder.keyboardWillShowNotification, object: nil)
        NotificationCenter.default.addObserver(self, selector: #selector(keyboardWillHide(notification:)), name: UIResponder.keyboardWillHideNotification, object: nil)
    }
    
    // 뷰가 화면에 표시되고 추가적인 작업을할 때 수행됨
    override func viewWillDisappear(_ animated: Bool) {
        super.viewWillDisappear(animated)
        //Notification 제거
        NotificationCenter.default.removeObserver(self, name: UIResponder.keyboardWillShowNotification, object: nil)
        NotificationCenter.default.removeObserver(self, name: UIResponder.keyboardWillHideNotification, object: nil)
    }

    @IBAction func focusingField(_ sender: Any) {
        
        // 버튼을 누르면 텍스트필드에 포커싱이 가게 됩니다.
        self.textfield.becomeFirstResponder()
    }
    
    @IBAction func regionField(_ sender: Any) {
        self.textfield.resignFirstResponder()
    }
}

