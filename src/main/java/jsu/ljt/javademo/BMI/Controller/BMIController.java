package jsu.ljt.javademo.BMI.Controller;

import jsu.ljt.javademo.BMI.Service.BMIService;
import jsu.ljt.javademo.BMI.model.BMIRecord;
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
        bmiService.saveRecord(bmiRecord);
        return "记录已提交！";
    }

    // 获取BMI汇总报告
    @GetMapping("/report")
    public List<BMIRecord> getReport() {
        return bmiService.getAllRecords();
    }
}
