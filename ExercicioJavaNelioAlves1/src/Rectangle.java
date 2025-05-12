public class Rectangle {
    protected double Width;
    protected double Height;

    public Rectangle (double Width, double Height){
        this.Width = Width;
        this.Height = Height;
    }
    public double Area ()   {
        return Width * Height;
    }
    public double Perimeter () {
        return Width + Height;
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(Width,2) + Math.pow(Height,2));
    }
}
