public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void add(double re , double img){
        this.real = re+this.real;
        this.imaginary = img+this.imaginary;
    }
    public void add(ComplexNumber complexNumber){
        this.real = this.real+complexNumber.real;
        this.imaginary = this.imaginary+complexNumber.imaginary;

    }
    public void subtract(double re , double img){
        this.real = this.real - re;
        this.imaginary = this.imaginary - img;
    }
    public void subtract(ComplexNumber complexNumber){
        this.real = this.real - complexNumber.real;
        this.imaginary =  this.imaginary - complexNumber.imaginary ;
    }


}
