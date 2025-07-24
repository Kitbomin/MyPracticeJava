package org.example.monster_raid.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Monster{


    private String name = "몬스터";
    private int maxHp = 1000;
    private int nowHp;
    private int monsterAttack = 50;


    public Monster(String name, int maxHp, int nowHp, int monsterAttack) {
        this.name = name;
        this.maxHp = maxHp;
        this.nowHp = nowHp;
        this.monsterAttack = monsterAttack;

    }

    public void attackToPlayer() {
        Player playerHp = new Player(getNowHp());



    }



}
