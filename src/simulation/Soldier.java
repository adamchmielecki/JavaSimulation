package simulation;

import java.util.Random;

public class Soldier extends Unit {

    public Soldier(){
        super(0);
        strenghtOfAttack = 5;
        strenghtOfDefence = 5;
        staff = 10;
        cost = 10;
    }

    public void createNewSoldier(Country country){
        setCount(getCount() + 1);
        country.setTotalGold(country.getTotalGold() - cost);
        country.setTotalPopulation(country.getTotalPopulation() - staff);
    }
    /*public void superMethod(Country country1, Country country2, Field field){
        bonus=bonusGenerator.nextInt(100);
        if(country1.army.getAmountOfSoldiers()>=country2.army.getAmountOfSoldiers()){
            if(bonus>=85){
                field.setPopulation(field.getPopulation()*2);
            }
        }
    }*/


}
