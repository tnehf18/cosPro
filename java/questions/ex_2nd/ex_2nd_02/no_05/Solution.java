package questions.ex_2nd.ex_2nd_02.no_05;

class Solution {

    public int solution(int attack, int recovery, int hp) {
        int count = 0;
        while(true) {
            count += @@@;
            hp -= @@@;
            if(hp <= 0)
                @@@;
            hp += @@@;
        }
        return count;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int attack = 30;
        int recovery = 10;
        int hp = 60;
        int ret = sol.solution(attack, recovery, hp);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
