package shared;

public class Person extends Animal {
    public String firstName;
    public String lastName;
    public int ssn;
    public static int count = 0;

    public static int getPersonCount() {
        return count;
    }

    public Person() {
        this.age = -1;
        this.firstName = "";
        this.lastName = "";

        count++;
    }

    public Person(String firstName, String lastName) {
        this.age = -1;
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
    }

    public Person(String firstName, String lastName, byte age, int ssn) {
        this.age = (int) age;
        this.firstName = firstName;
        this.lastName = lastName;

        this.ssn = ssn;
        count++;
    }

    public String speak() {
        String result = "";
        if (this.lastName.equals("")) {
            result = String.format("I don't have a name.");
            return result;
        }

        else if (this.lastName.length() > 0) {
            if (this.age >= 0) {
                result = String.format("My name is %s %s and I am %d years old.", this.firstName, this.lastName,
                        this.age);
                return result;
            } else {
                result = String.format("My name is %s %s.", this.firstName, this.lastName);
                return result;
            }
        }
        return result;
    }

    public String toString() {
        String result = "N/A";
        if (this.ssn >= 100000000) {
            String last4 = String.valueOf(this.ssn).substring(5);
            result = String.format("%s %s %s", this.firstName, this.lastName, last4);
            return result;
        } else if (this.lastName.length() > 0) {
            result = String.format("%s %s", this.firstName, this.lastName);
        }

        return result;
    }
}
