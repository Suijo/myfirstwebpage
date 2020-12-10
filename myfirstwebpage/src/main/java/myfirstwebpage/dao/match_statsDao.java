package myfirstwebpage.dao;

import myfirstwebpage.repository.Entity.match_stats;
import myfirstwebpage.repository.Match_statsRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class match_statsDao {
    private final Match_statsRepository repository;

    public match_statsDao(Match_statsRepository stats) {
        this.repository = stats;
    }
    public Iterable<match_stats> getAllstats(){
        return repository.findAll();

    }
    public Optional<match_stats> getStatById(int mid){

        return this.repository.findById(mid);
    }
    public void  insertStats (match_stats stats) {
        this.repository.save(stats);
        System.out.println("Match Stat Succesfully added");
    }

    public void deleteStatById(int id) {
        this.repository.deleteById(id);
        System.out.println("Match Stat Successfully deleted");
    }

    public void updateStat(match_stats stat){
        this.repository.save(stat);
        System.out.println("Match Stat successfully uptadet");
    }
}
