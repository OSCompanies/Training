//
//  DetailViewController.swift
//  Sample_NavigationTableView
//
//  Created by ssemm on 2022/01/13.
//

import UIKit

class DetailViewController: UIViewController {

    @IBOutlet var imgView: UIImageView!
    @IBOutlet var lbItem: UILabel!
    
    var receiveItem = ""
    var receiveImageItem = ""
    
    override func viewDidLoad() {
        super.viewDidLoad()

        imgView.image = UIImage(named: receiveImageItem)
        lbItem.text = receiveItem
    }
    
    // 테이블에서 받아온 데이터를 화면에 띄우기 위한 함수
    func receiveItems(_ item: String, _ imageitem: String){
        receiveImageItem = imageitem
        receiveItem = item
    }
    
}
