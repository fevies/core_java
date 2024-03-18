public class ClassConstants {
    public static final double CM_PER_INCH = 30.2;
    public static void main(String[] args) {
        double length = 5.0;
        double height = 8.0;

        System.out.println("The piece  of  sheet needed is  " + (length * CM_PER_INCH ) + (height * CM_PER_INCH));
    }
}