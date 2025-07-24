package org.example.rpg_charactor.charactor;

import lombok.Getter;

@Getter
public class Wizard extends Charactor {
    private String stamp;

    public Wizard(String name, String job, String stamp) {
        super(name, job);
        this.stamp = stamp;
    }

    @Override
    public String toString() {
        return super.toString() + ", 무기: " + stamp;
    }
}
