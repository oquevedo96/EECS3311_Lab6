package view;

import javax.swing.*;
import java.awt.*;

public class ConverterPanel extends JPanel {
    private JTextArea CentimetersConversionArea;

    public JTextArea getMeterConversionArea() {
        return MeterConversionArea;
    }

    private JTextArea MeterConversionArea;
    public JTextArea getFeetConversionArea() {
        return FeetConversionArea;
    }

    private JTextArea FeetConversionArea;
    public JTextArea getCentimetersConversionArea() {
        return CentimetersConversionArea;
    }

    public ConverterPanel(){
        super(new FlowLayout());
        paintFt();
        paintM();
        paintCm();
    }

    private void paintFt(){
        FeetConversionArea = new JTextArea(20,20);
        FeetConversionArea.setBackground(Color.GREEN);
        FeetConversionArea.setEditable(false);
        super.add(FeetConversionArea);
    }
    private void paintCm(){
        CentimetersConversionArea = new JTextArea(20,20);
        CentimetersConversionArea.setBackground(Color.YELLOW);
        super.add(CentimetersConversionArea);
    }
    private void paintM(){
        MeterConversionArea = new JTextArea(20,20);
        MeterConversionArea.setBackground(Color.ORANGE);
        MeterConversionArea.setEditable(false);
        super.add(MeterConversionArea);
    }
}
