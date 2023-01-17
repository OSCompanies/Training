스크롤뷰를 이용해서 아래에 있는 텍스트 확인해보기

1. ScrollView 추가

![스크린샷 2022-01-12 오후 3 48 54](https://user-images.githubusercontent.com/73631818/149079696-b784e035-ccc6-437b-8b16-97e7d33bfe8b.png)

-> 오브젝트인 ScrollView를 추가합니다.

2. ScrollView Container 설정

![스크린샷 2022-01-12 오후 3 49 06](https://user-images.githubusercontent.com/73631818/149079744-a93b8c6c-0953-4e7e-92a7-1098619efd8f.png)

-> 왼쪽, 오른쪽, 위, 아래에 Constarints를 0으로 잡습니다.(화면 사이즈가 변경될 수 있으니)

![스크린샷 2022-01-12 오후 3 49 16](https://user-images.githubusercontent.com/73631818/149080021-50ceb18f-99a9-4746-b9ba-b34532058994.png)

-> ScrollView의 Content Layout Guides를 체크해제 해야 합니다. 이거 해제 안하면 에러먹네요.

3. ScrollView 위에 UIView 추가

![스크린샷 2022-01-12 오후 3 49 29](https://user-images.githubusercontent.com/73631818/149080089-6ec38fae-9044-4f4d-9760-6262c0456ff0.png)

-> 오브젝트인 UIView를 추가합니다.

4. UIView Container 설정

![스크린샷 2022-01-12 오후 3 55 12](https://user-images.githubusercontent.com/73631818/149080148-c6672de2-9ffd-43f0-9a81-b756ef40b3fa.png)

-> 왼쪽, 오른쪽, 위, 아래에 Constraints를 0으로 잡고 Height 만 대략적으로 잡아줍니다.(1000이면 스크롤이 되는 사이즈라서 임의로 잡은겁니다)

![스크린샷 2022-01-12 오후 3 55 19(2)](https://user-images.githubusercontent.com/73631818/149080381-3fcd383d-b3f3-4ad4-ba35-6f5ecd38d6fa.png)

-> 이후에 UIView를 ScrollView로 끌어와서 Equal Widths값을 잡아줍니다. 이렇게 하면 갑자기 에러가 먹을 수 있는데 이 부분에서는

![스크린샷 2022-01-12 오후 3 55 41](https://user-images.githubusercontent.com/73631818/149080493-2beee98f-73ba-4e85-bd0c-c55cd230bc26.png)

-> 이 부분의 Multiplier의 값을 1로 잡아주면 됩니다.

5. UIView 에 Label 추가하여 ScrollView 확인하기


![스크린샷 2022-01-12 오후 4 10 42](https://user-images.githubusercontent.com/73631818/149080611-a98cd34d-d659-4b83-8d26-2e9309289ebb.png) ![스크린샷 2022-01-12 오후 4 10 47](https://user-images.githubusercontent.com/73631818/149080614-18ae1a8d-1b0a-4541-9789-1ac38523ee93.png)



끝.





