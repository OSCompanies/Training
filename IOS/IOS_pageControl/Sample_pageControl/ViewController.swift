//
//  ViewController.swift
//  Sample_pageControl
//
//  Created by ssemm on 2022/01/18.
//

// PageControl 사용하기
// ** 1,2번은 Main.storyboard에서 작업
// ** 3,7번은 Main.storyboard에서 Class로 연결 작업

// 1. Main.storyboard에서 ViewController에 UIImageView를 추가
// 2. Page Control 추가
// 3. Object를 추가한 ViewController와 연결된 Class에 Oulet 변수 선언(UIImageView, UIPageControl) (21-22Line)
// 4. Images 폴더를 생성하여 사용할 이미지 추가
// 5. 이미지를 변수에 넣어줌 (24Line)
// 6. pageControl의 속성은 아래 주석 참고(28-31Line)
// 7. Main.storyboard에서 PageControl를 Action 연결하여 PageControl을 눌렀을 때 발생될 이벤트를 작성(36Line)

import UIKit

class ViewController: UIViewController {

    @IBOutlet var imgView: UIImageView!
    @IBOutlet var pageControl: UIPageControl!
    
    var images = ["lamp_off.png","lamp_on.png","lamp_pink.png"]
    
    override func viewDidLoad() {
        super.viewDidLoad()
        pageControl.numberOfPages = images.count    // 총 페이지
        pageControl.currentPage = 0                 // 0번 페이지 이미지 출력
        pageControl.pageIndicatorTintColor = UIColor.systemYellow  // 페이지 color
        pageControl.currentPageIndicatorTintColor = UIColor.systemBlue  // 현재 페이지 color
        
        imgView.image = UIImage(named: images[0]) // 실행 시 띄울 이미지
    }

    @IBAction func pageChange(_ sender: UIPageControl) {
        // pagecontrol이 어디를 누르는지 알고있어서 왼쪽 오른쪽 체크 안해도된다.
        imgView.image = UIImage(named: images[pageControl.currentPage])
    }
    
}

