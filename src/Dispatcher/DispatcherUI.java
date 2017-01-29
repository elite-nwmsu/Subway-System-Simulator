/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispatcher;

import javax.swing.*;
import java.awt.*;
import Tracks.*;
import java.io.FileNotFoundException;
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
    private int x = 50;
    private int y = 50;

    ArrayList<Track> trackArrayList = new ArrayList<Track>();

    TrackReaderTest myTrackReader = new TrackReaderTest();
    
    public DispatcherUI() {
    }

    public void dummy() throws FileNotFoundException {
        TrackArray trackA = new TrackArray();
        //trackArrayList = trackA.getTrackArrayListtr
        //trackArrayList = myTrackReader.readTrack();
        trackArrayList = trackA.trackArrayList;

        System.out.println(trackArrayList.size());
        System.out.println(trackA.toString());

        for (int i = 0; i < trackArrayList.size(); i++) {
            System.out.println("in dummy for");
            this.sectionId = trackArrayList.get(i).getSectionId();
            this.sectionLength = trackArrayList.get(i).getSectionLength();
            this.sectionMaxSpeed = trackArrayList.get(i).getSectionMaxSpeed();
            this.sectionType = trackArrayList.get(i).getSectionType();

            System.out.println("length = " + sectionLength);

            this.sectionLengthPixels = (int) Math.round(sectionLength / 18);

        }
    }

    public void drawing() {
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GRAY);
        g.fillRect(100, 100, 100, 5);

        g.fillRect(100, 150, 100, 5);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));

        g2.drawLine(200, 152, 300, 103);

        g.fillRect(201, 100, 100, 5);
        g.fillRect(302, 100, 100, 5);
        g.fillRect(403, 100, 100, 5);
        g.fillRect(504, 100, 100, 5);
        g.fillRect(605, 100, 100, 5);
        g.fillRect(706, 100, 100, 5);
        g.fillRect(807, 100, 100, 5);

        g.fillRect(908, 100, 5, 100);
        g.fillRect(908, 201, 5, 100);

        g.fillRect(808, 302, 100, 5);
        g.fillRect(707, 302, 100, 5);
        g.fillRect(606, 302, 100, 5);
        g.fillRect(505, 302, 100, 5);
        g.fillRect(404, 302, 100, 5);
        g.fillRect(303, 302, 100, 5);
        g.fillRect(202, 302, 100, 5);

        for (Track sections : trackArrayList) {
            this.sectionId = sections.getSectionId();
            this.sectionLength = sections.getSectionLength();
            this.sectionMaxSpeed = sections.getSectionMaxSpeed();
            this.sectionType = sections.getSectionType();

            System.out.println("length = " + sectionLength);

            this.sectionLengthPixels = (int) Math.round(sectionLength / 18);

            while (x < 600) {
                g.setColor(Color.GRAY);
                g.fillRect(x, y, sectionLengthPixels, 5);
                this.x += sectionLengthPixels;
            }

        }

    }

    public void startButton() {
        JButton start = new JButton("START");
    }

    public void stopButton() {
        JButton stop = new JButton("STOP");
    }
}
