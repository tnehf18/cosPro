# 문제7

중간시험 점수와 기말시험 점수가 있습니다. 이를 바탕으로 점수가 가장 많이 오른 학생의 점수 차이와 가장 많이 떨어진 학생의 점수 차이를 구하려 합니다. 이를 위해 다음과 같이 프로그램 구조를 작성했습니다.

```
1. 각 학생에 대하여 기말고사 점수에서 중간고사 점수를 뺀 값의 최댓값을 구합니다.
2. 각 학생에 대하여 기말고사 점수에서 중간고사 점수를 뺀 값의 최솟값을 구합니다.
3. 1번과 2번 과정에서 구한 점수를 배열에 담아 return 합니다.
```

예를 들어 중간시험 점수가 [20, 50, 40]이고, 기말시험 점수가 [10, 50, 70]이면, 학생의 시험 점수 차이는 [-10, 0, 30]입니다. 따라서 성적이 가장 많이 오른 학생은 30점이 올랐습니다. 그리고 성적이 가장 많이 떨어진 학생은 10점이 떨어졌습니다.

학번순으로 중간시험 점수를 담은 배열 midScores와 학번순으로 기말시험 점수를 담은 배열 finalScores가 solution 메소드의 매개변수로 주어집니다. 이 때 성적이 가장 많이 오른 학생의 점수 차이를 **배열 첫 번째 원소** 로, 성적이 가장 많이 떨어진 학생의 점수 차이를 **두 번째 원소** 로 담은 배열을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <U>**한 줄**</U>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
import java.util.*;

class Solution {

    int func_a(int scores1[], int scores2[]) {
        int answer = 0;
        for(int i=0; i<scores1.length; i++)
            if (answer < scores2[i] - scores1[i])
                answer = scores2[i] - scores1[i];
        return answer;
    }

    int func_b(int scores1[], int scores2[]) {
        int answer = 0;
        for(int i=0; i<scores1.length; i++)
            if (answer > scores1[i] - scores2[i])
                answer = scores2[i] - scores1[i];
        return answer;
    }
    
    public int[] solution(int[] midScores, int[] finalScores) {
        int[] answer = {0, 0};
        answer[0] = func_a(midScores, finalScores);
        answer[1] = func_b(midScores, finalScores);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] midScores = {20, 50, 40};
        int[] finalScores = {10, 50, 70};
        int[] ret = sol.solution(midScores, finalScores);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.print("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.println(" 입니다.");
    }

}
```

---

#### 매개변수 설명
학번순으로 중간시험 점수를 담은 배열 midScores와 학번순으로 기말시험 점수를 담은 배열 finalScores가 solution 메소드의 매개변수로 주어집니다. 

* 시험 점수는 100 이하인 자연수입니다.
* midScores의 길이는 5 이상 50 이하입니다.
* 배열 midScores의 길이와 배열 finalScores의 길이는 같습니다.

---

#### return 값 설명
성적이 가장 많이 오른 학생의 점수 차이를 **배열 첫 번째 원소** 로 하고,  성적이 가장 많이 떨어진 학생의 점수 차이를 **두 번째 원소** 로 담은 배열을 return 해주세요.
* 점수가 오른 학생이 없으면 첫 번째 원소에 0을 넣고, 점수가 떨어진 학생이 없으면 두 번째 원소에 0을 넣도록 합니다.


#### 예시

| midScores |finalScores |return |
|---|---|---|
| [20, 50, 40] | [10, 50, 70]|[30, -10]|

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_04/no_08/desc_08.md "cosPro 2급 Java 4차 8번 문제")
