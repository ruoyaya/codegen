package com.yikeo.codegen.ui;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

@Lazy
@Component
public class CodeGenMainFrame extends JFrame {

//    public static boolean MAC_OS_X = (System.getProperty("os.name").toLowerCase().startsWith("mac os x"));
//    protected JDialog aboutBox, prefs;
//    protected JComboBox colorComboBox;

    public CodeGenMainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMenus();

//        // set up a simple about box
//        aboutBox = new JDialog(this, "About OSXAdapter");
//        aboutBox.getContentPane().setLayout(new BorderLayout());
//        aboutBox.getContentPane().add(new JLabel("OSXAdapter", JLabel.CENTER));
//        aboutBox.getContentPane().add(new JLabel("\u00A92003-2007 Apple, Inc.", JLabel.CENTER), BorderLayout.SOUTH);
//        aboutBox.setSize(160, 120);
//        aboutBox.setResizable(false);
//
//
//
//        prefs = new JDialog(this, "OSXAdapter Preferences");
//
//
//        JPanel masterPanel = new JPanel();
//        masterPanel.setBorder(new TitledBorder("Window background color:"));
//        prefs.getContentPane().add(masterPanel);
//        prefs.setSize(240, 100);
//        prefs.setResizable(false);

        //Create and set up the content pane.
        JComponent newContentPane = new JLabel("32323232323");
        newContentPane.setOpaque(true); //content panes must be opaque
        this.setContentPane(newContentPane);

//        registerForMacOSXEvents();

        Desktop desktop = Desktop.getDesktop();
        //com/apple/eawt/AboutHandler
        //com/apple/eawt/PreferencesHandler
        //com/apple/eawt/QuitHandler
    }

    private void addMenus() {
        JMenuBar jmb;	//定义菜单栏
        JMenu jm1,jm2,jm3,jm4,jm5;	//定义菜单
        JMenu jm6,jm7,jm8,jm9;		//定义菜单中的菜单
        JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5;		//定义子菜单

        //创建组件
        jmb=new JMenuBar();		//创建菜单栏
        jm1=new JMenu("文件");	//创建菜单
        jm2=new JMenu("编辑");
        jm3=new JMenu("资源");
        jm4=new JMenu("窗口");
        jm5=new JMenu("帮助");
        jm6=new JMenu("新建");
        jm7=new JMenu("打开");
        jm8=new JMenu("保存");
        jm9=new JMenu("导入");
        jmi1=new JMenuItem("文档");	//创建子菜单
        jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        jmi2=new JMenuItem("工程");
        jmi3=new JMenuItem("包");
        jmi4=new JMenuItem("类");
        jmi5=new JMenuItem("接口");

        //设置布局管理器

        //添加组件
        jm6.add(jmi1);	//把子菜单添加到菜单中
        jm6.add(jmi2);
        jm6.add(jmi3);
        jm6.add(jmi4);
        jm6.add(jmi5);

        jm1.add(jm6);	//把菜单添加到菜单中
        jm1.add(jm7);
        jm1.add(jm8);
        jm1.add(jm9);

        jmb.add(jm1);	//把菜单添加到菜单栏中
        jmb.add(jm2);
        jmb.add(jm3);
        jmb.add(jm4);
        jmb.add(jm5);

        this.setJMenuBar(jmb);
    }

//    public boolean quit() {
//        int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?", "Quit?", JOptionPane.YES_NO_OPTION);
//        return (option == JOptionPane.YES_OPTION);
//    }
//
//    public void about() {
//        aboutBox.setLocation((int)this.getLocation().getX() + 22, (int)this.getLocation().getY() + 22);
//        aboutBox.setVisible(true);
//    }
//
//    public void preferences() {
//        prefs.setLocation((int)this.getLocation().getX() + 22, (int)this.getLocation().getY() + 22);
//        prefs.setVisible(true);
//    }
//
//    public void registerForMacOSXEvents() {
//        if (MAC_OS_X) {
//            try {
//                // Generate and register the OSXAdapter, passing it a hash of all the methods we wish to
//                // use as delegates for various com.apple.eawt.ApplicationListener methods
//                OSXAdapter.setQuitHandler(this, getClass().getDeclaredMethod("quit", (Class[])null));
//                OSXAdapter.setAboutHandler(this, getClass().getDeclaredMethod("about", (Class[])null));
//                OSXAdapter.setPreferencesHandler(this, getClass().getDeclaredMethod("preferences", (Class[])null));
//            } catch (Exception e) {
//                System.err.println("Error while loading the OSXAdapter:");
//                e.printStackTrace();
//            }
//        }
//    }


}
