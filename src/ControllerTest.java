import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    Controller controller = new Controller();

    @Test
    void setX1() {
        assertFalse(controller.setX1(-1));
        assertFalse(controller.setX1(801));
        assertTrue(controller.setX1(0));
        assertTrue(controller.setX1(800));
    }

    @Test
    void setY1() {
        assertFalse(controller.setX1(-1));
        assertFalse(controller.setX1(801));
        assertTrue(controller.setX1(0));
        assertTrue(controller.setX1(800));
    }

    @Test
    void setX2() {
        int x1 = 100;
        controller.setX1(x1);
        assertFalse(controller.setX2(x1));
        assertFalse(controller.setX2(901));
        assertTrue(controller.setX2(x1 + 1));
        assertTrue(controller.setX2(900));
    }

    @Test
    void setY2() {
        int y1 = 100;
        controller.setY1(y1);
        assertFalse(controller.setY2(y1));
        assertFalse(controller.setY2(901));
        assertTrue(controller.setY2(y1 + 1));
        assertTrue(controller.setY2(900));
    }

    @Test
    void setX() {
        int x1 = 100;
        int x2 = 800;
        controller.setX1(x1);
        controller.setX2(x2);
        assertFalse(controller.setX(x1));
        assertFalse(controller.setX(x2 - 20));
        assertTrue(controller.setX(x1 + 1));
        assertTrue(controller.setX(x2 - 21));
    }

    @Test
    void setY() {
        int y1 = 100;
        int y2 = 800;
        controller.setY1(y1);
        controller.setY2(y2);
        assertFalse(controller.setY(y1));
        assertFalse(controller.setY(y2 - 20));
        assertTrue(controller.setY(y1 + 1));
        assertTrue(controller.setY(y2 - 21));
    }

    @Test
    void setVx() {
        assertFalse(controller.setVx(-11));
        assertFalse(controller.setVx(11));
        assertTrue(controller.setVx(-10));
        assertTrue(controller.setVx(10));
    }

    @Test
    void setVy() {
        assertFalse(controller.setVy(-11));
        assertFalse(controller.setVy(11));
        assertTrue(controller.setVy(-10));
        assertTrue(controller.setVy(10));
    }
}