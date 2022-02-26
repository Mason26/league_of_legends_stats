package com.example.leaguestats.View;

import com.example.leaguestats.RestClient.AccountDetails.AccountRestClient;
import com.example.leaguestats.RestClient.MatchDetails.MatchRestClient;
import com.example.leaguestats.Service.MatchDetailsRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;

class FormScreen extends JFrame
        implements ActionListener {

    // Components of the Form
    private final Container c;
    private final JTextField tUsername;
    private final JLabel username;
    private final JLabel matchId;
    private final JTextField tMatchId;
    private final JTextArea taStats;

    private final ImageIcon eraImg = new ImageIcon("src/main/java/images/EraLOGO.png");
    private final JLabel img;

    private final JButton btnSubmit;

    //Services
    private final MatchDetailsRepository matchDetailsRepository;

    private ActionEvent e;

    // constructor, to initialize the components
    // with default values.
    public FormScreen(MatchDetailsRepository matchDetailsRepository) {
        this.matchDetailsRepository = matchDetailsRepository;

        setTitle("Era Stats");
        setBounds(300, 90, 1080, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);
        c.setBounds(50, 5, 5, 5);
        c.setBackground(new Color(24, 24, 24) );

        //LABEL

        username = new JLabel("Username");
        username.setFont(new Font("Arial", Font.PLAIN, 20));
        username.setForeground(Color.WHITE);
        username.setSize(250, 30);
        username.setLocation(440, 320);
        c.add(username);

        matchId = new JLabel("Match Id");
        matchId.setFont(new Font("Arial", Font.PLAIN, 20));
        matchId.setForeground(Color.WHITE);
        matchId.setSize(250, 30);
        matchId.setLocation(440, 420);
        c.add(matchId);

        img = new JLabel();
        img.setIcon(eraImg);
        img.setSize(1080, 400);
        img.setLocation(-150, 0);
        c.add(img);

        //TEXT

        tUsername = new JTextField();
        tUsername.setFont(new Font("Arial", Font.PLAIN, 15));
        tUsername.setSize(190, 20);
        tUsername.setLocation(400, 350);
        c.add(tUsername);

        tMatchId = new JTextField();
        tMatchId.setFont(new Font("Arial", Font.PLAIN, 15));
        tMatchId.setSize(190, 20);
        tMatchId.setLocation(400, 450);
        c.add(tMatchId);

        //TEXT AREA

        taStats = new JTextArea();
        taStats.setFont(new Font("Arial", Font.PLAIN, 15));
        taStats.setSize(1050, 200);
        taStats.setLocation(10, 550);
        taStats.setLineWrap(true);
        taStats.setMargin(new Insets(5, 5, 5, 5));
        c.add(taStats);

        //BUTTONS

        btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Arial", Font.PLAIN, 15));
        btnSubmit.setSize(100, 20);
        btnSubmit.setLocation(440, 500);
        btnSubmit.addActionListener(this);
        btnSubmit.setBackground(new Color(24, 24, 24) );
        btnSubmit.setForeground(Color.WHITE);
        c.add(btnSubmit);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if(!tUsername.getText().equals("") && !tMatchId.getText().equals("")){
            retrieveMatchStats();
        }
        else if(!tMatchId.getText().equals("")){
            retrieveMatchStats();
        }
        else if(!tUsername.getText().equals("")){
            taStats.setText("");
            List<String> matches = matchDetailsRepository.retrieveListOfMatches(tUsername.getText());
            for(String match : matches){
                if(taStats.getText().equals("")){
                    taStats.setText(match);
                }
                else {
                    taStats.setText(taStats.getText() + "\n" + match);
                }
            }
        }
        else{
            taStats.setText("");
            taStats.setText("Nothing is selected");
        }
    }

    private void retrieveMatchStats() {
        try {
            taStats.setText("");
            List<String> singleMatchDetails = matchDetailsRepository.retrieveFullMatchCsv(tMatchId.getText());
            for(String str : singleMatchDetails) {
                taStats.append(str + "\n");
            }
        } catch (Exception exception){
            taStats.setText(exception.getMessage());
        }
    }
}

public class MainScreen {
    public static void main(String[] args) {
        new FormScreen(new MatchDetailsRepository(new AccountRestClient(), new MatchRestClient()));
    }
}
