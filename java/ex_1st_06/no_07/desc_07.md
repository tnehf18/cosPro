# 문제7

UP AND DOWN 게임은 다음과 같은 규칙에 따라 진행하는 게임입니다.

* 먼저 출제자가 1 이상 ~ K 이하인 자연수 중 하나를 마음속으로 생각합니다.
* 게임 참가자는 1 이상 ~ K 이하인 자연수 중 아무거나 하나를 말합니다.
 * 만약, 참가자가 말한 숫자가 출제자가 생각한 숫자보다 작다면 출제자는 "UP"이라고 말합니다.
 * 만약, 참가자가 말한 숫자가 출제자가 생각한 숫자보다 크다면 출제자는 "DOWN"이라고 말합니다.
* 참가자는 출제자가 말하는 "UP", "DOWN" 힌트를 잘 활용해서 출제자가 처음에 생각한 숫자를 맞추면 됩니다.

출제자가 처음에 생각할 수 있는 자연수 범위 K, 게임 참가자가 말한 숫자가 순서대로 담긴 배열 numbers, 게임 출제자가 참가자가 말한 각 숫자에 대해 답한 내용이 순서대로 담긴 배열 UpDown이 매개변수로 주어집니다. 배열에 주어진 순서대로 게임이 진행됐다고 했을 때, 현재 정답이 될 수 있는 숫자는 몇 개인지 return 하도록 solution 메소드를 작성하려 합니다. 빈칸을 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    public int solution(int K, int[] numbers, String[] UpDown) {
        int left = 1;
        int right = K;
        for(int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            if(UpDown[i].equals("UP"))
                left = @@@;
            else if(UpDown[i].equals("DOWN"))
                right = @@@;
            else if(UpDown[i].equals("RIGHT"))
                return 1;
        }
        return @@@;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int K1 = 10;
        int[] numbers1 = {4, 9, 6};
        String[] UpDown1 = {new String("UP"), new String("DOWN"), new String("UP")};
        int ret1 = sol.solution(K1, numbers1, UpDown1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int K2 = 10;
        int[] numbers2 = {2, 1, 6};
        String[] UpDown2 = {new String("UP"), new String("UP"), new String("DOWN")};
        int ret2 = sol.solution(K2, numbers2, UpDown2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int K3 = 100;
        int[] numbers3 = {97, 98};
        String[] UpDown3 = {new String("UP"), new String("RIGHT")};
        int ret3 = sol.solution(K3, numbers3, UpDown3);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명

출제자가 처음에 생각할 수 있는 자연수 범위 K, 게임 참가자가 말한 숫자가 순서대로 담긴 배열 numbers, 게임 출제자가 참가자가 말한 각 숫자에 대해 답한 내용이 순서대로 담긴 배열 UpDown이 solution 메소드의 매개변수로 주어집니다.

* K는 1 이상 10,000 이하인 자연수입니다.
* numbers 배열의 길이는 1 이상 10 이하입니다.
* numbers 배열의 원소는 1 이상 K 이하인 자연수입니다.
* UpDown 배열의 길이는 numbers 배열의 길이와 같습니다.
* UpDown 배열은 문자열 "UP", "DOWN", "RIGHT"으로만 이루어져 있습니다.
* "RIGHT"이 나오면 정답을 맞췄다는 것이며, 게임은 더는 진행되지 않습니다.
* 항상 올바르게 게임이 진행된 경우만 입력으로 주어집니다.

---

#### return 값 설명

배열에 주어진 순서대로 게임이 진행됐다고 했을 때, 현재 정답이 될 수 있는 숫자는 몇 개인지
return 해주세요.

* 출제자가 "RIGHT"을 말한 상태로 게임이 끝났다면 정답을 맞춘 것이므로 1을 return 하면 됩니다.

---

#### 예시

| K  | numbers   | UpDown              | return |
|----|-----------|----------------------|--------|
| 10 | [4, 9, 6] | ["UP", "DOWN", "UP"] | 2      |
| 10 | [2, 1, 6] | ["UP", "UP", "DOWN"] | 3      |
| 100 | [97, 98] | ["UP", "RIGHT"] | 1      |

#### 예시 설명

예제 #1

| 말한 숫자 | 출제자 대답 | 가능성 있는 숫자  |
|-----------|-------------|-------------------|
| 4         | "UP"        | 5, 6, 7, 8, 9, 10 |
| 9         | "DOWN"      | 5, 6, 7, 8        |
| 6         | "UP"        | 7, 8              |

따라서 현재 상황에서 가능성 있는 숫자는 2개입니다.

예제 #2

| 말한 숫자 | 출제자 대답 | 가능성 있는 숫자  |
|-----------|-------------|-------------------|
| 2         | "UP"        | 3, 4, 5, 6, 7, 8, 9, 10 |
| 1         | "UP"      | 3, 4, 5, 6, 7, 8, 9, 10        |
| 6         | "DOWN"        | 3, 4, 5              |

따라서 현재 상황에서 가능성 있는 숫자는 3개입니다.

예제 #3

| 말한 숫자 | 출제자 대답 | 가능성 있는 숫자  |
|-----------|-------------|-------------------|
| 97         | "UP"        | 98, 99, 100 |
| 98         | "RIGHT"      | 98        |

따라서 정답을 맞췄으므로 1을 return 하면 됩니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st_06/no_08/desc_08.md "cosPro 1급 Java 6차 8번 문제")
