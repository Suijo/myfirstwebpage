package myfirstwebpage.repository;

import myfirstwebpage.repository.Entity.matches;
import org.springframework.data.repository.CrudRepository;

public interface MatchesRepository extends CrudRepository<matches,Integer> {
}
