package swingproject;

//import java swing 
import javax.swing.*; 

public class Swingtoko extends JFrame{ 
    public static void main (String[] args){
        //membuat frame
        JFrame frame = new JFrame("Swing Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        //membuat panel
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel); 

        //menampilkan frame
        frame.setVisible(true);
    }

    public static void paceComponents(JPanel panel1) {
        panel1.setLayout(null);

        //Label
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel1.add(userLabel);

        //Text Field
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel1.add(userText);

        //Button (tombol)
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel1.add(loginButton);
    }
}