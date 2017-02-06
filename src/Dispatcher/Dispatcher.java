/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispatcher;

import java.io.*;
import javax.swing.*;
import Tracks.*;
import java.awt.Color;

/**
 *
 * @author Grevil Lopes
 */
public class Dispatcher extends JFrame {
 public static void main(String[] args) throws FileNotFoundException{
     
     TrackReader read = new TrackReader();
     read.readTrack();
     
     JFrame frame = new JFrame("Dispatcher");
     frame.setVisible(true);
     frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
     //frame.setSize(1280,800);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
//     JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        frame.getContentPane().add(pane);
     
     


     DispatcherUI track = new DispatcherUI();
     frame.add(track);
     track.drawing();
     

     
//     JButton stop = new JButton("STOP");
//     frame.add(stop);
   
 }
}
