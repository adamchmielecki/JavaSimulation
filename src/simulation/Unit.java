package simulation;

import java.util.Random;

public abstract class Unit {

    private int strenghtOfAttack;
    private int strenghtOfDefence;
    int bonus;
    Random bonusGenerator;

    public int getStrenghtOfAttack() {
        return strenghtOfAttack;
    }

    public void setStrenghtOfAttack(int strenghtOfAttack) {
        this.strenghtOfAttack = strenghtOfAttack;
    }

    public int getStrenghtOfDefence() {
        return strenghtOfDefence;
    }

    public void setStrenghtOfDefence(int strenghtOfDefence) {
        this.strenghtOfDefence = strenghtOfDefence;
    }
}
