# 문제3

A 사이트에서 아래 조건에 맞는 게시글을 **최초**로 작성하는 이용자에게 경품을 제공하려 합니다.

* 현재 작성되어있는 가장 마지막 게시글 이후에 작성된 게시글이어야 합니다.
* 게시글 번호의 자릿수가 짝수여야 합니다.
* 게시글 번호가 2n 자릿수 일때, 앞 n 자리의 각 자릿수의 합과 뒤 n 자리의 각 자릿수의 합이 같아야 합니다.

이 사이트의 게시글 번호는 마지막에 작성된 게시글 번호부터 1씩 증가합니다. 예를 들어, 가장 마지막 게시글의 번호가 235386이라면, 이후에 작성되는 게시글의 번호는 235387, 235388 ... 이 되며, 번호가 235387 이상인 게시글이 경품당첨의 대상이 됩니다.

당신은 경품을 받기위해 앞으로 게시글을 몇 개 더 작성해야 하는지 구하려 합니다. 이를 위해 다음과 같이 프로그램 구조를 작성했습니다.

~~~
1. 게시글 번호를 1 증가시키고 자릿수를 구합니다.
2. 만약 자릿수가 짝수가 아니라면 1로 돌아갑니다.
3. 만약 구한 자릿수가 짝수라면 다음을 수행합니다.
  3-1. 앞 자릿수 절반과 뒷 자릿수 절반을 분리합니다.
  3-2. 앞 자릿수 절반의 자릿수 합과 뒷 자릿수 절반의 자릿수 합을 구합니다.
  3-3. 위에서 구한 합이 서로 같으면 4로 가고, 같지 않으면 1로 돌아갑니다.
4. (3에서 구한 수 - 처음에 매개변수로 주어진 수)를 return 합니다.
~~~

가장 마지막 게시글의 번호 num이 매개변수로 주어질 때, 경품을 받기위해 앞으로 더 작성해야 하는 게시글의 개수를 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

### 초기 코드

```
class Solution {

    public int func_a(int n) {
        int ret = 1;
        while(n > 0) {
            ret *= 10;
            n--;
        }
        return ret;
    }

    int func_b(int n) {
        int ret = 0;
        while(n > 0) {
            ret++;
            n /= 10;
        }
        return ret;
    }
    
    int func_c(int n) {
        int ret = 0;
        while(n > 0) {
            ret += n%10;
            n /= 10;
        }
        return ret;
    }
    
	public int solution(int num) {
        int nextNum = num;
        while(true) {
            nextNum++;
            int length = func_@@@(@@@);
            if(length % 2 != 0)
                continue;

            int divisor = func_@@@(@@@);
            int front = nextNum / divisor;
            int back = nextNum % divisor;
            
            int frontSum = func_@@@(@@@);
            int backSum = func_@@@(@@@);
            if(frontSum == backSum)
                break;
        }
        return nextNum - num;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int num1 = 1;
        int ret1 = sol.solution(num1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int num2 = 235386;
        int ret2 = sol.solution(num2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명 
현재까지 작성된 가장 마지막 게시글의 번호 num이 매개변수로 주어집니다.
* num은 1 이상 50,000,000 이하의 자연수입니다.

---

#### return 값 설명
경품을 받기위해 앞으로 더 작성해야 하는 게시글의 개수를 return 해주세요.

---

#### 예시

| num  | return |
|----------|--------|
| 1 | 10    |
| 235386 | 20    |

#### 예시 설명

예시 #1

가장 마지막에 작성된 게시글의 번호가 1입니다. 

당첨조건을 만족하는 게시글 번호는 11이며, 따라서 최소 10번 더 게시글을 작성해야합니다.


예시 #2

가장 마지막에 작성된 게시글의 번호는 6자리이며, 3자리씩 끊으면 다음과 같습니다.

* 앞 4자리 : 235
* 뒤 4자리 : 386

앞 3자리의 각 자릿수 합은 다음과 같습니다.

* 2 + 3 + 5 = 10

뒤 3자리의 각 자릿수 합은 다음과 같습니다.

* 3 + 8 + 6 = 17

앞으로 최소 20개의 글을 더 작성한다면, 글 번호는 235406이 되며, 뒤 3자리의 각 자릿수 합은 다음과 같습니다.

* 4 + 0 + 6 = 10

따라서 경품을 받기 위해 최소 20개의 글을 더 작성하면 됩니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_02/no_04/ "cosPro 1급 Java 2차 4번 문제")
