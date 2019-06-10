package simulation;

import java.util.Random;

public abstract class Unit {

    protected int count;
    public int strenghtOfAttack;
    public int strenghtOfDefence;
    public int staff;
    public int cost;
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
