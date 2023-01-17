//
//  CustomTableViewCell.swift
//  Sample_CustomTableViewCell
//
//  Created by ssemm on 2022/01/18.
//

import UIKit

class CustomTableViewCell: UITableViewCell {

    @IBOutlet var ImageView: UIImageView!
    @IBOutlet var lbText: UILabel!
    
    
    override func awakeFromNib() {
        super.awakeFromNib()
        // Initialization code
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)

        // Configure the view for the selected state
    }
    
}
