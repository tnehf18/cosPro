# 문제6

두 학생 A와 B는 계단 게임을 하였습니다.
계단 게임의 규칙은 아래와 같습니다.

~~~
1. 계단 제일 아래에서 게임을 시작합니다. (0번째 칸)
2. 가위바위보를 합니다.
3. 이기면 계단 세 칸을 올라가고, 지면 한 칸을 내려가고, 비기면 제자리에 있습니다.
4. 계단 제일 아래에서 지면 제자리에 있습니다.
5. 2~4 과정을 열 번 반복합니다.
~~~

A와 B가 계단 게임을 완료한 후에, A가 계단 위 몇 번째 칸에 있는지 파악하려고 합니다.

A와 B가 낸 가위바위보 기록이 순서대로 들어있는 배열 recordA와 recordB가 매개변수로 주어질 때, 게임을 마친 후의 A의 위치를 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int func(int record) {
        if(record == 0) return 1;
        else if(record == 1) return 2;
        return 0;
    }

    public int solution(int[] recordA, int[] recordB) {
        int cnt = 0;
        for(int i = 0; i < recordA.length; i++) {
            if(recordA[i] == recordB[i])
                continue;
            else if(recordA[i] == func(recordB[i]))
                cnt = cnt + 3;
            else
                cnt = cnt - 1;
        }
        return cnt;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] recordA = {2,0,0,0,0,0,1,1,0,0};
        int[] recordB = {0,0,0,0,2,2,0,2,2,2};
        int ret = sol.solution(recordA, recordB);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
    
}
```

---

#### 매개변수 설명
A와 B가 낸 가위바위보 기록이 순서대로 들어있는 배열 recordA와 recordB가 매개변수로 주어집니다.
* recordA와 recordB의 원소는 0, 1, 2중 하나이고 순서대로 가위, 바위, 보를 의미합니다.
* recordA와 recordB의 길이는 10입니다.

---

#### return 값 설명
solution 메소드는 계단 게임을 마친 후에 A가 계단 위 몇 번째 칸에 위치하는지를 return 합니다.
* 계단 제일 아래 칸은 0번째 칸입니다.

---

#### 예시

| recordA              | recordB              | return |
|-----------------------|-----------------------|--------|
| [2,0,0,0,0,0,1,1,0,0] | [0,0,0,0,2,2,0,2,2,2] | 14     |

#### 예시 설명

||||||||||||
|----------|------|------|------|------|------|------|------|------|------|------|
| recordA | 보   | 가위 | 가위 | 가위 | 가위 | 가위 | 바위 | 바위 | 가위 | 가위 |
| recordB | 가위 | 가위 | 가위 | 가위 | 보   | 보   | 가위 | 보   | 보   | 보   |
| result   | 0    | 0    | 0    | 0    | +3   | +6   | +9   | +8   | +11  | +14  |

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_01/no_07/desc_07.md "cosPro 1급 Java 1차 7번 문제")
