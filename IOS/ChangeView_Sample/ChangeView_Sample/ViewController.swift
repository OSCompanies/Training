//
//  ViewController.swift
//  ChangeView_Sample
//
//  Created by 양진호 on 2022/01/13.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    // 버튼이 눌리면 해당 메소드 실행됨
    @IBAction func Actionbtn(_ sender: Any) {
        
        // sb 변수에 스토리보드를 가져옵니다.
        let sb = UIStoryboard(name: "Main", bundle: nil) // 이동하고싶은 ViewController가 있는 스토리보드 이름을 가져오면 됩니다.
        
        // 이동되는 스토리보드의 ViewController의 withIdentifier를 가져옵니다.
        let vc2 = sb.instantiateViewController(withIdentifier: "SecondViewController") as! SecondViewController
        
        // 이동이 되었을 때 model View의 Style을 정해줍니다. 여기서는 fullScreen으로 전체화면으로 보여줍니다.
        vc2.modalPresentationStyle = .fullScreen
        
        // present로 화면을 띄울건데. vc2 = 컨트롤러 가져오기, animated = 애니메이션 효과 주기 false면 아무런 효과없이 띡 변경됨.
        // completion = 여기서는 매개변수를 사용하지 않아서 nil값을 주어야 합니다.
        
        present(vc2, animated: false, completion: nil)
        print("두번째 화면으로 이동")
        
        
    }
    
    @IBAction func ActionNavigation(_ sender: Any) {

        // sb 변수에 스토리보드를 가져옵니다.
        let sb = UIStoryboard(name: "Nav", bundle: nil) // 이동하고싶은 ViewController가 있는 스토리보드 이름을 가져오면 됩니다.

        // 이동되는 스토리보드의 ViewController의 withIdentifier를 가져옵니다.
        let vc2 = sb.instantiateViewController(withIdentifier: "NavViewController") as! NavViewController

        // 이동이 되었을 때 model View의 Style을 정해줍니다. 여기서는 fullScreen으로 전체화면으로 보여줍니다.
        vc2.modalPresentationStyle = .fullScreen

        // present로 화면을 띄울건데. vc2 = 컨트롤러 가져오기, animated = 애니메이션 효과 주기 false면 아무런 효과없이 띡 변경됨.
        // completion = 여기서는 매개변수를 사용하지 않아서 nil값을 주어야 합니다.
        present(vc2, animated: false, completion: nil)
        print("네비게이션 스토리보드로 이동")

    }
    
    
    
}

