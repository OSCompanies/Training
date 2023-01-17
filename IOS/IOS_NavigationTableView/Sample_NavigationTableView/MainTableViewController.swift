//
//  MainTableViewController.swift
//  Sample_NavigationTableView
//
//  Created by ssemm on 2022/01/13.
//

import UIKit

// 실행시 테이블 뷰에 나타날 항목들
var items = ["책 구매", "저녁 약속", "스터디 준비하기"]
var itemsImageFile = ["cart.png", "clock.png","pencil.png"]

class MainTableViewController: UITableViewController {
    
    @IBOutlet var ListView: UITableView!
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // edit 버튼을 만들고 삭제 기능 추가, 왼쪽으로 배치
        self.navigationItem.leftBarButtonItem = self.editButtonItem
    }
    
    // Table View에 추가된 내용을 불러오기 위해서는 viewWillAppear에서 작업해줘야 함
    override func viewWillAppear(_ animated: Bool) {
        ListView.reloadData()
    }


    // 테이블 안에 섹션의 수
    override func numberOfSections(in tableView: UITableView) -> Int {
        
        return 1
    }

    // 섹션당 열의 갯수는 item의 갯수
    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        // #warning Incomplete implementation, return the number of rows
        return items.count
    }

    // cell의 구성 정의
    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "myCell", for: indexPath)
        
        cell.textLabel?.text = items[(indexPath as NSIndexPath).row]
        cell.imageView?.image = UIImage(named: itemsImageFile[(indexPath as NSIndexPath).row])

        return cell
    }
    
    
    

    /*
    // Override to support conditional editing of the table view.
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the specified item to be editable.
        return true
    }
    */

    
    // Override to support editing the table view.
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCell.EditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            // Delete the row from the data source
            items.remove(at: (indexPath as NSIndexPath).row)
            itemsImageFile.remove(at: (indexPath as NSIndexPath).row)
            tableView.deleteRows(at: [indexPath], with: .fade)
        } else if editingStyle == .insert {
            // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
        }    
    }
    
    override func tableView(_ tableView: UITableView, titleForDeleteConfirmationButtonForRowAt indexPath: IndexPath) -> String? {
        return "삭제"
    }
    

    
    // Override to support rearranging the table view.
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath) {
        
        // 이동할 item의 위치
        let itemToMove = items[(fromIndexPath as NSIndexPath).row]
        // 이동할 image의 위치
        let itemImageToMove = itemsImageFile[(fromIndexPath as NSIndexPath).row]
        // 이동할 item을 삭제
        items.remove(at: (fromIndexPath as NSIndexPath).row)
        // 이동할 image를 삭제
        itemsImageFile.remove(at: (fromIndexPath as NSIndexPath).row)
        // items 삽입
        items.insert(itemToMove, at: (to as NSIndexPath).row)
        itemsImageFile.insert(itemImageToMove, at: (to as NSIndexPath).row)
    }
    
    // DetailViewController에 데이터 전달
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
        if segue.identifier == "sgDetail"{
            let cell = sender as! UITableViewCell
            let indexPath = self.ListView.indexPath(for: cell)
            let detailView = segue.destination as! DetailViewController
            //detailView.receiveItem = items[(indexPath! as NSIndexPath).row]
            detailView.receiveItems(items[(indexPath! as NSIndexPath).row],itemsImageFile[(indexPath! as NSIndexPath).row])
        }
    }

    /*
    // Override to support conditional rearranging of the table view.
    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the item to be re-orderable.
        return true
    }
    */

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destination.
        // Pass the selected object to the new view controller.
    }
    */

}
