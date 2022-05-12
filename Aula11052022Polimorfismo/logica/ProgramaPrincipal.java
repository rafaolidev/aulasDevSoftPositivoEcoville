package aulasDevSoftPositivoEcoville.Aula11052022Polimorfismo.logica;

import aulasDevSoftPositivoEcoville.Aula11052022Polimorfismo.grafica.FrmCalculadoraGeometrica;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        FrmCalculadoraGeometrica frm = new FrmCalculadoraGeometrica();
        frm.setVisible(true);
        /*
        FormaGeometrica array[] = new FormaGeometrica[2];
        array[0] = new Circulo(0.5);
        array[1] = new Retangulo(2.5,3);

        for (FormaGeometrica formaGeometrica : array) {
            System.out.printf("%S -> area: %.1f %n -> cor: %s\n",
            formaGeometrica.getClass().getName(),formaGeometrica.calculaArea(),formaGeometrica.preenhcerCor());
        }
        */
    }
}
