package text_image;

import java.awt.AlphaComposite;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TextImage extends JLabel {

    public Icon getTextImage() {
        return textImage;
    }

    public void setTextImage(Icon textImage) {
        this.textImage = textImage;
    }

    private Icon textImage;

    @Override
    protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getHeight();
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2.setFont(getFont());
        FontMetrics ft = g2.getFontMetrics();
        Rectangle2D r2 = ft.getStringBounds(getText(), g2);
        double x = (width - r2.getWidth()) / 2;
        double y = (height - r2.getHeight()) / 2;
        g2.setColor(getForeground());
        g2.drawString(getText(), (int) x, (int) (y + ft.getAscent()));
        if (textImage != null) {
            g2.setComposite(AlphaComposite.SrcIn);
            g2.drawImage(((ImageIcon) textImage).getImage(), 0, 0, width, height, null);
        }
        grphcs.drawImage(img, 0, 0, null);
    }
}
