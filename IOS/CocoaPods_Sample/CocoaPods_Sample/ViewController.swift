//
//  ViewController.swift
//  CocoaPods_Sample
//
//  Created by 양진호 on 2022/01/19.
//

import UIKit
import Lottie

class ViewController: UIViewController {

    
    //애니메이션 뷰 객체 생성
    let animationView : AnimationView = {
        
        let animationview = AnimationView(name: "data")
        animationview.frame = CGRect(x: 0, y: 0, width: 400, height: 400)
        animationview.contentMode = .scaleAspectFill
        return animationview
        
    }()
    
    //Label 객체 생성
    let titleLabel : UILabel = {
        
        let title = UILabel()
        title.text = "안녕하세요"
        title.textAlignment = .center
        return title
    }()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        view.addSubview(animationView)
        animationView.center = view.center
        
        // 동기 처리
        // 애니메이션 뷰가 작동되고 해당 기능이 처리되고 난 후에 titleLabel이 표시될 수 있게 함.
        animationView.play{ (finish) in
            self.animationView.removeFromSuperview()
            self.view.addSubview(self.titleLabel)
            self.titleLabel.translatesAutoresizingMaskIntoConstraints = false
            self.titleLabel.centerXAnchor.constraint(equalTo: self.view.centerXAnchor).isActive = true
            self.titleLabel.centerYAnchor.constraint(equalTo: self.view.centerYAnchor).isActive = true
        }
        
        
    }


}

