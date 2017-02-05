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
    private int x = 50;
    private int y = 50;
    private int block = 20;
    private int blockCount = 0;
    TrackPixelMap pixelMap;
    static ArrayList<TrackPixelMap> sectionLengthPixelsArray = new ArrayList<TrackPixelMap>();
    
    Queue<Integer> tempSectionLengthPixels = new LinkedList<Integer>();

    private int x1 = 50;
    private int y1 = 50;
    private int x2 = 100;
    private int y2 = 50;

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
        g2.setStroke(new BasicStroke(5));

        //g2.drawLine(200, 150, 400, 150);
//        for (Track sections : trackArrayList) {
//            this.sectionId = sections.getSectionId();
//            this.sectionLength = sections.getSectionLength();
//            this.sectionMaxSpeed = sections.getSectionMaxSpeed();
//            this.sectionType = sections.getSectionType();
        for (int i = 0; i < trackArrayList.size(); i++) {
            this.sectionId = trackArrayList.get(i).getSectionId();
            this.sectionLength = trackArrayList.get(i).getSectionLength();
            this.sectionMaxSpeed = trackArrayList.get(i).getSectionMaxSpeed();
            this.sectionType = trackArrayList.get(i).getSectionType();

            System.out.println("id = " + sectionId);

            this.sectionLengthPixels = (int) Math.round(sectionLength / 8);
            
            drawTrack(sectionLengthPixels, g, i);
            sectionLengthPixelsArray.add(new TrackPixelMap(sectionId, sectionLengthPixels));
        }

    }


    public void drawTrack(int sectionLengthPixels, Graphics g, int i) {
        //only if index of Track in trackArrayList is 1 or more to avoid -ve index values
        if (i > 0) {
            String previousSectionId = trackArrayList.get(i - 1).getSectionId();

            //only if current section id matches prev section id to check parallel sections
            if ((sectionId.substring(0, (sectionId.indexOf("-")))).equals(previousSectionId.substring(0, (previousSectionId.indexOf("-"))))) {
                g.setColor(Color.GRAY);

                g.fillRect(x, y + block, sectionLengthPixels, 5);

                //x += sectionLengthPixels;
                g.setColor(Color.RED);
                g.fillRect((x + sectionLengthPixels) - 1, (y - 2) + block, 1, 9);

                block = block + 20;
                //tempSectionLengthPixels.add(sectionLengthPixels);

            } //If sections are not parallel continue drawing linear tracks
            else {
                if (tempSectionLengthPixels.isEmpty() == false) {
                    block = 20;
                    g.setColor(Color.GRAY);

                    g.fillRect(x + tempSectionLengthPixels.peek(), y, sectionLengthPixels, 5);

                    x += sectionLengthPixels;
                    g.setColor(Color.RED);
                    g.fillRect(x - 1, y - 2, 1, 9);
                } else {
                    g.setColor(Color.GRAY);

                    g.fillRect(x, y, sectionLengthPixels, 5);

                    x += sectionLengthPixels;
                    g.setColor(Color.RED);
                    g.fillRect(x - 1, y - 2, 1, 9);
                }
                System.out.println("in block reset");

            }
        } //if index of Track in trackArrayList is 0 do this(executed only once at start)
        else {
            g.setColor(Color.GRAY);

            g.fillRect(x, y, sectionLengthPixels, 5);

            //x += sectionLengthPixels;
            g.setColor(Color.RED);
            g.fillRect(x - 1, y - 2, 1, 9);
        }
    }
}
