//
//  ViewController.swift
//  BasicObjectTutorial
//
//  Created by 양진호 on 2022/01/12.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet var Text: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        Text.text = "텍스트 변경후"
    }


}

