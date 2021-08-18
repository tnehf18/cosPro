# 문제5

열량이 적힌 식단표가 있습니다.
다이어트를 하는 A 씨는 오늘 먹는 열량이 그동안 먹은 식단의 열량 중 최솟값보다 큰 경우 운동을 하여 그 차이만큼을 소모합니다.

예를 들어, 식단의 열량이 [713, 665, 873, 500, 751]이라면 둘째 날까지는 운동을 하지 않습니다. 셋째 날 식단의 열량이 873이고 그 전의 먹은 열량의 최솟값이 665이므로 208 열량을 소모하기 위한 운동을 합니다. 넷째 날은 운동을 하지 않고 다섯째 날 식단의 열량이 751이고 그 전의 먹은 열량의 최솟값이 500이므로 251 열량을 소모하기 위한 운동을 합니다. 따라서 운동으로 소모하는 총열량은 459입니다.

식단의 열량을 담고 있는 배열 calorie가 매개변수로 주어질 때, 운동으로 소모하는 총열량을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <U>**한 줄**</U>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
import java.util.*;

class Solution {

    public int solution(int[] calorie) {
        int minCal = 0;
        int answer = 0;
        for(int i=0; i<calorie.length; i++) {
            if(calorie[i] > minCal)
                answer += calorie[i] - minCal;
            else
                minCal = calorie[i];
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] calorie = {713, 665, 873, 500, 751};
        int ret = sol.solution(calorie);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

---

#### 매개변수 설명
식단의 열량을 담고 있는 배열 calorie가 solution 메소드의 매개변수로 주어집니다.

* calorie의 각 원소는 0보다 크고 1,000보다 작거나 같은 자연수입니다.
* calorie의 길이는 0보다 크고 100보다 작거나 같은 자연수입니다.

---

#### return 값 설명
운동으로 소모하는 총열량을 return 해주세요.

---
#### 예시

| calorie                   | return |
|---------------------------|--------|
| [713, 665, 873, 500, 751] | 459     |

#### 예시 설명
문제의 예와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_04/no_06/ "cosPro 2급 Java 4차 6번 문제")