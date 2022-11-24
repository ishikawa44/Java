package group44.Project.repo;

import group44.Project.models.Tovars;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TovarsRepository extends CrudRepository<Tovars, Long> {
    List<Tovars> findAllByOrderByIdDesc();
}
