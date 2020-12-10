package myfirstwebpage.Service;


import myfirstwebpage.dao.PlayersDao;
import myfirstwebpage.repository.Entity.players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class playersService {

    @Autowired
    private PlayersDao playersDao;

    public Collection<players> getAllMembers(){
        return playersDao.getAllMembers();
    }

    public Optional<players> getPlayerByID(int pid){
        return this.playersDao.getPlayerById(pid);
    }

    public void  insertPlayer(players player) {
         this.playersDao.insertPlayer(player);
    }
    public void deletePlayerById(int pid){
        this.playersDao.deletePlayerById(pid);
    }
    public void updatePlayer(players player){
        this.playersDao.updatePlayer(player);
    }

}
