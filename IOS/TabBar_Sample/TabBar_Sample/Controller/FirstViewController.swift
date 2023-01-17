//
//  FirstViewController.swift
//  TabBar_Sample
//
//  Created by 양진호 on 2022/01/18.
//

import UIKit

class FirstViewController: UIViewController {
    
    //MARK: - TextLabel
    //Label 객체 생성
    var titleLabel : UILabel = {
        let label = UILabel()
        label.text = "메인화면 입니다."
        label.textColor = .black
        label.font = UIFont.boldSystemFont(ofSize: 30)
        label.textAlignment = .center
        return label
    }()
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        //MARK: -Label addSubview
        
        // 해당 객체를 뷰위에 얹기 위해서는 addSubview <- 필수
        self.view.addSubview(titleLabel)
        self.titleLabel.translatesAutoresizingMaskIntoConstraints = false
        self.titleLabel.centerXAnchor.constraint(equalTo: self.view.centerXAnchor).isActive = true
        self.titleLabel.centerYAnchor.constraint(equalTo: self.view.centerYAnchor).isActive = true
        
        
        // 뷰 컬러 변경하기
        self.view.backgroundColor = .red
    }
    

}
