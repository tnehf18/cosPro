# 문제1

학생 10명이 상담을 받기 위해 매일 한 명씩, 순서대로 상담실을 찾아갑니다. 상담은 상담 선생님이 계실 때에만 상담을 받을 수 있습니다. 또한 한번 상담실을 방문한 학생은 다시 상담실에 찾아가지 않습니다. 선생님의 일정표가 주어질 때, 누가 상담을 받지 못했는지 알고 싶습니다. 일정표에는 선생님이 있는 날엔 "O"가, 없는 날엔 "X"가 표시됩니다.

예를 들어, 선생님의 일정이 ["O", "X", "X", "O", "O", "O", "X", "O", "X", "X"]라면 2번, 3번, 7번, 9번, 10번의 학생은 상담을 받지 못합니다.

선생님의 일정을 담은 배열 schedule이 매개변수로 주어질 때, 상담을 받지 못한 학생의 번호를 오름차순으로 정렬하여 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.Arrays;

class Solution {
    public int[] solution(String[] schedule) {
        int xCount = 0;
        for(int i=0; i<10; i++)
            if(schedule[i].charAt(0) == 'X')
                 xCount++;

        int[] answer = new int[xCount];
        for(int i=0, j=0; i<10; i++) {
            if(schedule[i].charAt(0) == 'X') {
                 answer[@@@] = @@@;
            }
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] schedule = {"O", "X", "X", "O", "O", "O", "X", "O", "X", "X"};
        int[] ret = sol.solution(schedule);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.print("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.println(" 입니다.");
    }
    
}
```

---

#### 매개변수 설명
선생님의 일정을 담은 배열 schedule이 solution 메소드의 매개변수로 주어집니다.

* schedule의 원소는 "O" 또는 "X"입니다.
* schedule은 길이가 10인 배열입니다.

#### return값 설명
상담을 받지 못한 학생들의 번호를 오름차순으로 정렬하여 return합니다.

---

#### 예시

| schedule | return |
|----|----|
| ["O", "X", "X", "O", "O", "O", "X", "O", "X", "X"] | [2, 3, 7, 9, 10] |

---

#### 예시 설명

1일, 4일, 5일, 6일, 8일에만 선생님이 상담실에 있으므로 2번, 3번, 7번, 9번, 10번 학생은 상담을 받지 못합니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_04/no_02/desc_02.md "cosPro 2급 Java 4차 2번 문제")
