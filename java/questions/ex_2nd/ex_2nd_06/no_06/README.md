# 문제6

X 사이트에서는 회원가입을 할 때 다음의 규칙을 지켜 비밀번호를 생성해야 합니다.

```
1. 한 개 이상의 알파벳 대문자를 포함해야 합니다.
2. 두 개 이상의 알파벳 소문자를 포함해야 합니다.
3. 두 개 이상의 숫자를 포함해야 합니다.
```

생성하고자 하는 비밀번호 password가 매개변수로 주어질 때, 생성가능한 비밀번호면 true를 그렇지 않으면 false를 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    public boolean solution(String password) {
        boolean answer = true;

        int capitalCount = 0, smallCount = 0, digitCount = 0;
        for(int i = 0; i < password.length(); i++) {
            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
                capitalCount++;
            else if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
                smallCount++;
            else if(password.charAt(i) >= @@@ && password.charAt(i) <= @@@)
                digitCount++;
        }

        if(@@@)
        	answer = true;
        else
        	answer = false;

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution sol = new Solution();

    	String password1 = new String("helloworld");
    	boolean ret1 = sol.solution(password1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	String password2 = new String("Hello123");
    	boolean ret2 = sol.solution(password2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
생성하고자 하는 비밀번호 password가 solution 메소드의 매개변수로 주어집니다.

* password는 알파벳 대문자, 소문자, 숫자로만 이루어진 문자열입니다.
* password의 길이는 5 이상 15 이하입니다.

---

#### return 값 설명
생성가능한 비밀번호면 true를 그렇지 않으면 false를 return 합니다.

---

#### 예시

| password     | return |
|--------------|--------|
| "helloworld" | false  |
| "Hello123"   | true   |

#### 예시 설명

예시 #1

알파벳 대문자와 숫자를 포함하지 않았습니다.

예시 #2

알파벳 대문자 1개, 알파벳 소문자 4개, 숫자 3개를 포함했으므로 생성할 수 있습니다.

---

### → 정답 확인

### [→ 다음 문제](../no_07/ "COS Pro 2급 Java 6차 7번 문제")
