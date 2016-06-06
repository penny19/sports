package com.tg8.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by penny19 on 15/10/11.
 */
@Entity
@Table(name="t_club",catalog = "sports")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j
public class TClub extends IdEntity {

    private String clubName;

    private Date foundTime;

    private String activeRange;

    @ManyToOne
    private TUser founder;

    private String intro;


}
