# 문제1

n일 동안 매일매일의 평균 기온이 순서대로 들어있는 배열이 있습니다. 이때, A 번째 일과 B 번째 일 사이에서 A, B 번째 일보다 기온이 높았던 날은 총 며칠이었는지 구하려 합니다.

n일 동안 매일매일의 평균 기온이 순서대로 들은 배열 temperature, 두 날짜를 나타내는 자연수 A, B가 매개변수로 주어질 때, A 번째 일과 B 번째 일 사이에서 두 날짜보다 기온이 높았던 날은 총 며칠인지 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int[] temperature, int A, int B) {
        int answer = 0;
        for(int i = 0; i < temperature.length; i++) {
            if(temperature[i] > temperature[A] && temperature[i] > temperature[B])
                answer += 1;
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] temperature = {3, 2, 1, 5, 4, 3, 3, 2};
        int A = 1;
        int B = 6;
        int ret = sol.solution(temperature, A, B);
	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

---

#### 매개변수 설명

n일 동안 매일매일의 평균 기온이 순서대로 들은 배열 temperature, 두 날짜를 나타내는 자연수 A, B가 solution 메소드의 매개변수로 주어집니다.

* temperature의 길이는 3 이상 30 이하입니다.
* temperature의 원소는 -30 이상 50 이하인 정수입니다.
* 날짜는 0번째 일부터 시작합니다.
* 즉, temperature의 첫 번째 원소는 0번째 날, 두 번째 원소는 1번째 날 ... 을 의미합니다.
* A, B는 날짜를 나타내는 정수이며, 0 이상 (temperature의 길이 - 1) 이하입니다.
* A는 B보다 항상 작습니다.

---

#### return 값 설명
 A 번째 일과 B 번째 일 사이에서 두 날짜보다 기온이 높았던 날은 총 며칠인지 return 해주세요.

---

#### 예제

| temperature              | A | B | return |
|--------------------------|---|---|--------|
| [3, 2, 1, 5, 4, 3, 3, 2] | 1 | 6 | 2      |

#### 예제 설명

예제 #1

* 1번째 날 온도는 2입니다.
* 6번째 날 온도는 3입니다.
* 두 날짜 사이에서 두 날짜보다 기온이 높았던 날은 3번째, 4번째 날입니다.

따라서 2를 return 하면 됩니다.

---

### → 정답 확인

### [→ 다음 문제](../no_02/ "COS Pro 2급 Java 6차 2번 문제")
