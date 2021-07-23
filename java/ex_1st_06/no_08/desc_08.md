# 문제8

수열 S가 주어질 때, 이 수열의 연속된 부분 수열 중 지그재그 수열 길이의 최댓값을 구하려 합니다.

지그재그 수열이란 첫 번째 원소부터 인접한 원소의 차이가 증가 → 감소 → 증가 → 감소 ... 혹은 감소 → 증가 → 감소 → 증가 ... 순으로 나타나는 수열을 말합니다. 단, 수열의 길이는 3 이상이어야 합니다.

예를 들어 수열이 [ 2, 5, 7, 3, 4, 6, 1, 8, 9]인 경우, 연속된 부분 수열 [5, 7, 3, 4]가 부분 수열 중 가장 긴 지그재그 수열이 됩니다.

부분 수열 중 가장 긴 지그재그 수열의 길이를 구하기 위해 다음과 같이 프로그램 구조를 작성했습니다.

~~~
1. 각 숫자가 바로 이전 숫자보다 증가했는지, 혹은 감소했는지 표시한 배열을 만듭니다.
  1-1. "증가"는 "INC", "감소"는 "DEC"로 표시합니다.
  1-2. 첫 번째 숫자는 증가도, 감소도 하지 않았다는 의미에서 -1로 표시합니다.

2. 1단계에서 만든 증가, 감소 배열을 이용해 각 숫자를 마지막으로 하는 지그재그 수열 중 가장 긴 것의 길이를 담은 배열을 만듭니다.
  2-1. 바로 전 숫자가 "증가"이고 현재 숫자가 "감소"이거나, 전 숫자가 "감소"이고 현재 숫자가 "증가"이면,
       현재 숫자를 마지막으로 하는 지그재그 수열 중 가장 긴 것의 길이는 (바로 전 숫자를 마지막으로 하는 지그재그 수열중 가장 긴 것의 길이 + 1)입니다.
  2-2. 그렇지 않으면 현재 숫자를 마지막으로 하는 지그재그 수열 중 가장 긴 것의 길이는 2입니다.
  2-3. 단, 첫 번째 숫자의 길이는 1로 초기화합니다.

3. 2단계에서 구한 배열에 담긴 값 중 최댓값이 부분 수열 중 가장 긴 지그재그 수열의 길이입니다.
  3-1. 만약 최댓값이 2라면 0을 return 합니다.
  3-2. 그 외에는 최댓값을 return 합니다.
~~~

수열이 담긴 배열 S가 매개변수로 주어질 때, 길이가 3 이상인 부분 수열 중 가장 긴 지그재그 수열의 길이를 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

### 초기 코드

```
class Solution {

    final int INC = 0;
    final int DEC = 1;
    
    int[] func_a(int[] arr){
        int length = arr.length;
        int[] ret = new int[length];
        ret[0] = 1;
        for(int i = 1; i < length; i++){
            if(arr[i] != arr[i-1])
                ret[i] = ret[i-1] + 1;
            else
                ret[i] = 2;
        }
        return ret;
    }
    
    int[] func_b(int[] arr){
        int length = arr.length;
        int[] ret = new int[length];
        ret[0] = -1;
        for(int i = 1; i < length; i++){
            if(arr[i] > arr[i-1])
                ret[i] = INC;
            else if(arr[i] < arr[i-1])
                ret[i] = DEC;
        }
        return ret;
    }
    
    int func_c(int[] arr){
        int length = arr.length;
        int ret = 0;
        for(int i = 0; i < length; i++)
            if(ret < arr[i])
                ret = arr[i];
        if(ret == 2)
            return 0;
        return ret;
    }
    
    public int solution(int[] S) {
        int[] check = func_@@@(@@@);
        int[] dp = func_@@@(@@@);
        int answer = func_@@@(@@@);
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] S1 = {2, 5, 7, 3, 4, 6, 1, 8, 9};
        int ret1 = sol.solution(S1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] S2 = {4, 3, 2, 1, 10, 6, 9, 7, 8};
        int ret2 = sol.solution(S2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        int[] S3 = {1, 2, 3, 4, 5};
        int ret3 = sol.solution(S3);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret3 + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
수열이 담긴 배열 S가 solution 메소드의 매개변수로 주어집니다.

* S의 길이는 3 이상 100 이하입니다.
* S의 원소는 1 이상 100 이하인 자연수이며, 같은 숫자가 중복해서 나타나지 않습니다.

---

#### return 값 설명
길이가 3 이상인 부분 수열 중 가장 긴 지그재그 수열의 길이를 return 해주세요.

* 만약 지그재그 수열이 없다면 0을 return 해주세요.

---

#### 예시

| S                            | return |
|------------------------------|--------|
| [2, 5, 7, 3, 4, 6, 1, 8, 9]  | 4      |
| [4, 3, 2, 1, 10, 6, 9, 7, 8] | 7      |
| [1, 2, 3, 4, 5]              | 0      |

#### 예시 설명

예제 #1

문제 예시와 같습니다.

예제 #2

[2, 1, 10, 6, 9, 7, 8]이 부분 수열 중 가장 긴 지그재그 수열입니다.

예제 #3

부분 수열중 지그재그 수열이 없습니다.
