# 문제7

주스 1잔을 만들려면 사과 3개와 당근 1개가 필요합니다. 그런데 키우는 토끼에게 먹이를 주기 위해 사과와 당근 종류에 상관없이 k개를 빼놓으려고 합니다. 주스는 최대한 많이 만들수록 좋습니다.

사과 개수 numApple과 당근 개수 numCarrot, 토끼에게 줄 먹이 개수 k가 주어질 때 주스를 최대 몇 잔 만들 수 있는지 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int numApple, int numCarrot, int k) {
        int answer = 0;
        
        if(numApple < 3 * numCarrot)
            answer = numApple / 3;
        else
            answer = numCarrot;
        
        numApple -= 3 * answer;
        numCarrot -= answer;

        for(int i = 0; k - (numApple + numCarrot + i) > 0; i++)
            if(i % 4 == 0)
                answer++;
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int numApple1 = 5;
        int numCarrot1 = 1;
        int k1 = 2;
        int ret1 = sol.solution(numApple1, numCarrot1, k1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int numApple2 = 10;
        int numCarrot2 = 5;
        int k2 = 4;
        int ret2 = sol.solution(numApple2, numCarrot2, k2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }

}
```

---

#### 매개변수 설명
사과 개수 numApple과 당근 개수 numCarrot, 토끼에게 줄 먹이 개수 k가 solution 메소드의 매개변수로 주어집니다.

* 사과 개수 numApple과 당근 개수 numCarrot는 0 이상 200 이하인 정수입니다.
* 토끼에게 줄 먹이 개수 k는 0 이상 `numApple+numCarrot` 이하인 정수입니다.

---

#### return 값 설명
주스를 최대 몇 잔 만들 수 있는지 return 해주세요.

---

#### 예시

| numApple | numCarrot | k | return |
|----|---|---|--------|
| 5  | 1 | 2 | 1  	|
| 10 | 5 | 4 | 2  	|

#### 예시 설명

예시 #1

사과 2개를 먹이로 주면 사과 3개, 당근 1개가 남습니다. 남은 재료로 주스를 1잔 만들 수 있습니다.

예시 #2

사과 2개와 당근 2개를 먹이로 주면 사과 8개, 당근 3개가 남습니다. 남은 재료로 주스를 2잔 만들 수 있습니다.

---

### → 정답 확인

### [→ 다음 문제](../no_08/ "COS Pro 2급 Java 3차 8번 문제")
