package myfirstwebpage.Controller;



import myfirstwebpage.Service.playersService;
import myfirstwebpage.repository.Entity.match_stats;
import myfirstwebpage.repository.Entity.players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class match_statsController {

    @Autowired
    private myfirstwebpage.Service.match_statsService statsService;


    @RequestMapping(value = "/stats",method = RequestMethod.GET)
    public Collection<match_stats> getAllStats() {
        return statsService.getAllStats();
    }

    @RequestMapping(value = "stats/{id}", method = RequestMethod.GET)
    public Optional<match_stats> getStatById(@PathVariable("id") int id) {
        return statsService.getStatByID(id);
    }

    @RequestMapping(
            value = "/stats/create",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStat(
            @RequestBody match_stats stats) {
        this.statsService.insertStat(stats);

    }

    @RequestMapping(value = "/stats/delete/{id}", method = RequestMethod.DELETE)
    public void deleteStatById(@PathVariable("id") int id) {
        statsService.deleteStatById(id);
    }

    @RequestMapping(value = "/stats/update",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStat(@RequestBody match_stats stats){
        statsService.updateStat(stats);
    }



}
