# 문제9

모 매장에서는 팝업스토어를 열려고 합니다. 팝업스토어란 한정 기간 문을 여는 매장입니다. 팝업스토어는 k일 동안 연속해서 열 예정입니다. n일 동안의 추정 매출액이 주어질 때, 언제 팝업스토어를 열어야 가장 매출이 높을지 알아보려 합니다.

n일 간의 추정 매출액이 담긴 배열 revenue와 팝업스토어를 열 날의 수 k가 매개변수로 주어질 때, 최대 매출액 합을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int[] revenue, int k) {
        int answer = 0;
        int n = revenue.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += revenue[i];
        }
        answer = sum;
        for (int i = 0; i < n; i++) {
            sum = sum - revenue[i - k] + revenue[i];
            if (answer < sum)
                answer = sum;
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] revenue1 = {1, 1, 9, 3, 7, 6, 5, 10};
        int k1 = 4;
        int ret1 = sol.solution(revenue1, k1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] revenue2 = {1, 1, 5, 1, 1};
        int k2 = 1;
        int ret2 = sol.solution(revenue2, k2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");        
    }
    
}
```

---

#### 매개변수 설명

추정 매출액이 담긴 배열 revenue와 팝업스토어를 열 날의 수 k가 solution 메소드의 매개변수로 주어집니다.

* revenue의 길이는 1 이상 200,000 이하입니다.
* revenue의 원소는 10,000 이하의 자연수입니다.
* k는 1 이상 100,000 이하이고, revenue의 길이보다 작거나 같습니다.

---

#### return 값 설명

최대 매출액 합을 return 해주세요.

---

#### 예시

| revenue | k | return |
|----------------|---|--------|
| [1, 1, 9, 3, 7, 6, 5, 10] | 4 | 28 |
| [1, 1, 5, 1, 1] | 1 | 5 |

#### 예시 설명

예시 #1

4일간 매출액 합이 최대가 되는 경우는 [7, 6, 5, 10]입니다. 따라서 최대 매출액은 28입니다.

예시 #2

1일간 매출액 합이 최대가 되는 경우는 [5]입니다. 따라서 최대 매출액은 5입니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_03/no_10/desc_10.md "cosPro 1급 Java 3차 10번 문제")
