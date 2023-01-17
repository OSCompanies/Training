//
//  ViewController.swift
//  Sample_ChangeView
//
//  Created by ssemm on 2022/01/17.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }
    
    // segue를 사용한 화면 전환은 스토리보드에서 버튼을 연결하여 이동할 화면에 연결시켜주면 된다.

    // Modal View
    @IBAction func btnMoveModal(_ sender: UIButton) {
        
        // 이동할 스토리보드 ID를 넣어 코드를 작성해줌
        let VC = self.storyboard?.instantiateViewController(identifier: "ModalVC")
        VC?.modalTransitionStyle = .coverVertical
        VC?.modalPresentationStyle = .automatic // 꽉찬 화면을 사용하려면 .fullScreen을 하면 된다
        self.present(VC!, animated: true, completion: nil)
    }
    
    // Navigation View
    @IBAction func btnMoveNavi(_ sender: UIButton) {
        let pushVC = self.storyboard?.instantiateViewController(withIdentifier: "navPush")
        self.navigationController?.pushViewController(pushVC!, animated: true)
    }
    
}

