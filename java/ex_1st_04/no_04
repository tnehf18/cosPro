# 문제4

마방진이란 가로, 세로, 대각선 방향의 수를 더한 값이 모두 같은 정사각형 행렬입니다. 마방진에는 `1`부터 `정사각형 넓이`까지, 수가 하나씩 배치되어야 합니다. 아래는 가로, 세로, 대각선 방향의 수를 더한 값이 모두 34인 4 x 4 마방진입니다.

  ![KakaoTalk_Photo_2018-09-15-17-58-10.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/762ea16c04/303fdbe0-89ed-4f74-87b9-1ed047cf2c7c.png)

4 x 4 행렬의 두 빈칸을 채워 행렬을 마방진으로 완성하려 합니다. 빈칸은 0으로 표시합니다. 이를 위해 다음과 같이 프로그램 구조를 작성했습니다.

```
1. 두 빈칸의 위치를 찾습니다.
2. 숫자 1 ~ 16 중 존재하지 않는 숫자 2개를 찾습니다.
3. 첫 번째 빈칸에 작은 숫자를, 두 번째 빈칸에 큰 숫자를 넣어 행렬이 마방진이 되는지 검사합니다.
  4-1. 마방진이라면 [작은 숫자의 행 번호, 작은 숫자의 열 번호, 작은 숫자, 큰 숫자의 행 번호, 큰 숫자의 열 번호, 큰 숫자]를 return 합니다.
  4-2. 마방진이 아니라면 [큰 숫자의 행 번호, 큰 숫자의 열 번호, 큰 숫자, 작은 숫자의 행 번호, 작은 숫자의 열 번호, 작은 숫자]를 return 합니다.
```

4 x 4 크기 2차원 배열 matrix가 매개변수로 주어질 때, 이때 빈칸의 위치와 각 칸에 들어갈 수를 담은 배열을 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작하도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

* 주어진 행렬은 빈칸을 채우면 반드시 마방진으로 완성할 수 있습니다.

### 초기 코드

```
import java.util.*;
import javafx.util.*;

class Solution {
    public static final int n = 4; 

    public ArrayList<Integer> func_a(int[][] matrix) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        boolean [] exist = new boolean[n * n + 1];
        Arrays.fill(exist, false);
        for (int i = 0; i < n; i ++)
            for (int j = 0; j < n; j++)
                    exist[matrix[i][j]] = true;
        for (int i = 1; i <= n * n;a i++)
            if (exist[i] == false)
                ret.add(i);
        return ret;
    }
    
    public ArrayList<Pair<Integer, Integer> > func_b(int[][] matrix) {
        ArrayList<Pair<Integer, Integer> > ret = new ArrayList<Pair<Integer, Integer> >();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (matrix[i][j] == 0)
                    ret.add( new Pair<Integer, Integer>(i, j) );
        return ret;
    }
    
    public boolean func_c(int[][] matrix) {
        int sum = 0;
        for (int i = 1; i <= n * n; i++)
            sum += i;
        sum = sum / n;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != sum || colSum != sum)
                return false;
        }
        int mainDiagonalSum = 0;
        int skewDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i];
            skewDiagonalSum += matrix[i][n-1-i];
        }
        if (mainDiagonalSum != sum || skewDiagonalSum != sum)
            return false;
        return true;
    }
    
    public int[] solution(int[][] matrix) {
        int[] answer = new int[6];
        int ansIdx = 0;
        ArrayList<Pair<Integer, Integer> > coords = func_@@@(@@@);
        ArrayList<Integer> nums = func_@@@(@@@);
        
        matrix[coords.get(0).getKey()][coords.get(0).getValue()] = nums.get(0);
        matrix[coords.get(1).getKey()][coords.get(1).getValue()] = nums.get(1);
        if (func_@@@(@@@)) {
            for (int i = 0; i <= 1; i++) {
                answer[ansIdx++] = coords.get(i).getKey() + 1;
                answer[ansIdx++] = coords.get(i).getValue() + 1;
                answer[ansIdx++] = nums.get(i);
            }
        }
        else {
            matrix[coords.get(0).getKey()][coords.get(0).getValue()] = nums.get(1);
            matrix[coords.get(1).getKey()][coords.get(1).getValue()] = nums.get(0);
            for (int i = 0; i <= 1; i++) {
                answer[ansIdx++] = coords.get(1-i).getKey() + 1;
                answer[ansIdx++] = coords.get(1-i).getValue() + 1;
                answer[ansIdx++] = nums.get(i);
            }
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.    
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] matrix = {{16,2,3,13},{5,11,10,0},{9,7,6,12},{0,14,15,1}};
        int[] ret = sol.solution(matrix);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    } 
    
}
```

---

#### 매개변수 설명

2차원 배열 matrix가 solution 메소드의 매개변수로 주어집니다.

* matrix는 크기가 4 x 4인 2차원 배열입니다.
* matrix에는 0이 반드시 두 개 들었습니다.
* matrix에는 1 이상 16 이하인 자연수 14개가 겹치지 않게 들었습니다.

---

#### return 값 설명

빈칸의 위치와 각 칸에 들어갈 수를 담은 배열을 return 해주세요.

---

#### 예시

| matrix | return |
|--------|--------|
| [[16,2,3,13],[5,11,10,0],[9,7,6,12],[0,14,15,1]] | [4,1,4,2,4,8] |

#### 예시 설명

예시 #1

  ![KakaoTalk_Photo_2018-09-15-18-01-27.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/3228b4e06c/bc8300f8-1e7b-4c77-88a7-82f64f6a53bc.png)

위 그림에서 빈칸은 (4, 1)과 (2, 4)입니다. 각 칸에 4와 8을 채우면 마방진이 완성됩니다. 따라서 [작은 숫자의 행 번호, 작은 숫자의 열 번호, 작은 숫자, 큰 숫자의 행 번호, 큰 숫자의 열 번호, 큰 숫자]를 return 해야 합니다. 답은 [4, 1, 4, 2, 4, 8]입니다.

  ![KakaoTalk_Photo_2018-09-15-18-01-27 (1).png](https://grepp-programmers.s3.amazonaws.com/files/ybm/07b49bd9cc/06b0e5b9-27ba-49e7-9782-089ca97cd15b.png)
