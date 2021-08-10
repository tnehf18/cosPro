# 문제3

단체 유니폼을 주문하려고 합니다. 사람들의 덩치를 수치로 표현할 때 주문해야 하는 유니폼의 사이즈는 다음과 같습니다.

| 덩치              | 사이즈 |
|-------------------|--------|
| 95 미만           | S      |
| 95 이상 100 미만  | M      |
| 100 이상 105 미만 | L      |
| 105 이상          | XL     |

사람들의 덩치를 담은 배열 people이 매개변수로 주어질 때, 주문해야 하는 유니폼 사이즈의 수를 [S, M, L, XL] 순으로 배열에 담아 return 하도록 solution 메소드를 작성해주세요.

### 초기 코드

```
// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Solution {

    public int[] solution(int[] people) {
        // 여기에 코드를 작성해주세요.
        int[] answer = new int[4];
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] people = {97, 102, 93, 100, 107};
        int[] ret = sol.solution(people);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
사람들의 덩치를 담은 배열 people이 solution 메소드의 매개변수로 주어집니다.

* people의 길이는 1 이상 100 이하인 자연수입니다.
* 사람들의 덩치는 80 이상 120 이하인 자연수입니다.

---

#### return 값 설명
주문해야 하는 유니폼 사이즈의 수를 [S, M, L, XL] 순으로 배열에 담아 return 합니다.

---

#### 예시

| people                  | return       |
|-------------------------|--------------|
| [97, 102, 93, 100, 107] | [1, 1, 2, 1] |

#### 예시 설명

3번째 사람은 S 사이즈를 입어야합니다.
1번째 사람은 M 사이즈를 입어야합니다.
2, 4번째 사람은 L 사이즈를 입어야합니다.
5번째 사람은 XL 사이즈를 입어야합니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_06/no_04/desc_04.md "cosPro 2급 Java 6차 4번 문제")
