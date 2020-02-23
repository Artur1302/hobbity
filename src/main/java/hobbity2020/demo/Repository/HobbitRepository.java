package hobbity2020.demo.Repository;

import hobbity2020.demo.Model.Hobbit;
import org.springframework.data.repository.CrudRepository;

public interface HobbitRepository extends CrudRepository<Hobbit, Long> {
}
