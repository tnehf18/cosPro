# 문제5

X 마트에서는 빈 병 n개와 음료수 한 병을 교환해줍니다.

예를 들어, 현재 가진 돈이 8원, 음료수 한 병은 2원이고 n이 4라면 음료수 4개를 살 수 있습니다. 음료수 네개를 다 마신 후, 남은 빈 병 4개를 가져가면 음료수를 한 병 더 받을 수 있습니다. 따라서 8원으로는 음료수를 총 5병 마실 수 있습니다.

가진 돈 money, 음료수 한 병의 가격 price, 음료수 한 병과 교환하는데 필요한 빈 병의 수 n이 매개변수로 주어질 때, 마실 수 있는 총 음료수의 수를 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int money, int price, int n) {
        int answer = 0;

        int emptyBottle = answer = money / price;
        while(n <= emptyBottle) {
        	emptyBottle = emptyBottle - n;
        	answer++;
        	emptyBottle++;
        }
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Solution sol = new Solution();

    	int money1 = 8;
    	int price1 = 2;
    	int n1 = 4;
    	int ret1 = sol.solution(money1, price1, n1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int money2 = 6;
    	int price2 = 2;
    	int n2 = 2;
    	int ret2 = sol.solution(money2, price2, n2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }

}
```

---

#### 매개변수 설명

가진 돈 money, 음료수 한 병의 가격 price, 음료수 한 병과 교환하는데 필요한 빈 병의 수 n이 solution 메소드의 매개변수로 주어집니다.

* 가진 돈 money는 1 이상 1,000 이하인 자연수입니다.
* 음료수 한 병의 가격 price는 1 이상 100 이하인 자연수입니다.
* 음료수 한 병과 교환하는데 필요한 빈 병의  수 n은 3 이상 10 이하인 자연수입니다.

---

#### return 값 설명
마실 수 있는 총 음료수의 수를 return 해주세요.

---

#### 예제

| money | price | n | return |
|-------|-------|---|--------|
| 8 	| 2 	| 4 | 5  	|
| 6 	| 2 	| 2 | 5  	|

#### 예제 설명

예제 #1

문제에 나온 예와 같습니다.

예제 #2

1. 6원으로 2원짜리 음료수 3개를 삽니다.
2. 음료를 다 마시면 빈 병 3개가 남습니다. 이 중 빈 병 두개를 가져가 새 음료수 한 병과 교환합니다.
3. 음료를 마시면 빈 병 2개가 남습니다. 이를 새 음료수 한 병으로 교환합니다.

따라서 총 6원으로는 음료수 5병을 마실 수 있습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_06/no_06/ "cosPro 2급 Java 6차 6번 문제")
