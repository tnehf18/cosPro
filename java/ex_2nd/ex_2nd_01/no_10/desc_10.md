# 문제10

평균은 자료의 합을 자료의 개수로 나눈 값을 의미합니다. 자연수가 들어있는 배열의 평균을 구하고, 평균 이하인 숫자는 몇 개 있는지 구하려합니다.

예를 들어 주어진 배열이 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]이라면, 평균은 5.5이므로 배열에서 평균 이하인 값은 5개입니다.

자연수가 들어있는 배열 data가 매개변수로 주어질 때, 배열에 평균 이하인 값은 몇 개인지 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int[] data) {
        double total = 0;
        int len = data.length;
        for(int i = 0; i < len; i++)
            total += data[i];
        int cnt = 0;
        double average = len / total;
        for(int i = 0; i < len; i++)
            if (data[i] <= average)
                cnt += 1;
        return cnt;
    }
    
    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] data1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ret1 = sol.solution(data1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int[] data2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 10};
        int ret2 = sol.solution(data2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
    
}
```

---

#### 매개변수 설명
자연수가 들어있는 배열 data가 solution 메소드의 매개변수로 주어집니다.

* data의 길이는 10 이상 100 이하 정수입니다.
* data의 원소는 1 이상 1,000 이하의 자연수입니다.

---

#### return 값 설명
평균보다 값이 작은 자연수는 몇개인지 return 해주세요.

---

#### 예시

| data                            | return |
|---------------------------------|--------|
| [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] | 5      |
| [1, 1, 1, 1, 1, 1, 1, 1, 1, 10] | 9      |

---

#### 예시 설명

예시 #1

자료의 합은 55이며, 자료의 개수는 10개입니다. 따라서 평균은 55 / 10 = 5.5입니다.
주어진 배열에서 5.5보다 작은 숫자는 총 5개입니다.

예시 #2

자료의 합은 19이며, 자료의 개수는 10개입니다. 따라서 평균은 19 / 10 = 1.9입니다.
주어진 배열에서 1.9보다 작은 숫자는 총 9개입니다.

---

### → 정답 확인
