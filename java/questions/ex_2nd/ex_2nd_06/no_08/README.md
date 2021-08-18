# 문제8

주어진 수와 주어진 수를 뒤집은 수와의 차를 계산하려고 합니다.

예를 들어, 주어진 수가 120인 경우 이를 뒤집으면 021입니다. 십진수에서 앞의 0은 제거해야하므로 120을 뒤집은 수는 21입니다. 따라서 120과 21의 차는 99 입니다.

이를 계산하기 위해 다음과 같이 프로그램 구조를 작성했습니다.

```
1. 주어진 수의 자릿수를 구합니다.
2. 구한 자릿수를 이용하여 주어진 수를 거꾸로 뒤집습니다.
3. 주어진 수와 뒤집은 수의 차이를 구합니다.
```

수 number가 주어질 때, 주어진 수와 주어진 수를 뒤집은 수와의 차를 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

### 초기 코드

```
class Solution {

    public int func_a(int number1, int number2) {
        int ret = 0;

        if(number1 > number2)
            ret = number1 - number2;
        else
            ret = number2 - number1;

        return ret;
    }

    public int func_b(int number) {
        int ret = 0;

        while(number != 0) {
            number = number / 10;
            ret++;
        }

        return ret;
    }

    public int func_c(int number, int digit) {
        int ret = 0;

        for(int i = 0; i < digit; i++) {
            int temp = number % 10;
            number = number / 10;
            ret = ret * 10 + temp;
        }

        return ret;
    }

    public int solution(int number) {
        int answer = 0;
        int digit = func_@@@(@@@);
        int convert_number = func_@@@(@@@);
        answer = func_@@@(@@@);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int number1 = 120;
        int ret1 = sol.solution(number1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int number2 = 23;
        int ret2 = sol.solution(number2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
수 number가 solution 메소드의 매개변수로 주어집니다.

* 수 number는 1 이상 10,000 이하인 정수입니다.

---

#### return 값 설명
주어진 수 number와 number를 뒤집은 수와의 차를 return 합니다.

---

#### 예제

| number | return |
|--------|--------|
| 120    | 99     |
| 23     | 9      |

#### 예제 설명

예제 #1

문제에 나온 예와 같습니다.

예제 #2

23을 반대로 뒤집으면 32가 되고 이때 두 수의 차는 9 입니다.

---

### → 정답 확인

### [→ 다음 문제](../no_09/ "COS Pro 2급 Java 6차 9번 문제")
