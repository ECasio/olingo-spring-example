package com.github.olingo.example.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="FATHER")
public class Father {
    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "FATHER_ID")
    private List<Child> childList = new ArrayList<Child>();

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Father father = (Father) o;
        return Objects.equals(id, father.id) &&
                Objects.equals(name, father.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}