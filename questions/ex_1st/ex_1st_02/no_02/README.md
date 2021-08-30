# 문제2

A 지하철역의 오늘 하루 지하철 도착 시각이 순서대로 들어있는 배열이 있습니다. 현재 시간이 주어졌을 때, 지하철을 타기위해서는 최소 몇 분을 기다려야 하는지 구하려 합니다. 이를 위해 다음과 같이 프로그램 구조를 작성했습니다.

~~~
1. 00:00을 기준으로 해서 현재 시각을 분 단위로 변환합니다.
2. 배열을 순회하며 다음을 수행합니다.
  2-1. 00:00을 기준으로, 각 지하철 도착 시각을 분 단위로 변환합니다.
  2-2. 현재 시각과 지하철 도착 시각을 비교하여 최소 대기 시간을 구합니다.
3. 2번 단계에서 구한 최소 대기 시간을 return 합니다.
~~~

오늘 하루 동안의 지하철 도착 시각이 순서대로 들어있는 배열 subwayTimes와 현재시간 currentTime이 매개변수로 주어질 때, 지하철을 타기 위해 기다려야 하는 최소 대기 시간을 return 하도록 solution 메소드를 작성했습니다. 이때, 위 구조를 참고하여 중복되는 부분은 func_a라는 메소드로 작성했습니다. 코드가 올바르게 동작할 수 있도록 빈칸을 알맞게 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    public int func_a(String times) {
        int hour = Integer.parseInt(times.substring(0, 2));
        int minute = Integer.parseInt(times.substring(3));
        return hour*60 + minute;
    }
    
    public int solution(String[] subwayTimes, String currentTime) {
        int currentMinute = func_a(@@@);
        int INF = 1000000000;
        int answer = INF;
        for(int i = 0; i < subwayTimes.length; ++i) {
            int subwayMinute = func_a(@@@);
            if(@@@) {
                answer = subwayMinute - currentMinute;
                break;
            }
        }
        if(answer == INF)
            return -1;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String[] subwayTimes1 = {"05:31", "11:59", "13:30", "23:32"};
        String currentTime1 = "12:00";
        int ret1 = sol.solution(subwayTimes1, currentTime1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] subwayTimes2 = {"14:31", "15:31"};
        String currentTime2 = "15:31";
        int ret2 = sol.solution(subwayTimes2, currentTime2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
    
}

```

---

#### 매개변수 설명
오늘 하루 동안의 지하철 도착 시각이 순서대로 들어있는 배열 subwayTimes와 현재시간 currentTime이 solution 메소드의 매개변수로 주어집니다. 

* subwayTimes의 길이는 1 이상 100 이하입니다.
* subwayTimes에는 지하철 도착 시간이 중복없이 들어있습니다.
* 지하철 도착 시각과 현재 시각은 24시간 표기법을 이용하여 나타냅니다.
  * 24시간 표기법은 00:00부터 23:59까지로 시간을 표기합니다.
  * 입력으로 주어지는 시간은 항상 "XX:YY"형태로 주어집니다.
* 지하철 첫차 도착 시각은 05:00 이후이며, 막차 도착 시각은 23:59 이전입니다.

---

#### return 값 설명
지하철을 타기 위해 기다려야 하는 최소 대기 시간을 return 해주세요.
* 만약 오늘 탈 수 있는 지하철이 없다면 -1을 return 하면 됩니다.

---

#### 예시

| subwayTimes                | currentTime | return |
|-----------------------------|--------------|--------|
| ["05:31", "11:59", "13:30", "23:32"] | "12:00"      | 90     |
| ["14:31", "15:31"]          | "15:31"      | 0      |

#### 예시 설명

예시 #1

현재시간 12:00에서 가장 가까운 지하철 도착 시각은 13:30입니다.
따라서 최소 90분을 기다려야 합니다.

예시 #2

현재 시각은 15:31이며, 15:31분에 도착하는 지하철에 탑승할 수 있습니다. 따라서 0분만 기다리면 됩니다.

---

### → 정답 확인

### [→ 다음 문제](../no_03/ "COS Pro 1급 Java 2차 3번 문제")
