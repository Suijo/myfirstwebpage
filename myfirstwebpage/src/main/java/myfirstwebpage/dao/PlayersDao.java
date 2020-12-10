package myfirstwebpage.dao;


import myfirstwebpage.repository.Entity.players;
import myfirstwebpage.repository.playersRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;




@Repository
public class PlayersDao {

    private final playersRepository repository;

    public PlayersDao(playersRepository players) {
        this.repository = players;
    }


    public Collection<players> getAllMembers(){
        return (Collection<players>) repository.findAll();
    }

    public Optional<players> getPlayerById(int id){
        return this.repository.findById(id);
    }


    public void  insertPlayer(players players) {
        this.repository.save(players);
        System.out.println("Player Succesfully added");
    }

    public void deletePlayerById(int id) {
        this.repository.deleteById(id);
        System.out.println("Player Successfully deleted");
    }

    public void updatePlayer(players player){
       this.repository.save(player);
       System.out.println("Player successfully uptadet");
    }
}
