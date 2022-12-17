import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloWorld extends JFrame
{
    public HelloWorld(String titleText)
    {
        super(titleText);
        addWindowListener(new WindowAdapter() {
            public void
            windowClosing(WindowEvent e)
            {
                HelloWorld.this.dispose();
                System.exit(0);
            }
        });
        JLabel greeting = new JLabel("SUIIII",JLabel.CENTER);
        getContentPane().add(greeting,BorderLayout.CENTER);
        setSize(300,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorld("Hello World! Sample");
    }
}


