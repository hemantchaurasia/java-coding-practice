package org.digi.marvel.numbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void init() {
        solution = new Solution();
    }

    @AfterEach
    public void destroy() {
        solution = null;
    }

    @Test
    @DisplayName("Test when input number is not provided between 1-9")
    public void whenNotEnterAValidInputNumber() {
        assertEquals("Please enter a valid number between 1 to 9", solution.run(10));
    }

    @Test
    @DisplayName("Test valid case expected result")
    public void whenNumberIsValidIncreasingOrder() {
        assertEquals(" 11  12  13  14  15  16  17  18  19  22  23  24  25  26  27  28  29  33  34  35  36  37  38  39  44  45  46  47  48  49  55  56  57  58  59  66  67  68  69  77  78  79  88  89  99 ", solution.run(2));
    }

/*  @Test
    @DisplayName("Test negative scenario when when number start with zero")
    public void whenNumberStartWithZero() {
        assertEquals(" 00  01  02  03  04  05  06  07  08  09  11  12  13  14  15  16  17  18  19  22  23  24  25  26  27  28  29  33  34  35  36  37  38  39  44  45  46  47  48  49  55  56  57  58  59  66  67  68  69  77  78  79  88  89  99 ", solution.run(2));
    }

    @Test
    @DisplayName("Test negative scenario when when numbers are not increasing")
    public void whenNumberAreNotAccendingOrder() {
        assertEquals(" 00  01  02  03  04  05  06  07  08  09  11  12  13  14  15  16  17  18  19  22  23  24  25  26  27  28  29  33  34  35  36  37  38  39  44  45  46  47  48  49  55  56  57  58  59  66  67  68  69  77  78  79  88  89  99 ", solution.run(2));
    }*/

}
