# 문제2

모 학교에서는 학기가 끝날 때마다 장학금을 줍니다. 이때 장학생이 몇 명인지 구하려고 합니다. 장학금을 주는 조건은 다음과 같습니다.

1. 이번 학기 성적이 80점 이상(100점 만점)이면서 석차가 상위 10% 이내인 학생
2. 이번 학기 성적이 80점 이상이면서 1등인 학생
3. 직전 학기 대비 성적이 가장 많이 오른 학생(여러 명인 경우 해당 학생 전부)

단, 동점인 학생들은 등수가 같으며, 중복 수혜는 불가합니다.

장학생이 몇 명인지 구하기 위해 다음과 같이 프로그램 구조를 작성했습니다.

~~~
1. 이번 학기 성적을 기준으로 학생별 석차를 구합니다.
2. 각 학생의 (이번 학기 성적 - 직전 학기 성적) 중 최댓값을 구합니다.
3. 아래 조건을 만족하는 학생을 발견하면, 장학생 수를 1 증가시킵니다.
 3-1. 이번 학기 성적이 80점 이상이고, 석차가 상위 10% 이내인 경우
 3-2. 또는 이번 학기 성적이 80점 이상이고, 석차가 1등인 경우
 3-3. 또는 (이번 학기 성적 - 직전 학기 성적)이 2단계에서 구한 값과 같고, 그 값이 양수인 경우
4. 장학생 수를 return 합니다.
~~~

학생들의 이번 학기 성적을 담고 있는 배열 currentGrade, 직전 학기 성적을 담고 있는 배열 lastGrade가 매개변수로 주어질 때, 장학생 수를 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

### 초기 코드

```
// You may use import as below.
//import java.util.*;

class Solution {

    public int func_a(int[] currentGrade, int[] lastGrade, int[] rank, int maxDiffGrade) {
        int arrLength = currentGrade.length;
	int count = 0;
	for (int i = 0; i < arrLength; i++) {
	    if (currentGrade[i] >= 80 && rank[i] <= arrLength / 10)
	        count++;
	    else if (currentGrade[i] >= 80 && rank[i] == 1)
	        count++;
	    else if (maxDiffGrade == currentGrade[i] - lastGrade[i])
	        count++;
	    }
	    return count;
    }

    public int[] func_b(int[] currentGrade) {
        int arrLength = currentGrade.length;
	int[] rank = new int[arrLength];
        for (int i = 0; i < arrLength; i++)
            rank[i] = 1;
        for (int i = 0; i < arrLength; i++) 
	     for (int j = 0; j < arrLength; j++) 
	         if (currentGrade[i] < currentGrade[j]) 
		     rank[i]++;
        return rank;
    }

    public int func_c(int[] currentGrade, int[] lastGrade) {
        int maxDiffGrade = 1;
	for (int i = 0; i < currentGrade.length; i++) {
	    if (maxDiffGrade < currentGrade[i] - lastGrade[i])
	        maxDiffGrade = currentGrade[i] - lastGrade[i];
        }
	return maxDiffGrade;
    }

    public int solution(int[] currentGrade, int[] lastGrade) {
        int[] rank = func_@@@(@@@);
	int maxDiffGrade = func_@@@(@@@);
	int answer = func_@@@(@@@);
	return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution sol = new Solution();
	
    	int[] currentGrade = {70, 100, 70, 80, 50, 95};
    	int[] lastGrade = {35, 65, 80, 50, 20, 60};
    	int ret = sol.solution(currentGrade, lastGrade);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
```

---

#### 매개변수 설명

학생들의 이번 학기 성적, 지난 학기 성적이 들어있는 배열 currentGrade, lastGrade가 solution 메소드의 매개변수로 주어집니다.
* currentGrade의 길이와 lastGrade의 길이는 같으며, 길이는 1 이상 200 이하입니다.
* currentGrade와 lastGrade의 원소는 0 이상 100 이하인 정수입니다.

---

#### return 값 설명

장학생 수를 return 해주세요.

---

#### 예시

| currentGrade | lastGrade | return |
|------------|------------|--------|
| [70, 100, 70, 80, 50, 95] | [35, 65, 80, 50, 20, 60] | 3 |

#### 예시 설명

학생 수가 10명보다 적으므로, 1등이 장학금을 받습니다. 
직전 학기 대비 성적이 가장 많이 오른 학생은 다음과 같이 3명입니다.

* 35 → 70점
* 65 → 100점
* 60 → 95점

이때, 두 번째 학생은 이번 학기 1등 장학금을 이미 받아 중복 수혜가 불가하고, 나머지 두 학생은 장학금을 받을 수 있습니다. 따라서 장학금을 받는 학생은 총 3명입니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_2nd/ex_2nd_03/no_03/desc_03.md "cosPro 2급 Java 3차 3번 문제")
