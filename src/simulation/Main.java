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
        Data data = new Data(3,5,5);
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
            map.takeNewField();
            System.out.println();
            map.printMap();
        }

    }
}
