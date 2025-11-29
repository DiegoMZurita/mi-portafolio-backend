package com.portafolio.mi_portafolio_backend.rest;


import com.portafolio.mi_portafolio_backend.model.Education;
import com.portafolio.mi_portafolio_backend.service.IEducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (("/api/education"))
public class EducationController {
    private  final IEducationService educationService;

    public EducationController(IEducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping
    public List<Education> findAll() {
        return educationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Education> findById(@PathVariable Long id) {
        Optional<Education> education = educationService.findById(id);
        if(education.isPresent()){
            return new ResponseEntity<>(education.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Education save(@RequestBody Education education) {
        return educationService.save(education);
    }

    @PutMapping("/{id}")
    public Education update(@PathVariable Long id, @RequestBody Education education) {
        education.setId(id);
        return educationService.save(education);
    }

    @DeleteMapping("/{id}")
    public void deleleById(@PathVariable Long id) {
        educationService.deleteById(id);
    }
}
