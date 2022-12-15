public class Employee {

    private static int employID = 100;
    private static int employCount = 0;
    private String firstName;
    private String lastName;
    public int thisEmployID;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        employID++;
        employCount++;
        thisEmployID = employID;
    }

    public static int recentID() {
        return employID;
    }

    public static int totalEmploy() {
        return employCount;
    }

    public String employeeInfo() {
        String employeeInfo = "Employee's full name: " + firstName + " " + lastName + "\n";
        employeeInfo += "Employee's ID: " + thisEmployID;
        return employeeInfo;

    }

    public static String classInfo() {
        String classInfo = "Most recent ID assigned: " + employID + "\n";
        classInfo += "Total employees hired: " + employCount;
        return classInfo;
    }

}
