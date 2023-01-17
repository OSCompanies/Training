//
//  ViewController.swift
//  LayoutGuide_Sample
//
//  Created by 양진호 on 2022/01/17.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet var FIrstBtn: UIButton!
    @IBOutlet var SecondBtn: UIButton!
    @IBOutlet var ThridBtn: UIButton!
    @IBOutlet var ChangeBtn: UIButton!
    @IBOutlet var ColorChangeView: UIView!
    
    
    let Color = [#colorLiteral(red: 0.1769416027, green: 1, blue: 0.0686865787, alpha: 0.8470588235),#colorLiteral(red: 0.6855864471, green: 1, blue: 0.03142752471, alpha: 0.8470588235),#colorLiteral(red: 1, green: 0.9800712101, blue: 0.04824662957, alpha: 0.8470588235),#colorLiteral(red: 1, green: 0.6802081871, blue: 0.005758808627, alpha: 0.8470588235),#colorLiteral(red: 1, green: 0.09577606928, blue: 0.05253324221, alpha: 0.8470588235),#colorLiteral(red: 1, green: 0.1730875125, blue: 0.7548298212, alpha: 0.8470588235),#colorLiteral(red: 0.7212736288, green: 0.3160349653, blue: 1, alpha: 0.8470588235),#colorLiteral(red: 0.174187793, green: 0.3153232491, blue: 1, alpha: 0.8470588235)]
    var index = 0
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        // 해당 인스턴스 메소드 호출 (FirstBtn, SecondBtn 버튼 누를때 마다 해당 함수 호출)
        FIrstBtn.addTarget(self, action: #selector(Action), for: .touchUpInside)
        SecondBtn.addTarget(self, action: #selector(secondAction), for: .touchUpInside)
        
    }
    
    override func viewWillAppear(_ animated: Bool) {
        // 레이아웃 함수 호출 viewDidLoad되기 전에 수행
        LayoutGuide()
    }

    // 버튼 레이아웃
    func LayoutGuide() {
        
        // 버튼 백그라운드 컬러 설정
        FIrstBtn.backgroundColor = .blue
        SecondBtn.backgroundColor = .red
        ThridBtn.backgroundColor = .yellow
        
        // 버튼 텍스트 컬러 설정
        FIrstBtn.tintColor = .red
        SecondBtn.tintColor = .white
        ThridBtn.tintColor = .blue
        
        // 버튼 모서리 둥글게 만들기
        FIrstBtn.layer.cornerRadius = 30
        SecondBtn.layer.cornerRadius = 20
        ThridBtn.layer.cornerRadius = 10
        ColorChangeView.layer.cornerRadius = 10
        
    }
    
    // 첫번째 버튼이 눌렸을 때 두번째 버튼 활성화 시키기
    @objc func Action() {
        if(FIrstBtn.isTouchInside){
            SecondBtn.isEnabled = true
            SecondBtn.backgroundColor = .black
        }
    }
    
    // 두번째 버튼이 눌렸을 때 세번째 버튼 활성화 시키기
    @objc func secondAction() {
        if(SecondBtn.isTouchInside){
            ThridBtn.isEnabled = true
            ThridBtn.backgroundColor = .black
        }
    }
    
    // 버튼 눌림 로고 찍기
    @IBAction func FirstBtnAction(_ sender: Any) {
        print("첫번째 버튼이 눌렸습니다.")
    }
    @IBAction func SecondBtnAction(_ sender: Any) {
        print("두번쨰 버튼이 눌렸습니다.")
    }
    @IBAction func ThridBtnAction(_ sender: Any) {
        print("세번째 버튼이 눌렸습니다.")
    }
    
    // 버튼이 눌릴 때 마다 배열의 값을 가지고 View 색상 변경하기
    @IBAction func ActionViewChange(_ sender: Any) {
        
        ColorChangeView.backgroundColor = Color[index]
        if(index == Color.count - 1){
            index = 0
        } else {
            index += 1
        }
    }
    
    
    
}

