# 문제8

상수도 요금을 계산하려 합니다. 가정용 상수도 사용요금 계산방법은 아래와 같습니다.

| 단계  | 사용량	| 요금  |
|-------|-----------|-------|
| 1단계 | 0~20톤  | 430원 |
| 2단계 | 21~30톤 | 570원 |
| 3단계 | 31톤 이상 | 840원 |

사용료는 사용량에 따라 단계별로 적용됩니다. 예를 들어, 물을 35톤 사용했다면 다음과 같은 방식으로 계산합니다.

```
* 1단계 적용 : 20톤 x 430원 = 8,600원
* 2단계 적용 : 10톤 x 570원 = 5,700원
* 3단계 적용 : 5톤 x 840원 = 4,200원
총 사용요금 : 18,500원
```

상수도 사용량 usage가 매개변수로 주어질 때, 사용요금을 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <u>**한 줄**</u>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {
    
    public int solution(int usage) {
        int answer = 0;
        
        if(usage > 30)
            answer = 20 * 430 + 10 * 570 + (usage - 20) * 840;
        else if(usage > 20)
            answer = 20 * 430 + (usage - 20) * 570;
        else
            answer = usage * 430;
        
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int usage = 35;
        int ret = sol.solution(usage);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

---

#### 매개변수 설명
상수도 사용량 usage가 solution 메소드의 매개변수로 주어집니다.

* 상수도 사용량은 0톤 이상 100톤 이하인 정수입니다.

---

#### return 값 설명
사용요금을 return 해주세요.

---

#### 예시

| usage | return |
|-------|--------|
| 35	| 18500  |

#### 예시 설명
문제에 나온 예와 같습니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_05/no_09/ "cosPro 2급 Java 5차 9번 문제")