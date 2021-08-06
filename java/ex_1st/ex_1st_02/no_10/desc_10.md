# 문제10

0과 1로만 이루어진 문자열에서 연속해서 붙어있는 0들을 하나의 0으로 줄이려 합니다.

예를 들어 "101100011100" 이란 문자열은 "101101110"으로 만들면 됩니다.

0과 1로만 이루어진 문자열 s가 매개변수로 주어질 때, 연속해서 붙어있는 0들을 하나의 0으로 줄인 문자열을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public String solution(String s) {
        s += '#';
        String answer = "";
        for(int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == '0' && s.charAt(i+1) != '0')
                answer += "0";
            else
                answer += "1";
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String s = "101100011100";
        String ret = sol.solution(s);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
0과 1로만 이루어진 문자열 s가 solution 메소드의 매개변수로 주어집니다.
* s의 길이는 1 이상 1,000 이하입니다.

---

#### return 값 설명
연속해서 붙어있는 0들을 하나의 0으로 줄인 문자열을 return 해주세요.

---

#### 예시

| s              | return      |
|----------------|-------------|
| "101100011100" | "101101110" |

#### 예시 설명
1은 줄이지 않으며, 연속해서 붙어있는 0만 하나의 0으로 줄이면 됩니다.

---

### → 정답 확인

### [→ 목록](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_02/no_list.md "COS Pro 1급 Java 2차")
