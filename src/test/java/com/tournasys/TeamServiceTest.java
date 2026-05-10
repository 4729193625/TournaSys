package com.tournasys;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.tournasys.config.DatabaseConnection;
import com.tournasys.exception.DuplicateTeamException;
import com.tournasys.model.Manager;
import com.tournasys.model.User;
import com.tournasys.service.TeamService;
import com.tournasys.service.TournamentService;
import com.tournasys.util.SessionManager;

public class TeamServiceTest {

    @Test
    void addTeamToTournament_shouldAddTeam() throws DuplicateTeamException {
        DatabaseConnection.initializeDatabase();

        TournamentService tournamentService = new TournamentService();
        TeamService teamService = new TeamService();

        User manager = new Manager(1, "manager1", "Test12345.");
            SessionManager.login(manager);

        int tournamentId = tournamentService.createTournament("Test Cup", "League", 1);

        int teamId = teamService.addTeamToTournament(tournamentId, "Team X");

        assertTrue(teamId > 0);
        assertEquals(1, teamService.getTeamsByTournamentId(tournamentId).size());
    }

    @Test
    void addTeamToTournament_shouldRejectDuplicateTeam() throws DuplicateTeamException {
        DatabaseConnection.initializeDatabase();

        TournamentService tournamentService = new TournamentService();
        TeamService teamService = new TeamService();

        User manager = new Manager(1, "manager1", "Test12345.");
            SessionManager.login(manager);

        int tournamentId = tournamentService.createTournament("Duplicate Cup", "League", 1);

        teamService.addTeamToTournament(tournamentId, "Team A");

        assertThrows(DuplicateTeamException.class, () ->
                teamService.addTeamToTournament(tournamentId, "Team A")
        );
    }

    @Test
    void addTeamToTournament_shouldRejectEmptyName() {
        TeamService teamService = new TeamService();

        assertThrows(IllegalArgumentException.class, () ->
                teamService.addTeamToTournament(1, "")
        );
    }
}