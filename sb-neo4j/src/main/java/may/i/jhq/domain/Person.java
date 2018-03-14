package may.i.jhq.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author jinhuaquan
 * @create 2018-03-14 上午10:49
 * @desc The domain of person
 **/
@NodeEntity
@Data
public class Person {

    @GraphId
    private Long id;

    private String firstName;

    private String lastName;

}
