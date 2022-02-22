package com.example.Sprint1.Sprint1Server.api;



import com.example.Sprint1.Sprint1Server.model.Tournament;

import com.example.Sprint1.Sprint1Server.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/tournament")
@RestController

public class TournamentController {
    private final TournamentService tournamentService;

    @Autowired
    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }


    @PostMapping
    public void addTournament(@RequestBody Tournament tournament){tournamentService.addTournament(tournament);}


    @GetMapping
    public List<Tournament> getAllTournaments() {
        return tournamentService.getAllTournaments();
    }

    @GetMapping(path = "/startDate={startDate}")
    public Tournament getTournamentByStartDate(@PathVariable("startDate") String startDate) {
        return tournamentService.getTournamentByStartDate(startDate).orElse(null);
    }

    @GetMapping(path = "/location={location}")
    public Tournament getTournamentByLocation(@PathVariable("location") String location) {
        return tournamentService.getTournamentByLocation(location).orElse(null);
    }

    @GetMapping(path = "/endDate={endDate}")
    public Tournament getTournamentByEndDate(@PathVariable("endDate") String endDate) {
        return tournamentService.getTournamentByEndDate(endDate).orElse(null);
    }
}
