//
//  ViewController.swift
//  MultiLayout_Sample
//
//  Created by 양진호 on 2022/01/14.
//

import UIKit

class ViewController: UIViewController {

    
    // <-------------- ViewDidLoad 밖에서 선언하는 방법 ----------->
    //클로저로 뷰 설정하기
    
    var mySecondView : UIView = {
        
        let view = UIView()
        //백그라운드 컬러 설정
        view.backgroundColor = #colorLiteral(red: 0.2196078449, green: 0.007843137719, blue: 0.8549019694, alpha: 1)
        //코너 Radius 설정
        view.layer.cornerRadius = 16
        // 코드로 오토레이아웃 작성시 해당 코드 필수 입력
        view.translatesAutoresizingMaskIntoConstraints = false
        // 코드로 오토레이아웃 Radius 작성시 해당 코드 필수 입력
        view.clipsToBounds = true
        return view
    }()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
        
        // <-------------- ViewDidLoad 안에서 선언하는 방법 ----------->
        // 여기서 인스턴스를 만들어줍니다.
        let myFirstView = UIView()
        myFirstView.translatesAutoresizingMaskIntoConstraints = false
        // 해당 뷰 백그라운드 컬러 설정
        myFirstView.backgroundColor = .systemPink
        myFirstView.layer.cornerRadius = 16
        // 첫번째 뷰 위에 뷰를 하나 추가 하겠다는 뜻
        self.view.addSubview(myFirstView)
        
        //가장 중요한 x축, y축, 가로, 세로를 넣어주어야 합니다.
        
        // X축 설정 완료
        myFirstView.centerXAnchor.constraint(equalTo: self.view.centerXAnchor).isActive = true
        // Y축 top 설정 완료
        myFirstView.topAnchor.constraint(equalTo: self.view.topAnchor, constant: 100).isActive = true
        
        //뷰의 가로세로 크기 제공
        myFirstView.widthAnchor.constraint(equalToConstant: 200).isActive = true
        myFirstView.heightAnchor.constraint(equalToConstant: 200).isActive = true
        
        // ---------------> mySecondView X축 Y축 가로 세로 설정
        self.view.addSubview(mySecondView)
        mySecondView.leadingAnchor.constraint(equalTo: myFirstView.leadingAnchor, constant: 0).isActive = true
        mySecondView.topAnchor.constraint(equalTo: myFirstView.bottomAnchor, constant: 10).isActive = true
        mySecondView.widthAnchor.constraint(equalToConstant: 100).isActive = true
        mySecondView.heightAnchor.constraint(equalToConstant: 100).isActive = true
        
    }


}

