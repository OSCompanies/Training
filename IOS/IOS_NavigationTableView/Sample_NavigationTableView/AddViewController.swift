//
//  AddViewController.swift
//  Sample_NavigationTableView
//
//  Created by ssemm on 2022/01/13.
//

import UIKit

class AddViewController: UIViewController, UIPickerViewDelegate, UIPickerViewDataSource {
    
    @IBOutlet var imgView: UIImageView!
    @IBOutlet var pickerImage: UIPickerView!
    @IBOutlet var txtMessage: UITextField!
    
    let MAX_ARRAY_NUM = 3 // 전체 이미지 갯수
    let PICKER_VIEW_COLUMN = 1 // PickerView의 컬럼 갯수
    var imageArray = [UIImage?]()   // image를 넣는다
    var imageFileName = ["cart.png","clock.png","pencil.png"]
    var selectedImageName = 0   // 선택된 이미지 row
   
    override func viewDidLoad() {
        super.viewDidLoad()

        // image 준비 : image를 배열로 생성한다.
        for i in 0..<MAX_ARRAY_NUM{
            let image = UIImage(named: imageFileName[i])
            imageArray.append(image)
        }
        
        imgView.image = imageArray[0]
    }
    
    // Add버튼 클릭
    @IBAction func btnAdd(_ sender: UIButton) {
        // items에 text field의 text값을 추가
        items.append(txtMessage.text!)
        itemsImageFile.append(imageFileName[selectedImageName])
        // print("\(imageFileName[selectedImageName])")
        txtMessage.text = ""
        navigationController?.popViewController(animated: true)
    }
    
    // pickerview의 컬럼 갯수
    func numberOfComponents(in pickerView: UIPickerView) -> Int {
        return PICKER_VIEW_COLUMN
    }
    
    // 출력할 이미지 파일 갯수
    func pickerView(_ pickerView: UIPickerView, numberOfRowsInComponent component: Int) -> Int {
        return imageFileName.count
    }
    
    // Picker View에 이미지로 배치
    func pickerView(_ pickerView: UIPickerView, viewForRow row: Int, forComponent component: Int, reusing view: UIView?) -> UIView {
        let imageView = UIImageView(image: imageArray[row])
        imageView.frame = CGRect(x: 0, y: 0, width: 30, height: 30)
        return imageView
    }
    
    // Picker View로 선택된 파일명을 레이블 및 image view에 출력
    func pickerView(_ pickerView: UIPickerView, didSelectRow row: Int, inComponent component: Int) {
        imgView.image = imageArray[row]
        selectedImageName = row // 선택된 이미지의 row를 저장
    }

}
