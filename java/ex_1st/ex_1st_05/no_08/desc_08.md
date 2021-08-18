# 문제8

세 수 a, b, c의 공약수가 몇 개인지 구하려고 합니다. 공약수란, 동시에 모든 정수의 약수인 정수를 뜻합니다. 예를 들어, 세 수 24, 9, 15의 공약수는 1, 3이고, 따라서 양의 공약수는 2개입니다.

세 수의 공약수가 몇 개인지 구하기 위해 다음과 같이 프로그램 구조를 작성했습니다.

```
1. 세 수의 최대공약수를 구합니다.
2. 앞서 구한 최대공약수의 약수가 몇 개인지 구합니다.
```

세 수 a, b, c가 매개변수로 주어질 때, 세 수의 약수가 몇 개인지 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

### 초기 코드

```
class Solution {

    public int func_a(int a, int b) {
        int mod = a % b;

        while(mod > 0) {
            a = b;
            b = mod;
            mod = a % b;
        }

        return b;
    }

    public int func_b(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            if(func_@@@(@@@))
                answer++;
        }

        return answer;
    }

    public boolean func_c(int p, int q) {
        if(p % q == 0)
            return true;
        else
            return false;
    }

    public int solution(int a, int b, int c) {
        int answer = 0;
        
        int gcd = func_@@@(func_@@@(@@@)@@@);
        answer = func_@@@(@@@);
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int a = 24;
        int b = 9;
        int c = 15;
        int ret = sol.solution(a, b, c);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
  
}
```

---

#### 매개변수 설명

세 수 a, b, c가 매개변수로 주어집니다.
* 세 수 a, b, c는 1 이상 1,000 이하인 정수입니다.

---

#### return 값 설명

세 수의 약수가 몇 개인지 return 합니다.

---

#### 예시

| a  | b | c  | return |
|----|---|----|--------|
| 24 | 9 | 15 | 2      |

#### 예시 설명
문제에 나온 예와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_05/no_09/desc_09.md "cosPro 1급 Java 5차 9번 문제")
