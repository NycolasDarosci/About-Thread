package threads1;

import javax.swing.*;
import java.math.BigInteger;

public class Calculate implements Runnable {

        private JTextField first;
        private JTextField second;
        private JLabel result;

        public Calculate(JTextField first, JTextField second, JLabel result) {
            this.first = first;
            this.second = second;
            this.result = result;
        }

        @Override
        public void run() {

            long value1 = Long.parseLong(first.getText());
            long value2 = Long.parseLong(second.getText());
            BigInteger calculation = new BigInteger("0");

            for (int i = 0; i < value1; i++) {
                for (int j = 0; j < value2; j++) {
                    calculation = calculation.add(new BigInteger("1"));
                }
            }

            result.setText(calculation.toString());
        }
}
