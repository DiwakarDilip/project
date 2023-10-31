public class MultipleCatchBlocksDemo {
    public static void main(String[] args) {
       
 try {
            int[] numbers = {1, 2, 3};
            int result = numbers[3] / 0; 
        } 
catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: ");
        } 
catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: ");
        } 
catch (Exception e) {
            System.out.println("General Exception caught: ");
        }
        System.out.println("Program continues after exception handling.");
    }
}
