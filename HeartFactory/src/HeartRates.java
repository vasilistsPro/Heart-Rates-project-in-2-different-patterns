public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private int currentYear;

    HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, int currentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
    }

    // Μέθοδοι για υπολογισμό των age, max heart rate, and target heart rate range
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int calculateAge() {
        int age = currentYear - birthYear;
        if (birthMonth > currentYear || (birthMonth == currentYear && birthDay > currentYear)) {
            age--;
        }
        return age;
    }

    public int calculateMaxHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }

    public String calculateTargetHeartRateRange() {
        int maxHeartRate = calculateMaxHeartRate();
        int lowerRange = (int) (maxHeartRate * 0.5);
        int upperRange = (int) (maxHeartRate * 0.85);
        return lowerRange + " - " + upperRange + " παλμοί ανα λεπτό";
    }

    // Factory method
    public static HeartRatesFactory createHeartRatesFactory() {
        return new DefaultHeartRatesFactory();
    }
}
