interface Validation {

    boolean validate();
    String outputAsLabel();
}

class Address implements Validation{
    public String street;
    public String city;
    public String county;
    public String postalCode;
    public String country;

    public Address(String street, String city, String county, String postalCode, String country){
        this.street = street;
        this.city = city;
        this.county = county;
        this.postalCode= postalCode;
        this.country = country;
    
    }

    public boolean validate(){
        return street != null && !street.isEmpty()
        && city != null && !city.isEmpty() 
        && county != null && !county.isEmpty();
    }
    
    public  String outputAsLabel(){
        return street + ", " + city + ", " + county + ", " + postalCode + ", " + country;
    }
    

}

class Person {
    public String name;
    public String phoneNumber;
    public String email;
    public Address address;
    public Person (String name, String phoneNumber, String email, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
    
    public void purchaseParkingPass() {
        System.out.println(name + " purchased a parking pass.");
    }

}
class Student extends Person{
    public int studentNumber;
    public double averageMark;
    public Student(String name, String phoneNumber, String email, Address address, int studentNumber, double averageMark){
        super(name, phoneNumber, email, address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
    }
    public boolean isEligibleToEnroll(){
        return averageMark >= 5.0;
    }

    public int[] getSeminarsTaken(){
        return new int[]{1123,2132,3};
    }
}

class Professor extends Person {
    private int salary;
    public Professor(String name, String phoneNumber, String email, Address address, int salary){
        super(name, phoneNumber, email, address);
        this.salary = salary;
    }
}


public class School {
    public static void main(String[] args) {
        Address address = new Address("Strada Mihai Eminescu", "Bucuresti", "Sector 2", "022314", "Romania");
        Student student = new Student("Tedoor", "0712345678", "teodor@tgpetrica.ro", address, 12345, 7.9);

        System.out.println(student.address.validate());

        student.purchaseParkingPass();

        student.address = new Address("Calea Dorobantilor", "", "Sector 2", "023020", "Romania");
        System.out.println(student.address.validate());

        int[]s = student.getSeminarsTaken();
        for (int sem : s) 
        {
            System.out.print(sem + " ");
        }

    }
}
