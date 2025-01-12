public class Vector3D {
    double x, y, z;

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }

    double getZ() {
        return z;
    }
    double getMagnitude() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(getZ(), 2));
    }
}