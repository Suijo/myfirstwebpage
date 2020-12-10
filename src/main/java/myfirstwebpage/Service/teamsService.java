package myfirstwebpage.Service;

import myfirstwebpage.dao.PlayersDao;
import myfirstwebpage.dao.teamsDao;
import myfirstwebpage.repository.Entity.players;
import myfirstwebpage.repository.Entity.teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;


@Service
public class teamsService {


    @Autowired
    private myfirstwebpage.dao.teamsDao teamsDao;

    public Collection<teams> getAllTeams(){
        return (Collection<teams>) teamsDao.getAllTeams();
    }

    public Optional<teams> getTeamByID(int tid){
        return this.teamsDao.getTeamById(tid);
    }

    public void  insertTeam(teams team) {
        this.teamsDao.insertTeams(team);
    }
    public void deleteTeamById(int tid){
        this.teamsDao.deleteTeamById(tid);
    }
    public void updateTeam(teams team){
        this.teamsDao.updateTeam(team);
    }

}
