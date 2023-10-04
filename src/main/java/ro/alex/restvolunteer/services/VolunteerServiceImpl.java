package ro.alex.restvolunteer.services;

import org.springframework.stereotype.Service;
import ro.alex.restvolunteer.models.Volunteer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Service
public class VolunteerServiceImpl implements VolunteerService{

    private final String path = "C:\\rest-volunteer\\src\\main\\java\\ro\\alex\\restvolunteer\\out\\volunteer.txt";

    @Override
    public String addVolunteerForm(Volunteer volunteer) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
            volunteer.setId(UUID.randomUUID());
            out.write(volunteerToString(volunteer));
            out.append("\n");
            out.close();
        } catch (IOException e){
            return "Error " + e.getMessage();
        }
        return "Volunteer information saved";
    }


    private String volunteerToString(Volunteer volunteer) {
        return "ID: " + volunteer.getId() + "\n" +
                "Name: " + volunteer.getName() + "\n" +
                "Email: " + volunteer.getEmail() + "\n" +
                "Phone number: " + volunteer.getPhoneNumber() + "\n" +
                "Event: " + volunteer.getEventName() + "\n";

    }


}
