package staff;

import apple.laf.JRSUIConstants;

public abstract class Employee {
    private String name;
    private int niNum;
    private int salary;

    public Employee(String name, int niNum, int salary){
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNum() {
        return niNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name != null) this.name = name;
    }

    public void raiseSalary(double raise){
        if(raise>0) this.salary += raise;
    }

    public double payBonus(){
    return this.salary * 0.01;
    }
}

