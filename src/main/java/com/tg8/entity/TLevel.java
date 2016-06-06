package com.tg8.entity;

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
public class TLevel extends IdEntity {

    private String levelIntro;

}
