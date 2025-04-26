package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 * A Calculator GUI application that performs basic arithmetic operations
 * and includes memory functions, reciprocal, square root, power, factorial,
 * and logarithmic calculations.
 *
 * @author Nhan Cao
 * Version 1.0
 * */
public class Calculator {

    /** Panel of the Calculator */
    private JPanel Calculator;
    /** Text Field of the Calculator */
    private JTextField textField;
    /**Buttons of the Calculator */
    private JButton oneBtn;
    private JButton twoBtn;
    private JButton threeBtn;
    private JButton addBtn;
    private JButton zeroBtn;
    private JButton digitBtn;
    private JButton equalBtn;
    private JButton mClearBtn;
    private JButton mRecallBtn;
    private JButton mAddBtn;
    private JButton mSubBtn;
    private JButton reciprocalBtn;
    private JButton powerBtn;
    private JButton logBtn;
    private JButton sqrBtn;
    private JButton divideBtn;
    private JButton factorialBtn;
    private JButton signBtn;
    private JButton clearBtn;
    private JButton mulBtn;
    private JButton nineBtn;
    private JButton eightBtn;
    private JButton sevenBtn;
    private JButton minusBtn;
    private JButton sixBtn;
    private JButton fiveBtn;
    private JButton fourBtn;

    /** Total of the calculations */
    private double currentValue = 0;
    private double total = 0;

    /** Memory for the m buttons */
    private double memory = 0; //Memory

    /** Gets the first char of the button to decide the operation */
    private char operation;
    private void getOperation (String operationBtn){
        operation = operationBtn.charAt(0);
        currentValue = Double.parseDouble(textField.getText());
        textField.setText("");
    }

    /** Provided test case buttons */
    public void test( String button){
        switch (button){
            case "0": zeroBtn.doClick();break;
            case "1": oneBtn.doClick();break;
            case "2": twoBtn.doClick();break;
            case "3": threeBtn.doClick();break;
            case "4": fourBtn.doClick();break;
            case "5": fiveBtn.doClick();break;
            case "6": sixBtn.doClick();break;
            case "7": sevenBtn.doClick();break;
            case "8": eightBtn.doClick();break;
            case "9": nineBtn.doClick();break;
            case "x!": factorialBtn.doClick();break;
            case "-/+": signBtn.doClick();break;
            case "AC": clearBtn.doClick();break;
            case "1/x": reciprocalBtn.doClick();break;
            case "sqr": sqrBtn.doClick();break;
            case "log": logBtn.doClick();break;
            case ".": digitBtn.doClick();break;
            case "+": addBtn.doClick();break;
            case "-": minusBtn.doClick();break;
            case "*": mulBtn.doClick();break;
            case "/": divideBtn.doClick();break;
            case "**": powerBtn.doClick();break;
            case "=": equalBtn.doClick();break;
            case "MR": mRecallBtn.doClick();break;
            case "MC": mClearBtn.doClick();break;
            case "M-": mSubBtn.doClick();break;
            case "M+": mAddBtn.doClick();break;
            case "txt": System.out.println("The result is: " + textField.getText());break;
            default:System.out.println("invalid input");break;
        }
    }

