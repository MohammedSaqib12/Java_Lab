import java.awt.*;
import java.awt.event.*;

public class Ex10 extends Frame implements 
ActionListener {
    private TextField amountTextField, resultTextField;
    private Choice fromChoice, toChoice;
    private Button convertButton;

    public Ex10() {
        setTitle("Currency Converter");
        setSize(600, 200);
        setLayout(new GridLayout(6, 2));

        Label amountLabel = new Label("Amount:");
        add(amountLabel);

        amountTextField = new TextField();
        add(amountTextField);

        Label fromLabel = new Label("From:");
        add(fromLabel);

        fromChoice = new Choice();
        fromChoice.add("USD");
        fromChoice.add("EUR");
        fromChoice.add("INR");
        add(fromChoice);

        Label toLabel = new Label("To:");
        add(toLabel);
        toChoice = new Choice();
        toChoice.add("USD");
        toChoice.add("EUR");
        toChoice.add("INR");
        add(toChoice);
        convertButton = new Button("Convert");
        convertButton.addActionListener(this);
        add(convertButton);

        Label resultLabel = new Label("Result:");
        add(resultLabel);

        resultTextField = new TextField();
        resultTextField.setEditable(false);
        add(resultTextField);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        double amount = 
   Double.parseDouble(amountTextField.getText());
        String fromCurrency = fromChoice.getSelectedItem();
        String toCurrency = toChoice.getSelectedItem();
        double result = convertCurrency(amount, fromCurrency,
   toCurrency);
        resultTextField.setText(String.format("%.2f", 
   result));
    }

    private double convertCurrency(double amount, String 
    fromCurrency, String toCurrency) {

        double rate = 1.0; 
        if (fromCurrency.equals("USD") && 
   toCurrency.equals("EUR")) {
            rate = 0.83;
        } else if (fromCurrency.equals("USD") && 
          toCurrency.equals("INR")) {
            rate = 73.51; 
        } else if (fromCurrency.equals("EUR") && 
toCurrency.equals("USD")) {
            rate = 1.20;
        } else if (fromCurrency.equals("EUR") &&
toCurrency.equals("INR")) {
            rate = 88.49; 
        } else if (fromCurrency.equals("INR") && 
toCurrency.equals("USD")) {
            rate = 0.014; 
        } else if (fromCurrency.equals("INR") &&
toCurrency.equals("EUR")) {
            rate = 0.011; 
        }
        return amount * rate;
    }

    public static void main(String[] args) {
        new Ex10();
    }
}
