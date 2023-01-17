//
//  SecondViewController.swift
//  ChangeView_Sample
//
//  Created by 양진호 on 2022/01/13.
//

import Foundation


import UIKit

class SecondViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func ActionBtn(_ sender: Any) {
        
        // 현재 모달뷰로 올라왔기 때문에 dissmiss라는 메소드를 사용해 올라온 창을 닫아줍니다.
        dismiss(animated: false, completion: nil)
        print("화면 닫기")
    }
    
}

