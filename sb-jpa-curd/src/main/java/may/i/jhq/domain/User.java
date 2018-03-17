package may.i.jhq.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author jinhuaquan
 * @create 2018-03-17 下午11:44
 * @desc The domain of user
 **/
@Data
@Entity
@Table(name = "s_user")
public class User implements Serializable {

    private static final long serialVersionUID = 19950620;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "u_id")
    private Long id;

    @Column(length = 32, name = "u_name")
    private String name;

    @Column(name = "u_age")
    private Integer age;
}
