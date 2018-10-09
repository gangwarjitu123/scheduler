package scheduler.com.service;

import java.util.List;

import scheduler.com.model.Team;
import scheduler.com.request.TeamAddRequestDto;
import scheduler.com.response.Response;

public interface TeamManagementService {

	Response addTeam(TeamAddRequestDto teamAddRequestDto);

	Response removeTeam(Integer id);

	Response Teams();

	Response addSchedule(Integer noOfDays);
}
