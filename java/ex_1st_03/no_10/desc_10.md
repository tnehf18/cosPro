# 문제10

미용실과 레스토랑이 예약을 받는 기준은 다음과 같습니다.

* 미용실
  * 인원수가 1명인 경우에만 예약받습니다.
  * 다른 손님과 예약 시간이 겹칠 수 없습니다.

* 레스토랑
  * 인원수가 2명 이상 8명 이하인 경우에만 예약받습니다.
  * 최대 두 팀까지 예약 시간이 겹칠 수 있습니다.

두 가게에서 예약을 받은 횟수를 계산하기 위해 다음과 같이 Customer, Shop, HairShop, Restaurant 클래스를 작성했습니다.

  ![shop2_java.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/96b7b25f52/90f19bba-8fd7-4bcf-9632-cb5b158b9b92.png)

* Customer:
  * Customer : 고객을 나타내는 클래스입니다.
  * id : 고객 식별 번호를 나타냅니다.
  * time : 고객이 신청한 예약 시간을 나타냅니다.
  * numOfPeople : 예약 인원 수를 나타냅니다.

* Shop :
  *  Shop : 가게를 나타내는 클래스입니다.
  * reserveList : 가게에 예약한 고객 리스트입니다.
  * reserve : 고객을 매개변수로 받아, 예약 고객 리스트에 추가 후 true를 return합니다.

* HairShop :
  * HairShop : 미용실을 나타내는 클래스이며, Shop을 상속합니다.
  * reserve : 고객을 매개변수로 받아, 미용실의 예약 기준에 맞는지 검사 합니다. 예약을 받았다면 예약 고객 리스트에 추가 후 true를 return하고, 그렇지 않으면 false를 return 합니다.

* Restaurant :
  * Restaurant는 레스토랑을 나타내는 클래스이며, Shop을 상속합니다.
  * reserve : 고객을 매개변수로 받아, 레스토랑의 예약 기준에 맞는지 검사 합니다. 예약을 받았다면 예약 고객 리스트에 추가 후 true를 return하고, 그렇지 않으면 false를 return 합니다.

예약을 원하는 고객 정보가 담긴 배열 customers와 shops가 매개변수로 주어질 때, 두 가게에서 예약받은 횟수를 return 하도록 solution 메소드를 작성하려고 합니다. 위 클래스 구조를 참고하여 주어진 코드의 빈칸을 적절히 채워 전체 코드를 완성해주세요.

### 초기 코드

```
import java.util.ArrayList;
import java.util.Iterator;

//Shop 인터페이스와 HairShop, Restaurant 클래스는 Inner Class로 작성되어있습니다. 아래 코드를 잘 읽고 빈칸을 채워주세요.
class Solution {

    class Shop {
        protected ArrayList<Customer> reserveList;
        public Shop() {
            this.reserveList = new ArrayList<Customer>();
        }
        public boolean reserve(Customer customer){
            reserveList.add(customer);
            return true;
        }
    }
    
    class Customer {
        public int id;
        public int time;
        public int numOfPeople;
        public Customer(int id, int time, int numOfPeople) {
            this.id = id;
            this.time = time;
            this.numOfPeople = numOfPeople;
        }
    }
    
    class HairShop @@@ {
        public HairShop() {
            super();
        }
        
        @@@ {
            if(@@@ != 1)
                return false;
            
            Iterator<Customer> iter = reserveList.iterator();
            while (iter.hasNext()) {
                Customer r = iter.next();
                if(@@@)
                    return false;
            }
            reserveList.add(customer);
            return true;
        }
    }
    
    class Restaurant @@@ {
        public Restaurant(){
            super();
        }
        
        @@@ {
            if(@@@)
                return false;
            int count = 0;
                        
            Iterator<Customer> iter = reserveList.iterator();
            while (iter.hasNext()) {
                Customer r = iter.next();
                if(@@@)
                    count += 1;
            }
            if(count >= 2)
                return false;
            reserveList.add(customer);
            return true;
        }
    }

    public int solution(int[][] customers, String[] shops) {
        Shop hairshop = new HairShop();
        Shop restaurant = new Restaurant();
        int count = 0;
        for(int i = 0; i < shops.length; i++) {
            if(shops[i].equals("hairshop")) {
                if(hairshop.reserve(new Customer(customers[i][0], customers[i][1], customers[i][2])))
                    count += 1;
            }
            else if(shops[i].equals("restaurant")) {
                if(restaurant.reserve(new Customer(customers[i][0], customers[i][1], customers[i][2])))
                    count += 1;
            }
        }
        return count;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] customers = {{1000, 2, 1},{2000, 2, 4},{1234, 5, 1},{4321, 2, 1}, {1111, 3, 10}};
        String[] shops = {"hairshop", "restaurant", "hairshop", "hairshop", "restaurant"};
        int ret = sol.solution(customers, shops);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
예약을 원하는 고객 정보가 담긴 배열 customers와 shops가 solution 메소드의 매개변수로 주어집니다.
* customers의 길이와 shops의 길이는 항상 같습니다.
* customers의 각 원소에는 고객 정보가 [고객 ID, 예약 시간, 예약 인원수] 순으로 들어있습니다.
  * 고객 ID는 1 이상 10,000 이하인 자연수입니다.
  * 예약 시간은 0 이상 23 이하인 정수입니다.
  * 예약 인원수는 1 이상 10 이하인 자연수입니다.
  * 고객 ID는 중복해서 주어지지 않습니다.
* customers에는 고객이 예약을 신청한 순서대로 들어있습니다. 
* shops는 각 고객이 예약할 가게를 나타내며, "hairshop" 또는 "restaurant" 로만 구성되어 있습니다.
* i 번째 고객이 예약할 가게는 shops[i] 입니다.
* 예약을 신청한 고객의 수는 1 이상 10 이하입니다.

---

#### return 값 설명
두 가게에서 예약받은 횟수를 return 해주세요.

---

#### 예시

| customers                                                               | shops                                                            | return |
|-------------------------------------------------------------------------|------------------------------------------------------------------|--------|
| [[1000, 2, 1], [2000, 2, 4], [1234, 5, 1], [4321, 2, 1], [1111, 3, 10]] | ["hairshop", "restaurant", "hairshop", "hairshop", "restaurant"] | 3      |

#### 예시 설명

고객별 예약 정보는 다음과 같습니다.

| ID   | 예약 시간 | 인원수 | 가게       |
|------|-----------|--------|------------|
| 1000 | 2         | 1      | hairshop   |
| 2000 | 2         | 4      | restaurant |
| 1234 | 5         | 1      | hairshop   |
| 4321 | 2         | 1      | hairshop   |
| 1111 | 3         | 10     | restaurant |

* 첫 번째 고객은 미용실에서 예약받습니다.
* 두 번째 고객은 레스토랑에서 예약받습니다.
* 세 번째 고객은 미용실에서 예약받습니다.
* 네 번째 고객은 예약받지 않습니다. 2시에 미용실을 먼저 예약한 손님이 있기 때문입니다.
* 다섯 번째 고객은 예약받지 않습니다. 레스토랑에 한 번에 예약 가능한 인원수는 2명 이상 8명 이하입니다.
