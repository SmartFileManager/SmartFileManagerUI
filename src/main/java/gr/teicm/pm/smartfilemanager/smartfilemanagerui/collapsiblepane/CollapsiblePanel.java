/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.smartfilemanagerui.collapsiblepane;

/**
 *
 * @author user
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author rgd
 */
public class CollapsiblePanel extends JPanel {

    String title = "tTitle";
    TitledBorder border;
    Dimension dimension;

    public CollapsiblePanel() {
        Border empty = BorderFactory.createEmptyBorder();
        border = BorderFactory.createTitledBorder(empty, "empty");
        // border = BorderFactory.createTitledBorder(title);
        setBorder(border);
        BorderLayout borderLayout = new BorderLayout();
        setLayout(borderLayout);
        addMouseListener(mouseListener);
        dimension = getSize();
    }

    public void collapse() {
        Dimension dimension = new Dimension(this.dimension.getSize());
        dimension.height = 33;
        setSize(dimension);
        repaint();
    }

    public void expand() {
        setSize(this.dimension);
        repaint();
    }
    MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            toggleVisibility();
        }
    };

    ComponentListener contentComponentListener = new ComponentAdapter() {
        @Override
        public void componentShown(ComponentEvent e) {
            updateBorderTitle();
            expand();
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            updateBorderTitle();
            collapse();
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        firePropertyChange("ttitle", this.title, this.title = title);
    }

    @Override
    public Component add(Component comp) {
        comp.addComponentListener(contentComponentListener);
        Component r = super.add(comp);
        updateBorderTitle();
        return r;
    }

    @Override
    public Component add(String name, Component comp) {
        comp.addComponentListener(contentComponentListener);
        Component r = super.add(name, comp);
        updateBorderTitle();
        return r;
    }

    @Override
    public Component add(Component comp, int index) {
        comp.addComponentListener(contentComponentListener);
        Component r = super.add(comp, index);
        updateBorderTitle();
        return r;
    }

    @Override
    public void add(Component comp, Object constraints) {
        comp.addComponentListener(contentComponentListener);
        super.add(comp, constraints);
        updateBorderTitle();
    }

    @Override
    public void add(Component comp, Object constraints, int index) {
        comp.addComponentListener(contentComponentListener);
        super.add(comp, constraints, index);
        updateBorderTitle();
    }

    @Override
    public void remove(int index) {
        Component comp = getComponent(index);
        comp.removeComponentListener(contentComponentListener);
        super.remove(index);
    }

    @Override
    public void remove(Component comp) {
        comp.removeComponentListener(contentComponentListener);
        super.remove(comp);
    }

    @Override
    public void removeAll() {
        for (Component c : getComponents()) {
            c.removeComponentListener(contentComponentListener);
        }
        super.removeAll();
    }

    protected void toggleVisibility() {
        toggleVisibility(hasInvisibleComponent());
    }

    protected void toggleVisibility(boolean visible) {
        for (Component c : getComponents()) {
            c.setVisible(visible);
        }
        updateBorderTitle();
    }

    protected void updateBorderTitle() {
        String arrow = "";
        if (getComponentCount() > 0) {
            arrow = (hasInvisibleComponent() ? "▽" : "△");
        }
        border.setTitle(arrow + " " + title);
        repaint();
    }

    protected final boolean hasInvisibleComponent() {
        for (Component c : getComponents()) {
            if (!c.isVisible()) {
                return true;
            }
        }
        return false;
    }

}
