package at.jahodinsky.slm_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class APIControllerTest {
    APIController apiController = new APIController();

    @Test
    void KilogramTest() {
        assertEquals(1*6.35, apiController.kilogram(1.0));
    }

    @Test
    void GramTest() {
        assertEquals(1*28.35,
                apiController.gram(1.0));
    }

}