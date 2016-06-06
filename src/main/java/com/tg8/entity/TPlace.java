package com.tg8.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by penny19 on 16/6/6.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="t_place",catalog = "sports")
public class TPlace extends IdEntity {

    private String name;
    private String place;
    private String longitude;
    private String latitude;
}
