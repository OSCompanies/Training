//
//  ViewController.swift
//  Sample_WebView
//
//  Created by ssemm on 2022/01/17.
//

import UIKit
import WebKit

class ViewController: UIViewController, WKNavigationDelegate{

    @IBOutlet var webView: WKWebView!
    
    override func viewDidLoad() {
        super .viewDidLoad()
        webView.navigationDelegate = self
        
        // 초기화면
        loadWebpage(url: "https://www.naver.com")
    }

    // 웹페이지 띄우는 함수
    func loadWebpage(url:String){
        let myUrl = URL(string: url)    // URL타입으로 바꿔줘야함
        let myRequest = URLRequest(url: myUrl!)
        webView.load(myRequest)
    }
    
    // naver 버튼
    @IBAction func btnNaver(_ sender: UIButton) {
        loadWebpage(url: "https://www.naver.com")
    }
    
    // html 버튼
    @IBAction func btnHtml(_ sender: UIButton) {
        let htmlString = """
        <html>
                    <head>
                       <meta charset="utf-8">
                       <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    </head>
                    <body>
                    <h1> HTML String </h1>
                    <p>String 변수를 이용한 웹페이지</p>
                    <p><a href=\"http://jtbc.joins.com\">JTBC</a>로 이동</p>
                    </body>
                    </html>
        """
        
        webView.loadHTMLString(htmlString, baseURL: nil)
    }
    
}

