import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Window extends JFrame {
    private UnitConverter u;

    JLabel fromUnits, toUnits, enterNumber, result, answer;
    JTextField textField;
    JButton calcBtn;

    JComboBox<String> startUnits;
    JComboBox<String> endUnits;

    public Window() {
        u = new UnitConverter();
        makeWindow();
    }

    private void update(){
//        DecimalFormat d = new DecimalFormat("#.##");
        String convertFrom = "", convertTo = "";
        double number = 0;

        convertFrom = startUnits.getSelectedItem().toString();
        convertTo = endUnits.getSelectedItem().toString();
        if(!textField.getText().equals("")) number = Double.parseDouble(textField.getText());
        answer.setText("" + (u.calculate(number, convertFrom, convertTo)) + u.getEndUnits());
    }

    private void makeWindow (){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(200,200);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(0,2));

        fromUnits = new JLabel("convert from: ");
        toUnits = new JLabel("to");
        enterNumber = new JLabel("enter number");
        answer = new JLabel("");
        textField = new JTextField("");
        calcBtn = new JButton("calculate");

        startUnits = new JComboBox<String>();
        for(String i : u.metricUnits.keySet()){ // add metric units
            startUnits.addItem(i);
        }
        for(String i : u.imperialUnits.keySet()){ // add imperial units
            startUnits.addItem(i);
        }

        endUnits = new JComboBox<String>();
        for(String i : u.metricUnits.keySet()){ // add metric units
            endUnits.addItem(i);
        }
        for(String i : u.imperialUnits.keySet()){ // add imperial units
            endUnits.addItem(i);
        }

        p.add(fromUnits);
        p.add(toUnits);
        p.add(startUnits, BorderLayout.WEST);
        p.add(endUnits, BorderLayout.SOUTH);
        p.add(enterNumber);
        p.add(textField);
        p.add(calcBtn);
        p.add(answer);

        frame.add(p);

        calcBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
            }
        });
    }
}
