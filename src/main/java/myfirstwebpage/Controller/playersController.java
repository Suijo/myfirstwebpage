package myfirstwebpage.Controller;


import myfirstwebpage.Service.playersService;
import myfirstwebpage.repository.Entity.players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
class PlayerController{

    @Autowired
    private playersService playersService;


    @RequestMapping(value = "/players",method = RequestMethod.GET)
    public Collection<players> getAllMembers() {
        return playersService.getAllMembers();
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.GET)
    public Optional<players> getMemberById(@PathVariable("id") int id) {
        return playersService.getPlayerByID(id);
    }

    @RequestMapping(
            value = "/players/create",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertPlayer(
            @RequestBody players player) {
       this.playersService.insertPlayer(player);

    }

    @RequestMapping(value = "/players/delete/{id}", method = RequestMethod.DELETE)
    public void deletePlayerById(@PathVariable("id") int id) {
        playersService.deletePlayerById(id);
    }

    @RequestMapping(value = "/players/update",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePlayer(@RequestBody players player){
        playersService.updatePlayer(player);
    }
}
