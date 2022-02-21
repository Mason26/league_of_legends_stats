package com.example.leaguestats.View;

import com.example.leaguestats.Domain.TagLine;
import com.example.leaguestats.RestClient.AccountDetails.AccountRestClient;
import com.example.leaguestats.RestClient.MatchDetails.MatchRestClient;
import com.example.leaguestats.Service.MatchDetailsRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

class FormScreen extends JFrame
        implements ActionListener {

    // Components of the Form
    private final Container c;
    private final JLabel title;
    private final JLabel name;
    private final JTextField tname;
    private final JLabel mno;
    private final JTextField tmno;
    private final JTextArea tadd;
    private final JTextArea taddTimeLine;

    private final JButton sub;
    private final JButton reset;

    //Services
    private final MatchDetailsRepository matchDetailsRepository;

    private ActionEvent e;

    // constructor, to initialize the components
    // with default values.
    public FormScreen(MatchDetailsRepository matchDetailsRepository)
    {
        this.matchDetailsRepository = matchDetailsRepository;

        setTitle("League Stats");
        setBounds(300, 90, 1080, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Get Match Information");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        //LABEL

        name = new JLabel("Username");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(250, 30);
        name.setLocation(100, 100);
        c.add(name);

        mno = new JLabel("Match Id");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(250, 30);
        mno.setLocation(100, 200);
        c.add(mno);

        //TEXT

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(300, 100);
        c.add(tname);

        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(190, 20);
        tmno.setLocation(300, 200);
        c.add(tmno);

        //TEXT AREA

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(550, 350);
        tadd.setLocation(500, 100);
        tadd.setLineWrap(true);
        tadd.setMargin(new Insets(5, 5, 5, 5));
        c.add(tadd);

        taddTimeLine = new JTextArea();
        taddTimeLine.setFont(new Font("Arial", Font.PLAIN, 15));
        taddTimeLine.setSize(550, 350);
        taddTimeLine.setLocation(500, 500);
        taddTimeLine.setLineWrap(true);
        taddTimeLine.setMargin(new Insets(5, 5, 5, 5));
        c.add(taddTimeLine);

        //BUTTONS

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
        }

        else if(!tname.getText().equals("")){
            List<String> matches = matchDetailsRepository.retrieveListOfMatches(tname.getText(), TagLine.EUW);
            for(String match : matches){
                if(tadd.getText().equals("")){
                    tadd.setText(match);
                }
                else {
                    tadd.setText(tadd.getText() + "\n" + match);
                }
            }
        }

        else if(!tmno.getText().equals("")){
            try {
                List<String> singleMatchDetails = matchDetailsRepository.retrieveFullMatchCsv(tmno.getText());
                for(String str : singleMatchDetails) {
                    tadd.append(str + "\n");
                }
            } catch (Exception exception){
                exception.printStackTrace();
            }
        }

    }
}

public class MainScreen {
    public static void main(String[] args) {
        FormScreen display = new FormScreen(new MatchDetailsRepository(new AccountRestClient(), new MatchRestClient()));
    }
}
