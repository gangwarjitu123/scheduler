package scheduler.com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import scheduler.com.model.Team;
import scheduler.com.request.TeamAddRequestDto;
import scheduler.com.response.Response;
import scheduler.com.service.TeamManagementService;

@Controller
@RequestMapping("/ipl")
public class TeamManagementController {
	
	@Autowired
	TeamManagementService teamManagementService;
	
	@RequestMapping(value ="/add",method=RequestMethod.POST)
	public ResponseEntity<Object> addTeams(@Valid @RequestBody TeamAddRequestDto teamAddRequestDto){
		Response response=teamManagementService.addTeam(teamAddRequestDto);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
		
	}
	
	@RequestMapping(value ="/delete",method=RequestMethod.DELETE)
	public ResponseEntity<Object> removeTeams(@Valid @RequestParam("id") Integer id){
		Response response=teamManagementService.removeTeam(id);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
		
	}
	
	@GetMapping
	public ResponseEntity<Object> Teams(){
		Response response=teamManagementService.Teams();
		return new ResponseEntity<Object>(response, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value ="/schedule",method=RequestMethod.POST)
	public ResponseEntity<Object> addSchedule(@Valid @RequestBody Integer noOfDays){
		Response response=teamManagementService.addSchedule(noOfDays);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
		
	}
	
}
