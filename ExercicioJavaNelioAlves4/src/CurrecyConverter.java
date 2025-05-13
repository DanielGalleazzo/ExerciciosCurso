public class CurrecyConverter {
    protected double DolarPrice;
    protected double ManyDollars;
    public static final double IOF = 0.06;

    public CurrecyConverter (double DolarPrice, double ManyDollars){
        this.DolarPrice = DolarPrice;
        this.ManyDollars = ManyDollars;
    }
    public double Amount (){
        return (ManyDollars * DolarPrice ) * ( 1+IOF ) ;
    }
}
