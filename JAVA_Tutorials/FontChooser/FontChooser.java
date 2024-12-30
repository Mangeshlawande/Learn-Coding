package FontChooser;

import javax.swing.*;
import java.awt.*;

public class FontChooser extends JDialog {
    private Font font;
    private JFontChooser fontChooser;

    public FontChooser(Font initialFont) {
        this.font = initialFont;
        fontChooser = new JFontChooser();
        fontChooser.setSelectedFont(initialFont);
        add(fontChooser, BorderLayout.CENTER);
        JButton okButton = new JButton("OK");
        okButton.addActionListener(e -> {
            font = fontChooser.getSelectedFont();
            dispose();
        });
        add(okButton, BorderLayout.SOUTH);
        pack();
        setModal(true);
    }

    public Font getSelectedFont() {
        return font;
    }
}

// Dummy JFontChooser class for demonstration
class JFontChooser extends JPanel {
    private Font selectedFont;

    public void setSelectedFont(Font font) {
        this.selectedFont = font;
    }

    public Font getSelectedFont() {
        return selectedFont;
    }
}
