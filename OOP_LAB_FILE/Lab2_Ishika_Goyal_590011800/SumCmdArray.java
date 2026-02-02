// 6. WAP to calculate sum of elements in an array using command line arguments . 
class SumCmdArray {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }

        System.out.println("Sum = " + sum);
    }
}

