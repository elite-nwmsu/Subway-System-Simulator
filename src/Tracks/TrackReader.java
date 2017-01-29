/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tracks;

import java.io.*;
;
import java.util.*;

/**
 *
 * @author Grevil Lopes
 */


public class TrackReader {

    public void readTrack() throws FileNotFoundException {

        TrackArray trackObjects = new TrackArray();
        Scanner fileReader = new Scanner(new File("trackData.txt"));

        while (fileReader.hasNext()) {

            String section = fileReader.nextLine();
            String[] sec = section.split(",");

            String secId = sec[0];
            double secLength = Double.parseDouble(sec[1]);
            double secMaxSpeed = Double.parseDouble(sec[2]);
            String secType = sec[3];

            trackObjects.addTrack(new Track(secId, secLength, secMaxSpeed, secType));
        }
        
        fileReader.close();
    }

}
