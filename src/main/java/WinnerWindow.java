import javax.swing.*;
import java.awt.*;

public class WinnerWindow {

    public WinnerWindow(String X_or_O) {

        JFrame frame = new JFrame("WINNER!");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

//        JOptionPane.showMessageDialog(null, "You are a winner!");
        JLabel label = new JLabel();
        label.setText(X_or_O+"- Won!!!");
        label.setBounds(100, 10, 360, 150);
        label.setBackground(Color.GRAY);
        label.setForeground(new Color(21, 100, 18));
        label.setFont(new Font("MV Boli", Font.ITALIC, 50));

        JButton button = new JButton();
        button.setText("Play again:");
        button.setBounds(145, 170, 200, 40);
        button.setFocusable(false);

        button.addActionListener(e -> {
            frame.dispose();
            new MainWindow();
        });


        frame.add(label);
        frame.add(button);

        frame.setVisible(true);
    }
}
