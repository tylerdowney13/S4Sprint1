package com.example.Sprint1.Sprint1Server.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Member {
    // Initialization variables
    private String memberName;
    private String memberAddress;
    private String memberEmail;
    private String memberPhone;
    private String membershipStartDate;
    private int membershipDuration;
    private String membershipType;
    private ArrayList<String> membershipFamilyMembers;
    private ArrayList<String> currentTournaments;
    private ArrayList<String> pastTournaments;
    private ArrayList<String> upcomingTournaments;


    // Person constructor
    public Member(@JsonProperty("memberName") String memberName,
                  @JsonProperty("memberAddress") String memberAddress,
                  @JsonProperty("memberEmail") String memberEmail,
                  @JsonProperty("memberPhone") String memberPhone,
                  @JsonProperty("membershipStartDate") String membershipStartDate,
                  @JsonProperty("membershipDuration") int membershipDuration,
                  @JsonProperty("membershipType") String membershipType,
                  @JsonProperty("membershipFamilyMembers") ArrayList<String> membershipFamilyMembers,
                  @JsonProperty("currentTournaments") ArrayList<String> currentTournaments,
                  @JsonProperty("pastTournaments") ArrayList<String> pastTournaments,
                  @JsonProperty("upcomingTournaments") ArrayList<String> upcomingTournaments
                  ) {
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.membershipStartDate = membershipStartDate;
        this.membershipDuration = membershipDuration;
        this.membershipType = membershipType;
        this.membershipFamilyMembers = membershipFamilyMembers;
        this.currentTournaments = currentTournaments;
        this.pastTournaments = pastTournaments;
        this.upcomingTournaments = upcomingTournaments;
    }

    // Getter methods
    public String getMemberName() {
        return memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public String getMembershipStartDate() {
        return membershipStartDate;
    }

    public int getMembershipDuration() {
        return membershipDuration;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public ArrayList<String> getMembershipFamilyMembers() {
        return membershipFamilyMembers;
    }

    public ArrayList<String> getCurrentTournaments() {
        return currentTournaments;
    }

    public ArrayList<String> getPastTournaments() {
        return pastTournaments;
    }

    public ArrayList<String> getUpcomingTournaments() {
        return upcomingTournaments;
    }
}
