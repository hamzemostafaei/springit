package com.hamze.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class comment {

    @Id
    @GeneratedValue

    private long id;
    private String body;

}
