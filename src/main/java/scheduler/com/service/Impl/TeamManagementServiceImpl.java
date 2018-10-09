package scheduler.com.service.Impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import scheduler.com.config.appconfig.MessageProperties;
import scheduler.com.dao.TeamManagementDao;
import scheduler.com.exception.CustomSchedulerException;
import scheduler.com.model.Team;
import scheduler.com.request.TeamAddRequestDto;
import scheduler.com.response.Response;
import scheduler.com.service.TeamManagementService;
import scheduler.com.utils.ResponseBuilder;

@Service
public class TeamManagementServiceImpl implements TeamManagementService{

	@Autowired
	TeamManagementDao teamManagementDao;

	@Autowired
	MessageProperties messageProperties;

	@Override
	public Response addTeam(TeamAddRequestDto teamAddRequestDto) {
		Optional<Team> teamOptional=teamManagementDao.findByTeamNameOrTeamVenue(teamAddRequestDto.getTeamName(),teamAddRequestDto.getTeamVenue());
		if(teamOptional.isPresent()){
			throw  new CustomSchedulerException(messageProperties.getAlreadyReported(),HttpStatus.ALREADY_REPORTED);
		}

		Team team= new Team();
		team.setTeamName(teamAddRequestDto.getTeamName());
		team.setTeamVenue(teamAddRequestDto.getTeamVenue());
		team.setCreatedBy(teamAddRequestDto.getCreatedBy());
		team.setCreatedDate(new Date());
		team =teamManagementDao.save(team);
		return  ResponseBuilder.build(team);
	}

	@Override
	public Response removeTeam(Integer id) {
		try {
			teamManagementDao.deleteById(id);
		}catch (EmptyResultDataAccessException ex){
			throw  new  CustomSchedulerException(messageProperties.getRecordNotFound(),HttpStatus.NOT_FOUND);

		}
		return  ResponseBuilder.build(null);
	}

	@Override
	public Response Teams() {
		List<Team> teams=teamManagementDao.findAll();
		return  ResponseBuilder.build(teams);

	}

	@Override
	public Response addSchedule(Integer noOfDays) {
		List<Team> teams=teamManagementDao.findAll();
		return  ResponseBuilder.build(teams);
	}

}
