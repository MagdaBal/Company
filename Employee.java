public class Employee {
    final private String name;
    final private String surname;
    protected int salary;
    protected double bonus;
    protected double tax=0.17;

    public Employee(String name, String surname, int salary, double bonus){
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.bonus=bonus;
    }

    public double CalculateSalary(){
        double finalSalary = salary + bonus*salary;
        finalSalary -=tax*finalSalary;
        return finalSalary;
    }

    public String Name(){
        return this.name +" "+this.surname;
    }

    public String toString(){
        return Name() + ": "+CalculateSalary();
    }
}

