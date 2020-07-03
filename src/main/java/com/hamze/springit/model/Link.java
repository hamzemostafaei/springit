package com.hamze.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
public class Link {

    @Id
    @GeneratedValue

    private long id;
    private String title;
    private String url;

}
