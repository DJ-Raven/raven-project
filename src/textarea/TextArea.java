package textarea;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.jdesktop.animation.timing.Animator;

public class TextArea extends JTextArea {

    private TextAreaScroll scroll;

    public TextArea() {
        setWrapStyleWord(true);
        setLineWrap(true);
        setBorder(new EmptyBorder(0, 0, 0, 0));
        setSelectionColor(new Color(76, 204, 255));
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                getScroll().setAnimateHinText(getText().equals(""));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                getScroll().setAnimateHinText(getText().equals(""));
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                getScroll().setMouseOver(true);
            }

            @Override
            public void mouseExited(MouseEvent me) {

                getScroll().setMouseOver(false);
            }
        });
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent fe) {
                showing(false);
            }

            @Override
            public void focusLost(FocusEvent fe) {
                showing(true);
            }
        });

    }

    private void showing(boolean action) {
        TextAreaScroll s = getScroll();
        Animator animator = s.getAnimator();
        float location = s.getAnimateLocation();
        if (animator.isRunning()) {
            animator.stop();
        } else {
            location = 1;
        }
        animator.setStartFraction(1f - location);
        s.setShow(action);
        location = 1f - location;
        s.setAnimateLocation(location);
        animator.start();
    }

    @Override
    public void setText(String string) {
        if (!getText().equals(string)) {
            showing(string.equals(""));
        }
        super.setText(string);
    }

    private TextAreaScroll getScroll() {
        if (scroll == null) {
            Component com = getParent();
            JViewport view = (JViewport) com;
            scroll = (TextAreaScroll) view.getParent();
        }
        return scroll;
    }
}
