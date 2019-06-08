package simulation;

public abstract class Jet extends Unit {

    public static final int strenghtOfAttack = 15;
    public static final int strenghtOfDefence = 15;
    public static final int staff = 10;
    public static final int cost = 50;



    public void superMethod(Country country1, Country country2, Field field){
        bonus=bonusGenerator.nextInt(100);
        if(country1.army.getAmountOfJets()>=country2.army.getAmountOfJets()) {
            if (bonus >= 85) {
                field.setOwnerID(country1.getCountryID());
            }
        }
    }


}
