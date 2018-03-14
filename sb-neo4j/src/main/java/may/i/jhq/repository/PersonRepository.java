package may.i.jhq.repository;

import may.i.jhq.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author jinhuaquan
 * @create 2018-03-14 上午10:51
 * @desc The repository of person
 **/
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{

    List<Person> findByLastName(@Param("name") String name);
}
