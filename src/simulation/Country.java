package simulation;

import java.util.Random;
import java.util.Stack;

public class Country {

    private int countryID;
    Map map;

    public int getTotalPopulation() {
        return totalPopulation;
    }

    public void setTotalPopulation(int totalPopulation) {
        Country.totalPopulation = totalPopulation;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(int totalGold) {
        Country.totalGold = totalGold;
    }

    private static int totalGold;
    private static int totalPopulation;


    private Stack<Field> territory;
    public Army army;
    Random generator;

    public Country(int countryID, Army army) {
        army=new Army(10,10,10);
        territory = new Stack<>();
        this.countryID = countryID;
        this.army = army;
        this.generator = generator;

        totalGold=0;
        totalPopulation=0;


    }

    public int summingCountryGold(){
        totalGold=0;
        for(int i=0; i<territory.size(); i++){
            totalGold+=territory.get(i).getGold();
        }
        return totalGold;
    }

    public int  summingCountryPopuation(){
        totalPopulation=0;
        for(int i=0; i<territory.size(); i++){
            totalPopulation+=territory.get(i).getGold();
        }
        return totalPopulation;
    }



    int attack() {
        int powerOfAttack;
        powerOfAttack = army.soldier.getCount()*army.soldier.strenghtOfAttack+army.tank.getCount()*army.tank.strenghtOfAttack+army.jet.getCount()*army.jet.strenghtOfAttack;
        return powerOfAttack;

    }

    int defend() {
        int powerOfDefence;
        powerOfDefence = army.soldier.getCount()*army.soldier.strenghtOfDefence+army.tank.getCount()*army.tank.strenghtOfDefence+army.jet.getCount()*army.jet.strenghtOfDefence;
        return powerOfDefence;

    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public Random getGenerator() {
        return generator;
    }

    public void setGenerator(Random generator) {
        this.generator = generator;
    }

    public Stack<Field> getTerritory() {
        return territory;
    }

    public void setTerritory(Stack<Field> territory) {
        this.territory = territory;
    }
}