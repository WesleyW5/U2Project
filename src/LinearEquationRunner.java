import java.util.Scanner;

class LinearEquationRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1 in this format: (x,y)");
        String coord1 = scan.nextLine();

        int temp = coord1.indexOf(",");
        String temp1 = coord1.substring(1, temp);
        int x1 = Integer.parseInt(temp1);
        System.out.println(x1);

        int temp2 = coord1.indexOf( ")" );
        String temp3 = coord1.substring(6, temp2);
        int y1 = Integer.parseInt(temp3);
        System.out.println(y1);





    }
}