package badminton.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by penny19 on 15/11/23.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="t_level",catalog = "sports")
public class TLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String levelIntro;

}
