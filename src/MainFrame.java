import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Segoe print",Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;
    public void init() {
        /****************Form Panel************** */
        
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JPanel formJPanel = new JPanel();
        formJPanel.setLayout(new GridLayout(4, 1, 5, 5 ));
        formJPanel.setOpaque(false);
        formJPanel.add(lbFirstName);
        formJPanel.add(tfFirstName);
        formJPanel.add(lbLastName);
        formJPanel.add(tfLastName);

        /****************** Welcome Label ********************** */
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /*********** Button Panel ************** */
        JButton btnOK = new JButton("Ok");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello" +  firstName + " " + lastName);
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
          
        });
        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              // TODO Auto-generated method stub
              tfFirstName.setText(" ");
              tfLastName.setText("getName()");
              lbWelcome.setText("getName()");
                
             throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
                
        });

        JPanel buttonsPannel = new JPanel();
        buttonsPannel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPannel.setOpaque(false);
        buttonsPannel.add(btnOK);
        buttonsPannel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formJPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPannel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Welcome");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
     public static void main(String[] args){
        MainFrame myFrame = new MainFrame();
        myFrame.init();
    } 
}

