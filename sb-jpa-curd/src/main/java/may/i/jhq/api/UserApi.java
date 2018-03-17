package may.i.jhq.api;

import may.i.jhq.domain.User;
import may.i.jhq.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author jinhuaquan
 * @create 2018-03-17 下午11:51
 * @desc The api of user
 **/
@RestController
@RequestMapping(value = "/api/users")
public class UserApi {

    /** logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserApi.class);


    @Autowired
    private UserRepository userRepository;

    @PostMapping("")
    public User saveUser(@RequestBody User user) {
        LOGGER.info("Api calling : Save a new user");

        return userRepository.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public Boolean removeUser(@PathVariable Long id) {
        LOGGER.info("Api calling : delete the user by id");

        userRepository.delete(id);

        return Boolean.TRUE;
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable Long id) {
        LOGGER.info("Api calling : get the user by id");

        return userRepository.findOne(id);
    }
}
