package jsu.ljt.javademo.VolunteerDemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Volunteer {
    private String name;
    private String studentId;
    private String activity;
    private String date;
    private Double duration;
}
