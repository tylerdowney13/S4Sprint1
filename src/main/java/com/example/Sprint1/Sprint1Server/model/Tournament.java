package com.example.Sprint1.Sprint1Server.model;


import com.example.Sprint1.Sprint1Server.service.MemberService;
import com.example.Sprint1.Sprint1Server.service.TournamentService;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Tournament {
    private String startDate;
    private String endDate;
    private String location;
    private double entryFee;
    private double cashPrizeAmount;
    private ArrayList<String> participatingMembers;
    private ArrayList<String> finalStandings; //if tournament is over


    //Tournament constructor
    public Tournament(@JsonProperty("startDate") String startDate,
                      @JsonProperty("endDate") String endDate,
                      @JsonProperty("location") String location,
                      @JsonProperty("entryFee") double entryFee,
                      @JsonProperty("cashPrizeAmount") double cashPrizeAmount,
                      @JsonProperty("participatingMembers") ArrayList<String> participatingMembers,
                      @JsonProperty("finalStandings") ArrayList<String> finalStandings
                      ){
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.entryFee = entryFee;
        this.cashPrizeAmount = cashPrizeAmount;
        this.participatingMembers = participatingMembers;
        this.finalStandings = finalStandings;

    }


    //Getter Methods

    public String getStartDate(){return startDate;}
    public String getEndDate(){return endDate;}
    public String getLocation(){return location;}
    public double getEntryFee(){return entryFee;}
    public double getCashPrizeAmount(){return cashPrizeAmount;}
    public ArrayList<String> getParticipatingMembers(){return participatingMembers;}
    public ArrayList<String> getFinalStandings(){return finalStandings;}

}
