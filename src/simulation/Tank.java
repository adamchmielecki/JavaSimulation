package simulation;

import java.util.Random;

public abstract class Tank extends Unit {

    public static final int strenghtOfAttack = 10;
    public static final int strenghtOfDefence = 20;
    public static final int staff = 15;
    public static final int cost = 25;

    public void superMethod(Country country1, Country country2, Field field){
        bonus=bonusGenerator.nextInt(100);
        if(country1.army.getAmountOfTanks()>=country2.army.getAmountOfTanks()){
            if(bonus>=85){
                field.setGold(field.getGold()*2);
            }
        }
    }
}
