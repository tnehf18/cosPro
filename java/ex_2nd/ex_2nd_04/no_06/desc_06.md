# 문제6

적립된 포인트를 최대한으로 사용하려고 합니다. 포인트를 사용하는 규칙은 다음과 같습니다.

* 포인트는 100포인트 단위로 사용합니다.
* 1000포인트 이상 있을 때만 포인트를 사용할 수 있습니다.

적립된 포인트 point가 매개변수로 주어질 때, 최대 몇 포인트를 쓸 수 있는지 return 하도록 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 몇몇 입력에 대해서는 올바르게 동작하지 않습니다. 주어진 코드에서 <U>**한 줄**</U>만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정하세요.

### 초기 코드

```
class Solution {

    public int solution(int point) {
        if (point < 1000)
            return 0;
        return point * 100 / 100;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 코드입니다. 아래에는 잘못된 부분이 없으니, 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int point = 2323;
        int ret = sol.solution(point);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

---

#### 매개변수 설명
적립된 포인트 point가 solution메소드의 매개변수로 주어집니다.

* point는 0 이상 1,000,000 이하인 정수입니다.

---

#### return 값 설명
최대 몇 포인트를 쓸 수 있는지 return합니다

---

#### 예시

| point | return |
|-------|-------|
| 2323 | 2300 |

#### 예시 설명

적립된 포인트가 2323포인트라면 최대로 사용 가능한 포인트는 2300포인트입니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_04/no_07/desc_07.md "cosPro 2급 Java 4차 7번 문제")
