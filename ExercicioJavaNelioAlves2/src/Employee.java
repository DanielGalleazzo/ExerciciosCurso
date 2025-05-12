public class Employee {
    protected String Name;
    protected double GrossSalary;
    protected double Tax;

    public Employee(String Name, double GrossSalary, double Tax){
        this.Name = Name;
        this.GrossSalary = GrossSalary;
        this.Tax = Tax;

    }
    public double NetSalary (){
        return GrossSalary - Tax;

    }
    public void IncreaseSalary (double Porcentage) {
         GrossSalary+= GrossSalary * Porcentage / 100.0;
    }
    @Override
    public String toString() {
        return String.format("Nome: %s, Salário líquido: R$ %.2f", Name, NetSalary());
    }
}
