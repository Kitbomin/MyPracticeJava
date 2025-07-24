package org.example.monster_and_player_game;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
abstract class Entity {
    private String name;
    private int hp;
    // 스킬 들어갈 자리
    private String state;

    public Entity(String name, int hp, String state) {
        this.name = name;
        this.hp = hp;
        this.state = state;
    }

    public void setHp(int hp) {
        this.hp -= hp;
    }
}


class Monster extends Entity{
    private String monsterName;
    private int monsterHp;
    private String monsterState;

    public Monster(String monsterName, int monsterHp, String monsterState) {
        super(monsterName, monsterHp, monsterState);
        this.monsterName = monsterName;
        this.monsterHp = monsterHp;
        this.monsterState = monsterState;
    }

}

class Player extends Entity{
    private String playerName;
    private int playerHp;
    private String PlayerState;

    private int attack;
    private int buff;
    private int recovery;

    public Player(String playerName, int playerHp, String PlayerState) {
        super(playerName, playerHp, PlayerState);
        this.playerName = playerName;
        this.playerHp = playerHp;
        this.PlayerState = PlayerState;
    }

}


interface SkillEffect{
    //1. 공격
    void attack(Player attack);

    //2. 패스

    //3. 버프
    void buff(Player player );

    //4. 회복
    void recovery();
}

class Skill{

}




public class MonsterAndPlayer {


}
