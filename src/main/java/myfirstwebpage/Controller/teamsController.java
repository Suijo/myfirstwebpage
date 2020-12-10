package myfirstwebpage.Controller;

import myfirstwebpage.repository.Entity.match_stats;
import myfirstwebpage.repository.Entity.teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class teamsController {

    @Autowired
    private myfirstwebpage.Service.teamsService teamsService;


    @RequestMapping(value = "/teams",method = RequestMethod.GET)
    public Collection<teams> getAllTeams() {
        return teamsService.getAllTeams();
    }

    @RequestMapping(value = "teams/{id}", method = RequestMethod.GET)
    public Optional<teams> getTeamById(@PathVariable("id") int tid) {
        return teamsService.getTeamByID(tid);
    }

    @RequestMapping(
            value = "/teams/create",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertTeam(
            @RequestBody teams team) {
        this.teamsService.insertTeam(team);

    }

    @RequestMapping(value = "/team/delete/{id}", method = RequestMethod.DELETE)
    public void deleteTeamById(@PathVariable("id") int tid) {
        teamsService.deleteTeamById(tid);
    }

    @RequestMapping(value = "/teams/update",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateTeam(@RequestBody teams team){
        teamsService.updateTeam(team);
    }
}
