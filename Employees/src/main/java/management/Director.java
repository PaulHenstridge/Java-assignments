package management;

public class Director extends Manager{
    private String budget;

    public Director(String name, int niNum, int salary, String deptName){
        super(name, niNum, salary, deptName);
        this.deptName = deptName;
    }

    public String getBudget() {
        return budget;
    }
}
