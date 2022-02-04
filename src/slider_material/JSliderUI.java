package slider_material;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JWindow;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicSliderUI;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class JSliderUI extends BasicSliderUI {

    private final JWindow window = new JWindow();
    private final Animator animator;
    private boolean show;

    public JSliderUI(JSlider slider) {
        super(slider);
        PanelSlider panel = new PanelSlider(slider);
        window.add(panel);
        window.setSize(new Dimension(30, 40));
        window.setBackground(new Color(0, 0, 0, 0));
        window.setOpacity(0f);
        slider.setOpaque(false);
        slider.setBackground(new Color(22, 134, 232));
        slider.setForeground(new Color(22, 134, 232));
        slider.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    show = true;
                    window.setLocation(getLocation(slider));
                    window.setVisible(true);
                    stopAnimation();
                    animator.start();
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    show = false;
                    stopAnimation();
                    animator.start();
                }
            }
        });
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                panel.setValues(slider.getValue());
                window.setLocation(getLocation(slider));
            }
        });
        animator = new Animator(200, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    window.setOpacity(fraction);
                } else {
                    window.setOpacity(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (!show) {
                    window.setVisible(false);
                }
            }
        });
        animator.setResolution(0);
    }

    private Point getLocation(JSlider slider) {
        Point p = slider.getLocationOnScreen();
        int x = (30 - thumbRect.width) / 2;
        return new Point(p.x + thumbRect.x - x, p.y - 40);
    }

    private void stopAnimation() {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
    }

    @Override
    public void paintFocus(Graphics grphcs) {

    }

    @Override
    protected Dimension getThumbSize() {
        return new Dimension(15, 15);
    }

    @Override
    public void paintThumb(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(slider.getForeground());
        g2.fillOval(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height);
        g2.dispose();
    }

    @Override
    public void paintTrack(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(slider.getBackground());
        if (slider.getOrientation() == JSlider.VERTICAL) {
            g2.fillRoundRect(slider.getWidth() / 2 - 2, 2, 4, slider.getHeight(), 5, 5);
        } else {
            g2.fillRoundRect(2, slider.getHeight() / 2 - 2, slider.getWidth() - 5, 4, 5, 5);
        }
        g2.dispose();
    }

    private class PanelSlider extends JComponent {

        private JLabel label;
        private JSlider slider;

        public PanelSlider(JSlider slider) {
            this.slider = slider;
            setLayout(new BorderLayout());
            label = new JLabel("0");
            label.setForeground(Color.WHITE);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setBorder(new EmptyBorder(0, 0, 10, 0));
            add(label, BorderLayout.CENTER);
        }

        public void setValues(int values) {
            label.setText(values + "");
        }

        @Override
        protected void paintComponent(Graphics grphcs) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int width = getWidth();
            int height = getHeight();
            Area area = new Area(new Ellipse2D.Double(0, 0, width, 31));
            Path2D p = new Path2D.Double();
            p.moveTo(1, 22);
            p.lineTo(width / 2, height);
            p.lineTo(width - 1, 22);
            area.add(new Area(p));
            g2.setColor(slider.getForeground());
            g2.fill(area);
            g2.dispose();
            super.paintComponent(grphcs);
        }
    }
}
