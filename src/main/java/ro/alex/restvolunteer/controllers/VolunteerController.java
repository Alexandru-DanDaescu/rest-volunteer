package ro.alex.restvolunteer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.alex.restvolunteer.models.Volunteer;
import ro.alex.restvolunteer.services.VolunteerService;

@RestController
@RequestMapping("/volunteers")
public class VolunteerController {

    private final VolunteerService volunteerService;

    public VolunteerController(VolunteerService volunteerService){
        this.volunteerService = volunteerService;
    }

    @PostMapping()
    public ResponseEntity<String> addVolunteerForm(@RequestBody Volunteer volunteer){
        return ResponseEntity.ok(volunteerService.addVolunteerForm(volunteer));
    }


}
