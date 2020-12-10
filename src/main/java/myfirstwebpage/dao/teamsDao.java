package myfirstwebpage.dao;

import myfirstwebpage.repository.Entity.teams;
import myfirstwebpage.repository.TeamsRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class teamsDao {


    private final TeamsRepository repository;

    public teamsDao(TeamsRepository teams) {
        this.repository = teams;
    }


    public Iterable<teams> getAllTeams(){
        return repository.findAll();

    }
    public Optional<teams> getTeamById(int id){

        return this.repository.findById(id);
    }
    public void  insertTeams(teams team) {
        this.repository.save(team);
        System.out.println("Team Succesfully added");
    }

    public void deleteTeamById(int id) {
        this.repository.deleteById(id);
        System.out.println("Team Successfully deleted");
    }

    public void updateTeam(teams team){
        this.repository.save(team);
        System.out.println("Team successfully uptadet");
    }
}
