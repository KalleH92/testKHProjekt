package se.reky.hakan;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class IOHandlerTest {

    private IOHandler ioHandler;

    private IOHandler getIoHandler (String dataForScanner) {
        ioHandler = new IOHandler(new Scanner(dataForScanner));
        return ioHandler;
    }

    @DisplayName("Testing input from new instance scanner")
    @Test
    void test_input_from_scanner(){
        assertEquals("test", getIoHandler("test").nextLine());
    }

    @DisplayName("Testing if its true was returned")
    @Test
    void hasNextIntTest(){
        assertTrue(getIoHandler("5").hasNextInt());
    }

}