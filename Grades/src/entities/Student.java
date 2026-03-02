package entities;

public class Student {
    public String name;
    public double firstTrimester;
    public double secondTrimester;
    public double thirdTrimester;

    public double totalScore() {
        return firstTrimester + secondTrimester + thirdTrimester;
    }

    public String toString() {
        if (totalScore() < 60.0) {
            return String.format("FINAL GRADE = %.2f%n", totalScore())
                    + "FAILED"
                    + String.format("%nMISSING %.2f POINTS", 60.0 - totalScore());
        }
        else {
            return String.format("FINAL GRADE = %.2f%n", totalScore())
                    + "PASS";
        }
    }
}
