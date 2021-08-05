# 문제4

1부터 n까지 숫자가 적힌 카드 뭉치를 다음 규칙에 따라 카드 뭉치를 섞었을 때, 아래에서부터 k번째에 있는 카드에 적힌 숫자를 알아내려합니다. 카드 뭉치 가장 아래에는 1이 쓰여있으며, 위로 갈수록 숫자가 커집니다. 카드 뭉치를 섞는 규칙은 다음과 같습니다.

```
1. 카드 뭉치를 정확히 반으로 나눕니다.
2. 두 개로 나뉜 카드 뭉치를 교차로 섞어서 카드 뭉치 하나를 만듭니다. 이때, 항상 1이 적힌 카드가 있는 뭉치를 아래로 놓고 섞습니다.
3. 위 과정을 반복합니다.
```

예를 들어, 1부터 6까지 숫자가 적힌 카드 뭉치를 3번 섞는다면 과정별로 아래에서부터 적힌 숫자는 다음과 같습니다.

| 횟수 | 카드 뭉치          |
|------|--------------------|
| 1    | [1, 4, 2, 5, 3, 6] |
| 2    | [1, 5, 4, 3, 2, 6] |
| 3    | [1, 3, 5, 2, 4, 6] |

이때, 아래에서 3번째에 있는 카드에 적힌 숫자는 5입니다.

처음에 가장 위에 있는 카드에 적힌 숫자 n, 섞는 횟수 mix, 알고 싶은 카드의 위치 k가 매개변수로 주어질 때, 아래에서부터 k번째에 있는 카드에 적힌 숫자를 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int n, int mix, int k) {
        int answer = 0;

        int[] card = new int[n];
        for(int i = 0; i < n; i++)
            card[i] = i+1;

        while((mix--) != 0) {
            int[] cardA = new int[n/2];
            int[] cardB = new int[n/2];

            for(int i = 0; i < n; i++) {
                if(i < n/2)
                    cardA[i] = card[i];
                else
                    cardB[i] = card[i];
            }

            for(int i = 0; i < n; i++) {
                if(i % 2 == 0)
                    card[i] = cardA[i/2];
                else
                    card[i] = cardB[i/2];
            }
        }

        answer = card[k-1];

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = 6;
        int mix = 3;
        int k = 3;
        int ret = sol.solution(n, mix, k);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
처음에 가장 위에 있는 카드에 적힌 숫자 n, 섞는 횟수 mix, 알고 싶은 카드의 위치 k가 solution 메소드의 매개변수로 주어집니다.
* n은 10 이상 50 이하인 짝수입니다.
* 카드는 0회 이상 10회 이하로 섞습니다.
* k는 1 이상 n 이하인 자연수입니다.

---

#### return 값 설명
아래에서 k번째에 있는 카드에 적힌 숫자를 return 해주세요.

---

#### 예시

| n  | mix | k | return |
|----|-----|---|--------|
| 6 | 3   | 3 | 5  	|

#### 예시 설명
문제에 나온 예와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st_06/no_05/desc_05.md "cosPro 1급 Java 6차 5번 문제")
