package core.singleton;

/**
 *  2 ways
 *      - with getInstance() method
 *      - with the method name same as class name
 *  - Static instance created only once at the time of loading the class
 */
public class Employee {

    private static Employee employee = null;

    String name="Employee Name";

    /**
     *  - using a method
     * @return
     */
    public  Employee getInstance(){
        if(employee == null)
            employee = new Employee();
        return employee;
    }

    public Employee Employee(){
        if(employee == null)
            employee = new Employee();
        return employee;
    }



}
