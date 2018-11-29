package core.singleton;

public class EmployeeMain {
    public static void main(String[] x){
        System.out.println("EmployeeMain");
        Employee employee = new Employee();
        System.out.println(employee.getInstance());
        System.out.println(employee.name);


        Employee employee1 = new Employee();
        System.out.println(employee1.getInstance());
        System.out.println(employee1.name);

        System.out.println("-------------------------------");
        Employee employee2 = new Employee();
        System.out.println(employee2.Employee());
        System.out.println(employee2.name);


        Employee employee3 = new Employee();
        System.out.println(employee3.Employee());
        System.out.println(employee3.name);

    }
}
