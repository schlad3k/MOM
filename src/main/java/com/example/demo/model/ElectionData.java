package com.example.demo.model;

import java.util.List;

public class ElectionData {
    private int regionID;
    private String regionName, regionAddress, regionPostalCodes, federalState, timeStamp;
    private List<Party> electionData;
    private List<Preference> preferenceData;



    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionAddress() {
        return regionAddress;
    }

    public void setRegionAddress(String regionAddress) {
        this.regionAddress = regionAddress;
    }

    public String getRegionPostalCodes() {
        return regionPostalCodes;
    }

    public void setRegionPostalCodes(String regionPostalCodes) {
        this.regionPostalCodes = regionPostalCodes;
    }

    public String getFederalState() {
        return federalState;
    }

    public void setFederalState(String federalState) {
        this.federalState = federalState;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getRegionID() {
        return regionID;
    }

    public void setRegionID(int regionID) {
        this.regionID = regionID;
    }

    public void setElectionData(List<Party> electionData) {
        this.electionData = electionData;
    }

    public List<Party> getElectionData() {
        return electionData;
    }

    public List<Preference> getPreferenceData() {
        return preferenceData;
    }

    public void setPreferenceData(List<Preference> preferenceData) {
        this.preferenceData = preferenceData;
    }
}
