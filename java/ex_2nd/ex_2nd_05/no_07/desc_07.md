# 문제7

XX 마트에선 구매할 물건이 3개 이하이면 소량 계산대에서, 그렇지 않으면 일반 계산대에서 계산해야 합니다. 두 계산대 모두 물건 한 개를 계산하는 데 1분이 걸립니다.

손님들이 구매할 물건 수가 담긴 배열 stuffs가 매개변수로 주어질 때, 모든 물건을 계산하는 데 필요한 시간을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int[] stuffs) {
        int answer = 0;

        int smallCounter = 0;
        int generalCounter = 0;

        for(int i = 0; i < stuffs.length; i++) {
            if(stuffs[i] > 3)
                generalCounter += stuffs[i];
            else
                smallCounter += stuffs[i];
        }

        if(smallCounter < generalCounter)
            answer = smallCounter;
        else
            answer = generalCounter;
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
    	Solution sol = new Solution();

    	int[] stuffs = {5, 3, 4, 2, 3, 2};
    	int ret = sol.solution(stuffs);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
손님들이 구매할 물건 수가 담긴 배열 stuffs가 solution 메소드의 매개변수로 주어집니다.

* 계산을 할 손님은 1명 이상 100명 이하입니다.
* 손님이 구입할 물건은 1개 이상 20개 이하입니다.

---

#### return 값 설명
모든 물건을 계산하는데 걸리는 시간을 return 해주세요.

---
#### 예시

| stuffs         	| return |
|--------------------|--------|
| [5, 3, 4, 2, 3, 2] | 10 	|

#### 예시 설명

첫 번째 손님, 세 번째 손님은 일반 계산대에서 계산합니다. 이때 9분이 걸립니다.
두 번째, 네 번째, 다섯 번째, 여섯 번째 손님은 소량 계산대에서 계산합니다. 이때 10분이 걸립니다.
따라서 모든 물건을 계산하는데 걸리는 시간은 10분입니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_05/no_08/desc_08.md "cosPro 2급 Java 5차 8번 문제")
