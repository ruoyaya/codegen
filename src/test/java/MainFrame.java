import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
@Lazy
public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {

        System.out.println("init MainFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new BasicDnD();
        newContentPane.setOpaque(true); //content panes must be opaque
        this.setContentPane(newContentPane);

    }
}
