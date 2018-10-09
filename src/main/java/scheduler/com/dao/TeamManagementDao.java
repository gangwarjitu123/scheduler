package scheduler.com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import scheduler.com.model.Team;

import java.util.Optional;

public interface TeamManagementDao extends JpaRepository<Team, Integer> {
    Optional<Team> findByTeamNameOrTeamVenue(String teamName, String teamVenue);

}
