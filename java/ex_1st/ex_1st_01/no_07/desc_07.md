# 문제7
지난 연속된 n일 동안의 주식 가격이 순서대로 들어있는 배열이 있습니다. 이때, 다음 규칙에 따라 주식을 사고 팔았을 때의 최대 수익을 구하려 합니다.

* n일 동안 주식을 단 한 번 살 수 있습니다.
* n일 동안 주식을 단 한 번 팔 수 있습니다.
* 주식을 산 날에 바로 팔 수는 없으며, 최소 하루가 지나야 팔 수 있습니다.
* 적어도 한 번은 주식을 사야하며, 한 번은 팔아야 합니다.

주식을 팔 때는 반드시 이전에 주식을 샀어야 하며, 최대 수익은 양수가 아닐 수도 있습니다.

연속된 n 일 동안의 주식 가격이 순서대로 들어있는 배열 prices가 매개변수로 주어질 때, 주식을 규칙에 맞게 한 번만 사고팔았을 때 얻을 수 있는 최대 수익을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 코드가 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정해주세요.

### 초기 코드

```
class Solution {

    int solution(int[] prices) {
        int INF = 1000000001;
        int tmp = INF;
        int answer = -INF;
        for(int price : prices) {
            if(tmp != INF)
                answer = Math.max(answer, tmp - price);
            tmp = Math.min(tmp, price);
        }
        return answer;
    }

    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.solution(prices1);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int[] prices2 = {3, 1};
        int ret2 = sol.solution(prices2);
        
        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
    
}
```

---

#### 매개변수 설명
연속된 n 일 동안의 주식 가격이 순서대로 들어있는 배열 prices가 solution 메소드의 매개변수로 주어집니다.
* prices의 길이는 2 이상 1,000,000 이하입니다.
* prices의 각 원소는 1 이상 1,000 이하의 자연수입니다.

---

#### return 값 설명
주식을 규칙에 맞게 한 번만 사고팔았을 때 얻을 수 있는 최대 수익을 return 해주세요.

---

#### 예시

| prices  	| return 	|
|---------	|--------	|
| [1,2,3] 	| 2      	|
| [3,1]   	| -2     	|

#### 예시 설명

예시 #1

연속된 3일의 주가가 차례로 [1, 2, 3] 이며, 첫째 날에 주식을 사서 셋째 날에 팔면 수익은 2이고, 이때가 최대입니다.

예시 #2

문제에서 설명한 것처럼 무조건 한 번은 매수하고, 한 번은 매도해야 합니다. 첫째 날에 매수하여 둘째 날에 매도하는 방법밖에 없기 때문에 수익은 -2, 즉 2만큼 손실을 보게 됩니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_01/no_08/desc_08.md "cosPro 1급 Java 1차 8번 문제")
