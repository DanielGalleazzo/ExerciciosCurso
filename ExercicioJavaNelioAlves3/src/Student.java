import org.w3c.dom.Notation;

public class Student {
    protected double Nota1;
    protected double Nota2;
    protected double Nota3;

    public Student(double Nota1, double Nota2, double Nota3){
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }

    public double NotaFinal (){
        return Nota1 + Nota2 + Nota3;
    }
    public double PontosFaltando(){
        if (NotaFinal() <60){
            return 60 - NotaFinal();
        }
        else {
            return 0;
        }
    }
}