    public Calculator() {
        /** Actions of buttons 0 - 9 */
        oneBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oneBtnText = textField.getText() + oneBtn.getText();
                textField.setText(oneBtnText);
            }
        });
        twoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String twoBtnText = textField.getText() + twoBtn.getText();
                textField.setText(twoBtnText);
            }
        });
        threeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String threeBtnText = textField.getText() + threeBtn.getText();
                textField.setText(threeBtnText);
            }
        });
        fourBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fourBtnText = textField.getText() + fourBtn.getText();
                textField.setText(fourBtnText);
            }
        });
        fiveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fiveBtnText = textField.getText() + fiveBtn.getText();
                textField.setText(fiveBtnText);
            }
        });
        sixBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sixBtnText = textField.getText() + sixBtn.getText();
                textField.setText(sixBtnText);
            }
        });
        sevenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sevenBtnText = textField.getText() + sevenBtn.getText();
                textField.setText(sevenBtnText);
            }
        });
        eightBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eightBtnText = textField.getText() + eightBtn.getText();
                textField.setText(eightBtnText);
            }
        });
        nineBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nineBtnText = textField.getText() + nineBtn.getText();
                textField.setText(nineBtnText);
            }
        });
        zeroBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String zeroBtnText = textField.getText() + zeroBtn.getText();
                textField.setText(zeroBtnText);
            }
        });

        /** Format for decimals, (1.0 would become 1 and contains 15 decimal places) */
        DecimalFormat formatter = new DecimalFormat("0.###############");

        /** Action Calculations Buttons */
        /** Add, Subtract, Multiply and Divide */
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operationText = addBtn.getText();
                getOperation(operationText);
            }
        });
        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operationText = minusBtn.getText();
                getOperation(operationText);
            }
        });
        mulBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operationText = mulBtn.getText();
                getOperation(operationText);
            }
        });
        divideBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operationText = divideBtn.getText();
                getOperation(operationText);
            }
        });
        /** Factorial Button */
        factorialBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentValue = Double.parseDouble(textField.getText());
                if (currentValue % 1 != 0 || currentValue < 0 || currentValue > 10) { /** Factorial between 0 to 10 and no number with a decimal */
                    textField.setText("ERROR");
                    return;
                } else {
                    total = 1;
                    for (int i = 1; i <= currentValue; i++) {
                        total *= i;
                    }
                    textField.setText((formatter.format(total)));
                }
            }
        });
        /** Square Root Button */
        sqrBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentValue = Double.parseDouble(textField.getText());
                if (currentValue < 0) { /** Cannot square root of a negative number */
                    textField.setText("ERROR");
                    return;
                } else {
                    total = Math.sqrt(currentValue);
                    textField.setText((formatter.format(total)));
                }
            }
        });
        /** Reciprocal Button */
        reciprocalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentValue = Double.parseDouble(textField.getText());
                if( currentValue == 0 ){ /** 1/0 is an ERROR */
                    textField.setText("ERROR");
                    return;
                } else {
                    total = 1 / currentValue;
                    textField.setText((formatter.format(total)));
                }
            }
        });
        /** Log Button */
        logBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentValue = Double.parseDouble(textField.getText());
                if(currentValue <= 0) { /** Log of a negative number is ERROR */
                    textField.setText("ERROR");
                    return;
                } else {
                    total = Math.log(currentValue);
                    textField.setText((formatter.format(total)));
                }
            }
        });
        /** Sign button */
        signBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentValue = Double.parseDouble(textField.getText());
                if(currentValue == 0){ /** 0 becomes 0 not -0 */
                    textField.setText(formatter.format(currentValue));
                } else {
                    currentValue = currentValue * -1;
                    textField.setText((formatter.format(currentValue)));
                }
            }
        });
        /** Power button */
        powerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operationText = powerBtn.getText();
                getOperation(operationText);
            }
        });
        /** Equal button */
        equalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /** Switch case for the operation being performed */
                if (!textField.getText().isEmpty()) {
                    switch (operation) {
                        /** Char.at(0) from the button decides the case */
                        case '+':
                            total = currentValue + Double.parseDouble(textField.getText());
                            break;
                        case '-':
                            total = currentValue - Double.parseDouble(textField.getText());
                            break;
                        case '*':
                            total = currentValue * Double.parseDouble(textField.getText());
                            break;
                        case '/':
                            if (Double.parseDouble(textField.getText()) == 0) { /** Error if divided by 0 */
                                textField.setText("ERROR");
                                return; // Exit early on division by zero
                            } else {
                                total = currentValue / Double.parseDouble(textField.getText());
                            }
                            break;
                        case 'X':
                            double base = currentValue;
                            double exponent = Double.parseDouble(textField.getText());
                            if (base < 0 && exponent % 1 != 0) { /** Base cant be negative and exponent doesn't have a decimal using modulo */
                                textField.setText("ERROR");
                                return;
                            } else {
                                total = Math.pow(base, exponent);
                            }
                            break;
                        default:
                            total = currentValue;
                            break;
                    }
                    textField.setText((formatter.format(total)));
                }

            }
        });
        /** Clear Button - Clearing the text Field */
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total = 0;
                textField.setText("");
            }
        });
        /** Digit button - Adding a decimal place to the number */
        digitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField.getText().equals("")){
                    textField.setText("0."); /** Places the "0." infront of a decimal without a whole number */
                } else if(textField.getText().contains(".")) {
                    digitBtn.setEnabled(false); /** False if there's going to be more than one decimal */
                } else {
                    String digitBtnText = textField.getText() + digitBtn.getText(); /** Sets the decimal point */
                    textField.setText(digitBtnText);
                }
                digitBtn.setEnabled(true);
            }
        });
        /** Adds current value to memory */
        mAddBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().isEmpty()) {
                    memory += Double.parseDouble(textField.getText());
                    textField.setText(formatter.format(memory));
                }
            }
        });
        /** Subtracts current value from memory */
        mSubBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().isEmpty()) {
                    memory -= Double.parseDouble(textField.getText());
                    textField.setText(formatter.format(memory));
                }
            }
        });
        /** Displays the current memory */
        mRecallBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(formatter.format(memory));
            }
        });
        /** Clears the memory */
        mClearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memory = 0;
                textField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        /** Sets the Calculator GUI */
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

