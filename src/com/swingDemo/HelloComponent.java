package com.swingDemo;

import javax.swing.*;
import java.awt.*;

public class HelloComponent extends JComponent {

  public void paintComponent(Graphics g) {
    g.setColor(Color.blue);
    g.drawString("Hello World", 200, 75);
  }
}
