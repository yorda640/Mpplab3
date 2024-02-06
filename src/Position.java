

class Position {
    private String title;
    private String description;
    private Employee employee;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void hireEmployee(Employee employee) {
        this.employee = employee;
    }

    public void print() {
        System.out.print("Position: " + title + " - " + description);
        if (employee != null) {
            System.out.println(" - Employee: " + employee.getFirstName() + " " + employee.getLastName());
        } else {
            System.out.println(" - Vacant");
        }
    }
}

