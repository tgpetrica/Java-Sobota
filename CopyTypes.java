class Address {
    String street;
    Address (String street) {
        this.street = street;
    }
}

class Student implements Cloneable {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    // se suprascrie metoda clone in interfata Cloneable

    Student copy() {
        Address newAddress = new Address(this.address.street);
        return new Student(this.name, newAddress);
    }
}

public class CopyTypes {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Mihai Eminescu");
        Student s1 = new Student("Teodor", addr);

        Student s2 = (Student) s1.clone(); // shallow copy

        Student s3 = s1.copy(); // deep copy

        /*
         * Shallow copy
         * - foloseste aceeasi referinta address
         * - se modifica toate copiile (clonele)
         * 
         * Deep copy
         * - se instantiaza un nou obiect Address, care are o noua referinta
         * - copiile raman nemodificate; obiectul este independent
         */

        s1.address.street = "Dacia";

        System.out.println("1: " + s1.address.street);
        System.out.println("2: " + s2.address.street);
        System.out.println("3: " + s3.address.street);
    }
}
