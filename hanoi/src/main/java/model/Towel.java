package model;

import static java.lang.StrictMath.pow;

public class Towel {
    int disks;

    // T(n) = 2^n - 1

    public Towel(int disks) {
        this.disks = disks;
    }

    public int numberMoviments() {
        return (int) (pow(2, disks) - 1);
    }
}
