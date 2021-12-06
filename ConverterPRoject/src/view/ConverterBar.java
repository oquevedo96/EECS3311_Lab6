package view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ConverterBar extends JMenuBar {
    public ConverterBar(ActionListener menubarListener){
        super();
        JMenu menu = new JMenu("Update model");
        menu.add(createMenuItem("Save input centimeter","SAVE", KeyEvent.ALT_DOWN_MASK | KeyEvent.VK_F,menubarListener));
        super.add(menu);
    }
    private JMenuItem createMenuItem(String text, String actionCommand, int accelerator, ActionListener listener) {
        JMenuItem menuItem = new JMenuItem(text);
        menuItem.setActionCommand(actionCommand);
        menuItem.addActionListener(listener);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(accelerator, 0));
        return menuItem;
    }
}
