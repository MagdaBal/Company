public class Main {
    public static void main(String[] args){
        var employee1 = new Accountant("John", "Smith",  7000);
        var employee2 = new ITEmployee("Emma", "Davis", 8000, 5);
        var employee3 = new ITEmployee("Lucas", "Johnson", 7000, 2);
        var employee4 = new SoftwareDeveloper("Sofia", "Anderson", 9000, 4);
        var employee5 = new Accountant("Andrew", "Martinez",  9000);
        var employee6 = new ITEmployee("Mia", "Wiloson", 6000, 3);
        var employee7 = new ITEmployee("Liam", "Hernandez", 10000, 6);
        var employee8 = new SoftwareDeveloper("Olivia", "Brown", 7000, 3);

        System.out.println("\nEmployee's salaries:");
        System.out.println("- "+employee1+" zł");
        System.out.println("- "+employee2+" zł");
        System.out.println("- "+employee3+" zł");
        System.out.println("- "+employee4+" zł");
        System.out.println("- "+employee5+" zł");
        System.out.println("- "+employee6+" zł");
        System.out.println("- "+employee7+" zł");
        System.out.println("- "+employee8+" zł");
    }
}
