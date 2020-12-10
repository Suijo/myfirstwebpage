package myfirstwebpage.repository;

import myfirstwebpage.repository.Entity.teams;
import org.springframework.data.repository.CrudRepository;

public interface TeamsRepository extends CrudRepository<teams,Integer> {
}
