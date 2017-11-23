package com.orm;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class News {
    @EmbeddedId
    private NewsId id;
    private String content;
}
