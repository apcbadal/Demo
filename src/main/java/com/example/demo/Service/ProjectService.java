package com.example.demo.Service;

import com.example.demo.dtos.ProjectDTO;
import org.springframework.stereotype.Service;

@Service
public interface ProjectService {
    void save(ProjectDTO projectDTO);
}
