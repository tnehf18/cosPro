# 문제5

O일장은 O일마다 열리는 시장을 뜻합니다. 예를 들어 오늘 4일장이 열렸다면, 다음 4일장은 4일 뒤에 열립니다. 오늘부터 a일장과 b일장 제도를 시행하려 합니다. 정수 a, b가 주어졌을 때, a일장과 b일장이 같이 열리는 날은 며칠에 한 번씩 있는지 구하려 합니다.

예를 들어, a가 4이고 b가 6이라면 시장은 다음과 같이 열립니다.

  ![스크린샷 2018-10-18 오후 3.20.05.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/8b5ccc6490/fbf2b7c5-4b29-4aa8-a227-b4d3754d54c7.png)

a와 b가 매개변수로 주어질 때, a일장과 b일장이 같이 열리는 날은 며칠에 한 번씩 있는지 return 하도록 solution 메소드를 작성했습니다. 그러나, 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int a, int b) {
        int answer = 0;
        
        for(int i = 1; i <= b; i++) {
            if((a * i) % b == 0) {
                answer = b * i;
                break;
            }
        }
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int a = 4;
        int b = 6;
        int ret = sol.solution(a, b);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

---

#### 매개변수 설명

a일장이 열리는 주기인 a와 b일장이 열리는 주기인 b가 solution 메소드의 매개변수로 주어집니다.

* a와 b는 1 이상 30 이하인 자연수입니다.

---

#### return 값 설명

a일장과 b일장이 같이 열리는 날은 며칠에 한 번씩 있는지 return 해주세요.

---

#### 예시

| a | b | return |
|--------|--------|--------|
| 4     | 6      | 12     |

#### 예시 설명

문제의 예와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](../no_06/ "COS Pro 2급 Java 5차 6번 문제")
