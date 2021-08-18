# 문제7

예산 내에서 의자와 책상을 하나씩 사려고 합니다. 이때, 의자와 책상 가격의 합이 가장 크게 사려고 합니다.

예를 들어, 돈을 7원을 가지고 있고 의자의 가격이 [2, 5], 책상의 가격이 [4, 3, 5]일 때, 첫번째 의자와 세번째 책상을 구매하면 가격의 합이 7원이고, 이때 의자와 책상 가격의 합이 가장 큽니다.

예산 money, 의자의 가격이 담긴 배열 chairs, 책상의 가격이 담긴 배열 desks가 매개변수로 주어집니다. 이때 예산으로 감당할 수 있는 의자와 책상 가격 합의 최댓값을 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    public int solution(int money, int[] chairs, int[] desks) {
        int answer = 0;

        for(int i = 0; i < chairs.length; i++) {
            for(int j = 0; j < desks.length; j++) {
                int price = @@@;
                if(answer < price && @@@)
                    answer = price;
            }
        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int money1 = 7;
        int[] chairs1 = {2, 5};
        int[] desks1 = {4, 3, 5};
        int ret1 = sol.solution(money1, chairs1, desks1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + "입니다.");

        int money2 = 7;
        int[] chairs2 = {3};
        int[] desks2 = {5};
        int ret2 = sol.solution(money2, chairs2, desks2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + "입니다.");
    }
    
}
```

---

#### 매개변수 설명

예산 money, 의자의 가격이 담긴 배열 chairs, 책상의 가격이 담긴 배열 desks가 solution 메소드의 매개변수로 주어집니다.

* 예산 money는 1 이상 1,000 이하인 자연수입니다.
* 의자와 책상의 가격은 1 이상 1,000 이하인 자연수입니다.
* chairs와 desks의 길이는 1 이상 100 이하입니다.

---

#### return 값 설명

의자와 책상을 하나씩 살때, 예산으로 감당할 수 있는 의자와 책상 가격 합의 최댓값을 return 합니다.

* 단, 가지고 있는 금액으로 의자와 책상을 하나씩 살 수 없는 경우에는 0을 return 합니다.

---

#### 예제

| money | chairs | desks 	| return |
|-------|--------|-----------|--------|
| 7 	| [2, 5] | [4, 3, 5] | 7  	|
| 7 	| [3]	| [5]   	| 0  	|

#### 예제 설명

예제 #1

문제에 나온 예와 같습니다.

예제 #2

3원짜리 의자와 5원짜리 책상을 구매하면 8원이 듭니다. 이는 예산 7원을 초과하기때문에 0을 return 합니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_06/no_08/ "cosPro 2급 Java 6차 8번 문제")
