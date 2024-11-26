package com.example.demo.model;

public class Preference {
    private String listname;
    private String name;
    private int amountVotes;
    public Preference(String listname, String name, int amountVotes) {
        this.amountVotes = amountVotes;
        this.listname = listname;
        this.name = name;
    }

    public String getListNumber() {
        return listname;
    }

    public void setListnumber(String listname) {
        this.listname = listname;
    }

    public String getCandidateName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountVotes() {
        return amountVotes;
    }

    public void setAmountVotes(int amountVotes) {
        this.amountVotes = amountVotes;
    }

    @Override
    public String toString() {
        return "Preference{" +
                "listname='" + listname + '\'' +
                ", name='" + name + '\'' +
                ", amountVotes=" + amountVotes +
                '}';
    }
}
