package simulation;

import java.util.Random;

public class Tank extends Unit {

    public void superMethod(Country country1, Country country2, Field field){
        bonus=bonusGenerator.nextInt(100);
        if(country1.army.getAmountOfTanks()>=country2.army.getAmountOfTanks()){
            if(bonus>=85){
                field.setGold(field.getGold()*2);
            }
        }
    }
}
