import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args){
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());

        // panel utama
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel judul = new JPanel();
        JLabel judulText = new JLabel("LOGIN");
        judul.add(judulText);

        // panel untuk form yg berisi inputan user
        JPanel input = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel email = new JLabel("Email: ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        input.add(email, gbc);
        JTextField fieldEmail = new JTextField(12);
        gbc.gridx = 1;
        input.add(fieldEmail, gbc);

        JLabel password = new JLabel("Password: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        input.add(password, gbc);
        JPasswordField fieldPassword = new JPasswordField(12);
        gbc.gridx = 1;
        input.add(fieldPassword, gbc);

        // panel tombol login
        JPanel login = new JPanel();
        JButton loginButton = new JButton("Login");
        login.add(loginButton);

        // panel tombol sign up jika belum punya akun
        JPanel signup = new JPanel();
        JLabel signupText = new JLabel("I don't have an account ");
        JButton signupButton = new JButton("Sign Up");
        signup.add(signupText);
        signup.add(signupButton);

        signupButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                Signup.main(null);
            }});
        
        mainPanel.add(judul);
        mainPanel.add(input);
        mainPanel.add(login);
        mainPanel.add(signup);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
