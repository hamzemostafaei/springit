package com.hamze.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor

public class Comment {

    @Id
    @GeneratedValue

    private long id;
    private String body;

    @ManyToOne
    private Link link;
}
