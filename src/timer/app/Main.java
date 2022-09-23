package timer.app;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        TimerJFrame frame = new TimerJFrame();
        frame.setLocationRelativeTo(null);

        int choose = JOptionPane.showOptionDialog(null, "Sure?", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"YES", "NO"}, null);

        if (choose == 0) {

            frame.setVisible(true);

        } else {
            System.exit(0);
        }

    }

}
