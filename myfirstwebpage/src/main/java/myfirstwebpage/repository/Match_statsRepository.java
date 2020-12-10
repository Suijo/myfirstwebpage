package myfirstwebpage.repository;

import myfirstwebpage.repository.Entity.match_stats;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface Match_statsRepository extends CrudRepository<match_stats, Integer> {


    Optional<match_stats> findById(String id);
}
