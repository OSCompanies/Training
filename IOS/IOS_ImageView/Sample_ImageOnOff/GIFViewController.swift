//
//  GIFViewController.swift
//  Sample_ImageOnOff
//
//  Created by ssemm on 2022/01/12.
//

import UIKit
import Gifu // 설치한 라이브러리 import

class GIFViewController: UIViewController {
    
    // 화면을 스토리 보드로 만드는 경우 - ImageViwe를 선택하여 CustomClass에 Class추가
    // 코드로 만드는 경우 - EX) let gifImageView = GIFImageView(frame: CGRect(x:0, y: 0, width: 200, heigth:200))
    
    @IBOutlet var gifImageView: GIFImageView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
    }
    
    override func viewWillAppear(_ animated: Bool) {
        gifImageView.animate(withGIFNamed: "Tyranno")   // 사용할 GIF 파일 이름을 넣어줌
    }
    
    // GO 버튼
    @IBAction func btnGo(_ sender: UIButton) {
        gifImageView.startAnimatingGIF() // 이미지 다시 시작
    }
    
    @IBAction func btnStop(_ sender: UIButton) {
        gifImageView.stopAnimatingGIF() // 이미지 멈추기
    }
    
    // 뒤로가기 버튼
    @IBAction func btnBack(_ sender: UIButton) {
        
        // 코드로 화면 전환
        let vc = self.storyboard?.instantiateViewController(withIdentifier: "SelectViewController")
        
        vc?.modalPresentationStyle = .fullScreen
        self.present(vc!, animated: false, completion: nil)
    }

}
