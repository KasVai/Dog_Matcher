import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Dog implements ActionListener {

    private static JLabel title; 
    private static JLabel optionLabel; 
    private static JLabel option1Label; 
    private static JLabel option2Label; 
    private static JLabel option3Label; 

    private static JLabel sizeLabel; 
    private static JButton large; 
    private static JButton medium; 
    private static JButton small; 

    private static JLabel personalityLabel; 
    private static JButton friendly; 
    private static JButton aggressive; 

    private static JLabel shedLabel; 
    private static JButton sheds; 
    private static JButton shedless; 

    private static JButton enter; 

    private static JLabel maintenanceLabel;
    private static JButton low; 
    private static JButton high; 
    
    private static Dogfinder Dog;
    
    private enum Actions {
        large, medium, small, friendly, aggressive, sheds, low, shedless, high, enter
    }

    public static void main(String[] args) {
        Dog = new Dogfinder();

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.getContentPane().setBackground(Color.RED);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 450);

        frame.add(panel);
        panel.setLayout(null);
    
        title = new JLabel("Dog matcher");
        title.setBounds(10, 20, 80, 25);
        panel.add(title);

        sizeLabel = new JLabel("size");
        sizeLabel.setBounds(10, 50, 80, 25);
        panel.add(sizeLabel);
    
        large = new JButton("large");
        large.setBounds(50, 50, 80, 25);
        large.addActionListener(new Dog());
        panel.add(large);

        medium = new JButton("medium");
        medium.setBounds(150, 50, 80, 25);
        medium.addActionListener(new Dog());
        panel.add(medium);

        small = new JButton("small");
        small.setBounds(250, 50, 80, 25);
        small.addActionListener(new Dog());
        panel.add(small);

        optionLabel = new JLabel("choose size");
        optionLabel.setBounds(350, 50, 80, 25);
        panel.add(optionLabel);

        personalityLabel = new JLabel("personality");
        personalityLabel.setBounds(10, 100, 80, 25);
        panel.add(personalityLabel);
    
        friendly = new JButton("friendly");
        friendly.setBounds(125, 100, 80, 25);
        friendly.addActionListener(new Dog());
        panel.add(friendly);

        aggressive = new JButton("aggressive");
        aggressive.setBounds(200, 100, 150, 25);
        aggressive.addActionListener(new Dog());
        panel.add(aggressive);

        option1Label = new JLabel("choose personality");
        option1Label.setBounds(400, 100, 150, 25);
        panel.add(option1Label);

        shedLabel = new JLabel("shed");
        shedLabel.setBounds(10, 150, 80, 25);
        shedLabel.setBackground(Color.red);
        panel.add(shedLabel);
    
        sheds = new JButton("sheds");
        sheds.setBounds(125, 150, 80, 25);
        sheds.addActionListener(new Dog());
        panel.add(sheds);

        shedless = new JButton("shedless");
        shedless.setBounds(200, 150, 150, 25);
        shedless.addActionListener(new Dog());
        panel.add(shedless);

        option2Label = new JLabel("choose shed or not");
        option2Label.setBounds(450, 150, 150, 25);
        panel.add(option2Label);

        maintenanceLabel = new JLabel("maintenance");
        maintenanceLabel.setBounds(10, 200, 200, 25);
        panel.add(maintenanceLabel);

        low = new JButton("low");
        low.setBounds(125, 200, 150, 25);
        low.addActionListener(new Dog());
        panel.add(low);

        high = new JButton("high");
        high.setBounds(300, 200, 150, 25);
        high.addActionListener(new Dog());
        panel.add(high);

        option3Label = new JLabel("choose maintenance");
        option3Label.setBounds(450, 200, 150, 25);
        panel.add(option3Label);

        enter = new JButton("enter");
        enter.setBounds(300, 350, 150, 25);
        enter.addActionListener(new Dog());
        panel.add(enter);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals(Actions.large.name())) {
            Dog.storeSize("large");
            optionLabel.setText("large");
        }
        if (cmd.equals(Actions.medium.name())) {
            Dog.storeSize("medium");   
            optionLabel.setText("medium");        
        }
        if (cmd.equals(Actions.small.name())) {
            Dog.storeSize("small");
            optionLabel.setText("small");
        }
        if (cmd.equals(Actions.friendly.name())) {
            Dog.storePersonality("friendly");
            option1Label.setText("friendly");
        }
        if (cmd.equals(Actions.aggressive.name())) {
            Dog.storePersonality("aggressive");
            option1Label.setText("aggressive");
        }
        if (cmd.equals(Actions.sheds.name())) {
            Dog.storeShed("sheds");
            option2Label.setText("sheds");
        }
        if (cmd.equals(Actions.shedless.name())) {
            Dog.storeShed("doesn't shed");
            option2Label.setText("doesn't shed");
        }
        if (cmd.equals(Actions.low.name())) {
            Dog.storeMaintenance("low maintenance");
            option3Label.setText("low maintenance");
        }
        if (cmd.equals(Actions.high.name())) {
            Dog.storeMaintenance("high maintenance");
            option3Label.setText("high maintenance");
        }
        if (cmd.equals(Actions.enter.name())) {
            Dog.findGolden();
            Dog.findLab();
            Dog.findBulldog();
            Dog.findPoodle();
            Dog.findChicha();
            Dog.findPitbull();
            Dog.findPug();
            Dog.findShiTzu();
            Dog.findSpaniel();
            Dog.findPomerian();
            Dog.findcaneCorso();
            String name = Dog.matchedDog();
            JOptionPane.showMessageDialog(enter, "you fit with a " + name);
        }
    }
}
