package simulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Country {

    private int countryID;



    public int getTotalPopulation() {
        return totalPopulation;
    }

    public void setTotalPopulation(int totalPopulation) {
        this.totalPopulation = totalPopulation;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public void setTotalGold(int totalGold) {
        this.totalGold = totalGold;
    }

    private int totalGold;
    private int totalPopulation;


    private Stack<Field> territory;
    Army army;
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

    void summingCountryGold(Field field){

        this.getTerritory().add(field);
        totalGold+=field.getGold();
        field.setOwnerID(this.getCountryID());
       // System.out.println(totalGold);

    }

    void summmingCountryPopuation(Field field){

        this.getTerritory().add(field);
        totalPopulation+=field.getPopulation();
        field.setOwnerID(this.getCountryID());
        //System.out.println(totalPopulation);
        //return  totalGold;
    }






    int attack() {
        int powerOfAttack;
        powerOfAttack = army.getAmountOfSoldiers()*army.soldier.getStrenghtOfAttack()+army.getAmountOfTanks()*army.tank.getStrenghtOfAttack()+army.getAmountOfJets()*army.jet.getStrenghtOfAttack();
        return powerOfAttack;

    }

    int defend() {
        int powerOfDefence;

        powerOfDefence = army.getAmountOfSoldiers()*army.soldier.getStrenghtOfDefence()+army.getAmountOfTanks()*army.tank.getStrenghtOfDefence()+army.getAmountOfJets()*army.jet.getStrenghtOfDefence();
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