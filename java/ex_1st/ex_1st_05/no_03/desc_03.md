# 문제3

서로 다른 정수 n개가 담긴 배열이 있습니다. 이 배열을 앞 `(n+1)/2`개 원소는 증가하고 뒤 `(n+1)/2`개 원소는 감소하도록 정렬하려고 합니다. 이때, 조건을 만족하는 배열이 여럿인 경우 사전순으로 가장 먼저 나오는 배열을 답으로 합니다. 예를 들어, 주어진 배열이 [7, 3, 4, 1, 2, 5, 6]라면 정렬한 이후에는 [1, 2, 3, 7, 6, 5, 4]가 됩니다.

정수 배열 numbers가 매개변수로 주어질 때, 문제의 조건에 맞게 정렬하여 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
import java.util.*;

class Solution {

    public void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
	numbers[i] = numbers[j];
	numbers[j] = tmp;
    }

    public int[] solution(int[] numbers) {
        int[] answer = {};

        Arrays.sort(numbers);
        int mid = (numbers.length - 1) / 2;
        swap(numbers, mid, numbers.length-1);

        int left = mid + 1;
        int right = numbers.length - 1;
        while(left <= right) {
	    swap(numbers, left, right);
	    left = left + 1;
	    right = right - 1;
        }

        answer = numbers;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Solution sol = new Solution();
      
    	int[] numbers = {7, 3, 4, 1, 2, 5, 6};
    	int[] ret = sol.solution(numbers);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.print("solution 메소드의 반환 값은 {");
    	for(int i = 0; i < ret.length; i++) {
    		if(i != 0)
    			System.out.print(", ");
    		System.out.print(ret[i]);
    	}
    	System.out.println("} 입니다.");
    }
    
}
```

---

#### 매개변수 설명

정수 배열 numbers가 solution 메소드의 매개변수로 주어집니다.
* numbers의 각 원소는 -1,000 이상 1,000 이하인 정수이며, 중복되는 수는 없습니다.
* numbers의 길이는 3 이상 10,000 이하인 홀수입니다.

---

#### return 값 설명

주어진 배열을 앞 `(n+1)/2`개 원소는 증가하고 뒤 `(n+1)/2`개 원소는 감소하도록 정렬하여 return 합니다.
조건을 만족하는 배열이 여럿인 경우 사전순으로 가장 먼저 나오는 배열을 답으로 합니다.

---
#### 입출력 예

| numbers               | return                |
|-----------------------|-----------------------|
| [7, 3, 4, 1, 2, 5, 6] | [1, 2, 3, 7, 6, 5, 4] |

#### 입출력 예 설명

문제에 나온 예와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_05/no_04/desc_04.md "cosPro 1급 Java 5차 4번 문제")
