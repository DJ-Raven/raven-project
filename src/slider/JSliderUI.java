package slider;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JSlider;
import javax.swing.plaf.basic.BasicSliderUI;

public class JSliderUI extends BasicSliderUI {

    public JSliderUI(JSlider slider) {
        super(slider);
    }

    @Override
    public void paintFocus(Graphics grphcs) {

    }

    @Override
    protected Dimension getThumbSize() {
        return new Dimension(14, 14);
    }

    @Override
    public void paintThumb(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(slider.getForeground());
        g2.fillOval(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height);
    }

    @Override
    public void paintTrack(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(slider.getBackground());
        if (slider.getOrientation() == JSlider.VERTICAL) {
            g2.fillRoundRect(slider.getWidth() / 2 - 2, 2, 4, slider.getHeight(), 1, 1);
        } else {
            g2.fillRoundRect(2, slider.getHeight() / 2 - 2, slider.getWidth() - 5, 4, 1, 1);
        }
    }
}
