package se.reky.hakan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class IOHandlerTest {

    private IOHandler ioHandler;

    private IOHandler testHandler (String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        return new IOHandler(scanner);
    }

    @DisplayName("Testing input from new instance scanner")
    @Test
    void test_input_from_scanner(){
        ioHandler = testHandler("privet");
        assertEquals("privet", ioHandler.nextLine());
    }

    @DisplayName("Testing if its true was retuend")
    @Test
    void hasNextIntTest(){
        ioHandler = testHandler("1");
        assertTrue(ioHandler.hasNextInt());
    }

}