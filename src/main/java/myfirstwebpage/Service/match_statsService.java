package myfirstwebpage.Service;

import myfirstwebpage.dao.PlayersDao;
import myfirstwebpage.dao.match_statsDao;
import myfirstwebpage.repository.Entity.match_stats;
import myfirstwebpage.repository.Entity.players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;


@Service
public class match_statsService {


    @Autowired
    private match_statsDao statsDao;

    public Collection<match_stats> getAllStats(){
        return (Collection<match_stats>) statsDao.getAllstats();
    }

    public Optional<match_stats> getStatByID(int  mid){
        return this.statsDao.getStatById(mid);
    }

    public void  insertStat(match_stats stats) {

        this.statsDao.insertStats(stats);
    }
    public void deleteStatById(int mid){
        this.statsDao.deleteStatById(mid);
    }
    public void updateStat(match_stats stats){
        this.statsDao.updateStat(stats);
    }

}
