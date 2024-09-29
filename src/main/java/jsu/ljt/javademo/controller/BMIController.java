package jsu.ljt.javademo.controller;

import jsu.ljt.javademo.service.BMIService;
import jsu.ljt.javademo.pojo.BMIRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bmi")
public class BMIController {

    @Autowired
    private BMIService bmiService;

    // 提交BMI记录
    @PostMapping("/submit")
    public String submitRecord(@RequestBody BMIRecord bmiRecord) {
        System.out.println("提交记录：" + bmiRecord);
        bmiService.saveRecord(bmiRecord);
        return "记录已提交！";
    }

    // 获取BMI汇总报告
    @GetMapping("/report")
    public List<BMIRecord> getReport() {
        return bmiService.getAllRecords();
    }
}
