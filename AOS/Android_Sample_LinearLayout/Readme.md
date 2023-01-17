[ LinearLayout (리니어 레이아웃) ]

뷰(View) : 안드로이드 앱 화면을 구성하는 요소
레이아웃(Layout) : 뷰의 배치 방식을 정의

LinearLayout은 View를 한쪽 방향으로 차례대로 배치한다.

한 방향으로 나열하고 싶은 View들을 하나의 LinearLayout태그로 감싼다.

orientation : 뷰를 쌓는 방향 [리니어 레이아웃에 반드시 지정해야하는 속성이다.]
선택 가능한 방향은 위에서 아래(↓), 또는 왼쪽에서 오른쪽 방향(→)이다.

    방향을 지정하는 속성은 android:orientation,

    vertical : 세로 방향, horizontal : 가로 방향

LinearLayout안에 있는 뷰는 방향을 지정하여 정렬할 수 있다.
뷰를 정렬할 때는 layout_gravity와 gravity 속성을 사용한다.

    layout_gravity : 부모 컨테이너의 남은 영역 안에서 뷰를 정렬

    gravity : 뷰 내부의 내용물을 정렬하는데 사용

weight : 공간 분할
    여러개의 뷰를 특정한 비례에 맞춰 배치하고 싶을때 layout_weight 속성을 사용한다.

    이 속성을 사용할때는 해당 방향의 길이를 0dp로 설정해야 한다.

margin, padding : 레이아웃의 크기설정

    margin : 뷰의 테두리선 바깥쪽 공간의 여백을 얼마나 줄것인지 지정한다.

    padding : 뷰 내부의 내용물과 뷰의 테두리 까지의 여백을 얼마나 줄것인지 지정하는 속성이다.