package simulation;

import java.util.Random;

public abstract class Unit {

    protected int count;
    public static int strenghtOfAttack;
    public static int strenghtOfDefence;
    public static int staff;
    public static int cost;
    /*int bonus;
    Random bonusGenerator;*/

    public Unit(int count){
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
