package FindDialog;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindDialog extends JDialog implements ActionListener {
    private JTextArea textArea;
    private JTextField findField, replaceField;
    private JButton findButton, replaceButton, replaceAllButton, cancelButton;

    public FindDialog(JTextArea ta) {
        this.textArea = ta;
        setTitle("Find and Replace");
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Find:"));
        findField = new JTextField();
        add(findField);

        add(new JLabel("Replace with:"));
        replaceField = new JTextField();
        add(replaceField);

        findButton = new JButton("Find");
        findButton.addActionListener(this);
        add(findButton);

        replaceButton = new JButton("Replace");
        replaceButton.addActionListener(this);
        add(replaceButton);

        replaceAllButton = new JButton("Replace All");
        replaceAllButton.addActionListener(this);
        add(replaceAllButton);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        add(cancelButton);

        pack();
        setModal(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Add the functionality here
    }
}
