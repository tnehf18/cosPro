# 문제4

오름차순으로 정렬되어있는 두 배열 arrA, arrB를 하나의 배열로 합치려 합니다. 단, 합친 후의 배열도 오름차순으로 정렬되어 있어야 합니다.

예를 들어 arrA = [-2, 3, 5, 9], arrB = [0, 1, 5]인 경우 두 배열을 오름차순으로 정렬된 하나의 배열로 합치면 [-2, 0, 1, 3, 5, 5, 9]가 됩니다.

오름차순으로 정렬된 두 배열 arrA와 arrB가 주어졌을 때, 두 배열을 오름차순으로 정렬된 하나의 배열로 합쳐서 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
import java.util.*;

class Solution {

    public int[] solution(int[] arrA, int[] arrB) {
        int arrA_idx = 0, arrB_idx = 0;
        int arrA_len = arrA.length;
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
        while(@@@) {
            if(arrA[arrA_idx] < arrB[arrB_idx])
                answer[answer_idx++] = arrA[arrA_idx++];
            else
                answer[answer_idx++] = arrB[arrB_idx++];
        }
        while(@@@)
            answer[answer_idx++] = arrA[arrA_idx++];
        while(@@@)
            answer[answer_idx++] = arrB[arrB_idx++];
        return answer;
    }
    
    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arrA = {-2, 3, 5, 9};
        int[] arrB = {0, 1, 5};
        int[] ret = sol.solution(arrA, arrB);
 
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
    
}
```

---

#### 매개변수 설명
오름차순으로 정렬된 두 배열 arrA와 arrB가 solution 메소드의 매개변수로 주어집니다.

* arrA의 길이는 1 이상 200,000 이하입니다.
* arrA의 원소는 -1,000,000 이상 1,000,000 이하의 정수입니다.
* arrB의 길이는 1 이상 200,000 이하입니다.
* arrB의 원소는 -1,000,000 이상 1,000,000 이하의 정수입니다.

---

#### return 값 설명
두 배열 arrA, arrB를 오름차순으로 정렬된 하나의 배열로 합쳐서 return 해주세요.

---

#### 예시

| arrA          | arrB      | return                 |
|---------------|-----------|------------------------|
| [-2, 3, 5, 9] | [0, 1, 5] | [-2, 0, 1, 3, 5, 5, 9] |
