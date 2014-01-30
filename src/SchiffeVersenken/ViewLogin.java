package SchiffeVersenken;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ViewLogin extends JFrame{
    private Model model;
    private JLabel labelName;
    private JButton buttonLogin, buttonFarbe;
    private JTextField textFieldName;
    
    public ViewLogin (String title, Model model){
    super(title);
    this.model = model;
    init();
    }
    
    public void init(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        labelName = new JLabel ("Name:");
        textFieldName = new JTextField ("Spielername");
        buttonFarbe = new JButton("Farbe wählen");
        buttonLogin = new JButton("Login");
        //buttonFarbe.addActionListener(new ControllerIngame());
        //buttonLogin.addActionListener(new ControllerIngame());
        this.add(labelName);
        this.add(textFieldName);
        this.add(buttonFarbe);
        this.add(buttonLogin);
        this.setSize(200, 200);
        this.setVisible(true);
    }
}
