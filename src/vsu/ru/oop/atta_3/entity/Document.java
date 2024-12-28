package vsu.ru.oop.atta_3.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;


@Entity
@Table(name = "num")

public class Document {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")


    @Column(nullable = false, name = "name")
    private String name;


    @Column(nullable = false, name = "age")
    private int age;

    @Column(nullable = false, name = "lessons_count")
    private int lessons_count;

    @Column(nullable = false, name = "body")
    private String body;
    @Column(nullable = false, unique = true, name = "id")
    private UUID document_id;




    public UUID getDocument_id() {
        return document_id;
    }

    public void setDocument_id(UUID document_id) {
        this.document_id = document_id;
    }

    public String getDocument_name() {
        return name;
    }

    public void setDocument_name(String name) {
        this.name = name;
    }

    public int getDocument_age() {
        return age;
    }

    public void setDocument_lessonscount(int lessons_count) {
        this.lessons_count = lessons_count;
    }

    public int getDocument_lessonscount() {
        return lessons_count;
    }

    public void setDocument_age(int age) {
        this.age = age;
    }

    public String getDocument_body() {
        return body;
    }

    public void setDocument_body(String body) {
        this.body = body;
    }
}
