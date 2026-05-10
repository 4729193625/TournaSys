This project was divided according to the responsibilities assigned to each team member.

## Berke Koyuncu GUI JavaFX UI Integration

- `src/main/java/com/tournasys/app/MainApp.java`
- `src/main/java/com/tournasys/config/DatabaseConnection.java`
- `src/main/java/com/tournasys/controller/DashboardController.java`
- `src/main/java/com/tournasys/controller/NavbarController.java`
- `src/main/java/com/tournasys/util/SceneManager.java`
- `src/main/java/com/tournasys/controller/* - correction and verification -`
- `src/main/resources/com/tournasys/css/app.css`
- `src/main/resources/com/tournasys/fxml/*`
- `src/main/resources/com/tournasys/ico/*`
- `Final correction and verification in whole project.`

## Muhammed Taha Eren Match Scheduling Score Standings

- `src/main/java/com/tournasys/controller/MatchController.java`
- `src/main/java/com/tournasys/controller/StandingsController.java`
- `src/main/java/com/tournasys/controller/BracketController.java`
- `src/main/java/com/tournasys/interfaces/Schedulable.java`
- `src/main/java/com/tournasys/interfaces/Scorable.java`
- `src/main/java/com/tournasys/model/Match.java`
- `src/main/java/com/tournasys/model/Standings.java`
- `src/main/java/com/tournasys/model/StandingRow.java`
- `src/main/java/com/tournasys/repository/MatchRepository.java`
- `src/main/java/com/tournasys/repository/StandingsRepository.java`
- `src/main/java/com/tournasys/service/MatchService.java`
- `src/main/java/com/tournasys/service/StandingsService.java`

## Yago Rodriguez de Pauli User Authentication Role Management

- `src/main/java/com/tournasys/controller/LoginController.java`
- `src/main/java/com/tournasys/controller/RegisterController.java`
- `src/main/java/com/tournasys/exception/AuthenticationException.java`
- `src/main/java/com/tournasys/interfaces/Authenticatable.java`
- `src/main/java/com/tournasys/model/User.java`
- `src/main/java/com/tournasys/model/Manager.java`
- `src/main/java/com/tournasys/model/Player.java`
- `src/main/java/com/tournasys/repository/UserRepository.java`
- `src/main/java/com/tournasys/service/AuthenticationService.java`
- `src/main/java/com/tournasys/util/SessionManager.java`

## Yunus Gedik Tournament Team Management

- `src/main/java/com/tournasys/controller/TournamentController.java`
- `src/main/java/com/tournasys/controller/TeamController.java`
- `src/main/java/com/tournasys/exception/DuplicateTeamException.java`
- `src/main/java/com/tournasys/interfaces/Manageable.java`
- `src/main/java/com/tournasys/model/Tournament.java`
- `src/main/java/com/tournasys/model/Team.java`
- `src/main/java/com/tournasys/repository/TournamentRepository.java`
- `src/main/java/com/tournasys/repository/TeamRepository.java`
- `src/main/java/com/tournasys/service/TournamentService.java`
- `src/main/java/com/tournasys/service/TeamService.java`
- `src/test/java/com/tournasys/TournamentModelTest.java`
- `src/test/java/com/tournasys/TeamServiceTest.java`
- `src/test/java/com/tournasys/MatchModelTest.java`
- `src/test/java/com/tournasys/AuthenticationServiceTest.java`
- `src/test/java/com/tournasys/StandingsModelTest.java`

## Shared Responsibilities

Some infrastructure and configuration files are shared equally among all members:

- `pom.xml`
- `README.md`
- `.gitignore`
- `RESPONSIBILITY_MAP.md`
- Database configuration files
- General utility classes
- Application startup files

These files support the whole system and are considered collaborative work.

---

## Notes

- The project structure was separated according to primary responsibility ownership.
- Some files may appear in multiple areas because of integration dependencies.
- Shared files are not exclusive to a single member.