# 문제1

학생들의 시험 점수가 주어졌을 때, n번 학생이 몇 등인지 구하려 합니다. 학번은 0번부터 시작하며, 시험 점수는 학번순으로 주어집니다.

예를 들어 학생 네 명의 시험 점수가 다음과 같은 경우

![image](http://res.cloudinary.com/dpxurmkij/image/upload/c_scale,w_150/v1514466528/%E1%84%89%E1%85%AE%E1%84%92%E1%85%A1%E1%86%A8%E1%84%83%E1%85%B3%E1%86%BC%E1%84%89%E1%85%AE%E1%84%80%E1%85%AE%E1%84%92%E1%85%A1%E1%84%80%E1%85%B53_gcwr84.png)

3번 학생은 3등을 했습니다.

이를 위해 다음과 같이 프로그램 구조를 작성했습니다.

~~~
1. n번 학생의 점수를 변수에 저장합니다.
2. 점수를 내림차순으로 정렬합니다.
3. 배열의 첫 번째 원소부터 마지막 원소까지 순회하며 n번 학생의 점수를 찾습니다.
  3-1. 1번 단계에서 저장해둔 점수와 같은 점수를 찾으면 등수를 return 합니다.
~~~

학생들의 시험 점수가 번호순으로 들은 배열 scores와 학번 n이 solution 메소드의 매개변수로 주어질 때, n번 학생의 등수를 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작하도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

### 초기 코드

```
// You may use import as below.
import java.util.*;

class Solution {

    int func_a(int[] scores, int score) {
        int length = scores.length;
        for(int rank = 0; rank < length; rank++)
            if(scores[rank] == score)
                return rank + 1;
        return 0;
    }
    
    void func_b(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        int temp = 0;
        for(int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[(length - 1) - i];
            arr[(length - 1) - i] = temp;
        }
    }
    
    int func_c(int[] arr, int n) {
        return arr[n];
    }

    public int solution(int[] scores, int n) {
        int score = func_@@@(@@@);
        func_@@@(@@@);
        int answer = func_@@@(@@@);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] scores = {20, 60, 98, 59};
        int n = 3;
        int ret = sol.solution(scores, n);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
}
```

---

### 매개변수 설명
학생들의 시험 점수가 번호순으로 들은 배열 scores와 학번 n이 solution 메소드의 매개변수로 주어집니다.
* scores의 길이는 1 이상 100 이하입니다.
* 점수는 0점 이상 100점 이하이며 동점자는 없습니다.
* n은 0 이상 (scores의 길이 - 1) 이하의 정수입니다.

---

### return 값 설명
n번 학생의 등수를 return 해주세요.

---

#### 예시

| scores           | n | result |
|------------------|---|--------|
| [20, 60, 98, 59] | 3 | 3      |

#### 예시 설명

* 3번 학생의 점수는 59점입니다.
* 점수를 내림차순으로 정렬하면 [98, 60, 59, 20]입니다.
* 정렬된 점수에서 59는 3번째에 있습니다.

따라서 3번 학생은 3등입니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_03/no_02/desc_02.md "cosPro 2급 Java 3차 2번 문제")
