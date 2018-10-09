package scheduler.com.request;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TeamAddRequestDto {
	@NotNull(message = "teamName can not blank")
	private String teamName;
    @NotNull(message = "teamVenue can not blank")
    private String teamVenue;
    @NotNull(message = "created by can not blank")
    private String createdBy;
    private String updatedBy;
   public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public String getTeamVenue() {
	return teamVenue;
}
public void setTeamVenue(String teamVenue) {
	this.teamVenue = teamVenue;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getUpdatedBy() {
	return updatedBy;
}
public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
}
 
 
}
