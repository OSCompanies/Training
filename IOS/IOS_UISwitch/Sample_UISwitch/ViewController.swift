//
//  ViewController.swift
//  Sample_UISwitch
//
//  Created by ssemm on 2022/01/21.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet var lbText: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        self.lbText.text = "Switch 사용법"
    }
    
    @IBAction func swLabelChange(_ sender: UISwitch) {
        switch sender.isOn{
        case true :
            self.lbText.text = "Switch 켜짐"
        default :
            self.lbText.text = "Switch 꺼짐"
        }
    }
    
    
}

