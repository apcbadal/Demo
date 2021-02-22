package com.example.demo.Service;

import com.example.demo.Entity.Project;
import com.example.demo.Repository.ProjectRepository;
import com.example.demo.dtos.ProjectDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl  implements ProjectService{
    @Autowired
    ProjectRepository projectRepository;

    @Override
    public void save(ProjectDTO projectDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Project project=null;
        project = modelMapper.map(projectDTO,Project.class);
        projectRepository.save(project);
    }
}
