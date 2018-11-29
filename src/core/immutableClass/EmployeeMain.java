package core.immutableClass;

public class EmployeeMain {
    public static void main(String[] x){
        System.out.println("EmployeeMain");
        Employee employee = new Employee(1, "Rajesh");
        System.out.println(employee);

        employee = new Employee(1, "Rajesh");
        System.out.println(employee);
    }
}
