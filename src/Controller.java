public class Controller {
    private final Storage storage = new Storage();

    public int getX1() {
        return storage.x1;
    }

    public boolean setX1(int x1) {
        if(x1 >= 0 && x1 <= 800) {
            storage.x1 = x1;
            return true;
        }
        return false;
    }

    public int getY1() {
        return storage.y1;
    }

    public boolean setY1(int y1) {
        if(y1 >= 0 && y1 <= 800) {
            storage.y1 = y1;
            return true;
        }
        return false;
    }

    public int getX2() {
        return storage.x2;
    }

    public boolean setX2(int x2) {
        if(x2 > storage.x1 && x2 <= 900) {
            storage.x2 = x2;
            return true;
        }
        return false;
    }

    public int getY2() {
        return storage.y2;
    }

    public boolean setY2(int y2) {
        if(y2 > storage.y1 && y2 <= 900) {
            storage.y2 = y2;
            return true;
        }
        return false;
    }

    public double getX() {
        return storage.x;
    }

    public boolean setX(double x) {
        if(x > storage.x1 && x < storage.x2 - 20) {
            storage.x = x;
            return true;
        }
        return false;
    }

    public double getY() {
        return storage.y;
    }

    public boolean setY(double y) {
        if(y > storage.y1 && y < storage.y2 - 20) {
            storage.y = y;
            return true;
        }
        return false;
    }

    public double getVx() {
        return storage.vx;
    }

    public boolean setVx(double vx) {
        if(vx >= -10 && vx <= 10) {
            storage.vx = vx;
            return true;
        }
        return false;
    }

    public double getVy() {
        return storage.vy;
    }

    public boolean setVy(double vy) {
        if(vy >= -10 && vy <= 10) {
            storage.vy = vy;
            return true;
        }
        return false;
    }
}
