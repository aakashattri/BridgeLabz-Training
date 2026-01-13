import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTesting {
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator=new Calculator();
        System.out.println("System setUp successfull");
    }
    @AfterEach
    void Detail() {
        System.out.println("Successfull");
    }

    @Test
    @DisplayName("Test Addition Method")
    void testAddition() {
        assertEquals(10, calculator.addition(5, 5),"Addition Should be correct");
    }
    @Test
    @DisplayName("Test Substraction Method")
    void testSubstraction() {
        assertEquals(4, calculator.substraction(8, 4),"Substraction Should be correct");
    }
    @Test
    @DisplayName("Test Multiplications Method")
    void testMultiply() {
        assertEquals(25, calculator.multiply(5, 5),"Multiplications Should be correct");
    }
    @Test
    @DisplayName("Test Division Method")

    void testDivision() {
        assertEquals(5, calculator.division(25, 5),"Division Should be correct");
    }


}