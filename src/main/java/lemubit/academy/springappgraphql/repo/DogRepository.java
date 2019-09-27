package lemubit.academy.springappgraphql.repo;

import lemubit.academy.springappgraphql.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
