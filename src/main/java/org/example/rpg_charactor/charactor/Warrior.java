package org.example.rpg_charactor.charactor;

import lombok.Getter;

@Getter
public class Warrior extends Charactor {
    private String sward;

    public Warrior(String name, String job, String sward){
        super(name, job);
        this.sward = sward;

    }

    @Override
    public String toString() {
        return super.toString() + ", 무기: " + sward;
    }
}
