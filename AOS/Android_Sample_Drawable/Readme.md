[기본적인 Drawable 사용법]

Drawable이란 화면에 그릴 수 있는 것을 말한다.
res 폴더의 drawable 폴더에는 이미지 뿐만 아니라
그래픽을 어떻게 표현할 것인지를 xml 파일을 통해 만들 수 있는데
이를 drawable 이라고 한다.

    StateListDrawable : 특정한 상황에서 이미지를 바꾸거나 그래픽을 지정하기 위한 드로어블이다.
    ShapeDrawable : 간단하게 도형을 직접 그릴 수 있는 드로어블이다. 직접 커스텀하거나 특정 모양을 지정할 수 있다.

1. res/drawable 폴더에 우클릭 후 Drawable resource file 클릭해서 xml 파일을 하나 생성한다.
2. <selector/>나 <shape/>를 생성하여 StateListDrawable를 사용할 것인지 ShapeDrawable를 사용할 것인지 정해준다.
3. activity.xml안에 만들어 놓은 Button에 android:background로 생성한 xml 파일을 불러온다.

* xml 편집 후 버튼에 백그라운드 색상 변경 및 커스텀 버튼 적용이 안될 때 *


    : 버튼에 대한 백그라운드 설정을 해도 모두 보라색으로만 결과가 나오는 문제
    -> res - values - themes - themes.xml에서
    parent="Theme.MaterialComponents.DayNight.DarkActionBar">
    이 부분을 parent="Theme.AppCompat.Light">로 변경


