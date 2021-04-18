public class oddNumbers<product> {
    public static void main(String[] args){
        int product = 1;
        System.out.println("Raymond Campbell Assignment 3 Odd Numbers");
        for (int i = 1; i <= 15; i += 2) {
            product = i * product;
        }
        System.out.printf("The product of all odd integers is: %d", product);
    }
}