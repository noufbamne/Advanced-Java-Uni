import java.util.ArrayList;
abstract class employee{
    private String name;
    private int id;

    public employee(String name , int id){
        this.name = name ;
        this.id = id; 
    }

    public String getname(){
        return name;
    }

    public int getid(){
        return id;
    }

    public abstract double CalculateSalary();
@Override
public String toString(){
    return "Employee [name = "+ name +" , ID = "+ id +" Salary = "+ CalculateSalary() + "]";
}
}

class FullTimeEmployee extends employee{
    private double monthlysalary;

    public FullTimeEmployee(String name , int id , double monthlysalary){
        super(name , id);
        this.monthlysalary = monthlysalary;
    }
    
    @Override
    public double CalculateSalary(){
        return monthlysalary;
    }
}

class PartTimeEmployee extends employee{
    private int HourWorked;
    private double HourRate;

    public PartTimeEmployee(String name , int id , int HourWorked , double HourRate){
        super(name , id);
        this.HourWorked = HourWorked;
        this.HourRate = HourRate;
    }

    @Override
    public double CalculateSalary(){
        return HourWorked * HourRate;
    }
}

class PayrollSystem{
    private ArrayList<employee> employeeList;
    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void AddEmployee(employee Employee){
        employeeList.add(Employee);
    }

    public void RemoveEmployee(int id){
        employee emp_to_remove = null;
        for (employee Employee: employeeList){
            if(Employee.getid() == id){
                emp_to_remove = Employee;
                break;
            }
        }
        if(emp_to_remove!= null){
            employeeList.remove(emp_to_remove);
        }
    }

    public void DisplayEmployee(){
        for(employee Employee : employeeList){
            System.out.println(Employee);
        }
    }
}


public class Program01{
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Nouf" , 02, 200000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Mahin", 04, 9, 600);

        payrollSystem.AddEmployee(emp1);
        payrollSystem.AddEmployee(emp2);

        System.out.println("Initial Employee Details : ");
        payrollSystem.DisplayEmployee();

        payrollSystem.RemoveEmployee(02);
        System.out.println("Removing Employee no : 02 ");
        System.out.println("Employee Details After Removing Employee no : 02 ");
        payrollSystem.DisplayEmployee();
    }
}