// 9. Create a package named shape with three classes Cuboid, Cylinder and 
// Cone with a method to find the volume of the specific shape. Develop a 
// java program to perform the above operation by importing the package.
import shape.*;

public class PackageCuboidDemo {
    public static void main(String[] args) {
        System.out.println("Hello !");
        Cuboid cu1 = new Cuboid(2, 3, 4);
        System.out.println(cu1.volume());

        Cylinder cy1 = new Cylinder(7, 7);
        System.out.println(cy1.volume());

        Cone co1 = new Cone(7, 7);
        System.out.println(co1.volume());
    }
}
