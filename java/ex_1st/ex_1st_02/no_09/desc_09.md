# 문제9

주어진 비밀번호가 안전한지 아닌지 판단하려합니다. 비밀번호의 안전 여부는 다음 규칙으로 판단합니다.

* 연속된 3자리 이상의 알파벳 혹은 숫자를 사용할 수 없습니다. (abc, cba, 012, 987 등)

비밀번호에 사용할 문자열 password가 매개변수로 주어질 때, 주어진 문자열이 위 규칙에 맞으면 true를, 맞지 않으면 false를 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public boolean solution(String password) {
        int length = password.length();
        for(int i = 0; i < length - 2; ++i) {
            int firstCheck = password.charAt(i + 1) - password.charAt(i);
            int secondCheck = password.charAt(i) - password.charAt(i+1);
            if(firstCheck == secondCheck && (firstCheck == 1 || firstCheck == -1))
                return false;
        }
        return true;
    }


    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String password1 = "cospro890";
        boolean ret1 = sol.solution(password1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");


        String password2 = "cba323";
        boolean ret2 = sol.solution(password2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2+ " 입니다.");       
    }
    
}
```

---

#### 매개변수 설명
비밀번호에 사용할 문자열 password가 solution 메소드의 매개변수로 주어집니다.
* password는 알파벳 소문자와 숫자로만 이루어진 문자열입니다.
* password의 길이는 5 이상 20 이하입니다.

---

#### return 값 설명
주어진 문자열이 주어진 규칙에 맞으면 true를, 맞지 않으면 false를 return 해주세요.

---

#### 예시

| password    | return |
|-------------|--------|
| "cospro890" | true   |
| "cba323"    | false  |

#### 예시 설명
예시 #1
주어진 문자열에는 연속된 3자리 이상의 문자열 혹은 숫자가 없습니다.

예시 #2
"cba"가 연속된 3자리 문자열이므로 주어진 규칙에 맞지 않습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_02/no_10/desc_10.md "cosPro 1급 Java 2차 10번 문제")
