# 문제8

배달음식 전문점 운영을 위해 다음과 같이 DeliveryStore 인터페이스와  PizzaStore, Food 클래스를 작성했습니다.

![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/20180316_deli_java1.png)

* DeliveryStore :
  * DeliveryStore는 배달 음식점의 인터페이스입니다.
  * 배달 음식점은 setOrderList와 getTotalPrice 메소드를 구현해야 합니다.
  * setOrderList 메소드는 주문 메뉴의 리스트를 매개변수로 받아 저장합니다.
  * getTotalPrice 메소드는 주문받은 음식 가격의 총합을 return 합니다.

* Food : 
  * Food는 음식을 나타내는 클래스입니다.
  * 음식은 이름(name)과 가격(price)으로 구성되어있습니다.

* PizzaStore
  * PizzaStore는 피자 배달 전문점을 나타내는 클래스이며 DeliveryStore 인터페이스를 구현합니다.
  * menuList는 피자 배달 전문점에서 주문 할 수 있는 음식의 리스트를 저장합니다.
  * orderList는 주문 받은 음식들의 이름을 저장합니다.
  * setOrderList 메소드는 주문 메뉴를 받아 orderList에 저장합니다.
  * getTotalPrice 메소드는 orderList에 들어있는 음식 가격의 총합을 return 합니다.

주문 메뉴가 들어있는 배열 orderList가 매개변수로 주어질 때, 주문한 메뉴의 전체 가격을 return 하도록 solution 메소드를 작성하려고 합니다. 위의 클래스 구조를 참고하여 주어진 코드의 빈칸을 적절히 채워 전체 코드를 완성해주세요.

---

##### 매개변수 설명
주문 메뉴가 들어있는 배열 orderList가 solution 메소드의 매개변수로 주어집니다.

* orderList의 길이는 1 이상 5이하입니댜.
* orderList에는 주문하려는 메뉴의 이름들이 문자열 형태로 들어있습니다.
  * orderList에는 같은 메뉴의 이름이 중복해서 들어있지 않습니다.
* 메뉴의 이름과 가격은 PizzaStore의 생성자에서 초기화해줍니다.

---
##### return 값 설명
주문한 메뉴의 전체 가격을 return 해주세요.

---
##### 예시

| orderList                          | return |
|-------------------------------------|--------|
| ["Cheese", "Pineapple", "Meatball"] | 51600  |
