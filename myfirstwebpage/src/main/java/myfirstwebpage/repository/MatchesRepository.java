package myfirstwebpage.repository;

import myfirstwebpage.repository.Entity.matches;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MatchesRepository extends CrudRepository<matches,Integer> {

    Optional<matches> findById(String mid);
}
