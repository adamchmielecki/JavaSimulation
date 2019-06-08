package simulation;

public class Jet extends Unit {

    public Jet(){
        super(0);
        strenghtOfAttack = 15;
        strenghtOfDefence = 15;
        staff = 10;
        cost = 50;
    }

    /*public void superMethod(Country country1, Country country2, Field field){
        bonus=bonusGenerator.nextInt(100);
        if(country1.army.getAmountOfJets()>=country2.army.getAmountOfJets()) {
            if (bonus >= 85) {
                field.setOwnerID(country1.getCountryID());
            }
        }
    }*/
}
