package me.interfacegrafica;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {
  public Main() {
    Button btn = new Button("Button");
    btn.setBounds(50, 50, 50, 50);
    add(btn);
    setSize(600, 400);
    setTitle("This is my First AWT example");
    setLayout(new FlowLayout());
    setVisible(true);
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            dispose();
        }
    });
  }

  public static void main(String args[]){
    new Main();
  }
}
