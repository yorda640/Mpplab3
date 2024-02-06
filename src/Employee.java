
class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String ssn;
    private double salary;

    public Employee(String employeeId, String firstName, String lastName, String birthDate, String ssn, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ssn = ssn;
        this.salary = salary;
    }

    // Getters for the employee details
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

