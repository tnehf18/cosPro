# 문제2

한 줄에 K자를 적을 수 있는 메모장에 영어 단어들을 적으려 합니다. 영어 단어는 정해진 순서로 적어야 하며, 단어와 단어 사이는 공백 하나로 구분합니다. 단, 한 줄의 끝에 단어 하나를 완전히 적지 못한다면, 그 줄의 나머지 부분을 모두 공백으로 채우고 다음 줄부터 다시 단어를 적습니다.

예를 들어 한 줄에 10자를 적을 수 있고, 주어진 단어가 순서대로 `["nice", "happy", "hello", "world", "hi"]` 인 경우 각 줄에 다음과 같이 적을 수 있습니다.('_'는 공백을 나타냅니다.)

* 첫째 줄 : `"nice_happy"`
* 둘째 줄 : `"hello_____"`
* 셋째 줄 : `"world_hi"`

이때, 둘째 줄에 `"hello"`를 적으면 단어를 적을 수 있는 남은 칸은 5칸이며, `"world"`를 이어서 적으려면 공백 하나를 포함하여 총 6칸이 필요합니다. 따라서 단어가 잘리게 되므로 남은 칸을 모두 공백으로 채운 후, 다음 줄에 `"world"`부터 다시 단어를 적어 나갑니다.

한 줄에 적을 수 있는 글자 수 K와 적을 단어가 순서대로 담긴 배열 words가 매개변수로 주어질 때, 단어를 모두 적으면 몇 줄이 되는지 return 하도록 solution 메소를 완성해주세요.

### 초기 변수

```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {

    public int solution(int K, String[] words) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int K = 10;
        String[] words = {new String("nice"), new String("happy"), new String("hello"), new String("world"), new String("hi")};
        int ret = sol.solution(K, words);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
한 줄에 적을 수 있는 글자 수 K와 적을 단어가 순서대로 담긴 배열 words가 solution 메소드의 매개변수로 주어집니다.

* K는 5 이상 30 이하인 자연수입니다.
* words 배열의 길이는 1 이상 100 이하입니다.
* words 배열에 담겨있는 모든 단어는 알파벳 소문자로만 이루어져 있으며, 각 단어의 길이는 K 이하입니다.

---

#### return값 설명
단어를 모두 적으면 몇 줄이 되는지 return해주세요.

---

#### 예시

| K  | words                                       | return |
|----|---------------------------------------------|--------|
| 10 | `["nice", "happy", "hello", "world", "hi"]` | 3      |

#### 예시 설명

예제#1

문제의 예시와 같으며, 단어를 모두 적으면 3줄이 됩니다.
