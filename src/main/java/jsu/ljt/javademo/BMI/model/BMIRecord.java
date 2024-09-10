package jsu.ljt.javademo.BMI.model;


import lombok.*;

@Data
public class BMIRecord {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String feedback;

    // 构造函数
    public BMIRecord(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.bmi = calculateBMI();
        this.feedback = generateFeedback();
    }

    // 计算BMI的方法
    private double calculateBMI() {
        return weight / (height * height);
    }

    // 根据BMI生成健康反馈
    private String generateFeedback() {
        if (bmi < 18.5) {
            return "体重过轻，建议增加营养摄入。";
        } else if (bmi < 24.9) {
            return "体重正常，保持良好的生活习惯。";
        } else {
            return "体重偏重，建议适当的运动和调整饮食。";
        }
    }

    public String toString() {
        return "姓名：" + name + "\n身高：" + height + "米\n体重：" + weight + "千克\nBMI：" + bmi + "\n健康反馈：" + feedback;
    }

}
