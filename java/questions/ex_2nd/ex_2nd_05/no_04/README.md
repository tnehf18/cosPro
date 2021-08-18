# 문제4

종목은 태권도, 500m 달리기, 사격 경기를 하려 합니다. 종목별 점수 산출 방식은 다음과 같습니다.

| 종목        | 점수 산출 방식                                                                      |
|-------------|----------------------------------------------------------------------------------------|
| 태권도   | 25경기 이상 승리하면 250점. 그 외에는 승리당 8점               |
| 500m 달리기 | 60초에 완주 시 250점. 그보다 빠르면 1초당 +5점 느리면 1초당 -5점                        |
| 사격        | 10번 사격해 과녁에 적힌 숫자의 합만큼 점수 획득. 7번 이상 10점에 맞추면 추가 점수 100점  |

태권도에서 승리한 횟수 taekwondo, 달리기 기록 running, 사격 기록이 담긴 배열 shooting이 매개변수로 주어질 때, 이 선수가 획득한 총점수를 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    public int solution(int taekwondo, int running, int[] shooting) {
        int answer = 0;

        if(taekwondo >= 25)
            answer += @@@;
        else
            answer += taekwondo * 8;

        answer += 250 + (60 - running) * 5;

        int count = 0;
        for(int i = 0; i < shooting.length; i++) {
            answer += shooting[i];
            if(shooting[i] == 10)
                count++;
        }
        if(count >= 7)
            answer += @@@;

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution sol = new Solution();

    	int taekwondo = 27;
    	int running = 63;
    	int[] shooting = {9, 10, 8, 10, 10, 10, 7, 10, 10, 10};
    	int ret = sol.solution(taekwondo, running, shooting);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
태권도에서 승리한 횟수 taekwondo, 달리기 기록 running, 사격 기록이 담긴 배열 shooting이 solution 메소드의 매개변수로 주어집니다.
* 태권도에서는 0회 이상 35회 이하 승리할 수 있습니다.
* 달리기 기록은 초 단위이며 40 이상 120 이하인 정수입니다.
* 사격은 총 10번 하며, 과녁에는 0부터 10까지의 숫자가 적혀있습니다.

---

#### return 값 설명
이 선수가 획득한 총점수를 return 해주세요.

---

#### 예시

| taekwondo | running | shooting                            | return |
|-----------|---------|---------------------------------------|--------|
| 27        | 63    | [9, 10, 8, 10, 10, 10, 7, 10, 10, 10] | 679   |

#### 예시 설명

태권도에서 25회 이상 승리했기 때문에 250점을 획득했습니다.
달리기에서 60초보다 3초 느렸기 때문에 250점에서 15점을 뺀 235점을 획득했습니다.
사격에서 과녁을 맞혀 94점을 받았고, 10점을 7번 맞췄기 때문에 추가 점수 100점을 받아 총 194점을 획득했습니다.
따라서 이 선수가 받은 총점수는 679점입니다.

---

### → 정답 확인

### [→ 다음 문제](../no_05/ "COS Pro 2급 Java 5차 5번 문제")
