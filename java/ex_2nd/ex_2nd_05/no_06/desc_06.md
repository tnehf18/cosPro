# 문제6

국어 시험 점수와 영어 시험 점수가 나왔습니다. 이때 국어, 영어, 수학 시험의 평균이 70점 이상이려면 수학 시험 점수가 최소 몇 점이어야 하는지 알고 싶습니다.

국어 점수 korean과 영어 점수 english가 매개변수로 주어질 때, 평균 점수를 70점 이상 받기 위해 받아야 하는 수학 점수의 최솟값을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int korean, int english) {
        int answer = 0;
        
        int math = 210 - korean + english;
        
        if(math > 100)
            answer = -1;
        else
            answer = math;
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int korean = 70;
        int english = 60;
        int ret = sol.solution(korean, english);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
국어 점수 korean과 영어 점수 english가 solution 메소드의 매개변수로 주어집니다.

* korean과 english는 0 이상 100 이하인 정수입니다.

---

#### return 값 설명
평균 70점을 넘기기 위해 받아야 하는 수학 점수의 최솟값을 return 합니다.

* 수학 점수를 100점을 받아도 평균 70점이 되지 않는 경우에는 -1을 return 합니다.

---

#### 예시

| korean | english | return |
|--------|---------|--------|
| 70 	| 60  	| 80 	|

#### 예시 설명

국어 점수가 70점, 영어 점수가 60점입니다. 따라서 평균이 70점 이상을 받으려면 수학 시험에서 최소 80점을 받아야 합니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_05/no_07/desc_07.md "cosPro 2급 Java 5차 7번 문제")
