package jsu.ljt.javademo.controller;

import jsu.ljt.javademo.service.VolunteerService;
import jsu.ljt.javademo.pojo.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @Autowired
    private VolunteerService volunteerService;

    // 添加志愿者
    @PostMapping("/add")
    public List<Volunteer> addVolunteer(@RequestBody Volunteer volunteer) {
        volunteerService.addVolunteer(volunteer);
        // 返回所有志愿者信息
        return volunteerService.getAllVolunteers();
    }

    // 获取所有志愿者
    @GetMapping("/all")
    public List<Volunteer> getAllVolunteers() {
        return volunteerService.getAllVolunteers();
    }
}