import javax.swing.*;
import java.awt.*;

public class KitchenPanel extends JFrame {
    JPanel orderPanel = new JPanel();
    JScrollPane ordersList;


    public KitchenPanel(){
        setTitle("J's Restaurant");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 500);
        getContentPane().setBackground(new Color(242, 251, 255));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        ordersList = new JScrollPane();
        ordersList.setLayout(new JScrollPane().getLayout());
        add(ordersList);

        orderPanel.setBounds(50,50,300,300);
        orderPanel.setBorder(BorderFactory.createTitledBorder("Order 1"));


        setVisible(true);
    }

    public static void main(String[] args) {
        new KitchenPanel();
    }
}
