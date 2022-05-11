package aulasDevSoftPositivoEcoville.Aula11052022Polimorfismo;

public class Circulo  extends FormaGeometrica{
    private double raio;
    public Circulo() {
        
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public Circulo(double raio) {
        this.raio = raio;
    }
    @Override
    public double calculaArea() {
        return  Math.PI * raio * raio;
    }
    @Override
    public String preenhcerCor() {
        // TODO Auto-generated method stub
        return null;
    }
}
