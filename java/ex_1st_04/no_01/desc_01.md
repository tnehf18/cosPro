# 문제1

어떤 단어가 XX 사전의 몇 번째 단어인지 알고 싶습니다. XX 사전에는 대문자 알파벳 'A', 'E', 'I', 'O', 'U'를 사용해 만들 수 있는 길이가 5 이하인 모든 단어가 수록되어 있습니다.

예를 들어, 사전의 첫 번째 단어는 "A"이고, 그다음은 "AA"입니다. 마지막 단어는 "UUUUU"입니다.

문자열 word가 매개변수로 주어질 때, word가 사전의 몇 번째 단어인지 return 하도록 solution 메소드를 작성했습니다. 그러나, 일부 코드가 잘못되어 코드가 바르게 동작하지 않습니다. 주어진 코드가 모든 입력을 바르게 처리하도록 코드를 수정해주세요. 코드는 _**한 줄**_만 수정해야 합니다.

### 초기 코드

```
import java.util.*;

public class Solution {

    String[] vowels = {"A", "E", "I", "O", "U"};
    ArrayList<String> words;
    
    public void create_words(int lev, String str) {
        words.add(str);
        for (int i = 0; i < 5; i++) {
            if (lev < 5) {
                create_words(lev, str.concat(vowels[i]));
            }
        }
    }
    
    public int solution(String word) {
        int answer = 0;
        words  = new ArrayList<String>();
        create_words(0, "");
        for (int i = 0; i < words.size(); i++) {
            if (word.equals(words.get(i))) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String word1 = new String("AAAAE");
        int ret1 = sol.solution(word1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String word2 = new String("AAAE");
        int ret2 = sol.solution(word2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명

문자열 word가 solution 메소드의 매개변수로 주어집니다.

* word는 'A', 'E', 'I', 'O', 'U'로만 구성됩니다.
* word의 길이는 5 이하입니다.

---

#### return 값 설명

사전에서 word가 몇 번째 단어인지 return 해주세요.

---

#### 예시

| word | return |
|------|--------|
| "AAAAE" | 6 |
| "AAAE" | 10 |

#### 예시 설명

사전엔 단어가 다음과 같이 수록됩니다. "A", "AA", "AAA", "AAAA", "AAAAA", "AAAAE", "AAAAI", "AAAAO", "AAAAU", "AAAE", ...

예시 #1

"AAAAE"는 여섯 번째에 나옵니다.

예시 #2

“AAAE”는 열 번째에 나옵니다.
