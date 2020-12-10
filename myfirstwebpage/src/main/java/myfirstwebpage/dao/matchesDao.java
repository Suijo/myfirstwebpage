package myfirstwebpage.dao;

import myfirstwebpage.repository.Entity.matches;
import myfirstwebpage.repository.MatchesRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public class matchesDao {

    private final MatchesRepository repository;

    public matchesDao(MatchesRepository matches) {
        this.repository = matches;
    }
    public Collection<matches> getAllmatches(){
        return (Collection<matches>) repository.findAll();
    }

    public Optional<matches> getMatchById(int id){

        return this.repository.findById(id);
    }

    public void  insertMatch(matches match) {
        this.repository.save(match);
        System.out.println("Match Succesfully added");
    }

    public void deleteMatchById(int id) {
        this.repository.deleteById(id);
        System.out.println("Match Successfully deleted");
    }

    public void updateMatch(matches match){
        this.repository.save(match);
        System.out.println("Match successfully uptadet");
    }
}
