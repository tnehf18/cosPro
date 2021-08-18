# 문제4

자연수가 중복 없이 들어있는 배열이 있습니다. 이 배열에서 합이 K의 배수가 되도록 서로 다른 숫자 세개를 고르는 방법은 몇 가지인지 세려고 합니다.

자연수가 들어있는 배열 arr가 매개변수로 주어질 때, 이 배열에서 합이 K의 배수가 되도록 서로 다른 숫자 세개를 고르는 방법의 가짓수를 return 하도록 solution 메소드를 완성해주세요.

### 초기 코드

```
//다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {

    public int solution(int[] arr, int K) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);
    
    
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
 
}
```

---

#### 매개변수 설명

자연수가 들어있는 배열 arr가 solution 메소드의 매개변수로 주어집니다.
* arr의 길이는 3 이상 100 이하입니다.
* arr에는 1 이상 1,000 이하의 자연수가 중복 없이 들어있습니다.
* K는 1 이상 10 이하의 자연수입니다.

---

#### return 값 설명

배열에서 합이 K의 배수가 되도록 서로 다른 숫자 세개를 고르는 방법의 가짓수를 return 해주세요.
* 그러한 방법이 없다면 0을 return 하면 됩니다.

---

#### 예시

| arr             | K | return |
|-----------------|---|--------|
| [1, 2, 3, 4, 5] | 3 | 4      |

#### 예시 설명

다음과 같이 4가지 방법이 있습니다.

* 1 + 2 + 3 = 6
* 1 + 3 + 5 = 9
* 2 + 3 + 4 = 9
* 3 + 4 + 5 = 12

---

### → 정답 확인

### [→ 다음 문제](../no_05/ "COS Pro 1급 Java 2차 5번 문제")
