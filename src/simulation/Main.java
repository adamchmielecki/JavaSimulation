package simulation;

import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

 /*      try{
            BufferedReader input = new BufferedReader(new FileReader("InputData.txt"));
            Data.readInputData(input);
            input.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }



        Data data = new Data(Data.getNumberOfCountries(),Data.getMapSize(),Data.getNumberOfIterations());*/



        System.out.println(Data.getNumberOfCountries());
        System.out.println(Data.getMapSize());
        System.out.println(Data.getNumberOfIterations());
        Data data = new Data(4,5,30);
        Map map = new Map(data);
        map.settingID();
        map.generateResources(100,10);
        map.generateStartingPosition();
        map.printMap();

        Random random = new Random();
        Country[] country = new Country[data.getMapSize()];
        Army[] army = new Army[data.getMapSize()];
        for(int i=0; i<data.getNumberOfCountries(); i++){
            map.countries.get(i).army = new Army(random.nextInt(100),random.nextInt(100),random.nextInt(100));
        }



        for(int i=0; i<data.getNumberOfIterations(); i++){

                System.out.println("AAAAA");
                map.generateResources(100,100);
                map.takeNewField();
                map.printMap();
                map.countries.get(0).summingCountryGold();
                map.countries.get(0).summingCountryPopuation();
                map.countries.get(0).army.updateArmy(map.countries.get(0));
                System.out.println("złoto "+map.countries.get(0).getTotalGold());

                System.out.println("population "+map.countries.get(0).getTotalPopulation());
                //System.out.println("Iteracja: " +i+ "Liczba żołnierzy: "+ map.countries.get(0).army.getAmountOfSoldiers());
                //System.out.println("Iteracja: " +i+ "Liczba czołgów: "+ map.countries.get(0).army.getAmountOfTanks());
                //System.out.println("Iteracja: " +i+ "Liczba somolotów: "+ map.countries.get(0).army.getAmountOfJets());

        }

    }
}
