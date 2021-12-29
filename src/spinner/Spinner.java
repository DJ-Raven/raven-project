package spinner;

import javax.swing.JSpinner;

public class Spinner extends JSpinner {

    public void setLabelText(String text) {
        SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
        editor.setLabelText(text);
    }

    public String getLabelText() {
        SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
        return editor.getLabelText();
    }

    public Spinner() {
        setOpaque(false);
        setUI(new SpinnerUI());
    }
}
