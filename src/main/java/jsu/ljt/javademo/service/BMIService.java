package jsu.ljt.javademo.service;

import jsu.ljt.javademo.pojo.BMIRecord;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BMIService {

    private List<BMIRecord> records = new ArrayList<>();

    // 保存BMI记录
    public void saveRecord(BMIRecord bmiRecord) {
        records.add(bmiRecord);
    }

    // 获取所有BMI记录
    public List<BMIRecord> getAllRecords() {
        return records;
    }
}
