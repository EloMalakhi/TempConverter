import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.codebinds.Temperature;
public class GUI {
    private double userTemp;
    private JPanel panel1;
    private JTextField userInput;
    private JButton cToFButton;
    private JButton fToCButton;
    private JTextField programOutput;
    private JLabel instructorText;


    public GUI() {
        cToFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userTemp = Float.valueOf(userInput.getText());
                programOutput.setText("" + Temperature.CelsToFahr(userTemp));
            }
        });
        fToCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userTemp = Float.valueOf(userInput.getText());
                programOutput.setText("" + Temperature.FahrToCels(userTemp));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Temp Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new GUI().panel1);
        frame.pack();
        frame.setVisible(true);
    }



}
