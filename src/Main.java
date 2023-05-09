public class Main {
    public static void main(String[] args) {
       
        Cow[] cows = {
                new Cow(123, (byte) 3, "male", "Zorka"),
                new Cow(126, (byte) 3, "male", "mady"),
                new Cow(230, (byte) 3, "male", "body"),
                new Cow(142, (byte) 3, "female", "nood"),
                new Cow(128, (byte) 3, "female", "bory")};
        for (Cow cow : cows
        ) {
            System.out.println(cow);
        }
        Horse[] horse = {
                new Horse(321, (byte) 4, "female", "Aikashka", "brown"),
                new Horse(321, (byte) 4, "female", "Karashka", "black")};

        for (Horse horse1 : horse
        ) {
            System.out.println(horse1);
        }
        Sheep[] sheep = {
                new Sheep(45, (byte) 2, "female", "BigBoss"),
                new Sheep(56, (byte) 2, "male", "BigBlackSheep")};

        for (Sheep sheep1 : sheep
        ) {
            System.out.println(sheep1);
        }
        Farm farm1 = new Farm("s.Petrovka", "OsOO Zarya", cows,sheep, horse);
        Farm farm2 = new Farm("s.Lyabino", "kolhoz GazProm ",  cows, sheep, horse);
        System.out.println(farm1+"\t\t");
        System.out.println(farm2);
    }



    }
