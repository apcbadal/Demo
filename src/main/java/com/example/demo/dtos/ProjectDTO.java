package com.example.demo.dtos;

import com.example.demo.Entity.ToDoLists;

import java.time.LocalDate;
import java.util.List;

public class ProjectDTO {
    private Long uniqueId;
    private String Title;
    private LocalDate createdDate;
    private List<ToDoListDTO> toDoListDTOS;

    public Long getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Long uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public List<ToDoListDTO> getToDoListDTOS() {
        return toDoListDTOS;
    }

    public void setToDoListDTOS(List<ToDoListDTO> toDoListDTOS) {
        this.toDoListDTOS = toDoListDTOS;
    }


}
