package com.zc.demo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

// 测试方法的执行顺序按照 @Order 注解中的值来确定
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BMIUtilTest {

    // 在所有测试用例执行之前初始化环境
    @BeforeAll
    static void init() {
        System.out.println("初始化测试环境");
    }

    // 在每个测试用例执行之前设置必要的条件
    @BeforeEach
    void setUp() {
        System.out.println("开始执行测试用例");
    }

    // 测试正常的BMI值
    @Test
    @Order(1) // 按照顺序执行
    @DisplayName("测试正常BMI") // 定义测试方法的显示名称
    void testNormalBMI() {
        double weight = 60;
        double height = 1.7;
        String expectedResult = "正常";

        String result = BMIUtil.calculateBMI(weight, height);

        assertEquals(expectedResult, result); // 检查结果是否符合预期
    }

    // 测试偏瘦的BMI值
    @Test
    @Order(2)
    @DisplayName("测试偏瘦BMI")
    void testUnderweightBMI() {
        double weight = 45;
        double height = 1.7;
        String expectedResult = "偏瘦";

        String result = BMIUtil.calculateBMI(weight, height);

        assertEquals(expectedResult, result); // 检查结果
    }

    // 测试偏胖的BMI值
    @Test
    @Order(3)
    @DisplayName("测试偏胖BMI")
    void testOverweightBMI() {
        double weight = 70;
        double height = 1.7;
        String expectedResult = "偏胖";

        String result  = BMIUtil.calculateBMI(weight, height);

        assertEquals(expectedResult, result); // 确认结果是否匹配预期
    }

    // 测试肥胖的BMI值
    @Test
    @Order(4)
    @DisplayName("测试肥胖BMI")
    void testObeseBMI() {
        double weight = 90;
        double height = 1.7;
        String expectedResult = "肥胖";

        String result = BMIUtil.calculateBMI(weight, height);

        assertEquals(expectedResult, result); // 验证结果
    }

    // 测试非法输入（负数）
    @Test
    @DisplayName("测试非法输入") // 显示名称
    void testInvalidInput() {
        double weight = -10; // 非法体重
        double height = 1.7;

        assertThrows(IllegalArgumentException.class, () -> {
            BMIUtil.calculateBMI(weight, height); // 应抛出异常
        });
    }

    // 在每个测试用例执行后进行必要的清理工作
    @AfterEach
    void tearDown() {
        System.out.println("结束执行测试用例");
    }

    // 在所有测试用例执行之后进行最终的清理工作
    @AfterAll
    static void cleanUp() {
        System.out.println("清理测试环境");
    }
}
