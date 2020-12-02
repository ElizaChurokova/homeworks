public class Main {

    public static void main(String[] args) {
        Cow cowList1 = new Cow(30, 3, 'F', "Marusya");
        Cow cowList2 = new Cow(45, 5, 'M', "Bernard");
        Cow cowList3 = new Cow(47, 5, 'M', "Ber");
        Cow cowList4 = new Cow(55, 6, 'F', "Masha");
        Cow cowList5 = new Cow(50, 4, 'M', "Maks");

        Cow[] cowList = new Cow[5];
        cowList[0] = cowList1;
        cowList[1] = cowList2;
        cowList[2] = cowList3;
        cowList[3] = cowList4;
        cowList[4] = cowList5;

        Sheep sheepList1 = new Sheep(10, 2, 'M', "Ben");
        Sheep sheepList2 = new Sheep(12, 2, 'M', "Lohmatik");
        Sheep sheepList3 = new Sheep(15, 3, 'F', "Sara");

        Sheep[] sheepList = new Sheep[3];
        sheepList[0] = sheepList1;
        sheepList[1] = sheepList2;
        sheepList[2] = sheepList3;

        Horse horseList1 = new Horse(50, 2, "brown", 'F', "Denny");
        Horse horseList2 = new Horse(55, 3, "grey", 'F', "Perry");


        Horse[] horseList = new Horse[2];
        horseList[0] = horseList1;
        horseList[1] = horseList2;

        Farm farmA = new Farm("Isyk-Kul, Aksuu village", cowList, sheepList, horseList, "Askarbek Janybekov");

        Cow cowListB = new Cow(52, 4, 'F', "Darya");
        Cow[] cowB = new Cow[1];
        cowList[0] = cowListB;

        Sheep sheepListB = new Sheep(13, 4,'F',"Kira");
        Sheep[] sheepB = new Sheep[1];
        sheepList[0] = sheepListB;

        Horse horseListB = new Horse(60, 5, "black", 'M', "Ken");
        Horse[] horsesB = new Horse[1];
        horseList[0] = horseListB;


        Farm farmB = new Farm("Naryn, Acha-Kaindy village", cowB, sheepB, horsesB, "Bektursun Jumagulov");

        System.out.println("Farm A:");
        System.out.println("Farm name: Reina-Kench" + ", Address: " + farmA.getAddress()
                + ", Number of cows: " + farmA.getCowList().length
                + ", Number of sheep: " + farmA.getSheepList().length
                + ", Number of horses: " + farmA.getHorseList().length);

        System.out.println();
        System.out.println("Farm B:");
        System.out.println("Farm name: Naryn-Kench" + ", Address: " + farmB.getAddress()
                + ", Number of cows: " + farmB.getCowList().length
                + ", Number of sheep: " + farmB.getSheepList().length +
                ", Number of hoeses: " + farmB.getHorseList().length);







    }
}
