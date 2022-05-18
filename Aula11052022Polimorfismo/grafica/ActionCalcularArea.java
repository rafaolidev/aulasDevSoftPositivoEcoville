package aulasDevSoftPositivoEcoville.Aula11052022Polimorfismo.grafica;
import javax.swing.*;

import aulasDevSoftPositivoEcoville.Aula11052022Polimorfismo.logica.Circulo;

import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionCalcularArea extends AbstractAction{

    public enum OpcaoForma{
        CIRCULO,
        RETANGULO
    }


    private JTextField txtRaio;
    private JTextField txtArea;
    private OpcaoForma opcaoForma;
    public ActionCalcularArea(JTextField txtRaio, OpcaoForma opcaoForma, JTextField txtArea){
            this.txtRaio = txtRaio;
            this.txtArea = txtArea;
            this.opcaoForma = opcaoForma;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (this.opcaoForma) {
            case CIRCULO:
                Double raio = Double.parseDouble(txtRaio.getText());
                Circulo circulo = new Circulo(raio);
                Double area = circulo.calculaArea();
                txtArea.setText(String.format("%S", area));
                break;
            
            case RETANGULO:
                
            break;

            default:
                break;
        }
        
    }
    
}
