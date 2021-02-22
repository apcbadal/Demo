package com.example.demo.Controller;

import com.example.demo.Service.ProjectService;
import com.example.demo.dtos.ProjectDTO;
import com.example.demo.dtos.ToDoListDTO;
import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    ProjectService projectService;

    @RequestMapping(value = "/todo",method = RequestMethod.GET)
    public ModelAndView todo(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("todo.html");
        return modelAndView;
    }

    @RequestMapping(value = "saveTodo",method = RequestMethod.POST)
    public ResponseEntity<?>saveData(@RequestBody ProjectDTO projectDTO){
        LocalDate createDate = LocalDate.now();
        projectDTO.setCreatedDate(createDate);
        for(ToDoListDTO toDoListDTO:projectDTO.getToDoListDTOS()){
            toDoListDTO.setProjectDTO(projectDTO);
        }
        projectService.save(projectDTO);
        return new ResponseEntity<>(new HttpHeaders(), HttpStatus.OK);
    }
}
