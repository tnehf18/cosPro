# 문제8

A씨가 하루에 TV를 두 대 이상 트는 시간을 알아내려합니다. A씨는 매일 세 프로그램을 시청합니다. 프로그램 방송 시간이 겹칠 때는 TV를 여러 대 켜서 모든 프로그램을 봅니다.

예를 들어 두 프로그램 방송 시간대가 겹치면 TV를 두 대 켜고, 세 프로그램 방송 시간이 겹치면 TV를 세 대 켭니다.

세 프로그램 방영 시작 시각과 끝 시각이 담긴 2차원 배열 programs가 매개변수로 주어질 때, 하루에 TV를 2대 이상 트는 총 시간을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int[][] programs) {
        int answer = 0;
        int[] usedTv = new int[25];

        for(int i = 0; i < programs.length; i++)
            for(int j = programs[i][0]; j < programs[i][1]; j++)
                usedTv[j]++;
        
        for(int i = 0; i < 25; i++)
            if(usedTv[i] >= 1)
                answer++;
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] programs = {{1, 6}, {3, 5}, {2, 8}};
        int ret = sol.solution(programs);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
3개의 프로그램이 시작되는 시각과 끝나는 시각이 담긴 2차원 배열 programs가 solution 메소드의 매개변수로 주어집니다.

* programs의 행 길이는 항상 3입니다.
* programs 배열의 각 원소는 각 프로그램의 방송 시간이 [시작 시각, 끝 시각] 형태로 들어있습니다.
* 프로그램의 시작 시각과 끝 시각은 0 이상 24 이하의 정수입니다.
* 프로그램의 시작 시각은 끝 시각보다 항상 빠릅니다.

---

#### return 값 설명
A 씨가 TV를 2대 이상 트는 총 시간을 return 해주세요.

---

#### 예시

| programs            		 | return |
|--------------------------|--------|
| [[1, 6], [3, 5], [2, 8]] | 4     |

---

#### 예시 설명

2대의 TV를 트는 시간이 2시부터 3시까지, 5시부터 6시까지 총 2시간이고
3대의 TV를 트는 시간이 3시부터 5시까지 총 2시간입니다.
따라서 TV를 2대 이상 트는 시간은 총 4시간입니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_03/no_09/ "cosPro 2급 Java 3차 9번 문제")
