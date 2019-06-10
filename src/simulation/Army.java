package simulation;

import java.util.Random;

public class Army {
    public Army(int amountOfSoldiers, int amountOfTanks, int amountOfJets) {
        soldier = new Soldier();
        tank = new Tank();
        jet = new Jet();
        soldier.setCount(amountOfSoldiers);
        tank.setCount(amountOfTanks);
        jet.setCount(amountOfJets);
        /*this.amountOfSoldiers = amountOfSoldiers;
        this.amountOfTanks = amountOfTanks;
        this.amountOfJets = amountOfJets;*/

    }

    /*private int amountOfSoldiers;
    private int amountOfTanks;
    private int amountOfJets;*/

    Soldier soldier;
    Tank tank;
    Jet jet;

    public void generateRandomArmy() {
    }

    public void updateArmy(Country country) {
        while(country.getTotalGold() >= jet.cost && country.getTotalPopulation() >= tank.staff) {
                int a;
                Random generator = new Random();
                a = generator.nextInt(3);
                if (a == 0) {
                    soldier.createNewUnit(country);
                    //soldier.createNewSoldier(country);
                            /*soldier.setCount(soldier.getCount() + 1);
                            Country.setTotalGold(Country.getTotalGold() - soldier.cost);
                            Country.setTotalPopulation(Country.getTotalPopulation() - soldier.staff);*/
                }
                else if (a == 1) {
                    tank.createNewUnit(country);
                    //tank.createNewTank(country);
                            /*tank.setCount(tank.getCount() + 1);
                            Country.setTotalGold(Country.getTotalGold() - tank.cost);
                            Country.setTotalPopulation(Country.getTotalPopulation() - tank.staff);*/
                }
                else if (a == 2) {
                    jet.createNewUnit(country);
                    //jet.createNewJet(country);
                    /*jet.setCount(jet.getCount() + 1);
                    Country.setTotalGold(Country.getTotalGold() - jet.cost);
                    Country.setTotalPopulation(Country.getTotalPopulation() - jet.staff);*/
                }
        }
        while (country.getTotalGold() >= soldier.cost && country.getTotalPopulation() >= soldier.staff) {
            soldier.createNewUnit(country);
            /*soldier.setCount(soldier.getCount() + 1);
            country.setTotalGold(country.getTotalGold() - soldier.cost);
            country.setTotalPopulation(country.getTotalPopulation() - soldier.staff);*/
        }
    }

    /*
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
*/
}