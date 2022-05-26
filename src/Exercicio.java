import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Exercicio extends JFrame {
    private JSlider slInicio;
    private JSlider slFim;
    private JSlider slPasso;
    private JButton contarButton;
    private JList lstCont;
    private JLabel lblInicio;
    private JLabel lblFim;
    private JLabel lblPasso;
    private JPanel mainPanel;



    public static void main(String[] args) {
        JFrame frame = new Exercicio();
        frame.setVisible(true);

    }

    public Exercicio() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        contarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = slInicio.getValue();
                int f = slFim.getValue();
                int p = slPasso.getValue();
                DefaultListModel lista =new DefaultListModel();


                for (int c =i; c<= f; c+=p) {
                    lista.addElement(c);


                }
                lstCont.setModel(lista);
            }
        });
        slInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int i = slInicio.getValue();
                lblInicio.setText(Integer.toString(i));
            }
        });
        slFim.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int f = slFim.getValue();
                lblFim.setText(Integer.toString(f));
            }
        });
        slPasso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int p = slPasso.getValue();
                lblPasso.setText(Integer.toString(p));
            }
        });

    }
}

