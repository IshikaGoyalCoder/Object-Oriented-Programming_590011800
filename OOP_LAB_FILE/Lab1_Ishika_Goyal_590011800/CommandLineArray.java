// 3. WAP that takes array input from command-line arguments, stores the values in a String array, 
// and prints the array. 

class CommandLineArray {
    public static void main(String[] args) {
        System.out.println("Array elements are:");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
