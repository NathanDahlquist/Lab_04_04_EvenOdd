public class EvenOdd {
    public static void main(String[] args) {
        int numToExamine = 2;
        int moduloOutput;

        moduloOutput = numToExamine % 2;

        if (moduloOutput == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
