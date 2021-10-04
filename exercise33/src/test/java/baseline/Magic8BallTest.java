package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void getResponse() {
        assertEquals("Yes.", Magic8Ball.getResponse(0));
    }

    @Test
    void getResponse2() {
        assertEquals("Ask again later.", Magic8Ball.getResponse(3));
    }
}