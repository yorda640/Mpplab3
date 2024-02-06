

class Application {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("XYZ Corp");

        // Create departments
        Department hrDepartment = new Department("HR", "Location1");
        Department itDepartment = new Department("IT", "Location2");

        // Add departments to the company
        company.addDepartment(hrDepartment);
        company.addDepartment(itDepartment);

        // Add positions to departments
        hrDepartment.addPosition(new Position("HR Manager", "Manages HR operations"));
        hrDepartment.addPosition(new Position("Recruiter", "Recruits new employees"));
        hrDepartment.addPosition(new Position("Training Coordinator", "Coordinates employee training"));

        itDepartment.addPosition(new Position("Software Engineer", "Develops software applications"));
        itDepartment.addPosition(new Position("Systems Administrator", "Manages IT infrastructure"));
        itDepartment.addPosition(new Position("IT Support Specialist", "Provides technical support"));

        // Hire some employees
        hrDepartment.getPositions().get(0).hireEmployee(new Employee("001", "John", "Doe", "01/01/1990", "123-45-6789", 50000));
        hrDepartment.getPositions().get(1).hireEmployee(new Employee("002", "Jane", "Smith", "02/02/1991", "987-65-4321", 45000));
        itDepartment.getPositions().get(0).hireEmployee(new Employee("003", "Mike", "Johnson", "03/03/1992", "567-89-0123", 60000));

        // Print the company hierarchy
        company.print();
    }
}



