# 문제3

 A와 B가 카드 게임을 할 때, 누가 더 많은 점수를 획득했는지, 또 획득한 점수는 몇 점인지 알아보려고 합니다. 게임 규칙은 다음과 같습니다.

* 알파벳 a, b, c, d, e가 적힌 카드뭉치가 있습니다.
* A와 B가 서로 번갈아 가면서 n장씩 카드를 뽑습니다.
* 소유한 카드 점수를 합산합니다. 알파벳 카드 한 장당 a = 1점, b = 2점, c = 3점, d = 4점, e = 5점으로 점수를 계산합니다.
* 점수가 높은 사람이 승리합니다.

게임에서 이긴 사람과 획득 점수를 구하기 위해 다음과 같이 프로그램 구조를 작성했습니다.

```
1. A와 B가 번갈아가며 가져간 카드를 각각 배열에 넣습니다.
2. A와 B가 각각 획득한 점수를 구합니다.
3. 획득한 점수가 큰 사람과 획득한 점수를 순서대로 배열에 담아 return 합니다.
```

뽑아야 하는 카드 개수 n과 카드를 나타내는 문자열 bundle이 매개변수로 주어질 때, 이긴 사람과 점수를 return 하도록 solution 메소드를 작성하려 합니다. 위 구조를 참고하여 코드가 올바르게 동작할 수 있도록 빈칸에 주어진 func_a, func_b, func_c 메소드와 매개변수를 알맞게 채워주세요.

### 초기 코드

```
class Solution {

	String func_a(String bundle, int start, int n) {
	    String answer = "";
	    for(int i=0; i<n; i++)
	        answer += bundle.charAt(start+i*2);
	    return answer;
	}
	
	int[] func_b(int score1, int score2) {
	    int[] answer = new int[2];
	    if(score1 > score2) {
	        answer[0] = 1;
	        answer[1] = score1;
	    }
	    else if(score1 < score2) {
	        answer[0] = 2;
	        answer[1] = score2;
	    }
	    else {
	        answer[0] = 0;
	        answer[1] = score1;
	    }
	    return answer;
	}
	
	int func_c(String card) {
	    int answer = 0;
	    for(int i = 0; i < card.length(); i++) {
	        answer += card.charAt(i) - 'a' + 1;
	    }
	    return answer;
	}
	
	int[] solution(int n, String bundle) {
	    String aCards = func_a(bundle, @@@, @@@);
	    String bCards = func_a(bundle, @@@, @@@);
	    int aScore = func_c(@@@);
	    int bScore = func_c(@@@);
	    int[] answer = func_b(@@@, @@@);
	    return answer;
	}
	
	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
	    Solution sol = new Solution();
	
	    int n = 4;
	    String bundle = new String("cacdbdedccbb");
	    int[] ret = sol.solution(n, bundle);
	    
	    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	    System.out.print("solution 메소드의 반환 값은 ");
	    System.out.printf(Arrays.toString(ret));
	    System.out.println(" 입니다.");
	}

}
```

---

#### 매개변수 설명
뽑아야 하는 카드 개수 n과 카드를 나타내는 문자열 bundle이 solution메소드의 매개변수로 주어집니다.

* n은 1 이상 25 이하인 자연수입니다.
* bundle은 모두 알파벳 소문자입니다.
* bundle의 길이는 2이상 2*n이하입니다.

---

#### return값 설명
이긴 사람과 획득한 점수를 return합니다.
A가 이겼을 경우에는 1, B가 이겼을 경우에는 2, 무승부일 경우에는 0을 return 해주세요.

---

#### 예시

| n | bundle | return |
|---|---|---|
| 4 | "cacdbdedccbb" | [0, 13] |

---

#### 예시 설명
A는 c, c, b, e 카드를 뽑았고 B는 a, d, d, d 카드를 뽑았습니다. A가 획득한 점수는 13점이고 B가 획득한 점수는 13점입니다. 둘다 13점을 획득하여 게임은 무승부로 끝납니다.

---

### → 정답 확인

### [→ 다음 문제](../no_04/ "COS Pro 2급 Java 4차 4번 문제")
