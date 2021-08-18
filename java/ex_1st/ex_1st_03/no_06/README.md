# 문제6

어떤 수를 서로 다른 소수 3개의 합으로 표현하는 방법의 수를 구하려 합니다.

예를 들어 33은 총 4가지 방법으로 표현할 수 있습니다.

1. 3+7+23
2. 3+11+19
3. 3+13+17
4. 5+11+17

자연수 n이 매개변수로 주어질 때, n을 서로 다른 소수 3개의 합으로 표현하는 방법의 수를 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

※ 1,000 이하인 소수는 168개 있습니다.

### 초기 코드

```
import java.util.ArrayList;

class Solution {

    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for (int i = 3; i <= n; i += 2) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++)
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            if (@@@)
                primes.add(i);
        }
        
        int primeLen = primes.size();
        for (int i = 0; i < primeLen - 2; i++)
            for (int j = i + 1; j < primeLen - 1; j++)
                for (int k = j + 1; k < primeLen; k++)
                    if (@@@)
                        answer++;
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n1 = 33;
        int ret1 = sol.solution(n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int n2 = 9;
        int ret2 = sol.solution(n2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    } 
    
}
```

---

#### 매개변수 설명

n이 solution 메소드의 매개변수로 주어집니다.

* n은 1,000 이하인 자연수입니다.

---

#### return 값 설명

n을 서로 다른 소수 3개의 합으로 표현하는 방법의 수를 return 해주세요.
* 만약, n을 서로 다른 소수 3개의 합으로 표현할 수 없다면 0을 return  해주세요.

---

#### 예시

| n | return |
|---|--------|
| 33 | 4 |
| 9 | 0 |

#### 예시 설명

예시 #1

문제에 나온 예와 같습니다.

예시 #2

9는 서로 다른 세 소수의 합으로 나타낼 수 없습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_03/no_07/ "cosPro 1급 Java 3차 7번 문제")
