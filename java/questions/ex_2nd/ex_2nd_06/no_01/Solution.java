package questions.ex_2nd.ex_2nd_06.no_01;

class Solution {

    public int solution(int[] temperature, int A, int B) {
        int answer = 0;
        for(int i = 0; i < temperature.length; i++) {
            if(temperature[i] > temperature[A] && temperature[i] > temperature[B])
                answer += 1;
        }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] temperature = {3, 2, 1, 5, 4, 3, 3, 2};
        int A = 1;
        int B = 6;
        int ret = sol.solution(temperature, A, B);
	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
