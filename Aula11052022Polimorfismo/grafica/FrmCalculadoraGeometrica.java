package aulasDevSoftPositivoEcoville.Aula11052022Polimorfismo.grafica;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;

public class FrmCalculadoraGeometrica extends JFrame {
    private JTextField txtCircunferenciaRaio;
    private JTextField txtCircunferenciaArea;
    private JTextField txtRetanguloAltura;
    private JTextField txtRetanguloArea;
    private JButton bntCalcularArea;
    public FrmCalculadoraGeometrica() {

        setSize(new DimensionUIResource(720, 600));
        setLayout(new GridLayout(3,1,25,25));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Circulo"));
        pnl.setLayout(
            new GridLayout(1,5,10,50)
        );
        pnl.add(new JLabel("Area"));
        bntCalcularArea = new JButton("Calcular");
        txtCircunferenciaRaio = new JTextField("Xunxo",20);
        pnl.add(bntCalcularArea);
        pnl.add(txtCircunferenciaRaio);
        add(pnl);

        JPanel pnl1 = new JPanel();
        pnl1.setBorder(BorderFactory.createTitledBorder("Retangulo"));
        add(pnl1);
        
    }
}
