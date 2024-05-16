import java.awt.*;
import java.awt.event.*;

public class Ex9 extends Frame implements ActionListener, MouseListener, KeyListener {

    TextField textfield;
    Button button;
    Label label;

    public Ex9() {
        setLayout(new FlowLayout());

        textfield = new TextField(20);
        button = new Button("Click me!");
        label = new Label();

        add(textfield);
        add(button);
        add(label);

        button.addActionListener(this);
        textfield.addMouseListener(this);
        textfield.addKeyListener(this);

        setTitle("GUI Example");
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button ){
            label.setText("Button Clicked");
        }
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed: "+ e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new Ex9();        
    }
    
}
