package scheduler.com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="match_schedule")
public class MatchSchedule implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(name="venue_team")
private String venuTeam;
@Column(name="against_team")
private String againstTeam;
@Column(name="location")
private String location;
@Column(name="match_schedule_date")
private Date date;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAgainstTeam() {
	return againstTeam;
}
public void setAgainstTeam(String againstTeam) {
	this.againstTeam = againstTeam;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

	public String getVenuTeam() {
		return venuTeam;
	}

	public void setVenuTeam(String venuTeam) {
		this.venuTeam = venuTeam;
	}
}
