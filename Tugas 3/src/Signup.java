import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup {
    public static void main(String[] args){
        JFrame frame = new JFrame("Sign Up");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());

        // panel utama
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel judul = new JPanel();
        JLabel judulText = new JLabel("SIGN UP");
        judul.add(judulText);

        // panel untuk form yg berisi inputan user
        JPanel input = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel nama = new JLabel("Full name: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        input.add(nama, gbc);
        JTextField fieldNama = new JTextField(12);
        gbc.gridx = 1;
        input.add(fieldNama, gbc);

        JLabel email = new JLabel("Email: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        input.add(email, gbc);
        JTextField fieldEmail = new JTextField(12);
        gbc.gridx = 1;
        input.add(fieldEmail, gbc);

        JLabel password = new JLabel("Password: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        input.add(password, gbc);
        JPasswordField fieldPassword = new JPasswordField(12);
        gbc.gridx = 1;
        input.add(fieldPassword, gbc);

        // panel tombol signup
        JPanel signup = new JPanel();
        JButton signupButton = new JButton("Sign Up");
        signup.add(signupButton);

        // panel tombol login jika udah punya akun
        JPanel login = new JPanel();
        JLabel loginText = new JLabel("I've an account ");
        JButton loginButton = new JButton("Login");
        login.add(loginText);
        login.add(loginButton);
  
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Login.main(null);
            }});

        mainPanel.add(judul);
        mainPanel.add(input);
        mainPanel.add(signup);
        mainPanel.add(login);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
