# Responsibility Map

This project was divided according to the responsibilities assigned to each team member.  
Each folder inside `TournaSys_Member_Responsibilities` contains the files mainly related to that member’s tasks.

---

## Member Responsibilities

### Berke Koyuncu
**Responsibilities:** GUI Design, JavaFX Implementation, UI Integration

**Assigned Areas**
- JavaFX UI screens
- FXML files
- CSS styling
- Scene navigation
- UI controllers
- User interface integration

**Typical Files**
- `src/main/resources/**/*.fxml`
- `src/main/resources/**/*.css`
- UI-related controllers
- JavaFX visual components
- Repository Folder

---

### Muhammed Taha Eren
**Responsibilities:** Match Scheduling, Score Tracking, Standings

**Assigned Areas**
- Match generation logic
- Scheduling system
- Score management
- League standings calculations
- Match result processing

**Typical Files**
- Match services
- Score services
- Standings logic
- Fixture generation classes
- Match-related models

---

### Yago Rodríguez de Pauli
**Responsibilities:** User Authentication and Role Management

**Assigned Areas**
- Login/Register systems
- Authentication logic
- User management
- Role permissions
- Session handling
- Security-related functionality

**Typical Files**
- Authentication services
- Login controllers
- Role management classes
- Security utilities

---

### Yunus Gedik
**Responsibilities:** Tournament and Team Management

**Assigned Areas**
- Tournament creation and management
- Team management
- Tournament structure logic
- Team registration
- Tournament services

**Typical Files**
- Tournament services
- Team services
- Tournament controllers
- Team models
- Test Folder

---

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