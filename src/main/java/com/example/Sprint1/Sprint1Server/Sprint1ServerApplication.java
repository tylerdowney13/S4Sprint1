package com.example.Sprint1.Sprint1Server;


import com.example.Sprint1.Sprint1Server.dao.MemberAccessService;
import com.example.Sprint1.Sprint1Server.dao.TournamentAccessService;
import com.example.Sprint1.Sprint1Server.model.Member;
import com.example.Sprint1.Sprint1Server.model.Tournament;
import com.example.Sprint1.Sprint1Server.service.TournamentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;


@SpringBootApplication
public class Sprint1ServerApplication {

	public static void main(String[] args) {

		// Create members for database
		Member m1 = new Member("Tyler Downey", "25 Baker Street", "tyler.downey@gmail.com",
				"709-690-1337", "2022-02-21", 5, "family",
				new ArrayList<String>(Arrays.asList("Tyler Downey", "Scott Downey")), new ArrayList<String>(Arrays.asList("PGA Tour 2022")),
				new ArrayList<String>(Arrays.asList("PGA Tour 2021")), new ArrayList<String>(Arrays.asList("PGA Tour 2023"))
		);

		Member m2 = new Member("Scott Downey", "25 Baker Street", "scott.downey@gmail.com",
				"709-690-4574", "2022-02-23", 5, "family",
				new ArrayList<String>(Arrays.asList("Tyler Downey", "Scott Downey")), new ArrayList<String>(Arrays.asList("PGA Tour 2022")),
				new ArrayList<String>(Arrays.asList("PGA Tour 2021")), new ArrayList<String>(Arrays.asList("PGA Tour 2023"))
		);

		Member m3 = new Member("Dryden Bussey", "3 Westbrook Landing", "dryden.bussey@gmail.com",
				"709-690-1234", "2022-02-19", 12, "trial",
				new ArrayList<String>(Arrays.asList()), new ArrayList<String>(Arrays.asList("PGA Tour 2022")),
				new ArrayList<String>(Arrays.asList("PGA Tour 2021")), new ArrayList<String>(Arrays.asList("PGA Tour 2023"))
		);

		Member m4 = new Member("Leah Gregory", "10 Canada Drive", "leah.gregory@gmail.com",
				"709-691-4567", "2022-02-01", 12, "special",
				new ArrayList<String>(Arrays.asList()), new ArrayList<String>(Arrays.asList("PGA Tour 2022")),
				new ArrayList<String>(Arrays.asList("PGA Tour 2021")), new ArrayList<String>(Arrays.asList("PGA Tour 2023"))
		);


		// Create member service
		MemberAccessService memberAccessService = new MemberAccessService();

		// Add members
		memberAccessService.insertMember(m1);
		memberAccessService.insertMember(m2);
		memberAccessService.insertMember(m3);
		memberAccessService.insertMember(m4);


		// Create tournaments for database
		Tournament t1 = new Tournament("2021-03-30", "2021-03-31", "St. John's", 50.00, 1000.00,
				new ArrayList<String>(Arrays.asList("Tyler Downey", "Scott Downey", "Dryden Bussey", "Leah Gregory")),
				new ArrayList<String>(Arrays.asList("Dryden Bussey", "Scott Downey", "Leah Gregory", "Tyler Downey")));

		Tournament t2 = new Tournament("2022-03-30", "2022-03-31", "St. John's", 100.00, 2000.00,
				new ArrayList<String>(Arrays.asList("Tyler Downey", "Scott Downey", "Dryden Bussey", "Leah Gregory")),
				new ArrayList<String>(Arrays.asList("Dryden Bussey", "Scott Downey", "Leah Gregory", "Tyler Downey")));

		Tournament t3 = new Tournament("2023-03-30", "2023-03-31", "St. John's", 200.00, 3000.00,
				new ArrayList<String>(Arrays.asList("Tyler Downey", "Scott Downey", "Dryden Bussey", "Leah Gregory")),
				new ArrayList<String>(Arrays.asList("Dryden Bussey", "Scott Downey", "Leah Gregory", "Tyler Downey")));

		// Create tournament service
		TournamentAccessService tournamentAccessService = new TournamentAccessService();

		// Add tournaments
		tournamentAccessService.insertTournament(t1);
		tournamentAccessService.insertTournament(t2);
		tournamentAccessService.insertTournament(t3);


		SpringApplication.run(Sprint1ServerApplication.class, args);
	}
}
