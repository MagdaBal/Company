public class ITEmployee extends Employee{
    private int workYears;

    public ITEmployee(String name, String surname, int salary, int years) {
        super(name, surname, salary, CalculateBonus(years));
        this.workYears = years;
    }

    private static double CalculateBonus(int workYears){
        if(workYears<2){
            return 500.0;
        } else if(workYears<5){
            return 2000.0;
        } else{
            return 5000.0;
        }
    }

    @Override
    public double CalculateSalary(){
        return this.salary+this.salary-(this.salary+this.bonus)*this.tax;
    }
}
