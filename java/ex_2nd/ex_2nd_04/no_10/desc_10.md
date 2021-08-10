# 문제10

XX 시험을 친 수험생들의 점수가 주어질 때, 합격자 수를 구하려 합니다. 시험에 합격하기 위해서는 커트라인 이상의 점수를 받아야 합니다.

예를 들어 수험생들의 점수가 [80점, 90점, 55점, 60점, 59점]이고, 커트라인이 60점이라면 3명이 합격했습니다.

수험생들의 시험 점수가 들어있는 배열 scores, 커트라인 점수 cutline이 매개변수로 주어질 때, 합격자 수를 return 하도록 solution 메소드를 완성해주세요.

### 초기 코드

```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {

    public int solution(int[] scores, int cutline) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] scores = {80, 90, 55, 60, 59};
        int cutline = 60;
        int ret = sol.solution(scores, cutline);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

---

#### 매개변수 설명
수험생들의 시험 점수가 들어있는 배열 scores, 커트라인 점수 cutline이 solution 메소드의 매개변수로 주어집니다.
* scores의 원소는 각 학생의 시험 점수를 나타내며 0 이상 100 이하의 정수입니다.
* scores의 길이는 1 이상 100 이하입니다.
* cutline은 0 이상 100 이하의 정수입니다.

---

#### return 값 설명
합격자의 수를 return 합니다.

---

#### 예시

| scores               | cutline | result |
|----------------------|---------|--------|
| [80, 90, 55, 60, 59] | 60      | 3      |

#### 예시 설명

예시 #1

* 80점, 90점, 60점은 합격입니다.
* 55점, 59점은 불합격입니다.

따라서 3명이 합격했습니다.

---

### → 정답 확인

### [→ 목록](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_04/no_list.md "cosPro 2급 Java 4차")
