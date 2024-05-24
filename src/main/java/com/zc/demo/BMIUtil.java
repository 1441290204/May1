package com.zc.demo;

public class BMIUtil {
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static String calculateBMI(double weight, double height) {

        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive numbers.");
        }

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            return "偏瘦";
        } else if (bmi >= 18.5 && bmi < 24) {
            return "正常";
        } else if (bmi >= 24 && bmi < 28) {
            return "偏胖";
        } else {
            return "肥胖";
        }
    }


}
