//
//  popViewController.swift
//  popup
//
//  Created by 김보람 on 2021/04/15.
//

import UIKit

class popViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }
    
    @IBAction func closeBtn(_ sender: Any) {
        dismiss(animated: false, completion: nil)
    }
    
    @IBAction func btn1(_ sender: Any) {
        dismiss(animated: false, completion: nil)
    }
    
    @IBAction func btn2(_ sender: Any) {
        dismiss(animated: false, completion: nil)
    }
    
    
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
