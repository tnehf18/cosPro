# 문제7

카프리카 수는 다음을 만족하는 수를 뜻합니다.

* 자신의 제곱수를 둘로 나누어 더한 값이 자기 자신과 같습니다.
* 단, 둘로 나뉜 수는 모두 양수여야 합니다.

예를 들어, 55^2 는 3,025입니다. 3,025는 3과 025, 30과 25, 302와 5로 나눌 수 있습니다. 이때 30+25 = 55이므로 55는 카프리카 수입니다.

자연수 k가 매개변수로 주어질 때, k 이하인 모든 카프리카 수를 배열에 담아 오름차순으로 정렬하여 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되었기 때문에, 코드가 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해 모든 입력에 대해 올바르게 동작하도록 수정해주세요.

### 초기 변수

```
import java.util.*;

class Solution {

    public int[] solution(int k) {
        int[] kaprekarArr = new int[k];
        int count = 0;
        for (int i = 1; i <= k; i++) {
        	long squareNum = i * i;
        	long divisor = 1;
        	while (squareNum % divisor != 0) {
        		long front = squareNum / divisor;
        		long back = squareNum % divisor;
        		divisor *= 10;
        		if (back != 0 && front != 0)
        			if (front + back == i) {
        				kaprekarArr[count] = i;
        				count++;
        			}
        	}
        }
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) 
        	answer[i] = kaprekarArr[i];
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int k = 500;
        int[] ret = sol.solution(k);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
자연수 k가 solution 메소드의 매개변수로 주어집니다.
* k는 50 이상 100,000 이하인 자연수입니다.

---

#### return 값 설명
k 이하인 모든 카프리카 수를 배열에 담아 오름차순으로 정렬하여 return 해주세요.

* 100,000 이하인 카프리카 수는 100개보다 작습니다.

---

#### 예시

| k   | return               |
|-----|----------------------|
| 500 | [9, 45, 55, 99, 297] |

#### 예시 설명

9 x 9 = 81 → 8 + 1 = 9
45 x 45 = 2,025 → 20 + 25 = 45
55 x 55 =  3,025 → 30 + 25 = 55
99 x 99 = 9,801 → 98 + 01 = 99
297 x 297 = 88,209 → 88 + 209 = 297

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_03/no_08/desc_08.md "cosPro 1급 Java 3차 8번 문제")
