package org.example.monster_raid.model.skill;

import org.example.monster_raid.model.entity.Player;

public interface Skill {
    void attack(int attack);

    void defence(int nowHp);

    void buff(int attack);

    void recovery(int nowHp);

}
