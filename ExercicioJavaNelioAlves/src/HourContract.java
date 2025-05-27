import java.util.Date;

public class HourContract {
    protected Date date;
    protected double valuePerHour;
    protected int hours;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public  HourContract(Date date, double valuePerHour, int hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }
    public double TotalValue (){
        return valuePerHour * hours;
    }
}
