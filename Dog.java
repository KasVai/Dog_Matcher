import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;



public class dog implements ActionListener{

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
    //private static JButton lowmaintenance ; 
    //private static JButton highMaintenance ; 
    
    private static JButton low; 
    private static JButton high; 
    
    private static dogfinder dog;
    
    
    private enum Actions{
        large, medium, small, friendly, aggressive, sheds, low, shedless, high, enter
    }
     



    public static void main(String[] args) {
        dog =  new dogfinder();


        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.getContentPane().setBackground(Color.RED);

    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        frame.setSize(900,450);

        frame.add(panel);
        panel.setLayout(null);
    
        //title of GUI
         title = new JLabel("dog matcher");
       //(x,y,width,height)
        title.setBounds(10,20,80,25);
        panel.add(title);

         sizeLabel = new JLabel("size");
        //(x,y,width,height)
        sizeLabel.setBounds(10,50,80,25);
         panel.add(sizeLabel);
    
        large = new JButton("large");
        large.setBounds(50,50,80,25);
        large.addActionListener(new dog());
        panel.add(large);

        medium = new JButton("medium");
        medium.setBounds(150,50,80,25);
        medium.addActionListener(new dog());
        panel.add(medium);

        small = new JButton("small");
        small.setBounds(250,50,80,25);
        small.addActionListener(new dog());
        panel.add(small);

        //display chose
        optionLabel = new JLabel("choose size");
        optionLabel.setBounds(350,50,80,25);
         panel.add(optionLabel);






         personalityLabel = new JLabel("personality");
        //(x,y,width,height)
        personalityLabel.setBounds(10,100,80,25);
         panel.add(personalityLabel);
    
         friendly = new JButton("friendly");
        friendly.setBounds(125,100,80,25);
        friendly.addActionListener(new dog());

        panel.add(friendly);

         aggressive = new JButton("aggressive");
        aggressive.setBounds(200,100,150,25);
        aggressive.addActionListener(new dog());

        panel.add(aggressive);

        option1Label = new JLabel("choose personality");
        option1Label.setBounds(400,100,150,25);
         panel.add(option1Label);



         shedLabel = new JLabel("shed");
         shedLabel.setBounds(10,150,80,25);
         shedLabel.setBackground(Color.red);
         panel.add(shedLabel);
    
        sheds = new JButton("sheds");
        sheds.setBounds(125,150,80,25);
        sheds.addActionListener(new dog());
        panel.add(sheds);

        shedless = new JButton("shedless");
        shedless.setBounds(200,150,150,25);
        shedless.addActionListener(new dog());
        panel.add(shedless);

        option2Label = new JLabel("choose shed or not");
        option2Label.setBounds(450,150,150,25);
        panel.add(option2Label);


         maintenanceLabel = new JLabel("maintaintence");
         maintenanceLabel.setBounds(10,200,200,25);
         panel.add(maintenanceLabel);

        
         low = new JButton("low");
         low.setBounds(125,200,150,25);
         low.addActionListener(new dog());
         panel.add(low);
 

        high = new JButton("high");
        high.setBounds(300,200,150,25);
        high.addActionListener(new dog());
        panel.add(high);

        option3Label = new JLabel("choose maintenance");
        option3Label.setBounds(450,200,150,25);
        panel.add(option3Label);


        enter = new JButton("enter");
        enter.setBounds(300,350,150,25);
        enter.addActionListener(new dog());
        panel.add(enter);

        //pops up GUI (always add end to show)
     
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){


        if((e.getActionCommand() == Actions.large.name())) {
            dog.storeSize("large");
            optionLabel.setText("large");
            
        }

        if((e.getActionCommand() == Actions.medium.name())) {
            dog.storeSize("medium");   
            optionLabel.setText("medium");        
        }

        if((e.getActionCommand() == Actions.small.name())) {
            dog.storeSize("small");
            optionLabel.setText("small");
        }

        if((e.getActionCommand() == Actions.friendly.name())) {
            dog.storePersonality("friendly");
            option1Label.setText("friendly");
        }

        if((e.getActionCommand() == Actions.aggressive.name())) {
                dog.storePersonality("aggressive");
                option1Label.setText("aggressive");
        }

        if((e.getActionCommand() == Actions.sheds.name())) {
            dog.storeShed("sheds");
            option2Label.setText("sheds");
        }

        if((e.getActionCommand() == Actions.shedless.name())) {
            dog.storeShed("doesn't shed");
            option2Label.setText("doesn't shed");
        }

        if((e.getActionCommand() == Actions.low.name())) {
            dog.storeMaintenance("low maintenance");
            option3Label.setText("low maintenance");
        }

        if((e.getActionCommand() == Actions.high.name())) {
            dog.storeMaintenance("high maintenance");
            option3Label.setText("high maintenance");
        }

        if((e.getActionCommand() == Actions.enter.name())) {
            dog.findGolden();
            dog.findLab();
            dog.findBulldog();
            dog.findPoodle();
            dog.findChicha();
            dog.findPitbull();
            dog.findPug();
            dog.findShiTzu();
            dog.findSpaniel();
            dog.findPomerian();
            dog.findcaneCorso();
            String name  = dog.matchedDog();
            JOptionPane.showMessageDialog(enter, "you fit with a " + name);

        }










    

    }

} 


    

