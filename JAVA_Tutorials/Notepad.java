import java.io.*;  
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*; 
import FontChooser.*; 
import FindDialog.*;
import MyFileFilter.*;
import LookAndFeelMenu.*;

public class Notepad extends JFrame implements ActionListener{
    JTextArea ta;
    JLabel statusBar;
    String fileNameContainer;

    FontChooser fontDialog = null;
    FindDialog findReplaceDialog = null;

    public Notepad() {
        ta = new JTextArea();
        statusBar = new JLabel("||       Ln 1, Col 1", JLabel.RIGHT);
        add(new JScrollPane(ta), BorderLayout.CENTER);
        add(statusBar, BorderLayout.SOUTH);
        ta.setFont(new Font("Courier New", Font.PLAIN, 12));
        ta.addCaretListener(e -> {
            int line = 0, column = 0;
            try {
                int caretPos = ta.getCaretPosition();
                line = ta.getLineOfOffset(caretPos);
                column = caretPos - ta.getLineStartOffset(line);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            statusBar.setText("||       Ln " + (line + 1) + ", Col " + (column + 1));
        });
        setTitle("Untitled - Notepad");
        setSize(800, 600);
        createMenuBar(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void createMenuBar(JFrame f) {
        JMenuBar mb = new JMenuBar();
        JMenuItem temp;

        JMenu fileMenu = createMenu("File", KeyEvent.VK_F, mb);
        JMenu editMenu = createMenu("Edit", KeyEvent.VK_E, mb);
        JMenu formatMenu = createMenu("Format", KeyEvent.VK_O, mb);
        JMenu viewMenu = createMenu("View", KeyEvent.VK_V, mb);
        JMenu helpMenu = createMenu("Help", KeyEvent.VK_H, mb);

        createMenuItem("New", KeyEvent.VK_N, fileMenu, KeyEvent.VK_N, this);
        createMenuItem("Open", KeyEvent.VK_O, fileMenu, KeyEvent.VK_O, this);
        createMenuItem("Save", KeyEvent.VK_S, fileMenu, KeyEvent.VK_S, this);
        createMenuItem("Save As", KeyEvent.VK_A, fileMenu, this);
        fileMenu.addSeparator();
        temp = createMenuItem("Page Setup", KeyEvent.VK_U, fileMenu, this);
        temp.setEnabled(false);
        createMenuItem("Print", KeyEvent.VK_P, fileMenu, KeyEvent.VK_P, this);
        fileMenu.addSeparator();
        createMenuItem("Exit", KeyEvent.VK_X, fileMenu, this);

        temp = createMenuItem("Undo", KeyEvent.VK_U, editMenu, KeyEvent.VK_Z, this);
        temp.setEnabled(false);
        editMenu.addSeparator();
        createMenuItem("Cut", KeyEvent.VK_T, editMenu, KeyEvent.VK_X, this);
        createMenuItem("Copy", KeyEvent.VK_C, editMenu, KeyEvent.VK_C, this);
        createMenuItem("Paste", KeyEvent.VK_P, editMenu, KeyEvent.VK_P, this);
        createMenuItem("Find", KeyEvent.VK_F, editMenu, KeyEvent.VK_F, this);
        createMenuItem("Replace", KeyEvent.VK_R, editMenu, KeyEvent.VK_R, this);

        createMenuItem("Font", KeyEvent.VK_F, formatMenu, this);

        LookAndFeelMenu.createLookAndFeelMenuItem(viewMenu, this);

        createMenuItem("About Notepad", KeyEvent.VK_A, helpMenu, this);

        f.setJMenuBar(mb);
    }

    JMenu createMenu(String s, int key, JMenuBar toMenuBar) {
        JMenu m = new JMenu(s);
        m.setMnemonic(key);
        toMenuBar.add(m);
        return m;
    }

    JMenuItem createMenuItem(String s, int key, JMenu toMenu, ActionListener al) {
        JMenuItem m = new JMenuItem(s, key);
        m.addActionListener(al);
        toMenu.add(m);
        return m;
    }

    JMenuItem createMenuItem(String s, int key, JMenu toMenu, int aclKey, ActionListener al) {
        JMenuItem m = new JMenuItem(s, key);
        m.setAccelerator(KeyStroke.getKeyStroke(aclKey, ActionEvent.CTRL_MASK));
        m.addActionListener(al);
        toMenu.add(m);
        return m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmdText = e.getActionCommand();
        switch (cmdText) {
            case "New":
                ta.setText("");
                setTitle("Untitled - Notepad");
                break;
            case "Open":
                FileDialog fd = new FileDialog(this, "Open File", FileDialog.LOAD);
                fd.setVisible(true);
                if (fd.getFile() != null) {
                    fileNameContainer = fd.getDirectory() + fd.getFile();
                    readFile();
                    setTitle(fd.getFile() + " - Notepad");
                }
                break;
            case "Save":
                if (fileNameContainer == null) {
                    FileDialog saveDialog = new FileDialog(this, "Save File", FileDialog.SAVE);
                    saveDialog.setVisible(true);
                    if (saveDialog.getFile() != null) {
                        fileNameContainer = saveDialog.getDirectory() + saveDialog.getFile();
                        saveFile();
                        setTitle(saveDialog.getFile() + " - Notepad");
                    }
                } else {
                    saveFile();
                }
                break;
            case "Save As":
                FileDialog saveAsDialog = new FileDialog(this, "Save As File", FileDialog.SAVE);
                saveAsDialog.setVisible(true);
                if (saveAsDialog.getFile() != null) {
                    fileNameContainer = saveAsDialog.getDirectory() + saveAsDialog.getFile();
                    saveFile();
                    setTitle(saveAsDialog.getFile() + " - Notepad");
                }
                break;
            case "Print":
                try {
                    ta.print();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
            case "Exit":
                System.exit(0);
                break;
            case "Cut":
                ta.cut();
                break;
            case "Copy":
                ta.copy();
                break;
            case "Paste":
                ta.paste();
                break;
            case "Find":
                if (findReplaceDialog == null) {
                    findReplaceDialog = new FindDialog(ta);
                }
                findReplaceDialog.setVisible(true);
                break;
            case "Replace":
                if (findReplaceDialog == null) {
                    findReplaceDialog = new FindDialog(ta);
                }
                findReplaceDialog.setVisible(true);
                break;
            case "Font":
                if (fontDialog == null) {
                    fontDialog = new FontChooser(ta.getFont());
                }
                fontDialog.setVisible(true);
                ta.setFont(fontDialog.getSelectedFont());
                break;
            case "About Notepad":
                JOptionPane.showMessageDialog(this, "Notepad", "About Notepad", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileNameContainer))) {
            ta.setText("");
            String line;
            while ((line = br.readLine()) != null) {
                ta.append(line + "\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void saveFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameContainer))) {
            bw.write(ta.getText());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Notepad().setVisible(true);
    }
}
