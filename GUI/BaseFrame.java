

import javax.swing.*;

public abstract class BASEFRAME extends JFrame{

    protected User user;

    public BASEFRAME(String title)
    {
        initialize(title);
    }
    public BASEFRAME(String title, User user)
    {
        this.user=user;

        initialize(title);
    }

    private void initialize(String title)
    {
        setTitle(title);
        setSize(420, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        addGuiComponents();
    }

    protected abstract void addGuiComponents();
}