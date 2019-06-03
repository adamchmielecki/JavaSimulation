package simulation;

import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

       /*
       try{
            BufferedReader input = new BufferedReader(new FileReader("InputData.txt"));
            Data.readInputData(input);
            input.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }



        //Data data = new Data(Data.getNumberOfCountries(),Data.getMapSize(),Data.getNumberOfIterations());

        */



        /*System.out.println(Data.getNumberOfCountries());
        System.out.println(Data.getMapSize());
        System.out.println(Data.getNumberOfIterations());*/
        Data data = new Data(3,5,10);
        Map map = new Map(data);
        map.settingID();
        map.generateResources(100,10);
        map.generateStartingPosition();
        map.printMap();

        Random random = new Random();
        Country[] country = new Country[data.getMapSize()];
        Army[] army = new Army[data.getMapSize()];
        for(int i=0; i<data.getNumberOfCountries(); i++){
            army[i] = new Army(random.nextInt(100),random.nextInt(100),random.nextInt(100));
            country[i] = new Country(i,army[i]);
            //System.out.println("Country ID: "+country[i].getCountryID() + "  Soldiers: "+army[i].getAmountOfSoldiers()+"  Tanks: "+army[i].getAmountOfTanks()+"  Jets: "+army[i].getAmountOfJets());
        }

        for(int i=0; i<11; i++){
            map.takeNewField();
            System.out.println("aaaaaaaa");
            map.printMap();
        }
    }
}
