//
//  ViewController.swift
//  notificationCall
//
//  Created by 김보람 on 2021/04/12.
//

import UIKit

class ViewController: UIViewController {
    
    public var moveVC : CallViewController?

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    // 호출할 함수
    public func call(){
        print("Call!")
    }


    @IBAction func btn(_ sender: Any) {
        let storyborad = UIStoryboard(name: "Main", bundle: nil)
        moveVC = storyboard?.instantiateViewController(withIdentifier: "call") as! CallViewController
        moveVC!.modalPresentationStyle = .fullScreen
        moveVC?.topVC = self
        self.present(moveVC!, animated: true, completion: nil)
    }
}

