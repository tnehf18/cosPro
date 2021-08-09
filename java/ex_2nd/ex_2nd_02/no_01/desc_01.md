# 문제1

왼손 장갑의 제품 번호가 들어있는 배열과 오른손 장갑의 제품 번호가 들어있는 배열이 있습니다. 제품 번호는 1부터 10 사이의 자연수입니다. 제품 번호가 같은 왼손장갑과 오른손 장갑을 합쳐 장갑 한 쌍을 만들 수 있습니다. 이때, 최대한 많은 쌍의 장갑을 만들면 최대 몇 쌍을 만들 수 있는지 구하려 합니다. 이를 위해 다음과 같이 프로그램 구조를 작성했습니다. 

~~~
1. 왼손 장갑이 제품 번호별로 몇 개씩 있는지 개수를 셉니다.
2. 오른손 장갑이 제품 번호별로 몇 개씩 있는지 개수를 셉니다.
3. 각 제품 번호별로 최대한 많은 장갑 쌍을 만들면서 개수를 셉니다.
~~~

왼손 장갑의 제품 번호가 들어있는 배열 leftGloves와 오른손 장갑의 제품 번호가 들어있는 배열 rightGloves가 매개변수로 주어질 때, 최대 몇 개의 장갑 쌍을 만들 수 있는지 return 하도록 solution 메소드를 작성하려 합니다. 이때, 위 구조를 참고하여 중복되는 부분은 func_a라는 메소드로 작성했습니다. 코드가 올바르게 동작할 수 있도록 빈칸을 알맞게 채워주세요.

### 초기 코드

```
class Solution {

    final int maxProductNumber = 10;
    
    public int[] func_a(int[] gloves){
        int[] counter = new int[maxProductNumber + 1];
        for(int i = 0; i < gloves.length; i++)
            @@@
        return counter;
    }
    
    public int solution(int[] leftGloves, int[] rightGloves) {
        int[] leftCounter = func_a(leftGloves);
        int[] rightCounter = func_a(rightGloves);
        int total = 0;
        for(int i = 1; i <= maxProductNumber; i++)
            total += Math.min(leftCounter[i], rightCounter[i]);
        return total;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] leftGloves = {2, 1, 2, 2, 4};
        int[] rightGloves = {1, 2, 2, 4, 4, 7};
        int ret = sol.solution(leftGloves, rightGloves);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
왼손 장갑의 제품 번호가 들어있는 배열 leftGloves와 오른손 장갑의 제품 번호가 들어있는 배열 rightGloves가 solution 메소드의 매개변수로 주어집니다.

* leftGloves의 길이는 1 이상 100 이하입니다.
* leftGloves의 원소는 1 이상 10 이하의 자연수입니다.
* rightGloves의 길이는 1 이상 100 이하입니다.
* rightGloves의 원소는 1 이상 10 이하의 자연수입니다.

---

#### return 값 설명 
왼손과 오른손의 제품 번호가 같은 장갑 끼리 한 쌍을 만들 때, 최대 몇 개의 쌍을 만들 수 있는지 개수를 return 해주세요.

---

#### 예시

| leftGloves              | rightGloves                  | return |
|---------------------------|--------------------------------|--------|
| [2, 1, 2, 2, 4] | [1, 2, 2, 4, 4, 7] | 4      |

---

#### 예시 설명

예시 #1

왼손 장갑 : 1번 장갑 1개, 2번 장갑 3개, 4번 장갑 1개가 있습니다.
오른손 장갑 : 1번 장갑 1개, 2번 장갑 2개, 4번 장갑 2개, 7번 장갑 1개가 있습니다.

따라서 1번 장갑 한 쌍, 2번 장갑 두 쌍, 4번 장갑 한 쌍을 만들면 최대 4개의 장갑 쌍을 만들 수 있습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_02/no_02/desc_02.md "cosPro 2급 Java 2차 2번 문제")
