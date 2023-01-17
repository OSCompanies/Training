//
//  ViewController.swift
//  popup
//
//  Created by 김보람 on 2021/04/15.
//

import UIKit

class ViewController: UIViewController {

    
    let moveStoryBoard: UIStoryboard = UIStoryboard(name: "Main", bundle: nil)
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func btn(_ sender: Any) {
        let showPopUp = moveStoryBoard.instantiateViewController(withIdentifier: "pop")
        self.show(showPopUp, sender: self)
    }
    
}

