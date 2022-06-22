package at.jahodinsky.slm_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class APIControllerTest {
    APIController apiController = new APIController();

    @Test
    void KilogramTest() {
        assertEquals(1*6.35, apiController.kilogram(1.0));
    }

}