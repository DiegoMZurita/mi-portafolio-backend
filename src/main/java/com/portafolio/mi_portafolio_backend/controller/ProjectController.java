package com.portafolio.mi_portafolio_backend.controller;

import com.portafolio.mi_portafolio_backend.dto.ProjectDto;
import com.portafolio.mi_portafolio_backend.mapper.ProjectMapper;
import com.portafolio.mi_portafolio_backend.model.Project;
import com.portafolio.mi_portafolio_backend.service.FileStorageService;
import com.portafolio.mi_portafolio_backend.service.IProjectService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.Optional;
>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)

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

<<<<<<< HEAD
=======
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Optional<Project> projectOptional = projectService.findById(id);

        if(projectOptional.isPresent()) {
            model.addAttribute("projectDto", ProjectMapper.toDto(projectOptional.get()));
            return "projects/form-project";
        }

        return "redirect:/projects";
    }

>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)
    @PostMapping("/save")
    public String saveProject(@Valid @ModelAttribute("projectDto") ProjectDto projectDto, BindingResult result,
                                @RequestParam("file") MultipartFile file
    ){
<<<<<<< HEAD
        if(file.isEmpty()){
=======
        boolean isCreating = projectDto.getId() == null;

        if(isCreating && file.isEmpty()){
>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)
            result.rejectValue("imageUrl","file.required", "La imagen del proyecto es obligatoria.");
        }

        if(result.hasErrors()){
            return "projects/form-project";
        }

        try{
<<<<<<< HEAD
            String imageURL = fileStorageService.storeFile(file);

            projectDto.setImageUrl(imageURL);
=======
            if(!file.isEmpty()) {
                String imageURL = fileStorageService.storeFile(file);
                projectDto.setImageUrl(imageURL);
            } else if(!isCreating) {
                projectService.findById(projectDto.getId())
                        .map(Project::getImageUrl)
                        .ifPresent(projectDto::setImageUrl);
            }
>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)

            Project project = ProjectMapper.toEntity(projectDto);

            projectService.save(project);

            return "redirect:/projects";

        }catch (IOException e){
            return "error-page";
        }

    }

<<<<<<< HEAD
=======
    @PostMapping("/delete/{id}")
    public String deleteProject(@PathVariable Long id) {
        projectService.deleteById(id);
        return "redirect:/projects";
    }

>>>>>>> 3b90af7 (Actualizacion portafolio y preparado para despliegue)
}
