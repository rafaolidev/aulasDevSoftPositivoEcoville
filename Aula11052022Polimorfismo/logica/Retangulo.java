package aulasDevSoftPositivoEcoville.Aula11052022Polimorfismo.logica;

public class Retangulo  extends FormaGeometrica{
    private double altura;
    private double base;

    public Retangulo() {}
    
    public Retangulo(double altura ,double base ) {
        this.altura=altura;
        this.base=base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculaArea() {
        return base*altura;
    }

    @Override
    public String preenhcerCor() {
        return "Verde";
    }
    
    
}
