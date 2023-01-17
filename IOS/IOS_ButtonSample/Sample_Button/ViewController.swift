//
//  ViewController.swift
//  Sample_Button
//
//  Created by ssemm on 2022/01/20.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet var lbText: UILabel!
    @IBOutlet var ButtonColor: UIButton!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func btnLabelChange(_ sender: UIButton) {
        self.lbText.text = "Button 사용법"
    }
    
    @IBAction func btnLabelColor(_ sender: UIButton) {
        self.lbText.textColor = UIColor.red
    }
    
    @IBAction func btnColor(_ sender: UIButton) {
        self.ButtonColor.backgroundColor = UIColor.yellow
        self.ButtonColor.tintColor = UIColor.black
    }
    
}

