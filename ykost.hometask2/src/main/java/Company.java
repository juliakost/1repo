public class Company {

    public static void main(String[] args) {

        Employee bob = new Employee();


            bob.setFirstName("Bob");
            bob.setLastName("Rod");
            bob.setYearOfBirth(1998);
            bob.setWorkYears(5);

        Employee anna = new Employee();


            anna.setFirstName("Anna");
            anna.setLastName("Soll");
            anna.setYearOfBirth(2000);
            anna.setWorkYears(4);


        Employee jurek = new Employee();


            jurek.setFirstName("Jurek");
            jurek.setLastName("Lux");
            jurek.setYearOfBirth(1977);
            jurek.setWorkYears(10);


        System.out.println("First Employee is " + bob.getFirstName() + " " + bob.getLastName() + ", born in " + bob.getYearOfBirth() + ", works " + bob.getWorkYears() + " years");
        System.out.println("Second Employee is " + anna.getFirstName() + " " + anna.getLastName() + ", born in " + anna.getYearOfBirth() + ", works " + anna.getWorkYears() + " years");
        System.out.println("Third Employee is " + jurek.getFirstName() + " " + jurek.getLastName() + ", born in " + jurek.getYearOfBirth() + ", works " + jurek.getWorkYears() + " years");

    }


}
