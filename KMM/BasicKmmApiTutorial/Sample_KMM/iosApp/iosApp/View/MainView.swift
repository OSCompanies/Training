import SwiftUI
import shared

struct MainView: View {
    @State var memberInfo: String = "loading"
    
    // 안드로이드의 통신 시 URL을 빌드 PC의 IP로 지정하였기 때문에
    // 휴대폰에서 빌드하려면 와이파이에 연결해서 빌드해야 합니다.
    var body: some View {
        Text(memberInfo)
            .task {
                ApiService().getMemberInfo { data, error in
                    memberInfo = data ?? "error"
                }
            }
    }
}

struct MainView_Previews: PreviewProvider {
    static var previews: some View {
        MainView()
    }
}
