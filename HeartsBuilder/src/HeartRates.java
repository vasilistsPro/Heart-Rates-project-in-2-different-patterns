public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private int currentYear;

    // Private constructor to enforce the use of the builder
    private HeartRates(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.birthMonth = builder.birthMonth;
        this.birthDay = builder.birthDay;
        this.birthYear = builder.birthYear;
        this.currentYear = builder.currentYear;
    }

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

    // Builder class for HeartRates
    public static class Builder {
        private String firstName;
        private String lastName;
        private int birthMonth;
        private int birthDay;
        private int birthYear;
        private int currentYear;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder birthMonth(int birthMonth) {
            this.birthMonth = birthMonth;
            return this;
        }

        public Builder birthDay(int birthDay) {
            this.birthDay = birthDay;
            return this;
        }

        public Builder birthYear(int birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public Builder currentYear(int currentYear) {
            this.currentYear = currentYear;
            return this;
        }

        public HeartRates build() {
            return new HeartRates(this);
        }
    }
}
