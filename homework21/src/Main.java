import CreditOrg.Credit;

public class Main {

    public static void main(String[] args) {

        Credit credit1 = new Credit(1111, 5000, "21.01.2020-21.01.2021", 20);
        Credit credit2 = new Credit(1112, 10000, "20.01.2020-20.01.2021", 20);
        Credit credit3 = new Credit(1113, 10000, "19.01.2020-19.01.2021", 20);
        Credit credit4 = new Credit(1114, 10000, "19.01.2020-19.01.2021", 20);
        Credit credit5 = new Credit(1115, 10000, "15.01.2020-151.01.2021", 20);


        System.out.println("Number of operated credits: " + Credit.getNumberOfCredits());
        System.out.println("Sum of operated credits in KGS: " + Credit.getSumOfCredits());
        System.out.println("The average sum of operated credits in KGS: " + Credit.averageSum());


    }
}
