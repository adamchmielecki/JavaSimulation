package simulation;

import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

       try{
            BufferedReader input = new BufferedReader(new FileReader("InputData.txt"));
            Data.readInputData(input);
            input.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }



        Data data = new Data(Data.getNumberOfCountries(),Data.getMapSize(),Data.getNumberOfIterations());

        Map map = new Map(data);
        map.settingID();
        map.generateResources(100,10);
        map.generateStartingPosition();
        map.printMap();


        System.out.println("AAAAAAAAAAAAAA");
        System.out.println(map.countries.get(0).army.tank.getCount());
        map.countries.get(0).army.tank.createNewUnit(map.countries.get(0));
        map.countries.get(0).army.tank.createNewUnit(map.countries.get(0));
        map.countries.get(0).army.tank.createNewUnit(map.countries.get(0));
        System.out.println(map.countries.get(0).army.tank.getCount());
        System.out.println("AAAAAAAAAAAAAA");



        Random random = new Random();
        Country[] country = new Country[data.getMapSize()];
        Army[] army = new Army[data.getMapSize()];
        for(int i=0; i<data.getNumberOfCountries(); i++){
            map.countries.get(i).army = new Army(random.nextInt(100),random.nextInt(100),random.nextInt(100));
        }


        for(int i=0; i<data.getNumberOfIterations(); i++){
                map.generateResources(100,100);
                map.takeNewField();
                for(int j=0; j<data.getNumberOfCountries(); j++){
                    map.countries.get(j).summingCountryGold();
                    map.countries.get(j).summingCountryPopuation();
                    map.countries.get(j).army.updateArmy(map.countries.get(j));
                }

        }

    }
}
