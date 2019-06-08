package simulation;

import java.util.ArrayList;
import java.util.Random;

public class Army {
    public Army(int amountOfSoldiers, int amountOfTanks, int amountOfJets) {
        this.amountOfSoldiers = amountOfSoldiers;
        this.amountOfTanks = amountOfTanks;
        this.amountOfJets = amountOfJets;
        /*soldier = new Soldier();
        tank = new Tank();
        jet = new Jet();
        soldier.setStrenghtOfAttack(20);
        soldier.setStrenghtOfDefence(12);
        tank.setStrenghtOfAttack(56);
        tank.setStrenghtOfDefence(33);
        jet.setStrenghtOfAttack(200);
        jet.setStrenghtOfDefence(45);*/
    }


    private int amountOfSoldiers;
    private int amountOfTanks;
    private int amountOfJets;

    /*Soldier soldier;
    Tank tank;
    Jet jet;*/


    public void updateArmy() {
        int a;
        Random generator = new Random();
        a = generator.nextInt(3);
        if (a == 0) {
            for (; Country.getTotalGold() > Soldier.cost; ) {
                for (; Country.getTotalPopulation() > Soldier.staff; ) {
                    amountOfSoldiers++;
                    Country.setTotalGold(Country.getTotalGold() - Soldier.cost);
                    Country.setTotalPopulation(Country.getTotalPopulation() - Soldier.staff);
                }
            }
        } else if (a == 1) {
            for (; Country.getTotalGold() > Tank.cost; ) {
                for (; Country.getTotalPopulation() > Tank.staff; ) {
                    amountOfTanks++;
                    Country.setTotalGold(Country.getTotalGold() - Tank.cost);
                    Country.setTotalPopulation(Country.getTotalPopulation() - Tank.staff);
                }
            }
        } else if (a == 2) {
            for (; Country.getTotalGold() > Jet.cost; ) {
                for (; Country.getTotalPopulation() > Jet.staff; ) {
                    amountOfJets++;
                    Country.setTotalGold(Country.getTotalGold() - Jet.cost);
                    Country.setTotalPopulation(Country.getTotalPopulation() - Jet.staff);
                }
            }
        }
    }

    public void reduceArmy(Country countries){


        countries.army.setAmountOfSoldiers(countries.army.getAmountOfSoldiers()/2);
        countries.army.setAmountOfTanks(countries.army.getAmountOfTanks()/2);
        countries.army.setAmountOfJets(countries.army.getAmountOfJets()/2);
    }

    public int getAmountOfSoldiers() {
        return amountOfSoldiers;
    }

    public void setAmountOfSoldiers(int amountOfSoldiers) {
        this.amountOfSoldiers = amountOfSoldiers;
    }

    public int getAmountOfTanks() {
        return amountOfTanks;
    }

    public void setAmountOfTanks(int amountOfTanks) {
        this.amountOfTanks = amountOfTanks;
    }

    public int getAmountOfJets() {
        return amountOfJets;
    }

    public void setAmountOfJets(int amountOfJets) {
        this.amountOfJets = amountOfJets;
    }

}