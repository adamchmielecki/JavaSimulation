package simulation;

public class Resources {

    private int gold;
    private int population;

    public  Resources(int gold, int population)
    {
        this.gold=gold;
        this.population = population;
    }
    public Resources(){
        this.setGold(0);
        this.setPopulation(0);
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


}
