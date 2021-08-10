# 문제10

불량 사과 상자가 몇 박스인지 알아보려 합니다. 사과 한 박스의 표준 무게는 weight이며, 표준 무게와 비교해 무게가 오차 10% 이내인 사과 박스는 정상품으로, 오차가 그보다 많은 사과 박스는 불량품으로 판정합니다.

예를 들어, 표준 무게가 600이라면 무게가 540 이상 660 이하인 사과 상자만 정상품입니다. 판정해야 할 사과 상자의 무게가 각각 [653, 670, 533, 540, 660]로 주어진다면 무게가 670, 533인 상자는 불량품입니다. 따라서 주어진 상자 중 불량품은 2개입니다.

표준 무게 weight와 판정해야 할 사과 상자의 무게가 담긴 배열 boxes가 매개변수로 주어질 때, 불량품 개수를 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    public int solution(int weight, int[] boxes) {
        int answer = 0;

        for(int i = 0; i < boxes.length; i++) 
        	if(@@@)
        		answer++;
        	
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int weight = 600;
        int[] boxes = {653, 670, 533, 540, 660};
        int ret = sol.solution(weight, boxes);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
	
}
```

---

#### 매개변수 설명
표준 무게 weight와 판정해야 할 사과 상자의 무게가 담긴 배열 boxes가 solution 메소드의 매개변수로 주어집니다.

* 표준 무게는 500 이상 10,000 이하입니다.
* 표준 무게는 항상 10으로 나누어 떨어집니다.
* 판정해야 할 사과 상자의 개수는 1개 이상 20개 이하입니다.
* 판정해야 할 사과 상자의 무게는 400 이상 12,000 이하입니다.

---

#### return 값 설명
불량품 개수를 return 해주세요.

---
#### 예시

| weight | boxes                 	| return |
|--------|---------------------------|--------|
| 600	| [653, 670, 533, 540, 660] | 2  	|

#### 예시 설명
문제에 나온 예와 같습니다.

---

### → 정답 확인

### [→ 목록](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_06/no_list.md "cosPro 2급 Java 6차")
