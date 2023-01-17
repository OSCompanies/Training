//
//  ViewController.swift
//  ButtonTutorial
//
//  Created by 양진호 on 2022/01/12.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet var FirstBtn: UIButton!
    @IBOutlet var SecondBtn: UIButton!
    @IBOutlet var Text: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func ActionBtn(_ sender: Any) {
        print("왼쪽버튼눌림")
        Text.text = "왼쪽"
    }
    @IBAction func ActionSBtn(_ sender: Any) {
        print("오른쪽버튼눌림")
        Text.text = "오른쪽"
    }
    
}

