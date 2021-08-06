# 문제5

핸드폰 화면에 문구를 출력해주는 전광판 어플이 있습니다. 문구는 "happy-birthday"로 설정하였습니다. 전광판 어플은 다음과 같은 규칙으로 화면에 문구를 출력해 줍니다.

* 어플은 화면에 14자 문구를 출력합니다.
* 문구는 1초에 왼쪽으로 한 칸씩 움직입니다.
* 문구 이외의 부분은 "_"로 표시됩니다.
* 어플은 설정한 문구를 화면에 반복해 출력합니다. 
* 어플은 문구가 다 지나가면 설정한 문구를 반복해 보여줍니다.

```
예를 들어, 처음에는 화면에 "______________"가 보입니다.
3초 뒤에는 화면에 "___________hap"가 보입니다.
14초 뒤에는 화면에 "happy-birthday"가 보입니다.
20초 뒤에는 화면에 "birthday_____"가 보입니다.
28초 뒤에는 모든 문자열이 지나간 후 "______________"가 보입니다.
29초 뒤에는 다시 첫 번째 문자부터 나타나며, "_____________h"가 보입니다.
```

문구를 담은 문자열 phrases와 초를 담은 second가 매개변수로 주어질 때, 화면에 보이는 문자열을 출력하도록 solution 메소드를 작성해 주세요.
단, '_'는 공백을 나타냅니다.

### 초기 코드

```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {

    public String solution(String phrases, int second) {
        // 여기에 코드를 작성해주세요.
        String answer = "";
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String phrases = new String("happy-birthday");
        int second = 3;
        String ret = sol.solution(phrases, second);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
문구를 담은 문자열 phrases와 초를 담은 second가 solution 메소드의 매개변수로 주어집니다.

* phrases는 "happy-birthday"입니다.
* second는 1 이상 10,000 이하인 자연수입니다.

---

#### return값 설명
solution 메소드는 화면에 보이는 문자열을 return 합니다.

---

#### 예시

| phrases | second | return |
|---|---|---|
| "happy-birthday" | 3 | "___________hap" |

---

#### 예시 설명
화면 처음상태인 "______________"에서 3초가 지나면 화면에는 글자 3개가 왼쪽으로 옮겨진 상태인 "___________hap"가 보입니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_03/no_06/desc_06.md "cosPro 1급 Java 3차 6번 문제")
