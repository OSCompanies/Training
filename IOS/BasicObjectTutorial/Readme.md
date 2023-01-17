# BasicObjectTutorial

Label 변경하기 

1.화면 상단에 + 버튼을 눌러서 오브젝트를 하나 추가해줍니다 (Label)

![스크린샷 2022-01-12 오전 9 26 58](https://user-images.githubusercontent.com/73631818/149042440-50d0dc36-4637-4610-94e1-e81f833f9612.png)


2.Label을 추가하고 Label의 이름을 오른쪽 Inspector에서 변경해 줍니다. "텍스트변경전"

<img width="1440" alt="스크린샷 2022-01-12 오전 8 58 49" src="https://user-images.githubusercontent.com/73631818/149042620-5c8b4a53-9fb8-4f52-9457-5ec4b2315ab2.png">


3.Label의 요소를 끌어서 Controller안에 넣어줍니다. 이것을 Outlet 연결이라고 합니다.

<img width="1440" alt="스크린샷 2022-01-12 오전 8 58 49" src="https://user-images.githubusercontent.com/73631818/149042768-5bec13ba-9a2b-4b2a-86e1-cf03ed3305b9.png">

4.Controller의 viewdidLoad() 메소드 안에 해당 Outlet을 변경해 봅시다.

viewdidLoad()는 메모리안에 해당 컨트롤러가 호출되었을 때 실행되는 메소드 입니다. 그래서 storyboard안에서는 "텍스트변경전" 으로 표시된 Label이 프로젝트가 실행되면서 "텍스트변경후"로 바뀌어서 호출됩니다

<img width="1005" alt="스크린샷 2022-01-12 오전 9 01 01" src="https://user-images.githubusercontent.com/73631818/149043153-1bdb5638-a3ad-418c-bb34-1cc4cc541f41.png">


