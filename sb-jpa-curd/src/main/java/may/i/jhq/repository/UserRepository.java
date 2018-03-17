package may.i.jhq.repository;

import may.i.jhq.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author jinhuaquan
 * @create 2018-03-17 下午11:49
 * @desc
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
