# 문제10

직업에 아르바이트, 판매사원이 있습니다. 직원들 급여의 총합을 계산하기 위해 아래와 같이 Job, PartTimeJob, SalesJob 클래스를 작성했습니다.

  ![스크린샷 2018-10-19 오후 6.30.38.png](https://grepp-programmers.s3.amazonaws.com/files/ybm/b9dd7b3872/e273b74c-7e6b-44f2-b3e7-eaefc3d223a1.png)

* Job :
  * Job : 직업을 나타내는 클래스입니다.
  * salary : 직업의 급여를 나타냅니다. 초기 급여는 0입니다.
  * getSalary : 직업의 급여를 return 합니다.

* PartTimeJob :
  * PartTimeJob : 아르바이트를 나타내는 클래스이며 Job을 상속합니다.
  * workHour : 아르바이트를 한 시간입니다.
  * payPerHour : 아르바이트의 시간 당 급여입니다.
  * getSalary : 아르바이트 급여를 계산하여 return 합니다.

* SalesJob :
  * SalesJob : 판매사원을 나타내는 클래스이며 Job을 상속합니다.
  * salesResult : 판매사원의 판매실적입니다.
  * payPerSale : 판매실적 당 급여입니다.
  * getSalary : 판매사원의 급여를 계산하여 return 합니다.

주어진 아르바이트, 판매사원 급여의 총합을 계산하려 합니다.

* 아르바이트는 기본적으로 `아르바이트를 한 시간 X 시간 당 급여`를 받으며 40시간 이상 근무시 8시간만큼의 급여를 추가로 받습니다.
* 판매사원은 기본적으로 `판매실적 * 판매실적 당 급여`를 받으며 판매실적이 10건이 넘으면 급여를 2배로, 20건이 넘으면 급여를 3배로 받습니다.

아르바이트의 정보가 담긴 2차원 배열 partTimeJobs, 판매사원의 정보가 담긴 2차원 배열 salesJobs가 매개변수로 주어질 때, 모든 직원들 급여의 총합을 return 하도록 solution 메소드를 작성하려 합니다. 위 클래스 구조를 참고하여 주어진 코드의 빈칸을 적절히 채워 전체 코드를 완성해주세요.

### 초기 코드

```
class Solution {

    class Job {
        public int salary;

        public Job() {
            this.salary = 0;
        }
        
        public int getSalary() {
            return salary;
        }
    }

    class PartTimeJob @@@ {
        public int workHour, payPerHour;

        public PartTimeJob(int workHour, int payPerHour) {
            this.workHour = workHour;
            this.payPerHour = payPerHour;
        }

        @@@ {
            salary = workHour * payPerHour;
            if(workHour >= 40)
                salary += (payPerHour * 8);

            return salary;
        }
    }

    class SalesJob @@@ {
        public int salesResult, payPerSale;

        public SalesJob(int salesResult, int payPerSale) {
            this.salesResult = salesResult;
            this.payPerSale = payPerSale;
        }

        @@@ {
            if(salesResult > 20)
                salary = salesResult * payPerSale * 3;
            else if(salesResult > 10)
                salary = salesResult * payPerSale * 2;
            else
                salary = salesResult * payPerSale;

            return salary;
        }
    }

    public int solution(int[][] partTimeJobs, int[][] salesJobs) {
        int answer = 0;

        for(int i = 0; i < partTimeJobs.length; i++) {
            PartTimeJob partTimeJob = new PartTimeJob(partTimeJobs[i][0], partTimeJobs[i][1]);
            answer += partTimeJob.getSalary();
        }

        for(int i = 0; i < salesJobs.length; i++) {
            SalesJob salesJob = new SalesJob(salesJobs[i][0], salesJobs[i][1]);
            answer += salesJob.getSalary();
        }

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[][] partTimeJobs = {{10, 5000}, {43, 6800}, {5, 12800}};
        int[][] salesJobs = {{3, 18000}, {12, 8500}};
        int ret = sol.solution(partTimeJobs, salesJobs);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
    
}
```

---

#### 매개변수 설명
아르바이트의 정보가 담긴 2차원 배열 partTimeJobs, 판매사원의 정보가 담긴 2차원 배열 salesJobs가 solution 메소드의 매개변수로 주어집니다.
* partTimeJobs는 길이가 1이상 10이하인 2차원 배열입니다.
* partTimeJobs의 각 원소는 [아르바이트를 한 시간, 시간 당 급여]입니다.
  * 아르바이트를 한 시간은 1이상 100이하입니다.
  * 시간 당 급여는 1,000이상 20,000이하입니다.
* salesJobs은 길이가 1이상 10이하인 2차원 배열입니다.
* salesJobs의 각 원소는 [판매실적, 판매실적 당 급여]입니다.
  * 판매실적은 1이상 30이하입니다.
  * 판매실적 당 급여는 1,000이상 20,000이하입니다.

---

#### return 값 설명
모든 직원들 급여의 총합을 return 합니다.

---

#### 입출력 예

| partTimeJobs                       | salesJobs               | return |
|--------------------------------------|--------------------------|--------|
| [[10, 5000], [43, 6800], [5, 12800]] | [[3, 18000], [12, 8500]] | 718800 |

#### 입출력 예 설명

첫번째 아르바이트에게 50,000(10 * 5,000)을 지급합니다.
두번째 아르바이트에게 346,800(43 * 6,800 + 8 * 6,800)을 지급합니다.
세번째 아르바이트에게 64,000(5 * 12,800)을 지급합니다.
첫번째 영업사원에게 54,000(3 * 18,000)을 지급합니다.
두번째 영업사원에게 204,000(12 * 8,500 * 2)을 지급합니다.
따라서 급여의 총합은 718,800입니다.

---

### → 정답 확인

### [→ 목록](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_06/no_listmd "cosPro 1급 Java 6차")
