package techStaff;

import staff.Employee;


public class Developer extends Employee {
    public Developer(String name, int niNum, int salary) {
        super(name, niNum, salary);
    }
    public double payBonus(){
        return this.salary * 0.02;
    }

}