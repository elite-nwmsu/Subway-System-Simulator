/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispatcher;

import javax.swing.*;
import java.awt.*;
import Tracks.*;
import java.util.*;

/**
 *
 * @author Grevil Lopes
 */
public class DispatcherUI extends JPanel {

    private String sectionId;
    private double sectionLength;
    private int sectionLengthPixels;
    private double sectionMaxSpeed;
    private String sectionType;
    static ArrayList<TrackPixelMap> sectionLengthPixelsArray = new ArrayList<TrackPixelMap>();
    Map<String, Integer> hm = new HashMap<String, Integer>();
    ArrayList<Track> trackArrayList = new ArrayList<Track>();

    public DispatcherUI() {
    }

    public void drawing() {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        TrackArray trackA = new TrackArray();
        trackArrayList = trackA.trackArrayList;

        Graphics2D g2 = (Graphics2D) g;
        //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(4));
        
        g2.setColor(Color.BLACK);
        g2.drawLine(100, 100, 200, 100);//S1-1
        g2.drawLine(100, 130, 200, 130);//S1-2
        g2.drawLine(100, 140, 200, 140);//S1-3
        g2.drawLine(100, 170, 200, 170);//S1-4
        
        g2.drawLine(205, 100, 230, 100);//S2-1, SW-1
        g2.drawLine(205, 130, 235, 105);//S2-2, SW-1
        g2.drawLine(205, 140, 230, 140);//S2-3, SW-2
        g2.drawLine(205, 170, 235, 145);//S2-4, SW-2
        
        g2.drawLine(235, 100, 535, 100);//S3-1
        g2.drawLine(235, 140, 535, 140);//S3-2
        
        g2.drawLine(525, 105, 550, 135);//SW-3
        g2.drawLine(525, 135, 550, 105);//SW-4
        
        g2.drawLine(540, 100, 900, 100);//S4-1
        g2.drawLine(540, 140, 900, 140);//S4-2
        
        g2.drawLine(890, 105, 915, 135);//SW-5
        g2.drawLine(890, 135, 915, 105);//SW-6
        
        g2.drawLine(905, 100, 1005, 100);//S5-1
        g2.drawLine(905, 140, 1005, 140);//S5-2

        g2.setColor(Color.BLUE);
        g2.fillRect(108, 106, 80, 20);//BOSTON Station platform 1
        g2.fillRect(108, 146, 80, 20);//BOSTON Station platform 2
        
        g2.fillRect(920, 106, 80, 28);//ALEWIFE Station platform 1
        
        g2.setColor(Color.BLACK);
        g2.setFont(new Font("TimesRoman", Font.BOLD, 15)); 
        g2.drawString("BOSTON", 118, 120);//BOSTON station platform 1 name
        g2.drawString("BOSTON", 118, 160);//BOSTON station platform 2 name
        
        g2.drawString("ALEWIFE", 925, 125);//ALEWIFE station platform 1 name
        
        

        for (int i = 0; i < trackArrayList.size(); i++) {
            this.sectionId = trackArrayList.get(i).getSectionId();
            this.sectionLength = trackArrayList.get(i).getSectionLength();
            this.sectionMaxSpeed = trackArrayList.get(i).getSectionMaxSpeed();
            this.sectionType = trackArrayList.get(i).getSectionType();

            this.sectionLengthPixels = (int) Math.round(sectionLength / 5);

            sectionLengthPixelsArray.add(new TrackPixelMap(sectionId, sectionLengthPixels));
            hm.put(sectionId, sectionLengthPixels);

        }
        System.out.println("Section Id --- pixels\n");
       
        for (TrackPixelMap secs : sectionLengthPixelsArray) {
            System.out.println(secs.SectionId + "       --- " + secs.sectionLengthPixels);
        }

    }
}
 //edited by mahesh