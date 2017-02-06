/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dispatcher;

/**
 *
 * @author Grevil Lopes
 */
public class TrackPixelMap {
    String SectionId;
    int sectionLengthPixels;

    public TrackPixelMap(String SectionId, int sectionLengthPixels) {
        this.SectionId = SectionId;
        this.sectionLengthPixels = sectionLengthPixels;
    }

    public String getSectionId() {
        return SectionId;
    }

    public void setSectionId(String SectionId) {
        this.SectionId = SectionId;
    }

    public int getSectionLengthPixels() {
        return sectionLengthPixels;
    }

    public void setSectionLengthPixels(int sectionLengthPixels) {
        this.sectionLengthPixels = sectionLengthPixels;
    }

    @Override
    public String toString() {
        return "TrackPixelMap{" + "SectionId=" + SectionId + ", sectionLengthPixels=" + sectionLengthPixels + '}';
    }
    
    
    
}
