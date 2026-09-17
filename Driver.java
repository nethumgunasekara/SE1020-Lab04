
public class Driver {

    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    // Constructor 1
    public Driver(String driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = 0;
        this.performanceScore = 1;
    }

    // Constructor 2
    public Driver(String driverID, String driverName, double baseSalary) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        this.performanceScore = 1;
    }

    // Constructor 3
    public Driver(String driverID, String driverName,
                  double baseSalary, int performanceScore) {

        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        setPerformanceScore(performanceScore);
    }

    // Getter for driverID
    public String getDriverID() {
        return driverID;
    }

    // Setter for driverID
    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    // Getter for performanceScore
    public int getPerformanceScore() {
        return performanceScore;
    }

    // Setter for performanceScore
    public void setPerformanceScore(int performanceScore) {

        if (performanceScore >= 1 && performanceScore <= 5) {
            this.performanceScore = performanceScore;
        } else {
            this.performanceScore = 1;
        }
    }

    // Calculate bonus using actual performance score
    public double calculateBonus() {

        return calculateBonus(performanceScore);
    }

    // Calculate bonus using custom score
    public double calculateBonus(int score) {

        double bonus = 0;

        if (score == 5) {
            bonus = baseSalary * 20 / 100;
        } else if (score == 4) {
            bonus = baseSalary * 15 / 100;
        } else if (score == 3) {
            bonus = baseSalary * 10 / 100;
        } else if (score == 2) {
            bonus = baseSalary * 5 / 100;
        } else {
            bonus = 0;
        }

        return bonus;
    }

    // Calculate total salary
    public double calculateTotalSalary() {

        return baseSalary + calculateBonus();
    }

    // Display details
    public void displayDetails() {

        System.out.println("Driver ID: " + driverID);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println();
    }
}
