import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Δώσε το μικρό σου όνομα: ");
        String firstName = input.nextLine();

        System.out.print("Δώσε το επώνυμό σου: ");
        String lastName = input.nextLine();

        System.out.print("Δώσε τον μήνα γέννησής σου (π.χ., 1 για Ιανουάριο): ");
        int birthMonth = input.nextInt();

        System.out.print("Δώσε την ημέρα γέννησης σου (Από 1 έως 31): ");
        int birthDay = input.nextInt();

        System.out.print("Δώσε το έτος της γέννησής σου: ");
        int birthYear = input.nextInt();

        int currentYear = 2023;

        // Χρήση του Factory Pattern για τη δημιουργία αντικειμένου HeartRates
        HeartRatesFactory factory = HeartRates.createHeartRatesFactory();
        HeartRates person = factory.createHeartRates(firstName, lastName, birthMonth, birthDay, birthYear, currentYear);

        System.out.println("Προσωπικές πληροφορίες:");
        System.out.println("Ονοματεπώνυμο: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Ηλικία: " + person.calculateAge() + " χρονών");
        System.out.println("Συχνότητα μέγιστου καρδιακού παλμού: " + person.calculateMaxHeartRate() + " παλμοί ανα λεπτό");
        System.out.println("Εύρος συχνότητας καρδιακού παλμού: " + person.calculateTargetHeartRateRange());

        input.close();
    }
}
