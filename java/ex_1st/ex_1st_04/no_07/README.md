# 문제7

게임에 몬스터, 전사, 힐러 세 종류의 유닛이 있습니다. 

유닛들의 공격과 힐링에 따른 체력치의 변화를 계산하기 위해 아래와 같이 Unit, Monster, Warrior, Healer 클래스를 작성했습니다.

![unit_java.png](https://grepp-programmers.s3.amazonaws.com/files/production/d0ebcd5a72/19191b1f-81cb-4201-b533-71767b55105d.png)


* Unit :
  * Unit : 유닛을 나타내는 클래스입니다.
  * HP : 유닛의 체력을 나타냅니다. 유닛의 초기 체력은 1,000입니다.
  * underAttack : 유닛이 공격을 받으면 유닛의 체력을 감소시킵니다.

* Monster :
  * Monster : 몬스터를 나타내는 클래스이며 Unit을 상속합니다.
  * attakPoint : 몬스터의 공격력 입니다.
  * underAttack : 몬스터가 공격을 받으면 몬스터의 체력을 감소시킵니다.
  * attack : 몬스터의 attackPoint를 return 합니다.

* Warrior :
  * Warrior : 전사를 나타내는 클래스이며 Unit을 상속합니다.
  * attakPoint : 전사의 공격력 입니다.
  * underAttack : 전사가 공격을 받으면 전사의 체력을 감소시킵니다.
  * attack : 전사의 attackPoint를 return 합니다.

* Healer : 
  * Healer : 힐러를 나타내는 클래스이며 Unit을 상속합니다.
  * healingPoint : 힐러의 회복치 입니다.
  * underAttack : 힐러가 공격을 받으면 힐러의 체력을 감소시킵니다.
  * healing : 대상 유닛의 체력을 healingPoint 만큼 회복시킵니다.  회복 후 대상 유닛의 체력은 기본 체력 1,000보다 커질 수 있습니다.

게임에서 각 유닛들이 다음과 같이 행동 했을 때, 몬스터, 전사, 힐러의 남은 체력을 구하려 합니다.

* 몬스터가 전사와 힐러를 한 번씩 공격했습니다.
* 전사가 몬스터를 한 번 공격했습니다.
* 힐러가 몬스터와 전사의 체력을 한 번씩 회복했습니다.

몬스터의 공력력 monsterAttackPoint, 전사의 공격력 warriorAttackPoint, 힐러의 회복치 healingPoint 매개변수로 주어질 때, 각 유닛이 행동을 마친 후 몬스터, 전사, 힐러의 남은 체력을 순서대로 배열에 담아 return 하도록 solution 메소드를 작성하려 합니다. 위 클래스 구조를 참고하여 주어진 코드의 빈칸을 적절히 채워 전체 코드를 완성해주세요.

### 초기 코드

```
import java.util.Arrays;

class Solution {

    class Unit {
        public int HP;
        public Unit() {
            this.HP = 1000;
        }
        public void underAttack(int damage) { }
    }

    class Monster @@@ {
        public int attackPoint;
        public Monster(int attackPoint) {
            this.attackPoint = attackPoint;
        }
        @@@ {
            this.HP -= damage;
        }
        @@@ {
            return attackPoint;
        }
    }

    class Warrior @@@ {
        public int attackPoint;
        public Warrior(int attackPoint) {
            this.attackPoint = attackPoint;
        }
        @@@ {
            this.HP -= damage;
        }
        @@@ {
            return attackPoint;
        }
    }

    class Healer @@@ {
        public int healingPoint;
        public Healer(int healingPoint) { 
            this.healingPoint = healingPoint;
        }
        @@@ {
            this.HP -= damage;
        }
        @@@ {
            unit.HP += healingPoint;
        }
    }
    
    public int[] solution(int monsterAttackPoint, int warriorAttackPoint, int healingPoint) {
        Monster monster = new Monster(monsterAttackPoint);
        Warrior warrior = new Warrior(warriorAttackPoint);
        Healer healer = new Healer(healingPoint);
        
        //전사가 몬스터를 한 번 공격
        monster.underAttack(warrior.attack());
        //몬스터가 전사를 한 번 공격
        warrior.underAttack(monster.attack());
        //몬스터가 힐러를 한 번 공격
        healer.underAttack(monster.attack());
        //힐러가 전사의 체력을 한 번 회복
        healer.healing(warrior);
        //힐러가 몬스터의 체력을 한 번 회복
        healer.healing(monster);

        int[] answer = {monster.HP, warrior.HP, healer.HP};
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int monsterAttackPoint = 100;
        int warriorAttackPoint = 90;
        int healingPoint = 30;
        int[] ret = sol.solution(monsterAttackPoint, warriorAttackPoint, healingPoint);

        // 실행] 버튼을 누르면 출력값을 볼 수 있습니다.
        System.out.printf("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.printf(" 입니다.\n");
    } 
    
}
```

---

#### 매개변수 설명
몬스터의 공력력 monsterAttackPoint, 전사의 공격력 warriorAttackPoint, 힐러의 회복치 healingPoint solution 메소드의 매개변수로 주어집니다.

* monsterAttackPoint는 1 이상 500 이하의 자연수입니다.
* warriorAttackPoint는 1 이상 500 이하의 자연수입니다.
* healingPoint는 1 이상 500 이하의 자연수입니다.

---

#### return 값 설명
각 유닛이 문제에 주어진 행동을 마친 후 몬스터, 전사, 힐러의 남은 체력을 순서대로 배열에 담아 return 해주세요.

---

#### 예시

| monsterAttackPoint | warriorAttackPoint | healingPoint | return          |
|----------------------|----------------------|---------------|-----------------|
| 100                  | 90                   | 30            | [940, 930, 900] |

#### 예시 설명

* 몬스터 공격력 : 100
* 전사 공격력 : 90
* 힐러 회복치 : 30

몬스터가 전사와 힐러를 한 번씩 공격하면 각 유닛의 남은 체력은 다음과 같습니다.

| 몬스터 체력 | 전사 체력 | 힐러 체력 |
|-------------|-----------|-----------|
| 1000        | 900       | 900       |

전사가 몬스터를 한 번 공격하면 각 유닛의 남은 체력은 다음과 같습니다.

| 몬스터 체력 | 전사 체력 | 힐러 체력 |
|-------------|-----------|-----------|
| 910        | 900       | 900       |

힐러가 몬스터와 전사의 체력을 한 번씩 회복하면 각 유닛의 남은 체력은 다음과 같습니다.

| 몬스터 체력 | 전사 체력 | 힐러 체력 |
|-------------|-----------|-----------|
| 940        | 930       | 900       |

따라서 [940, 930, 900]을 return 하면 됩니다.

---

### → 정답 확인

### [→ 다음 문제](https://github.com/tnehf18/cosPro/blob/main/java/ex_1st/ex_1st_04/no_08/ "cosPro 1급 Java 4차 8번 문제")
