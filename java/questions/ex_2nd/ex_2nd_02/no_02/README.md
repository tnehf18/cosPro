# 문제2

자연수가 들어있는 배열에 3의 배수와 5의 배수 중 어떤 수가 더 많은지 알아보려 합니다. 이를 위해 다음과 같이 프로그램 구조를 작성했습니다.

~~~
1. 3의 배수의 개수를 셉니다.
2. 5의 배수의 개수를 셉니다.
3. 3의 배수와 5의 배수의 개수를 비교 후 다음을 수행합니다.
  3-1. 만약 3의 배수가 더 많다면 "three"를 return 합니다.
  3-2. 만약 5의 배수가 더 많다면 "five"를 return 합니다.
  3-3. 만약 3의 배수와 5의 배수의 개수가 같다면 "same"을 return 합니다.
~~~

자연수가 들어있는 배열 arr가 매개변수로 주어질 때, 배열에 3의 배수의 개수가 더 많다면 "three"를, 5의 배수의 개수가 더 많다면 "five"를, 3의 배수와 5의 배수의 개수가 같다면 "same"을 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

### 초기 코드

```
class Solution {

    public int func_a(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 5 == 0)
                count += 1;
        return count;
    }
    
    public String func_b(int three, int five) {
        if (three > five)
            return "three";
        else if (three < five)
            return "five";
        else
            return "same";
    }
    
    public int func_c(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; ++i)
            if (arr[i] % 3 == 0)
                count += 1;
        return count;
    }

    public String solution(int[] arr) {
        int countThree = func_@@@(@@@);
        int countFive = func_@@@(@@@);
        String answer = func_@@@(@@@);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] arr = {2, 3, 6, 9, 12, 15, 10, 20, 22, 25};
        String ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
자연수가 들어있는 배열 arr가 solution 메소드의 매개변수로 주어집니다.

* arr의 길이는 1 이상 100 이하입니다.
* arr에 들어있는 숫자는 1 이상 1,000 이하의 자연수입니다.

---

#### return 값 설명

배열에 3의 배수의 개수가 더 많다면 "three"를, 5의 배수의 개수가 더 많다면 "five"를, 3의 배수와 5의 배수의 개수가 같다면 "same"을 return 해주세요.

---

#### 예시

| arr                    | return |
|------------------------|--------|
| [2, 3, 6, 9, 12, 15, 10, 20, 22, 25] | "three" |

#### 예시 설명

* 3의 배수 : 3, 6, 9, 12, 15
* 5의 배수 : 10, 15, 20, 25

3의 배수는 5개, 5의 배수는 4개이므로 3의 배수가 더 많습니다. 따라서 "three"를 return 합니다.

---

### → 정답 확인

### [→ 다음 문제](../no_03/ "COS Pro 2급 Java 2차 3번 문제")
