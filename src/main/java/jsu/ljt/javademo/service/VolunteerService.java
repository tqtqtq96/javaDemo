package jsu.ljt.javademo.service;

import jsu.ljt.javademo.pojo.Volunteer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VolunteerService {
    private List<Volunteer> volunteers = new ArrayList<>();
    /**
     * 添加志愿者
     * @param volunteer
     */
    public void addVolunteer(Volunteer volunteer){
        volunteers.add(volunteer);
    }


    /**
     * 获取所有志愿者
     * @return
     */
    public List<Volunteer> getAllVolunteers(){
        return volunteers;
    }
}
