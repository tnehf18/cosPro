# 문제10

학생들의 시험 성적을 등급으로 분류하고자 합니다.

* 90점 이상: A
* 80점 이상: B
* 70점 이상: C
* 60점 이상: D
* 그 외: F

학생들의 성적이 담긴 배열 scores 가 매개변수로 주어질 때 성적에 대한 등급을 담은 배열을 return 하도록 solution을 작성해주세요.

### 초기 코드

```
class Solution {

    public String[] solution(int[] scores) {
        String[] answer = {};        	
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] scores = {91, 52, 88, 76, 82, 71, 90};
        String[] ret = sol.solution(scroes);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
	
}
```

---

#### 매개변수 설명
정수형 배열 scores 는 학생들의 시험 성적이 담긴 배열입니다.

---

#### return 값 설명
성적에 따른 등급이 담긴 배열을 return 해주세요.

---
#### 예시

| weight | boxes                 	| return |
|--------|---------------------------|--------|
| 600	| {91, 52, 88, 76, 82, 71, 90} | {"A", "F", "B", "C", "B", "C", "A"}  	|

#### 예시 설명
문제에 나온 예와 같습니다.

---

### → 정답 확인

### [→ 목록](../ "COS Pro 2급 Java 6차")
