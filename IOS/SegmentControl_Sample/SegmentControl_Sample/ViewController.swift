//
//  ViewController.swift
//  SegmentControl_Sample
//
//  Created by 양진호 on 2022/01/25.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var SegementControl: UISegmentedControl!
    @IBOutlet weak var ImageView: UIImageView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    override func viewWillAppear(_ animated: Bool) {
        self.ImageView.image = UIImage(named: "warren-wong-bh4LQHcOcxE")
    }
    
    @IBAction func ClickedSement(_ sender: UISegmentedControl) {
        
        switch SegementControl.selectedSegmentIndex {
        case 0 :
            self.ImageView.image = UIImage(named: "warren-wong-bh4LQHcOcxE")
        case 1 :
            self.ImageView.image = UIImage(named: "taylor-kopel-WX4i1Jq_o0Y")
        case 2 :
            self.ImageView.image = UIImage(named: "alvan-nee-ZCHj_2lJP00")
        default:
            self.ImageView.image = UIImage(named: "warren-wong-bh4LQHcOcxE")
        }
    }
    
}

