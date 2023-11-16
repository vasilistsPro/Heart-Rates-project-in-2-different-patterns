public class DefaultHeartRatesFactory implements HeartRatesFactory {
    @Override
    public HeartRates createHeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, int currentYear) {
        return new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear, currentYear);
    }
}
