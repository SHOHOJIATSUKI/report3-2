package jp.ac.uryukyu.ie.e235731;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultEnemyHp = 20;
        Warrior demowarrior = new Warrior("戦士", 10, 6);
        Enemy demoEnemy = new Enemy("スライムもどき2", defaultEnemyHp, 3);

        for (int i = 0; i < 3; i++) {
            demowarrior.attackWithWeponSkill(demoEnemy);
            defaultEnemyHp -= 9;
            assertEquals(defaultEnemyHp, demoEnemy.getHitPoint());
        }
            
        
        
    }
}
