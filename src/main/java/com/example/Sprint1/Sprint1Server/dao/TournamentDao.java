package com.example.Sprint1.Sprint1Server.dao;



import com.example.Sprint1.Sprint1Server.model.Tournament;

import java.util.List;
import java.util.Optional;


public interface TournamentDao {

    default int insertTournament(Tournament tournament){
        return insertTournament(tournament);
    }
    List<Tournament> selectAllTournaments();

    Optional<Tournament> selectTournamentByStartDate(String startDate);

    Optional<Tournament> selectTournamentByLocation(String location);

    Optional<Tournament> selectTournamentByEndDate(String endDate);
}
