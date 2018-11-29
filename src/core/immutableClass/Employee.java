package core.immutableClass;

/**
 *  - Final Class
 *  - Final attributes
 *  - No setters Method
 *  - parameter constructor
 */
final class Employee {

    private final int empNo;
    private final String empName;

    Employee(int empNo, String empName){
        this.empName = empName;
        this.empNo = empNo;
    }

    private int getEmpNo(){
        return empNo;
    }

    private String getEmpName(){
        return empName;
    }
}
