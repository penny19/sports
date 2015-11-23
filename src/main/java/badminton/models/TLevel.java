package badminton.models;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by penny19 on 15/11/23.
 */
@Entity
@Data
public class TLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String levelintro;

}
