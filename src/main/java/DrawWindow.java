import javax.swing.*;
import java.awt.*;

public class DrawWindow {

    public DrawWindow() {

        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Draw");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel label = new JLabel();
        label.setText("It's a draw, Well done!");
        label.setBounds(60, 10, 500, 150);
        label.setBackground(Color.GRAY);
        label.setForeground(new Color(21, 100, 18));
        label.setFont(new Font("MV Boli", Font.ITALIC, 30));
        
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
