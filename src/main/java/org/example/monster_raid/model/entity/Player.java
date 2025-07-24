package org.example.monster_raid.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player{

    private String name = "주인공";
    private int maxHp = 500;
    private int nowHp;
    private int attack = 30;

    public Player(String name, int maxHp, int nowHp, int attack) {
        this.name = name;
        this.maxHp = maxHp;
        this.nowHp = nowHp;
        this.attack = attack;
    }


    public Player(int nowHp) {
    }
}
