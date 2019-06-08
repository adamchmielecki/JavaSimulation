package simulation;

import java.util.Random;

public abstract class Soldier extends Unit {

    public static final int strenghtOfAttack = 5;
    public static final int strenghtOfDefence = 2;
    public static final int staff = 10;
    public static final int cost = 10;



    public void superMethod(Country country1, Country country2, Field field){
        bonus=bonusGenerator.nextInt(100);
        if(country1.army.getAmountOfSoldiers()>=country2.army.getAmountOfSoldiers()){
            if(bonus>=85){
                field.setPopulation(field.getPopulation()*2);
            }
        }
    }


}
