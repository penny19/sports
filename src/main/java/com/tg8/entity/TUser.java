package com.tg8.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

import javax.persistence.*;

/**
 * Created by penny19 on 15/10/11.
 */
@Entity
@Table(name="t_user",catalog = "sports")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j
public class TUser extends IdEntity {

    private String userName;
    private Boolean userGender;

    @ManyToOne
    private TLevel Level;

}
