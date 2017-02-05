/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispatcher;

import java.io.*;
import javax.swing.*;
import Tracks.*;

/**
 *
 * @author Grevil Lopes
 */
public class Dispatcher extends JPanel {
 public static void main(String[] args) throws FileNotFoundException{
     
     TrackReader read = new TrackReader();
     read.readTrack();
     
     JFrame frame = new JFrame("Dispatcher");
     frame.setVisible(true);
     frame.setSize(1100,700);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    
     
     DispatcherUI track = new DispatcherUI();
     //track.dummy();
     frame.add(track);
     track.drawing();
     
//     JButton stop = new JButton("STOP");
//     stop.setSize(20, 40);
//     frame.add(stop);
     
     
     
 }
}
