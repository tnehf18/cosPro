# 문제4

카드를 3장 뽑아 점수를 내는 게임을 하려고 합니다. 각 카드는 색이 칠해져 있고, 숫자가 적혀 있습니다.

획득한 점수를 계산하는 규칙은 다음과 같습니다.

```
1. 카드 3장의 색이 모두 같다면 획득한 점수는 적힌 숫자의 총합에 3을 곱한 값입니다.
2. 카드 2장의 색이 같고, 1장의 색이 다르다면 획득한 점수는 적힌 숫자의 총합에 2를 곱한 값입니다.
3. 카드 3장의 색이 모두 다르다면 획득한 점수는 적힌 숫자의 총합입니다.
```

뽑은 카드의 색과 숫자를 문자열로 담은 2차원 배열 cards가 매개변수로 주어질 때, 획득한 총 점수를 return 하도록 solution 메소드를 작성해주세요.

```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

public class Solution {

    public int solution(String[][] cards) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String[][] cards1 = {{new String("blue"), new String("2")}, {new String("red"), new String("5")}, {new String("black"), new String("3")}};
        int ret1 = sol.solution(cards1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[][] cards2 = {{new String("blue"), new String("2")}, {new String("blue"), new String("5")}, {new String("black"), new String("3")}};
        int ret2 = sol.solution(cards2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }

}
```

---

#### 매개변수 설명
뽑은 카드의 색과 숫자를 문자열로 담은 2차원 배열 cards가 solution 메소드의 매개변수로 주어집니다.

* cards는 3x2 크기인 2차원 배열입니다.
* cards의 각 원소는 [색, 숫자] 입니다.
    * 카드의 색은 ["red", "black", "blue"] 중 하나입니다.
    * 카드에 적힌 숫자는 1 이상 9 이하인 자연수입니다.

---

#### return 값 설명
획득한 총 점수를 return 합니다.

---

#### 예제

| cards                                      	| return |
|------------------------------------------------|--------|
| [["blue", "2"], ["red", "5"], ["black", "3"]]  | 10 	|
| [["blue", "2"], ["blue", "5"], ["black", "3"]] | 20 	|

#### 예제 설명

예제 #1

모든 카드 색이 모두 다르기 때문에 획득한 점수는 적힌 숫자의 총합인 10 입니다.

예제 #2

두 카드 색이 같고, 1장의 색이 다릅니다. 따라서’ 획득한 점수는 적힌 숫자의 총합에 2를 곱한 20 입니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_06/no_05/desc_05.md "cosPro 2급 Java 6차 5번 문제")
