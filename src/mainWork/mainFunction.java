package mainWork;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import mainWork.timeTravel;
import mainWork.travelForward;

public class mainFunction {

    private JFrame mainFrame;
    private JPanel leftJPanel;
    private JPanel textPanel;
    private JScrollPane container;
    public static JTextArea storyTextArea;

    private JPanel buttonPanel;
    private JButton Galaxy_war;
    private JButton Extraterrestrial_story;
    private JButton Clear;

    private JPanel resourceJPanel;

    protected ActionListener clickActionListener;

    private mainFunction(){
        mainFrame = new JFrame("Time Travelling");

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);// exit
            }
        });

        leftJPanel = new JPanel();
        leftJPanel.setLayout(new BorderLayout());
        leftJPanel.setPreferredSize(new Dimension(1000,600));

        textPanel = new JPanel();
        storyTextArea = new JTextArea();
        storyTextArea.setEditable(false);
        storyTextArea.setVisible(true);
        storyTextArea.setForeground(Color.blue);
        container = new JScrollPane(storyTextArea);
        textPanel.setLayout(new BorderLayout());
        textPanel.setPreferredSize(new Dimension(950,500));
        textPanel.add(container);
        textPanel.setBorder(new TitledBorder("Begin of the story"));
        textPanel.setVisible(true);
        storyTextArea.setLineWrap(true);
        storyTextArea.setWrapStyleWord(true);
        resourceJPanel = new JPanel();

        buttonPanel = new JPanel();
        Galaxy_war = new JButton("Travel back");
        Galaxy_war.setPreferredSize(new Dimension(100,80));
        Extraterrestrial_story = new JButton("Travel forward");
        Extraterrestrial_story.setPreferredSize(new Dimension(100,80));
        Clear = new JButton("Clear");
        Clear.setPreferredSize(new Dimension(100,80));
        buttonPanel.setLayout(new GridLayout(1,3));
        buttonPanel.setPreferredSize(new Dimension(700,100));
        buttonPanel.setBorder(new TitledBorder("Selections"));
        buttonPanel.add(Galaxy_war);
        buttonPanel.add(Extraterrestrial_story);
        buttonPanel.add(Clear);
        buttonPanel.setVisible(true);

        leftJPanel.add(textPanel,BorderLayout.NORTH);
        leftJPanel.add(resourceJPanel,BorderLayout.CENTER);
        leftJPanel.add(buttonPanel,BorderLayout.SOUTH);
        //rightJPanel.add(characterPanel);

        mainFrame.setLayout(new BorderLayout());
        mainFrame.add(leftJPanel,BorderLayout.WEST);
       // mainFrame.add(rightJPanel,BorderLayout.EAST);
        mainFrame.setSize(1000,650);

        clickActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//				System.out.print(e + "\n");
                if (e.getActionCommand().equals("Travel back")) {
                    generateGalaxyStory();
                }
                else if (e.getActionCommand().equals("Travel forward")) {
                    Extraterrestrial_story();
                }
                else if (e.getActionCommand().equals("Clear")) {
                    Clear();
                }
            }

        };

        Extraterrestrial_story.addActionListener(clickActionListener);
        Galaxy_war.addActionListener(clickActionListener);
        Clear.addActionListener(clickActionListener);

        mainFrame.setVisible(true);

    }
    
    private void generateGalaxyStory(){
        timeTravel story=new timeTravel();
        String ret=story.mainTimeStory();
        storyTextArea.append(ret);
        storyTextArea.append("\n");
        storyTextArea.append("\n");
        storyTextArea.append("\n");
    }

    private void Extraterrestrial_story(){
        travelForward story=new travelForward();
        String ret=story.forward_story();
        storyTextArea.append(ret);
        storyTextArea.append("\n");
        storyTextArea.append("\n");
        storyTextArea.append("\n");
    }

    private void Clear(){
        storyTextArea.setText("");
    }

    public static JTextArea geTextArea() {
        return storyTextArea;
    }
    public static void main(String args[]) {
        new mainFunction();
    }
}
