package simulation;

import java.util.Random;

public class Soldier extends Unit {


    public void superMethod(Country country1, Country country2, Field field){
        bonus=bonusGenerator.nextInt(100);
        if(country1.army.getAmountOfSoldiers()>=country2.army.getAmountOfSoldiers()){
            if(bonus>=85){
                field.setPopulation(field.getPopulation()*2);
            }
        }
    }
}
