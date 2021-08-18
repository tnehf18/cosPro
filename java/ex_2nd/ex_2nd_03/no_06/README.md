# 문제6

타일을 'R', 'G', 'B' 색으로 칠하려 합니다. R 색으로는 3칸을 한 번에, G 색으로는 2칸을 한 번에 칠할 수 있으며, B 색으로는 1칸을 칠할 수 있습니다. 색은 R, G, B 순서로 한 번씩 번갈아 가면서 사용해야 하며, 타일의 길이를 넘겨서 칠할 수는 없습니다.

예를 들어, 타일 길이가 11이면 "RRRGGBRRRGG"의 색으로 칠할 수 있습니다.

타일 길이가 매개변수 tileLength로 주어질 때, 타일을 색칠한 순서를 문자열로 return하는 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

순서에 맞게 타일을 칠할 수 없다면 -1을 return 해주세요.

### 초기 코드

```
class Solution {

    public String solution(int tileLength) {
        String answer = "";
        String com = "RRRGGB";
        if(tileLength%6 == 1 || tileLength%6 == 2 || @@@)
            answer = "-1";
        else 
            for(int i = 0; i < tileLength; i++)
                answer += com.charAt(i%6);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int tileLength1 = 11;
        String ret1 = sol.solution(tileLength1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int tileLength2 = 16;
        String ret2 = sol.solution(tileLength2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명

타일 길이 tileLength가 solution 메소드의 매개변수로 주어집니다.

* tileLength는 1,000 이하의 자연수입니다.

---

#### return 값 설명
타일을 색칠한 순서를 문자열로 return 해주세요.

* 순서에 맞게 타일을 칠할 수 없다면 -1을 return 해주세요.

---

#### 예시

| tileLength |answer |
|------|------|
|11| "RRRGGBRRRGG"|
|16| "-1"|

---

#### 예시 설명

예시 #1

다음과 같은 순서로 타일을 칠하면 됩니다.

* 'R' - 3장
* 'G' - 2장
* 'B' - 1장
* 'R' - 3장
* 'G' - 2장

따라서 "RRRGGBRRRGG"를 return 하면 됩니다.

예시 #2

타일 길이는 16입니다.
'R', 'G', 'B' 순서대로 타일을 색칠하면 다음과 같습니다.


| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 |
|---|---|---|---|---|---|---|---|---|----|----|----|----|----|----|----|
| R | R | R | G | G | B | R | R | R | G  | G  | B  | R  | R  | R  | -  |

15번째 타일까지 칠하니 타일이 한 칸 남았습니다. G 색으로는 두 칸을 칠해야 하므로 타일을 더 칠할 수 없습니다. 따라서 "-1"을 return 합니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_03/no_07/ "cosPro 2급 Java 3차 7번 문제")
