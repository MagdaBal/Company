public class SoftwareDeveloper extends ITEmployee{
    public SoftwareDeveloper(String name, String surname, int salary, int years) {
        super(name, surname, salary, years);
        this.tax/=2;
    }
}
