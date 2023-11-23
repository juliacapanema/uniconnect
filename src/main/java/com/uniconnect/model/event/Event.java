package com.uniconnect.model.event;

import com.uniconnect.model.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Event extends BaseEntity {

    private String name;

    private String place;

    private Date startDate;

    private Date endDate;
}