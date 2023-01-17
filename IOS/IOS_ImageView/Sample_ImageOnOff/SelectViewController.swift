//
//  SelectViewController.swift
//  Sample_ImageOnOff
//
//  Created by ssemm on 2022/01/12.
//
// 버튼 선택 페이지
// 전구 이미지 버튼은 segue로 연결

import UIKit

class SelectViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

    }
    
    // GIF 버튼
    @IBAction func btnGIF(_ sender: UIButton) {
        
        // 코드를 사용하여 화면전환
        let vc = self.storyboard?.instantiateViewController(withIdentifier: "GIFViewController")
        
        vc?.modalPresentationStyle = .fullScreen
        self.present(vc!, animated: true, completion: nil)

    }
    
}
