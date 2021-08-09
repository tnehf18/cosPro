# 문제10

배열 원소인 자신을 2로 나눈 값이 배열에 있는 수의 개수를 구하려고 합니다. 예를 들어, 배열이 [4, 8, 3, 6, 7]인 경우, 6/2 = 3, 8/2 =4이므로 자신을 2로 나눈 값이 배열에 들어있는 수의 개수는 총 2개입니다. 
숫자가 담긴 배열 arr가 주어졌을 때, 자신을 2로 나눈 값이 배열에 들어있는 수가 몇 개인지 return 하는 solution 메소드를 작성했습니다. 그러나, 코드 일부분이 잘못되어있기 때문에, 코드가 올바르게 동작하지 않습니다. 주어진 코드에서 _**한 줄**_만 변경해서 모든 입력에 대해 올바르게 동작하도록 수정해주세요. 

### 초기 코드

```
class Solution {

    public int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) 
            for (int j = 0; j < arr.length; j++) 
                if (arr[i]%2 == 0 && arr[i]/2 == arr[j]) {
                    answer++;
                    continue;
                }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] arr = {4, 8, 3, 6, 7};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

--- 

#### 매개변수 설명 
숫자가 담긴 배열 arr가 solution 메소드의 매개변수로 주어집니다. 

* arr의 크기는 1 이상 1,000 이하입니다. 
* arr의 원소는 1,000 이하의 자연수입니다. 

--- 

#### return 값 설명 
자신을 2로 나눈 값이 배열에 들어있는 수가 몇 개인지 return 해주세요. 

#### 예시 

| arr |return | 
|---|---| 
| [4, 8, 3, 6, 7] |2| 

--- 

#### 예시 설명 

4/2=2이고, 2는 배열에 없습니다. 
8/2=4이고 4는 4 이고 4는 배열에 존재합니다. 
3/2=1.5이고 1.5는 배열에 없습니다. 
6/2=3이고 3은 배열에 존재합니다. 
7/2=3.5이고 3.5는 배열에 없습니다. 
따라서 자신을 2로 나눈 값이 배열에 들어있는 수가 총 2개이므로 2를 return 합니다.

---

### → 정답 확인

### [→ 목록](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_03/no_list.md "cosPro 2급 Java 3차")
