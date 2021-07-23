# 문제5

다음과 같이 새로운 숫자를 생성할 때, n번째 생성할 숫자를 구하려고 합니다.

```
1. 첫 번째 수는 1입니다.
2. 다음수를 1의 자리에 추가합니다.
3. 만든 숫자를 뒤집습니다.
4. 숫자 1부터 9까지 추가하면서 2, 3번째 단계를 반복합니다.
5. 숫자 9까지 추가했다면 다시 숫자 1부터 추가합니다.
```

n이 매개변수로 주어질 때, n번째로 생성할 수를 문자열 형태로 return 하는 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 바르게 동작하도록 빈칸을 채워주세요.

### 초기 코드

```
class Solution {

    public String reverse(String number) {
        String reverseNumber = "";
        for(int i = number.length()-1; i >= 0; i--)
            @@@;
        return reverseNumber;
    }

    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            answer += Integer.toString(@@@);
            answer = reverse(answer);
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = 5;
        String ret = sol.solution(n);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
숫자 n이 solution 메소드의 매개변수로 주어집니다.

* n은 1 이상 1,000 이하인 자연수입니다.

---

#### return값 설명

solution 메소드는 n번째 수를 문자열 형태로 return 합니다.

---
#### 예시

| n | return |
|---|---|
| 5 | "53124" |

---

#### 예시 설명

첫 번째 숫자: 1
두 번째 숫자: 21
세 번째 숫자: 312
네 번째 숫자: 4213
다섯 번째 숫자: 53124

따라서 답은 "53124"입니다.
