/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tracks;

/**
 *
 * @author Grevil Lopes
 */
public class Track {

    private String sectionId;
    private double sectionLength;
    private double sectionMaxSpeed;
    private String sectionType;

    public Track() {
    }

    public Track(String sectionId, double sectionLength, double sectionMaxSpeed, String sectionType) {
        this.sectionId = sectionId;
        this.sectionLength = sectionLength;
        this.sectionMaxSpeed = sectionMaxSpeed;
        this.sectionType = sectionType;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public double getSectionLength() {
        return sectionLength;
    }

    public void setSectionLength(double sectionLength) {
        this.sectionLength = sectionLength;
    }

    public double getSectionMaxSpeed() {
        return sectionMaxSpeed;
    }

    public void setSectionMaxSpeed(double sectionMaxSpeed) {
        this.sectionMaxSpeed = sectionMaxSpeed;
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }

    @Override
    public String toString() {
        return "Track{" + "sectionId=" + sectionId + ", sectionLength=" + sectionLength + ", sectionMaxSpeed=" + sectionMaxSpeed + ", sectionType=" + sectionType + '}';
    }

}
