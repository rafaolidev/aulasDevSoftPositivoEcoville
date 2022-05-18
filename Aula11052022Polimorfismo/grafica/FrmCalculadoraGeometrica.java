package aulasDevSoftPositivoEcoville.Aula11052022Polimorfismo.grafica;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import aulasDevSoftPositivoEcoville.Aula11052022Polimorfismo.grafica.ActionCalcularArea.OpcaoForma;

import java.awt.*;
import java.util.concurrent.Flow;

public class FrmCalculadoraGeometrica extends JFrame {
    private JTextField txtCircunferenciaRaio;
    private JTextField txtCircunferenciaArea;
    private JTextField txtRetanguloAltura;
    private JTextField txtRetanguloArea;
    private JTextField areaCirculo;
    private JButton bntCalcularArea;
    public FrmCalculadoraGeometrica() {

        setSize(new DimensionUIResource(720, 600));
        setLayout(new GridLayout(3,1,25,25));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Circulo"));
        pnl.setLayout(
            new FlowLayout()
        );
        bntCalcularArea = new JButton("Calcular");
        txtCircunferenciaRaio = new JTextField(20);
        areaCirculo = new JTextField(10);
        pnl.add(new JLabel("Raio"));
        pnl.add(areaCirculo);
        pnl.add(bntCalcularArea);
        pnl.add(new JLabel("Area"));
        pnl.add(txtCircunferenciaRaio);
        
        
        add(pnl);

        JPanel pnl1 = new JPanel();
        pnl1.setBorder(BorderFactory.createTitledBorder("Retangulo"));
        add(pnl1);
        pack();
        ActionCalcularArea action = new ActionCalcularArea
        (areaCirculo, OpcaoForma.CIRCULO, txtCircunferenciaRaio );
        bntCalcularArea.addActionListener(action);
        
    }
}
