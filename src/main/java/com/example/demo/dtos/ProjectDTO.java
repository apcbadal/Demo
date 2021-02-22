package com.example.demo.dtos;

import java.time.LocalDate;
import java.util.List;

public class ProjectDTO {
    private Long uniqueId;
    private String title;
    private LocalDate createdDate;
    private List<ToDoListDTO> toDoLists;

    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public List<ToDoListDTO> getToDoLists() {
        return toDoLists;
    }

    public void setToDoLists(List<ToDoListDTO> toDoLists) {
        this.toDoLists = toDoLists;
    }


}
