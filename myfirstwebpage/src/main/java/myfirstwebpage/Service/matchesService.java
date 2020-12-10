package myfirstwebpage.Service;

import myfirstwebpage.dao.PlayersDao;
import myfirstwebpage.dao.matchesDao;
import myfirstwebpage.repository.Entity.matches;
import myfirstwebpage.repository.Entity.players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;


@Service
public class matchesService {


    @Autowired
    private myfirstwebpage.dao.matchesDao matchesDao;

    public Collection<matches> getAllMatches(){
        return matchesDao.getAllmatches();
    }

    public Optional<matches> getMatchByID(String mid){
        return this.matchesDao.getMatchById(mid);
    }

    public void  insertMatch(matches match) {
        this.matchesDao.insertMatch(match);
    }
    public void deleteMatchById(int mid){
        this.matchesDao.deleteMatchById(mid);
    }
    public void updateMatch(matches match){
        this.matchesDao.updateMatch(match);
    }

}
