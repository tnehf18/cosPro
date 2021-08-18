# 문제4

프로그래밍 수업 n개를 동시에 진행할 때, 필요한 조교 수를 알아보려고 합니다. 조교 1명이 m명의 학생을 담당합니다.
교실별 학생 수 classes, 조교 1명이 담당하는 학생 수 m이 매개변수로 주어질 때, 수업을 진행하기 위한 조교 수를 return 하는 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    public int solution(int[] classes, int m) {
        int answer = 0;
        for(int i=0; i<classes.length; i++) {
            answer += classes[i] @@@ m;
            if (classes[i] @@@ m != 0)
                answer++;
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] classes = {80, 45, 33, 20};
        int m = 30;
        int ret = sol.solution(classes, m);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

---

#### 매개변수 설명
교실별 학생 수 classes, 조교 1명이 담당하는 학생 수 m이 solution 메소드의 매개변수로 주어집니다.

* classes의 원소는 0이상 1,000이하인 정수입니다.
* classes의 길이는 1이상 1,000이하인 자연수입니다.
* m은 1이상 1,000이하인 자연수입니다.

---

#### return값 설명
수업을 진행하기 위한 조교 수를 return합니다.

---

#### 예시

| classes | m | return |
|---|---|---|
| [80, 45, 33, 20] | 30 | 8 |

---

#### 예시 설명

예시 #1

반마다 학생 수가 80명, 45명, 33명, 20명이고 조교 1명이 학생 30명을 담당합니다. 반마다 필요한 조교 수는 3명, 2명, 2명, 1명으로 총 8명의 조교가 필요합니다.

---

### → 정답 확인

### [→ 다음 문제](../no_05/ "COS Pro 2급 Java 4차 5번 문제")
