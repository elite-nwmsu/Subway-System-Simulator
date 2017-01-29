/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tracks;

import java.util.ArrayList;

/**
 *
 * @author Grevil Lopes
 */
public class TrackArray {

    public static ArrayList<Track> trackArrayList = new ArrayList<Track>();

    public TrackArray() {
    }

    public static ArrayList<Track> getTrackArrayList() {
        return trackArrayList;
    }

    public Boolean addTrack(Track track) {
        return trackArrayList.add(track);
    }

    public int getNumberOfTracks() {
        return trackArrayList.size();
    }

    @Override
    public String toString() {
        return "TrackArray{" + "trackArrayList=" + trackArrayList + '}';
    }

}
