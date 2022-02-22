package com.example.Sprint1.Sprint1Server.service;



import com.example.Sprint1.Sprint1Server.dao.TournamentDao;

import com.example.Sprint1.Sprint1Server.model.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TournamentService {
    private final TournamentDao tournamentDao;

    @Autowired
    public TournamentService(@Qualifier("tournamentDao")TournamentDao tournamentDao) {this.tournamentDao = tournamentDao;}

    public int addTournament(Tournament tournament ){return tournamentDao.insertTournament(tournament);}

    public List<Tournament> getAllTournaments() {
        return tournamentDao.selectAllTournaments();
    }

    public Optional<Tournament> getTournamentByStartDate(String startDate) {
        return tournamentDao.selectTournamentByStartDate(startDate);
    }

    public Optional<Tournament> getTournamentByLocation(String location) {
        return tournamentDao.selectTournamentByLocation(location);
    }

    public Optional<Tournament> getTournamentByEndDate(String endDate) {
        return tournamentDao.selectTournamentByEndDate(endDate);
    }
}

