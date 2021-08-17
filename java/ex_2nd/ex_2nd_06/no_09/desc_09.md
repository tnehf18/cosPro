# 문제9

다양한 색을 가진 양말 중 같은 색을 가진 양말을 2개씩 묶어 한 쌍을 만드려고 합니다.

예를 들어, 가지고 있는 양말의 색깔이 [빨강, 파랑, 빨강, 노랑, 파랑, 빨강] 이라면 아래 그림과 같이 2쌍을 만들 수 있습니다.

  ![스크린샷 2018-10-31 오후 1.01.08.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/9343ee8315/8ba77d22-ae40-4a17-83bf-d4a6e0fbb93f.png)
 
양말 색을 숫자로 표현해서 담은 배열 socks가 매개변수로 주어질 때, 양말을 몇 쌍 만들 수 있는지 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
public class Solution {

    public int solution(int[] socks) {
        int answer = 0;

        int[] count = new int[10];
        for(int i = 0; i < socks.length; i++)
            count[socks[i]]++;

        for(int i = 0; i < 10; i++)
            answer += (count[i] % 2);

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] socks = {1, 2, 1, 3, 2, 1};
        int ret = sol.solution(socks);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
양말 색을 숫자로 표현해서 담은 배열 socks가 solution 메소드의 매개변수로 주어집니다.

* 양말 색은 0 보다 크거나 같고 10 보다 작은 정수로 표현합니다.
* 양말 수는 1개 이상 100개 이하입니다.

---

#### return 값 설명
양말을 몇 쌍 만들 수 있는지 return 합니다.

---

#### 예시

| socks              | return |
|--------------------|--------|
| [1, 2, 1, 3, 2, 1] | 2      |

#### 예시 설명
문제에 나온 예와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_06/no_10/desc_10.md "cosPro 2급 Java 6차 10번 문제")
