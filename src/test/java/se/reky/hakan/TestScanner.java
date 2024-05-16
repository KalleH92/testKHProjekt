package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestScanner {
    Scanner scanner;

    @BeforeEach
    public void setUp() {scanner = new Scanner("Hello world");}
    @DisplayName("Testing Scanner input")
    @Test
    void testScanner() {assertEquals("Hello world", scanner.nextLine());
    }
}
