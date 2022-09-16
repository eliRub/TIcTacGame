import com.sun.tools.javac.Main;
import org.checkerframework.checker.units.qual.C;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MainWindow {

    JFrame frame;
    JPanel panel;
    JLabel title;
    JButton[] buttons;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    public MainWindow() {

        frame = new JFrame("TicTac game.");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.BLACK);

        title = new JLabel("Tic-Tac-Toe");
        title.setFont(new Font("MV Buli", Font.ITALIC, 40));
        title.setForeground(new Color(23, 174, 12));
        title.setBackground(Color.BLACK);
        title.setHorizontalAlignment(JLabel.CENTER);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 0, 0));

        Set<Integer> set = new HashSet<>();
        set.add(1);set.add(2);set.add(3);set.add(4);set.add(5);set.add(6);set.add(7);set.add(8);set.add(9);

        String[] icons = {"O", "X"};
        Color[] iconColor = new Color[]{Color.blue, Color.red};

        button1 = new JButton("");
        button1.addActionListener(e -> {
            if (!button1.getText().equals("")) return;
            button1.setFocusable(false);
            button1.setForeground(iconColor[set.size()%2]);
            button1.setFont(new Font("MV Buli", Font.ITALIC, 120));
            button1.setText(icons[set.size()%2]);
            check();
            set.remove(1);
        });
        button2 = new JButton("");
        button2.addActionListener(e -> {
            if (!button2.getText().equals("")) return;
            button2.setFocusable(false);
            button2.setForeground(iconColor[set.size()%2]);
            button2.setFont(new Font("MV Buli", Font.ITALIC, 120));
            button2.setText(icons[set.size()%2]);
            check();
            set.remove(2);
        });
        button3 = new JButton("");
        button3.addActionListener(e -> {
            if (!button3.getText().equals("")) return;
            button3.setFocusable(false);
            button3.setForeground(iconColor[set.size()%2]);
            button3.setFont(new Font("MV Buli", Font.ITALIC, 120));
            button3.setText(icons[set.size()%2]);
            check();
            set.remove(3);
        });
        button4 = new JButton("");
        button4.addActionListener(e -> {
            if (!button4.getText().equals("")) return;
            button4.setFocusable(false);
            button4.setForeground(iconColor[set.size()%2]);
            button4.setFont(new Font("MV Buli", Font.ITALIC, 120));
            button4.setText(icons[set.size()%2]);
            check();
            set.remove(4);
        });
        button5 = new JButton("");
        button5.addActionListener(e -> {
            if (!button5.getText().equals("")) return;
            button5.setFocusable(false);
            button5.setForeground(iconColor[set.size()%2]);
            button5.setFont(new Font("MV Buli", Font.ITALIC, 120));
            button5.setText(icons[set.size()%2]);
            check();
            set.remove(5);
        });
        button6 = new JButton("");
        button6.addActionListener(e -> {
            if (!button6.getText().equals("")) return;
            button6.setFocusable(false);
            button6.setForeground(iconColor[set.size()%2]);
            button6.setFont(new Font("MV Buli", Font.ITALIC, 120));
            button6.setText(icons[set.size()%2]);
            check();
            set.remove(6);
        });
        button7 = new JButton("");
        button7.addActionListener(e -> {
            if (!button7.getText().equals("")) return;
            button7.setFocusable(false);
            button7.setForeground(iconColor[set.size()%2]);
            button7.setFont(new Font("MV Buli", Font.ITALIC, 120));
            button7.setText(icons[set.size()%2]);
            check();
            set.remove(7);
        });
        button8 = new JButton("");
        button8.addActionListener(e -> {
            if (!button8.getText().equals("")) return;
            button8.setFocusable(false);
            button8.setForeground(iconColor[set.size()%2]);
            button8.setFont(new Font("MV Buli", Font.ITALIC, 120));
            button8.setText(icons[set.size()%2]);
            check();
            set.remove(8);
        });
        button9 = new JButton("");
        button9.addActionListener(e -> {
            if (!button9.getText().equals("")) return;
            button9.setFocusable(false);
            button9.setForeground(iconColor[set.size()%2]);
            button9.setFont(new Font("MV Buli", Font.ITALIC, 120));
            button9.setText(icons[set.size()%2]);
            check();
            set.remove(9);
        });

        buttons = new JButton[]{button1, button2, button3, button4, button5, button6, button7, button8, button9};
        for (JButton b: buttons) {
            panel.add(b);
        }

        frame.add(title, BorderLayout.NORTH);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void check() {
        if(button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText()) && !button1.getText().equals("")) {
            new WinnerWindow(button1.getText());
            frame.dispose();
        } else if (button1.getText().equals(button4.getText()) && button1.getText().equals(button7.getText()) && !button1.getText().equals("")) {
            new WinnerWindow(button1.getText());
            frame.dispose();
        } else if (button3.getText().equals(button6.getText()) && button3.getText().equals(button9.getText()) && !button3.getText().equals("")) {
            new WinnerWindow(button3.getText());
            frame.dispose();
        } else if (button9.getText().equals(button8.getText()) && button9.getText().equals(button7.getText()) && !button9.getText().equals("")) {
            new WinnerWindow(button9.getText());
            frame.dispose();
        } else if (button1.getText().equals(button5.getText()) && button1.getText().equals(button9.getText()) && !button1.getText().equals("")) {
            new WinnerWindow(button1.getText());
            frame.dispose();
        } else if (button3.getText().equals(button5.getText()) && button3.getText().equals(button7.getText()) && !button3.getText().equals("")) {
            new WinnerWindow(button3.getText());
            frame.dispose();
        } else if (button2.getText().equals(button5.getText()) && button2.getText().equals(button8.getText()) && !button2.getText().equals("")) {
            new WinnerWindow(button2.getText());
            frame.dispose();
        } else if (button4.getText().equals(button5.getText()) && button4.getText().equals(button6.getText()) && !button4.getText().equals("")) {
            new WinnerWindow(button4.getText());
            frame.dispose();
        } else if (!button1.getText().equals("") && !button2.getText().equals("") &&!button3.getText().equals("") &&
                   !button4.getText().equals("") &&!button5.getText().equals("") &&!button6.getText().equals("") &&
                   !button7.getText().equals("") &&!button8.getText().equals("") &&!button9.getText().equals("")) {
            new DrawWindow();
            frame.dispose();
        }
    }

//    public void check() {
//        // check x wins condition.
//        if (Objects.equals(buttons[0].getText(), "X") &&
//                Objects.equals(buttons[1].getText(), "X") &&
//                Objects.equals(buttons[2].getText(), "X")) {
//
//        } else if (Objects.equals(buttons[0].getText(), "X") &&
//                Objects.equals(buttons[1].getText(), "X") &&
//                Objects.equals(buttons[2].getText(), "X")) {
//
//        }
//    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
