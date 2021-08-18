# 문제9

시험 점수에 따라 학생의 순위를 매기려 합니다. 동점자 순위는 가능한 순위 중 가장 높은 순위로 매깁니다.
예를 들어 학생별 점수가 [90, 87, 87, 23, 35, 28, 12, 46]이면, 학생별 순위는 [1, 2, 2, 7, 5, 6, 8, 4]입니다.

모든 학생의 점수를 담은 배열 score가 매개변수로 주어질 때, 순위를 담은 배열을 return 하도록 solution 메소드를 작성해주세요.

### 초기 코드

```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {

    public int[] solution(int[] score) {
        // 여기에 코드를 작성해주세요.
        int[] answer = {};
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] score1 = {90, 87, 87, 23, 35, 28, 12, 46};
        int[] ret1 = sol.solution(score1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret1) + " 입니다.");

        int[] score2 = {10, 20, 20, 30};
        int[] ret2 = sol.solution(score2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret2) + " 입니다.");
    }

}
```

---

#### 매개변수 설명
모든 학생의 점수를 담은 배열 score가 solution 메소드의 매개변수로 주어집니다.

* 학생 수는 1명 이상 1,000명 이하입니다.
* 점수는 1 이상 100 이하인 정수입니다.

---

#### return 값 설명
* 순위를 담은 배열을 return 합니다.

---

#### 예시

| score |return |
|---|---|
| [90, 87, 87, 23, 35, 28, 12, 46] | [1, 2, 2, 7, 5, 6, 8, 4] |
| [10, 20, 20, 30] | [4, 2, 2, 1] |

#### 예시 설명

예시 #1

문제에 나온 예와 같습니다.

예시 #2

이들의 순위는 [4, 2, 2, 1]입니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_05/no_10/ "cosPro 2급 Java 5차 10번 문제")
