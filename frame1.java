package Guess;



import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class frame1 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblNewLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame1 frame = new frame1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public frame1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 546, 505);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(426, 10, 200, 30);
        contentPane.add(lblNewLabel);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
        rdbtnNewRadioButton.setBounds(302, 262, 150, 30);
        contentPane.add(rdbtnNewRadioButton);

        JButton btnNewButton = new JButton("Login");
        btnNewButton.setBounds(314, 298, 120, 30);
        contentPane.add(btnNewButton);

        // Adding action listener to the button
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open new JFrame
                openNewFrame();
            }
        });
    }

    // Method to open a new frame
    private void openNewFrame() {
        // Create a new instance of Frame2
        frame2 frame2 = new frame2();
        // Set the frame to visible
        frame2.setVisible(true);
        // Dispose the current frame
        dispose();
    }
}
