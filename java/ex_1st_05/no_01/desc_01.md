# 문제1

계단 n칸을 올라가는 방법의 수를 구하려고 합니다. 계단은 한 번에 1계단, 2계단, 3계단씩 오를 수 있습니다.
예를 들어, 계단 3칸을 오르는 방법은 다음과 같이 4가지가 있습니다.

```
1. 1계단 + 1계단 + 1계단
2. 1계단 + 2계단
3. 2계단 + 1계단
4. 3계단
```

계단 수 n이 매개변수로 주어질 때, 계단을 오르는 경우의 수를 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    public int solution(int n) {
        int answer = 0;

        int[] steps = new int[n+1];
        steps[1] = 1;
        steps[2] = 2;
        steps[3] = 4;
        for(int i = 4; i <= n; i++)
        	steps[i] = @@@;
        answer = steps[n];

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution sol = new Solution();
      
    	int n1 = 3;
    	int ret1 = sol.solution(n1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int n2 = 4;
    	int ret2 = sol.solution(n2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명

계단 수 n이 solution 메소드의 매개변수로 주어집니다.
* n은 3 이상 30 이하인 정수입니다.

---

#### return 값 설명

계단을 오르는 경우의 수를 return 합니다.

---

#### 입출력 예

| n | return |
|---|--------|
| 3 | 4     |
| 4 | 7     |

#### 입출력 예 설명

예시 #1

문제에 나온 예와 같습니다.

예시 #2

계단 4칸을 오르는 방법은 다음과 같이 7가지가 있습니다.

```
1. 1계단 + 1계단 + 1계단 + 1계단
2. 1계단 + 1계단 + 2계단
3. 1계단 + 2계단 + 1계단
4. 2계단 + 1계단 + 1계단
5. 1계단 + 3계단
6. 3계단 + 1계단
7. 2계단 + 2계단
```
