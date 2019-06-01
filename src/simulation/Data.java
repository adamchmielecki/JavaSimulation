package simulation;

public class Data {
    /*    private static int numberOfCountries;
        private static int mapSize;
        private static int numberOfIterions;
    /*
        public Data(int numberOfCountries, int mapSize, int numberOfIterations) {
            this.numberOfCountries = numberOfCountries;
            this.mapSize = mapSize;
            this.numberOfIterations = numberOfIterations;
        }

        public static void readInputData(BufferedReader input) throws IOException{
            numberOfCountries = lineReader(input, numberOfCountries);
            mapSize = lineReader(input, mapSize);
            numberOfIterations = lineReader(input, numberOfIterations);
        }

        private static int lineReader(BufferedReader input, int value) throws IOException {
            String line = input.readLine();
            StringTokenizer token = new StringTokenizer(line, ":");
            token.nextToken();
            String text = token.nextToken();
            text = text.trim();
            value = Integer.parseInt(text);
            return value;
        }


        public static int getNumberOfCountries() {
            return numberOfCountries;
        }

        public static int getMapSize() {
            return mapSize;
        }

        public static int getNumberOfIterations() {
            return numberOfIterations;
        }

     */
    private int numberOfCountries;
    private int mapSize;
    private int numberOfIterations;

    public Data(int numberOfCountries, int mapSize, int numberOfIterations) {
        this.numberOfCountries = numberOfCountries;
        this.mapSize = mapSize;
        this.numberOfIterations = numberOfIterations;
    }

    public int getNumberOfCountries() {
        return numberOfCountries;
    }

    public void setNumberOfCountries(int numberOfCountries) {
        this.numberOfCountries = numberOfCountries;
    }

    public int getMapSize() {
        return mapSize;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public int getNumberOfIterations() {
        return numberOfIterations;
    }

    public void setNumberOfIterations(int numberOfRounds) {
        this.numberOfIterations = numberOfRounds;
    }
}
