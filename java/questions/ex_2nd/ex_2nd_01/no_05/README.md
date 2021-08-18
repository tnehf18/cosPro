# 문제5

주어진 배열의 순서를 뒤집으려고 합니다.

예를 들어 주어진 배열이 [1, 4, 2, 3]이면, 순서를 뒤집은 배열은 [3, 2, 4, 1]입니다.

정수가 들어있는 배열 arr가 매개변수로 주어졌을 때, arr를 뒤집어서 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
import java.util.*;

class Solution {

    public int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(@@@) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
        return arr;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] arr = {1, 4, 2, 3};
        int[] ret = sol.solution(arr);
 
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
    
}
```

---

#### 매개변수 설명
정수가 들어있는 배열 arr가 solution 메소드의 매개변수로 주어집니다.

* arr의 길이는 1 이상 100 이하입니다.
* arr의 원소는 -100 이상 100 이하의 정수입니다.

---

#### return 값 설명
배열 arr의 순서를 뒤집어서 return 해주세요.

---

#### 예시

| arr          | return       |
|--------------|--------------|
| [1, 4, 2, 3] | [3, 2, 4, 1] |

#### 예시 설명
[1, 4, 2, 3]을 뒤에서부터 읽으면 3, 2, 4, 1입니다. 따라서 [1, 4, 2, 3]의 순서를 뒤집은 결과는 [3, 2, 4, 1]이 됩니다.

---

### → 정답 확인

### [→ 다음 문제](../no_06/ "COS Pro 2급 Java 1차 6번 문제")
