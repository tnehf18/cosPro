# 문제7

화씨온도(℉)를 섭씨온도(℃)로, 섭씨온도(℃)를 화씨온도(℉)로 바꾸려고 합니다. 두 온도 사이의 환산 공식은 다음과 같습니다.

~~~
환산공식
* 화씨온도(℉)에서 섭씨온도(℃)로 환산 : (화씨온도 - 32) ÷ 1.8 = 섭씨온도
* 섭씨온도(℃)에서 화씨온도(℉)로 환산 : (섭씨온도 x 1.8) + 32 = 화씨온도
~~~

두 온도 단위 사이를 환산하는 메소드를 구현하려고 합니다.

현재 온도 value와 현재 단위 unit이 매개변수로 주어질 때, 환산한 온도의 정수 부분을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int value, String unit) {
        int converted = 0;
        if (unit.equals("C"))
            converted = (int)(value * 1.8 + 32);
        if (unit.equals("F"))
            converted = (int)(value - 32 / 1.8);
        return converted;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int value = 527;
        String unit = "C";
        int ret = sol.solution(value, unit);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
현재 온도 value와 현재 단위 unit이 solution 메소드의 매개변수로 주어집니다.

* unit은 화씨온도 "F"와 섭씨온도 "C" 둘 중 하나로 주어집니다.
  * unit이 "F"인 경우 value는 화씨온도(℉)를 나타냅니다.
  * unit이 "C"인 경우 value는 섭씨온도(℃)를 나타냅니다.
* value는 -460 이상 1,000 이하의 정수입니다.

---

#### return 값 설명
환산한 온도의 정수 부분을 return 해주세요.

* unit이 "F"인 경우에는 화씨온도(℉)에서 섭씨온도(℃)로 환산해주세요.
* unit이 "C"인 경우에는 섭씨온도(℃)에서 화씨온도(℉)로 환산해주세요.

---

#### 예시 

| value | unit | return |
|-------|------|--------|
| 527   | "C"  | 980    |

#### 예시 설명
unit이 "C" 이므로 주어진 value는 527℃를 나타냅니다. 이를 화씨온도(℉)로 환산하면 다음과 같습니다.
(섭씨온도 x 1.8) + 32 = (527 x 1.8) + 32 = 980.6

따라서 환산 결과는 980.6℉이며, 정수 부분만 return 하면 되므로 980을 return 하면 됩니다.

---

### → 정답 확인

### [→ 다음 문제](../no_08/ "COS Pro 2급 Java 2차 8번 문제")
