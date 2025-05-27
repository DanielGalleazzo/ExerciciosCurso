import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    protected String name;
    protected WorkerLevel level;
    protected double baseSalary;
    protected Department department;

    List<HourContract> HC = new ArrayList<>();
    public Worker(){
    }
    public Worker(String name, WorkerLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void addContract(HourContract contract){
        HC.add(contract);
    }
    public void removeContract(HourContract contract){
        HC.remove(contract);
    }
    public double income(int year, int month){
        double soma = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for(HourContract contract : HC){
            int calendar_year = calendar.get(Calendar.YEAR);
            int calendar_month = calendar.get(Calendar.MONTH);
            if (year == calendar_year && month == calendar_month) {
                soma += contract.TotalValue();
            }
        }
        return soma;
    }
}