import java.util.Date;

public class Order {
    protected Date moment  ;
    protected OrderStatus status;

    public Order ( Date moment, OrderStatus status){
        this.moment = moment ;
        this.status = status ;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
