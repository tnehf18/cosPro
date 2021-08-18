# 문제1

도서 대여점의 만화책과 소설책의 대여 요금이 다음과 같습니다.

| 구분   | 대여 요금         | 추가 요금                     |
|--------|-----------------|--------------------|
| 만화책 | 첫 2일 500원 | 이후 1일당 200원씩 추가  |
| 소설책 | 첫 3일 1000원 | 이후 1일당 300원씩 추가 |

만화책과 소설책의 대여 요금을 계산하기 위해 아래 그림과 같이 Book 인터페이스와 ComicBook, Novel 클래스를 작성했습니다.

![image](https://s3.ap-northeast-2.amazonaws.com/grepp-cloudfront/programmers_imgs/challengeable-imgs/book3_java.png)

* Book :
  * Book은 책의 인터페이스입니다..
  * 책은 getRentalPrice 메소드를 구현해야 합니다.
  * getRentalPrice 메소드는 대여 기간을 매개변수로 받아 대여 요금을 계산합니다.

* ComicBook :
  * ComicBook은 만화책을 나타내는 클래스이며, Book 인터페이스를 구현합니다.
  * getRentalPrice 메소드는 대여 기간을 매개변수로 받아 만화책의 대여 요금을 계산합니다.

* Novel :
  * Novel은 소설책을 나타내는 클래스이며, Book 인터페이스를 구현합니다.
  * getRentalPrice 메소드는 대여 기간을 매개변수로 받아 소설책의 대여 요금을 계산합니다.

대여를 원하는 책들의 종류가 들어있는 배열 bookTypes와 대여 기간 day가 매개변수로 주어질 때, 전체 대여 요금을 return 하도록 solution 메소드를 작성하려고 합니다. 위의 클래스 구조를 참고하여 주어진 코드의 빈칸을 적절히 채워 전체 코드를 완성해주세요.

### 초기 코드

```
//Book 인터페이스와 ComicBook, Novel 클래스는 Inner Class로 작성되어있습니다. 아래 코드를 잘 읽고 빈칸을 채워주세요.
class Solution {

	interface Book {
	    public int getRentalPrice(int day);
	}

	class ComicBook @@@ {
	    @@@ {
	        int cost = 500;
	        day -= 2;
	        if(day > 0)
	            cost += @@@;
	        return cost;
	    }
	}
	
	class Novel @@@ {
	    @@@ {
	        int cost = 1000;
	        day -= 3;
	        if(day > 0)
	            cost += @@@;
	        return cost;
	    }
	}
	
	public int solution(String[] bookTypes, int day) {
	    Book[] books = new Book[50];
	    int length = bookTypes.length;
	    for(int i = 0; i < length; ++i) {
	        if(bookTypes[i].equals("comic"))
	            books[i] = new ComicBook();
	        else if(bookTypes[i].equals("novel"))
	            books[i] = new Novel();   
	    }
	    int totalPrice = 0;
	    for(int i = 0; i < length; ++i)
	        totalPrice += books[i].getRentalPrice(day);
	    return totalPrice;
	}
	
	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args) {
	    Solution sol = new Solution();
	    
	    String[] bookTypes = {"comic", "comic", "novel"};
	    int day = 4;
	    int ret = sol.solution(bookTypes, day);
	
	    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	    System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
	
}
```

---

#### 매개변수 설명
대여를 원하는 책들의 종류가 들어있는 배열 bookTypes와 대여 기간 day가 solution 메소드의 매개변수로 주어집니다.
* bookTypes의 길이는 1 이상 50 이하입니다.
* bookTypes에는 만화책을 뜻하는 문자열 "comic"과 소설책을 뜻하는 문자열 "novel"이 들어있습니다.
  * 예를 들어 ["comic", "comic", "novel"]이 매개변수로 주어진다면, 이는 만화책 두 권과 소설책 한 권을 나타냅니다.
* day는 1 이상 100 이하의 자연수입니다.

---

#### return 값 설명
전체 대여 요금을 return 해주세요.

---

#### 예시

| bookTypes                   | day | return |
|-----------------------------|-----|--------|
| ["comic", "comic", "novel"] | 4   | 3100   |

#### 예시 설명

만화책의 4일 대여요금 : 500 + 200\*2 = 900원
소설책의 4일 대여요금 : 1000 + 300\*1 = 1300원

만화책은 2권이므로 총 대여요금은 900 + 900 + 1300 = 3100원입니다.

---

### → 정답 확인

### [→ 다음 문제](../no_02/ "COS Pro 1급 Java 2차 2번 문제")
