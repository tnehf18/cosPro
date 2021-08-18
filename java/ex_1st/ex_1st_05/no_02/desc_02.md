# 문제2

아래와 같이 벽이 여러 개 있을 때, 벽 2개를 제외한 나머지 벽을 제거하여 물을 최대한 담으려 합니다. 물은 `두 벽 사이의 거리 x 두 벽 중 낮은 벽의 높이`리터 만큼 담을 수 있으며, 두 벽의 거리는 두 벽의 위치 차이입니다.

  ![스크린샷 2018-10-15 오전 9.33.21.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/ed3547120e/3d38bd74-2521-4bcb-80ac-9e5715558d51.png)

모든 벽의 위치와 높이를 담은 2차원 배열 walls가 매개변수로 주어질 때, 물을 최대 몇 리터나 담을 수 있는지 return 하도록 solution 메소드를 작성했습니다. 그러나, 일부 코드가 잘못되어 코드가 바르게 동작하지 않습니다. 주어진 코드가 모든 입력을 바르게 처리하도록 코드를 수정해주세요. 코드는 <u>**한 줄**</u>만 수정해야 합니다.

### 초기 코드

```
class Solution {

    public int solution(int[][] walls) {
        int answer = 0;

        for(int i = 0; i < walls.length; i++) {
            for(int j = i+1; j < walls.length; j++) {
                int area = 0;
                if(walls[i][1] > walls[j][1])
                    area = walls[i][1] * (walls[j][0] - walls[i][0]);
                else
                    area = walls[j][1] * (walls[j][0] - walls[i][0]);

                if(answer < area)
                    answer = area;
            }
        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Solution sol = new Solution();
      
    	int[][] walls = {{1, 4}, {2, 6}, {3, 5}, {5, 3}, {6, 2}};
    	int ret = sol.solution(walls);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명

모든 벽의 위치와 높이를 담은 2차원 배열 walls가 solution 메소드의 매개변수로 주어집니다.
* walls는 길이가 3이상 100이하인 2차원 배열입니다.
* walls의 각 원소는 [벽의 위치, 벽의 높이] 이고, 벽의 위치를 기준으로 오름차순으로 정렬되어 있습니다.
    * 벽의 위치는 1 이상 100 이하입니다.
    * 벽의 높이는 1 이상 100 이하입니다.

---

#### return 값 설명

물을 최대 몇 리터나 담을 수 있는지 return 합니다.

---

#### 입출력 예

| walls                                 | return |
|------------------------------------------|--------|
| [[1, 4], [2, 6], [3, 5], [5, 3], [6, 2]] | 12     |

#### 입출력 예 설명

아래와 같이 벽을 남겼을 때 물을 최대로 담을 수 있습니다. 이 때 최대 12리터를 담을 수 있습니다.

  ![스크린샷 2018-10-15 오전 9.33.16.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/56a9ac8e95/6b389bed-936d-40d0-abe2-b89000409703.png)

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_05/no_03/desc_03.md "cosPro 1급 Java 5차 3번 문제")
