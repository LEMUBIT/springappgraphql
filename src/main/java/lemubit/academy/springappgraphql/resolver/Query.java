package lemubit.academy.springappgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lemubit.academy.springappgraphql.entity.Dog;
import lemubit.academy.springappgraphql.exception.DogNotFoundException;
import lemubit.academy.springappgraphql.repo.DogRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Maps to Graphql file queries
 * **/
@Component
public class Query implements GraphQLQueryResolver {
    private DogRepository dogRepository;

    public Query(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }


    public Iterable<Dog> findAllDogs() {
        return dogRepository.findAll();
    }

    public Dog findDogById(Long id) {
        Optional<Dog> optionalDog = dogRepository.findById(id);
        if (optionalDog.isPresent()) {
            return optionalDog.get();
        } else {
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }
}
