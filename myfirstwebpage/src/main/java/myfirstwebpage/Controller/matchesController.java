package myfirstwebpage.Controller;

import myfirstwebpage.repository.Entity.match_stats;
import myfirstwebpage.repository.Entity.matches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;


@RestController
public class matchesController {

    @Autowired
    private myfirstwebpage.Service.matchesService matchesService;


    @RequestMapping(value = "/matches",method = RequestMethod.GET)
    public Collection<matches> getAllMatches() {

        return matchesService.getAllMatches();
    }

    @RequestMapping(value = "matches/{id}", method = RequestMethod.GET)
    public Optional<matches> getMatchByID(@PathVariable("id") String id) {
        return matchesService.getMatchByID(id);
    }

    @RequestMapping(
            value = "/matches/create",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertMatch(
            @RequestBody matches match) {
        this.matchesService.insertMatch(match);

    }

    @RequestMapping(value = "/matches/delete/{id}", method = RequestMethod.DELETE)
    public void deleteMatchById(@PathVariable("id") int id) {
        matchesService.deleteMatchById(id);
    }

    @RequestMapping(value = "/matches/update",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateMatch(@RequestBody matches match){
        matchesService.updateMatch(match);
    }
}
