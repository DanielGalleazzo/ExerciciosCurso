import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    protected Date moment  ;
    protected OrderStatus status;
    protected Client client;
    protected List<OrderItem> listaProducts = new ArrayList<>();

    public Order ( Date moment, OrderStatus status, Client client){
        this.moment = moment ;
        this.status = status ;
        this.client = client ;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getListaProducts() {
        return listaProducts;
    }

  public void addItem(OrderItem item){
        listaProducts.add(item);
  }
  public void removeItem(OrderItem item){
        listaProducts.remove(item);
  }
  public double Total (){
        double soma = 0;
        for(OrderItem itens : listaProducts){
            soma = soma + itens.subTotal();
        }
        return  soma;
    }

    @Override
    public String toString() {
        return "Order{" +
                "moment=" + moment +
                ", status=" + status +
                ", client=" + client +
                ", listaProducts=" + listaProducts +
                '}';
    }
}
