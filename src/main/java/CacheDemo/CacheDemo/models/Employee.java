package CacheDemo.CacheDemo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = 6527855645691638321L;

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne
    @JoinColumn(
            name = "companyId",
            nullable = true,
            foreignKey = @ForeignKey
    )
    @JsonIgnore
    private Company company;
}
