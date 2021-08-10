# 문제10

n명이 시간표에 따라 교대 근무에 들어갑니다. 이때 가장 오래 일한 사람이 몇 시간 일했는지 알아내려 합니다. 근무 순번은 첫 번째 사람부터 n번째 사람 순으로 합니다. n번 사람이 일을 한 뒤에는 다시 첫 번째 사람부터 일을 합니다.

예를 들어 시간표가 [1, 5, 1, 9]이고 n이 3이면 첫 번째 사람은 1+9시간, 두 번째 사람은 5시간, 세 번째 사람은 1시간 근무합니다. 따라서 첫 번째 사람이 가장 오래 일했으며, 10시간 일했습니다.

근무 시간표를 담은 배열 time_table과 사람 수 n이 매개변수로 주어질 때, 가장 오래 일한 사람은 몇 시간 일했는지 return 하도록 solution 메소드를 작성해주세요.

### 초기 코드

```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {

    public int solution(int[] timeTable, int n) {
    	// 여기에 코드를 작성해주세요.
        int answer = 0;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution sol = new Solution();

    	int[] timeTable1 = {1, 5, 1, 9};
    	int n1 = 3;
    	int ret1 = sol.solution(timeTable1, n1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int[] timeTable2 = {4, 8, 2, 5, 4, 6, 7};
    	int n2 = 4;
    	int ret2 = sol.solution(timeTable2, n2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
시간표를 담은 배열 time_table과 사람 수 n이 solution 메소드의 매개변수로 주어집니다.

* time_table의 길이는 1 이상 100 이하입니다.
* time_table의 원소는 1 이상 100 이하인 자연수입니다.
* n은 1 이상 `time_table의 길이` 이하인 자연수입니다.

---

#### return 값 설명
가장 오래 일한 사람이 몇 시간 일했는지 return 합니다.

---

#### 예시

| time_table |n|return |
|---|---|------|
|[1, 5, 1, 9] |3| 10|
| [4, 8, 2, 5, 4, 6, 7]|4 | 14|

---

#### 예시 설명

예시 #1

앞선 예와 같습니다.

예시 #2

첫 번째 사람은 4+4시간만큼 근무를 합니다.
두 번째 사람은 8+6시간만큼 근무를 합니다.
세 번째 사람은 2+7시간만큼 근무를 합니다.
네 번째 사람은 5시간만큼 근무를 합니다.

따라서, 가장 오래 근무를 한 사람은 14시간 일했습니다.

---

### → 정답 확인

### [→ 목록](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_05/no_list.md "cosPro 2급 Java 5차")
