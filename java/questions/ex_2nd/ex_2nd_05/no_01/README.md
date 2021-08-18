# 문제1

6명이 사다리 게임[^1] 을 할 때, 몇 번째 위치에서 시작하는 사람이 상품을 타는지 알고 싶습니다. 가로줄은 항상 인접한 세로줄만 연결할 수 있으며 주어진 순서대로 위에서부터 연결합니다.

예를 들어, 아래 사다리의 가로줄은 [[1, 2], [3, 4], [2, 3], [4, 5], [5, 6]] 으로 표현합니다. 이때 1번째 위치에서 시작한 사람이 상품을 탑니다.

 ![ladders.jpg](https://grepp-programmers.s3.amazonaws.com/files/ybm/4179093d4d/d2f78792-2661-41bd-9973-f072153ee229.jpg)

가로줄의 위치가 담긴 2차원 배열 ladders와 상품의 위치 win이 매개변수로 주어질 때, 당첨자의 시작 위치를 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    public int solution(int[][] ladders, int win) {
        int answer = 0;
        
        int[] player = { 1, 2, 3, 4, 5, 6 };
        
        for(int i = 0; i < ladders.length; i++) {
            int temp = player[ladders[i][0]-1];
            @@@ = @@@;
            @@@ = temp;
        }
        
        answer = player[win-1];
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] ladders = {{1, 2}, {3, 4}, {2, 3}, {4, 5}, {5, 6}};
        int win = 3;
        int ret = sol.solution(ladders, win);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

---

#### 매개변수 설명
가로줄의 위치가 담긴 2차원 배열 ladders와 상품이 있는 위치 win이 solution 메소드의 매개변수로 주어집니다.

* 가로줄의 개수는 1 이상 20 이하인 자연수입니다.
* win은 1 이상 6 이하인 자연수입니다.
* 가로줄은 항상 연결할 수 있는 형태만 주어집니다.

---

#### return 값 설명
승리하는 사람의 시작 위치를 return 합니다.

---
#### 예시

| ladders                              	| win | return |
|------------------------------------------|-----|--------|
| [[1, 2], [3, 4], [2, 3], [4, 5], [5, 6]] | 3   | 1  	|


[^1]: 사다리 게임은 먼저 사람 수만큼 세로줄을 긋고 한쪽 편에는 이름을 쓰고 반대쪽에는 상품 위치를 씁니다. 서로 인접한 세로줄 사이에 가로줄을 무작위로 그은 다음 세로줄을 타고 내려가면서 가로줄을 만날 때마다 가로줄로 연결된 다른 세로줄로 가는 게임입니다.

---

### → 정답 확인

### [→ 다음 문제](../no_02/ "COS Pro 2급 Java 5차 2번 문제")
