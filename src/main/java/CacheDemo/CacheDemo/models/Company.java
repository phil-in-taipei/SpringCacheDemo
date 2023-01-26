package CacheDemo.CacheDemo.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Company implements Serializable {

    private static final long serialVersionUID = 4502207642216411443L;

    @Id
    @GeneratedValue
    private int id;
    private String name;

    //@OneToMany(mappedBy = "company")
    //private Collection<Employee> employees;
}
