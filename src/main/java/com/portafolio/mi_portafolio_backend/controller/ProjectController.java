package com.portafolio.mi_portafolio_backend.controller;

import com.portafolio.mi_portafolio_backend.dto.ProjectDto;
import com.portafolio.mi_portafolio_backend.dto.ProjectMapper;
import com.portafolio.mi_portafolio_backend.model.Project;
import com.portafolio.mi_portafolio_backend.service.FileStorageService;
import com.portafolio.mi_portafolio_backend.service.IProjectService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/projects")
public class ProjectController {

    private final IProjectService projectService;
    private final FileStorageService fileStorageService;


    @GetMapping
    public String getAll(Model model) {
        List<ProjectDto> projects = projectService.findALL().stream()
                .map(ProjectMapper::toDto)
                .toList();
        model.addAttribute("projects", projects);
        return "projects/list";
    }

    @GetMapping("/new-project")
    public String showForm(Model model){
        model.addAttribute("projectDto", new ProjectDto());
        return "projects/form-project";
    }

    @PostMapping("/save")
    public String saveProject(@Valid @ModelAttribute("projectDto") ProjectDto projectDto,
                                @RequestParam("file") MultipartFile file
    ){
        try{
            String imageURL = fileStorageService.storeFile(file);

            projectDto.setImageUrl(imageURL);

            Project project = ProjectMapper.toEntity(projectDto);

            projectService.save(project);

            return "redirect:/projects";

        }catch (IOException e){
            return "error-page";
        }

    }

}
