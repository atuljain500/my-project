public class Employee {
    private int salary;
    private String name;
    private String dept;
    private int id;

    public Employee(int id, int salary, String name, String dept){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }

    public int getSalary(){
        return this.salary;
    } 

    public String getName(){
        return this.name;
    }

     public String getDept(){
        return this.dept;
    }

    public int getId(){
        return this.id;
    }
}
