public class Student {

    private String name;
    private int points;
    private static int maxPoints = 0;
    private static int totalPoints = 0;

    public Student(String name) {
        this.name = name;
        this.points = 0;
    }

    public String studentInfo() {
        String studentInfo = "Student: " + name + "\n";
        studentInfo += "Points: " + points;
        return studentInfo;
    }

    public void addPoints(int addPoints) {
        points += addPoints;
        totalPoints += addPoints;
        if (points > maxPoints) {
            maxPoints = points;
        }
    }

    public static int getTotalPointsEarned() {
        return totalPoints;
    }

    public static int getGreatestPoints() {
        return maxPoints;
    }








}
