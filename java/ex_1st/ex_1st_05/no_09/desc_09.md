# 문제9

정수 number와 target이 주어졌을 때, 다음 세 연산을 이용해 number를 target으로 만들려 합니다.

```
연산 1. 1을 더합니다.
연산 2. 1을 뺍니다.
연산 3. 2를 곱합니다.
```

정수 number와 target이 매개변수로 주어질 때, number로 target으로 만들려면 연산을 최소 몇 번 해야 하는지 return 하도록 solution 메소드를 작성해 주세요.

### 초기 코드

```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {

    public int solution(int number, int target) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();        

        int number1 = 5;
        int target1 = 9;
        int ret1 = sol.solution(number1, target1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int number2 = 3;
        int target2 = 11;
        int ret2 = sol.solution(number2, target2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명

두 정수 number와 target이 solution 메소드의 매개변수로 주어집니다.
* number와 target은 0 이상 10,000 이하입니다.

---

#### return 값 설명

number를 target으로 만들려면 연산을 최소 몇 번 해야 하는지 return 합니다.

---

#### 예시

| number |target|return |
|---|---|------|
| 5|9|2|
|3|11|3|

---
#### 예시 설명

예시 #1

1. 5 x 2 = 10
2. 10 - 1 = 9

따라서 연산을 최소 2번 해야 합니다.

예시 #2

1. 3 x 2 = 6
2. 6 x 2 = 12
3. 12 - 1 = 11

따라서 연산을 최소 3번 해야 합니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_05/no_10/desc_10.md "cosPro 1급 Java 5차 10번 문제")
