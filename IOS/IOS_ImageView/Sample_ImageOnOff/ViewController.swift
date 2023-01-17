//
//  ViewController.swift
//  Sample_ImageOnOff
//
//  Created by ssemm on 2022/01/12.
//

// 이미지 Images 폴더 생성 후 이미지 넣기
// Main.storyboard에서 ImageView 

import UIKit

class ViewController: UIViewController {
    
    // 이미지뷰 연결
    @IBOutlet var imgView: UIImageView!
    
    // 변수 선언
    // type : UIImage
    var imgOn : UIImage? // 켜진 전구 이미지
    var imgOff : UIImage? // 꺼진 전구 이미지
    var isZoom = false // 이미지 확대 여부
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        // 초기 화면 기본 세팅
        // 1. 이미지 파일 연결(전구)
        imgOn = UIImage(named: "lamp_on.png")
        imgOff = UIImage(named: "lamp_off.png")
        
        // imageView에 image할당
        imgView.image = imgOff
    }
    
    // 전구 확대 스위치
    @IBAction func switchResizeImage(_ sender: UISwitch) {
        // 이미지 크기를 1.5배
        let scale : CGFloat = 1.5
        var newWidth : CGFloat
        var newHeight : CGFloat
        
        switch sender.isOn{ // switch가 on인지 off인지 sender가 알고 있음.
        case true:          // 확대를 해야하는 경우
            // 현재 이미지 뷰 크기에서 width를 scale만큼 곱해주자
            newWidth = imgView.frame.width * scale
            newHeight = imgView.frame.height * scale
            
        default:
            // 현재 이미지 뷰 크기에서 width를 scale만큼 나눠주자
            newWidth = imgView.frame.width / scale
            newHeight = imgView.frame.height / scale
        }
        // 이미지 뷰 크기 세팅
        imgView.frame.size = CGSize(width: newWidth, height: newHeight)
        // isZoom의 상태가 true일때, (초기값이 false)
        isZoom = !isZoom
    }
    
    // 전구 on, off 스위치
    @IBAction func switchImageOnOff(_ sender: UISwitch) {
        // switch가 on인지 off인지 sender가 알고 있음.
        switch sender.isOn{
        case true:
            imgView.image = imgOn
        default:
            imgView.image = imgOff
        }
    }
    

}

