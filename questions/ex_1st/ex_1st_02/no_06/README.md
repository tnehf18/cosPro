# 문제6
로봇이 아래 그림과 같이 2차원 평면의 원점 (0, 0)에 서있습니다. 

![20180417_grid2.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/5a4105b974/62a0c11c-4f91-41d1-9c83-f0cb33ffe9cf.png)

이 로봇은 x축 방향, 혹은 y축 방향으로만 움직일 수 있으며, 알파벳으로 명령을 내릴 수 있습니다. 명령을 내릴 때 사용하는 알파벳은 'L', 'R', 'U', 'D'의 4가지이며, 'L'은 x축 방향으로 -1만큼, 'R'은 x축 방향으로 +1만큼, 'U'는 y축 방향으로 +1만큼, 'D'는 y축 방향으로 -1 만큼 이동하라는 의미입니다. 

로봇에게 내린 명령이 순서대로 들어있는 문자열 commands가 매개변수로 주어질 때, 주어진 명령을 모두 수행한 후의 로봇 위치를 return 하도록 solution 메소드를 완성해주세요.

### 초기 코드

```
class Solution {

    public int[] solution(String commands) {
        // 여기에 코드를 작성해주세요.
        int[] answer = {};
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String commands = "URDDL";
        int[] ret = sol.solution(commands);
    
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
 
}
```

---

#### 매개변수 설명
로봇에게 내린 명령이 순서대로 들어있는 문자열 commands가 solution 메소드의 매개변수로 주어집니다.
* commands는 알파벳 대문자 'L', 'R', 'U', 'D'로만 이루어진 문자열이며, 길이는 1 이상 100 이하입니다.

---

#### return 값 설명
주어진 명령을 모두 수행한 후의 로봇 위치를 return 해주세요.
* [x축 좌표, y축 좌표] 형태로 로봇의 최종 위치를 배열에 담아 return 해주세요.

---

#### 예시

| commands | return  |
|------------|---------|
| "URDDL"    | [0, -1] |

#### 예시 설명

"URDDL"명령에 따라 (0, 0)에 있는 로봇은 다음과 같이 움직입니다.

* [0, 0] → [0, 1] → [1, 1] → [1, 0] → [1, -1] → [0, -1]

따라서 로봇의 최종 위치는 [0, -1]입니다.

---

### → 정답 확인

### [→ 다음 문제](../no_07/ "COS Pro 1급 Java 2차 7번 문제")
