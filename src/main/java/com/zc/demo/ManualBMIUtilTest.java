package com.zc.demo;

/**
 * 手动编写的单元测试类，用于测试 BMIUtil 类的功能。
 */
public class ManualBMIUtilTest {

    /**
     * 主方法，用于执行测试方法。
     */
    public static void main(String[] args) {
        testNormalBMI();
        testUnderweightBMI();
        testOverweightBMI();
        testObeseBMI();
        testInvalidInput();
    }

    /**
     * 测试正常BMI值的方法。
     */
    private static void testNormalBMI() {
        double weight = 60;
        double height = 1.7;
        String expectedResult = "正常";

        // 调用 BMIUtil 类的计算方法
        String result = BMIUtil.calculateBMI(weight, height);

        // 检查结果是否符合预期，并输出测试结果
        if (expectedResult.equals(result)) {
            System.out.println("正常BMI测试通过");
        } else {
            System.out.println("正常BMI测试失败");
        }
    }

    /**
     * 测试偏瘦BMI值的方法。
     */
    private static void testUnderweightBMI() {
        double weight = 45;
        double height = 1.7;
        String expectedResult = "偏瘦";

        String result = BMIUtil.calculateBMI(weight, height);

        if (expectedResult.equals(result)) {
            System.out.println("偏瘦BMI测试通过");
        } else {
            System.out.println("偏瘦BMI测试失败");
        }
    }

    /**
     * 测试偏胖BMI值的方法。
     */
    private static void testOverweightBMI() {
        double weight = 70;
        double height = 1.7;
        String expectedResult = "偏胖";

        String result = BMIUtil.calculateBMI(weight, height);

        if (expectedResult.equals(result)) {
            System.out.println("偏胖BMI测试通过");
        } else {
            System.out.println("偏胖BMI测试失败");
        }
    }

    /**
     * 测试肥胖BMI值的方法。
     */
    private static void testObeseBMI() {
        double weight = 90;
        double height = 1.7;
        String expectedResult = "肥胖";

        String result = BMIUtil.calculateBMI(weight, height);

        if (expectedResult.equals(result)) {
            System.out.println("肥胖BMI测试通过");
        } else {
            System.out.println("肥胖BMI测试失败");
        }
    }

    /**
     * 测试非法输入的方法。
     */
    private static void testInvalidInput() {
        double weight = -10; // 非法体重
        double height = 1.7;
        boolean exceptionThrown = false;

        // 捕获 IllegalArgumentException 异常，表示非法输入
        try {
            BMIUtil.calculateBMI(weight, height);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }

        // 检查是否抛出异常，并输出测试结果
        if (exceptionThrown) {
            System.out.println("非法输入测试通过");
        } else {
            System.out.println("非法输入测试失败");
        }
    }
}
