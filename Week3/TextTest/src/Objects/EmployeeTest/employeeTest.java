package Objects.EmployeeTest;

/**
 * employeeTest
 */
public class employeeTest {
    public static void main(final String[] args) {
        final employee employee1 = new employee(01, "Jake", "Glasgow", 1000);
        System.out.println(employee1);

        employee1.salaryIncrease(10);

        System.out.println(employee1);

        System.out.println(employee1.checkLocation("employee"));


        System.out.println(employee1.checkLocation("Glasgow"));
    } 
}