# 문제2

공강이란 수업 시간 사이에 수업이 없이 비는 시간입니다. 시간표가 주어질 때 공강은 총 몇 시간인지 구하려 합니다. 시간표 상에 수업이 있는 시간은 1로, 수업이 없는 시간은 0으로 표시합니다. 모든 수업은 정각에 시작해 1시간 뒤에 끝납니다.

  ![스크린샷 2018-10-18 오전 10.04.02.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/249829888e/337a6f09-4e9d-4a31-8406-bc2c95652273.png)

예를 들어, 위 시간표에서 공강은 총 3시간입니다. 
공강이 총 몇 시간인지 구하기 위해 다음과 같이 프로그램 구조를 작성했습니다.

### 초기 코드

```
class Solution {

    public int func_a(int[] timeTable) {
        int answer = 0;
        for(int i = timeTable.length-1; i >= 0; i--) {
            if(timeTable[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int func_b(int[] timeTable, int class1, int class2) {
        int answer = 0;
        for(int i = class1; i < class2; i++)
            if(timeTable[i] == 0)
                answer++;
        return answer;
    }

    public int func_c(int[] timeTable) {
        int answer = 0;
        for(int i = 0; i < timeTable.length; i++) {
            if(timeTable[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int solution(int[] timeTable) {
        int answer = 0;
        int firstClass = func_@@@(@@@);
        int lastClass = func_@@@(@@@);
        answer = func_@@@(@@@);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution sol = new Solution();
        
    	int[] timeTable = {1, 1, 0, 0, 1, 0, 1, 0, 0, 0};
    	int ret = sol.solution(timeTable);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

```
1. 가장 첫 수업 시작 시각을 구합니다.
2. 가장 마지막 수업 시작 시각을 구합니다.
3. 1과 2사이에서 수업이 없는 시간을 셉니다.
```

시간표를 표현한 배열 time_table이 매개변수로 주어질 때 공강은 총 몇 시간인지 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

---
#### 매개변수 설명
시간표를 표현한 배열 time_table이 solution 메소드의 매개변수로 주어집니다.

* time_table은 길이가 5 이상 15 이하인 배열입니다.
* 시간표에서 수업이 있는 시간은 1로 표현하고 수업이 없는 시간은 0입니다.
* time_table의 원소는 0 또는 1입니다.

---

#### return 값 설명
공강이 총 몇 시간인지 return 해주세요.

---
#### 예시

| time_table                 	| return |
|--------------------------------|--------|
| [1, 1, 0, 0, 1, 0, 1, 0, 0, 0] | 3  	|

#### 예시 설명
문제에 나온 예와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_05/no_03/ "cosPro 2급 Java 5차 3번 문제")
