# 문제5

A 게임은 4x4 격자 모양의 보드의 가장 왼쪽 위에서 가장 오른쪽 아래로 말을 이동시키면서 각 구역에 있는 코인을 획득하는 게임입니다. 이때, 말은 오른쪽 또는 아래쪽으로만 이동할 수 있습니다.

예를 들어, 보드가 아래와 같다면

  ![스크린샷 2018-11-14 오후 6.09.57.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/66edaada7d/0ac1c4be-5e0c-459a-9b83-b7fccefb70cc.png)

아래의 경우가 코인을 최대로 획득할 수 있는 경우이고 이때 획득하는 코인은 38입니다.

  ![스크린샷 2018-11-14 오후 6.09.52.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/1858f83a13/df5c905b-fbd4-40cf-a11b-587f6858932e.png)


각 구역에서 획득할 수 있는 코인 양을 담은 2차원 배열 board가 매개변수로 주어질 때, 최대로 획득할 수 있는 코인의 양을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int[][] board) {
        int answer = 0;

        int[][] coins = new int[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(i == 0 && j == 0)
                    coins[i][j] = board[i][j];
                else if(i == 0 && j != 0)
                    coins[i][j] = board[i][j] + coins[i][j-1];
                else if(i != 0 && j == 0)
                    coins[i][j] = board[i][j] + coins[i-1][j];
                else
                    coins[i][j] = board[i][j] + Math.max(coins[i][j], coins[i-1][j-1]);
            }
        }

        answer = coins[3][3];
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] board = {{6, 7, 1, 2}, {3, 5, 3, 9}, {6, 4, 5, 2}, {7, 3, 2, 6}};
        int ret = sol.solution(board);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
각 구역에서 획득할 수 있는 코인 양을 담은 2차원 배열 board가 solution 메소드의 매개변수로 주어집니다.

* board는 4x4 크기인 2차원 배열입니다.
* 각 구역에서 획득할 수 있는 코인의 양은 1 이상 9 이하인 자연수입니다.

---

#### return 값 설명
최대로 획득할 수 있는 코인의 양을 return 합니다.

---

#### 예시

| board                                                	| return |
|----------------------------------------------------------|--------|
| [[6, 7, 1, 2], [3, 5, 3, 9], [6, 4, 5, 2], [7, 3, 2, 6]] | 38 	|

#### 예시 설명
문제에 나온 예와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_06/no_06/desc_06.md "cosPro 1급 Java 6차 6번 문제")
