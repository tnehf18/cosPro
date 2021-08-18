# 문제6

4 x 4 크기인 정사각형 종이가 1 x 1 크기인 격자 칸으로 나누어져 있습니다. 이 종이를 가로축 혹은 세로축에 평행한 격자 선을 따라 한 번 접었을 때, 만나는 격자 칸에 적힌 숫자의 합이 최대가 되도록 하려 합니다. 종이를 접을 때는 만나는 격자 칸이 정확히 일치하도록 해야 합니다.

예를 들어 다음과 같이 4 x 4 크기인 종이가 있을 때,

  ![grid_sum_3.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/3ea85370be/5116d961-6f8b-4b1b-a01c-c8ffc722755b.png)

종이는 점선 중 하나를 따라서 접을 수 있습니다. 이때, 붉은색 점선을 따라 종이를 접으면 36과 19가 적힌 칸이 정확히 만납니다. 두 숫자의 합은 55이며, 이때가 최댓값입니다.

4 x 4 크기인 정사각형 종이의 각 격자 칸에 적힌 숫자가 담긴 배열 grid가 매개변수로 주어질 때, 종이를 접었을 때 만나게 되는 격자 칸에 적힌 숫자의 합 중 최댓값을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int[][] grid) {
        int answer = 0;
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                for(int k = j + 1; k < 4; k += 2)
                    answer = Math.max(answer, Math.max(grid[i][j] + grid[j][k], grid[j][k] + grid[k][i]));
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] grid = {{1, 4, 16, 1}, {20, 5, 15, 8}, {6, 13, 36, 14}, {20, 7, 19, 15}};
        int ret = sol.solution(grid);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
4 x 4 크기인 정사각형 종이의 각 격자 칸에 적힌 숫자가 담긴 배열 grid가 solution 메소드의 매개변수로 주어집니다.

* 각 격자칸에 적힌 수는 1 이상 100 이하인 자연수입니다.

---

#### return 값 설명
격자 선을 따라 종이를 한 번 접었을 때 만나는 격자 칸에 적힌 숫자의 합 중 최댓값을 return 해주세요.

* 격자 선은 문제의 예시와같이 가로, 혹은 세로 방향으로 평행한 점선을 말합니다.

---

#### 예시

| grid                                                              | return |
|-------------------------------------------------------------------|--------|
| [[1, 4, 16, 1], [20, 5, 15, 8], [6, 13, 36, 14], [20, 7, 19, 15]] | 55     |

#### 예시 설명
문제의 예시와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_06/no_07/ "cosPro 1급 Java 6차 7번 문제")