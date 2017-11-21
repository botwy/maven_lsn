package com.orm;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class NewsId implements Serializable{

        private String title;
        private String language;

}
