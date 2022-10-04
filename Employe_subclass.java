//49.	Write an application to create a super class Employee with information first name & last name and methods getFirstName(),
// getLastName() derive the sub-classes ContractEmployee and RegularEmployee with the information about department,
// designation & method displayFullName() , getDepartment, getDesig() to print the salary and to set
// department name & designation of the corresponding sub-class objects respectively.
class Employee{
    String first_nm;
    String last_nm;
    String getFirst_nm(){
        return first_nm;
    }
    void setFirst_nm(String first_nm){
        this.first_nm=first_nm;
    }
    String getLast_nm(){
        return last_nm;
    }
    void setLast_nm(String last_nm){
        this.last_nm=last_nm;
    }
}
class ContractEmployee extends Employee{
    String department;
    String designation;
    double salary;

    String getDepartment(){
        return department;
    }
    void setDepartment(String department){
        this.department=department;
    }
    String getDesgnation(){
        return designation;
    }
    void setDesignation(String designation){
        this.designation=designation;
    }
    double getSalary(){
        return salary;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee name:"+getFirst_nm()+" "+getLast_nm());
    }
}
class Regular_employee extends Employee{
    String department;
    String designation;
    double salary;

    String getDepartment(){
        return department;
    }
    void setDepartment(String department){
        this.department=department;
    }
    String getDesgnation(){
        return designation;
    }
    void setDesignation(String designation){
        this.designation=designation;
    }
    double getSalary(){
        return salary;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
    void display(){
        System.out.println("Employee name:"+getFirst_nm()+" "+getLast_nm());
    }
}
public class Employe_subclass {
    public static void main(String [] args){
        ContractEmployee ct=new ContractEmployee();
        ct.setFirst_nm("Arpita");
        ct.setLast_nm("Brode");
        ct.setDepartment("IT");
        ct.setSalary(100000);
        ct.setDesignation("Engineer");
        System.out.println("First Name:"+ct.getFirst_nm());
        System.out.println("Last Name:"+ct.getLast_nm());
        System.out.println("Department:"+ct.getDepartment());
        System.out.println("Designation:"+ct.getDesgnation());
        System.out.println("Salary:"+ct.getSalary());
        ct.display();
        Regular_employee rg=new Regular_employee();
        rg.setFirst_nm("Palak");
        rg.setLast_nm("verma");
        rg.setDepartment("HR");
        rg.setDesignation("Manager");
        rg.setSalary(50000);
        System.out.println("First Name:"+rg.getFirst_nm());
        System.out.println("last Name:"+rg.getLast_nm());
        System.out.println("Department:"+rg.getDepartment());
        System.out.println("Designation:"+rg.getDesgnation());
        System.out.println("Salary:"+rg.getSalary());
        rg.display();
    }
}
