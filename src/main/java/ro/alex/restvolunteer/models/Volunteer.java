package ro.alex.restvolunteer.models;

import lombok.Data;

import java.util.UUID;
@Data
public class Volunteer {


    private UUID id;
    private String name;
    private String email;
    private String phoneNumber;
    private String eventName;
}
