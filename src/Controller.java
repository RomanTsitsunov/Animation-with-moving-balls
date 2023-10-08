public class Controller {
    private Storage storage = new Storage();

    public double getX1() {
        return storage.x1;
    }

    public boolean setX1(double x1) {
        if(x1 >= 0 && x1 <= 1000) {
            storage.x1 = x1;
            return true;
        }
        return false;
    }

    public double getY1() {
        return storage.y1;
    }

    public boolean setY1(double y1) {
        if(y1 >= 0 && y1 <= 1000) {
            storage.y1 = y1;
            return true;
        }
        return false;
    }

    public double getX2() {
        return storage.x2;
    }

    public boolean setX2(double x2) {
        if(x2 > storage.x1 && x2 <= 2000) {
            storage.x2 = x2;
            return true;
        }
        return false;
    }

    public double getY2() {
        return storage.y2;
    }

    public boolean setY2(double y2) {
        if(y2 > storage.y1 && y2 <= 2000) {
            storage.y2 = y2;
            return true;
        }
        return false;
    }

    public double getX() {
        return storage.x;
    }

    public boolean setX(double x) {
        if(x >= storage.x1 && x <= storage.x2) {
            storage.x = x;
            return true;
        }
        return false;
    }

    public double getY() {
        return storage.y;
    }

    public boolean setY(double y) {
        if(y >= storage.y1 && y <= storage.y2) {
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
