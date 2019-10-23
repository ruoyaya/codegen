package com.yikeo.codegen;

import com.bulenkov.darcula.DarculaLaf;
import com.yikeo.codegen.ui.CodeGenMainFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

//@SpringBootApplication
public class CodeGenApplication {

    public static void main222(String[] args) {
        try {

            if (System.getProperty("os.name").contains("Mac")) {
                System.setProperty("apple.laf.useScreenMenuBar", "true");
                System.setProperty("com.apple.mrj.application.apple.menu.about.name","CodeGen");
                System.setProperty("com.apple.macos.smallTabs", "true");
            }

            UIManager.setLookAndFeel(new DarculaLaf());


        } catch (Exception e) {
            e.printStackTrace();
        }

        ApplicationContext ctx = SpringApplication.run(CodeGenApplication.class, args);

        SwingUtilities.invokeLater(() -> {
            CodeGenMainFrame mainFrame = ctx.getBean(CodeGenMainFrame.class);
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setVisible(true);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {

                String osName = System.getProperty("os.name").toLowerCase();
                boolean is_mac = osName.startsWith("mac os x");
                if (is_mac) {
                    System.setProperty("apple.laf.useScreenMenuBar", "true");
                    System.setProperty("com.apple.mrj.application.apple.menu.about.name", "WikiTeX");
                    System.setProperty("com.apple.macos.smallTabs", "true");
                }
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

//                UIManager.setLookAndFeel(new DarculaLaf());


            } catch (Exception e) {
                e.printStackTrace();
            }

            CodeGenMainFrame mainFrame = new CodeGenMainFrame();
            mainFrame.pack();
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setVisible(true);
        });
    }
}
