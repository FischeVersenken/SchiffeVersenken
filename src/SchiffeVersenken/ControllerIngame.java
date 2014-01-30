package SchiffeVersenken;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerIngame implements ActionListener {

    private ViewLogin viewLogin;
    private Model model;

    public ControllerIngame(ViewLogin viewLogin, Model model) {
        this.viewLogin = viewLogin;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

}
