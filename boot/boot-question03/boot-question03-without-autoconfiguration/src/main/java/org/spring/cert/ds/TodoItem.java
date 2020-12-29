package org.spring.cert.ds;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "TODO_ITEM")
public class TodoItem {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String title;
}
