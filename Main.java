public class Main {

    public static void main(String[] args) {

        Driver driver1 = new Driver("D001", "Kamal");

        Driver driver2 = new Driver("D002", "Nimal", 80000);

        Driver driver3 = new Driver("D003", "Sunil", 100000, 5);

        driver1.displayDetails();

        driver2.displayDetails();

        driver3.displayDetails();

        System.out.println("Driver 3 bonus with score 3: "
                + driver3.calculateBonus(3));
    }
}
