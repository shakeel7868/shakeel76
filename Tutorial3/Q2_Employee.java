package Tutorial3;

public class Q2_Employee {
    private static String empName;
    private static double empSalary;

    public static double getEmpSalary() {
        return empSalary;
    }

    public static void setEmpSalary(double empSalary) {
        Q2_Employee.empSalary = empSalary;
    }

    public String getEmpName(){
        return empName;
    }

    public static void setEmpName(String empName){
        Q2_Employee.empName = empName;
    }

    public Q2_Employee(){

    }

    public Q2_Employee(String empName, double empSalary){
        setEmpName(empName);
        setEmpSalary(empSalary);
    }

    public String toString(){
        return super.toString() + "Employee name : " + getEmpName() + "\nEmployee salary : " + getEmpSalary();
    }
}
