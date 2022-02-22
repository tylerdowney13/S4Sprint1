package com.example.Sprint1.Sprint1Server.dao;


import com.example.Sprint1.Sprint1Server.model.Tournament;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository("tournamentDao")
public class TournamentAccessService implements TournamentDao {
    private static List<Tournament> DB = new ArrayList<>();

    @Override
    public int insertTournament(Tournament tournament){
        DB.add(new Tournament(tournament.getStartDate(), tournament.getEndDate(), tournament.getLocation(), tournament.getEntryFee(),
                tournament.getCashPrizeAmount(), tournament.getParticipatingMembers(), tournament.getFinalStandings()));
        return 1;
    }

    @Override
    public List<Tournament> selectAllTournaments() {
        return DB;
    }

    @Override
    public Optional<Tournament> selectTournamentByStartDate(String startDate) {
        return DB.stream().filter(tournament -> tournament.getStartDate().equals(startDate)).findFirst();
    }

    @Override
    public Optional<Tournament> selectTournamentByLocation(String location) {
        return DB.stream().filter(tournament -> tournament.getLocation().equals(location)).findFirst();
    }

    @Override
    public Optional<Tournament> selectTournamentByEndDate(String endDate) {
        return DB.stream().filter(tournament -> tournament.getEndDate().equals(endDate)).findFirst();
    }
}
