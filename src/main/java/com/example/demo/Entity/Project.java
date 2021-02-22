package com.example.demo.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Project {
    private Long uniqueId;
    private String title;
    private LocalDate createdDate;
    private List<ToDoLists> toDoListsList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_unique_id")
    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Basic
    @Column(name = "project_title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "project_create_date")
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @OneToMany(mappedBy = "project",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    public List<ToDoLists> getToDoListsList() {
        return toDoListsList;
    }

    public void setToDoListsList(List<ToDoLists> toDoListsList) {
        this.toDoListsList = toDoListsList;
    }
}
