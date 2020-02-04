package com.swingDemo;

import javax.swing.*;
import java.awt.*;


public class SimpleFrame extends JFrame {
  public SimpleFrame() {
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    int sWidth = screenSize.width;
    int sHeight = screenSize.height;
    setSize(sWidth / 2, sHeight / 2);

    add(new HelloComponent());
    setTitle("SimpleFrame Demo");
    setVisible(true);
  }
}
