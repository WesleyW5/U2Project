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
        String temp3 = coord1.substring(coord1.indexOf(",") + 1, temp2);
        int y1 = Integer.parseInt(temp3);
        System.out.println(y1);

        System.out.println("Enter coordinate 2 in this format: (x,y)");
        String coord2 = scan.nextLine();

        int temp4 = coord2.indexOf(",");
        String temp5 = coord2.substring(1, temp4);
        int x2 = Integer.parseInt(temp5);
        System.out.println(x2);

        int temp6 = coord2.indexOf( ")" );
        String temp7 = coord2.substring(coord2.indexOf(",") + 1, temp6);
        int y2 = Integer.parseInt(temp7);
        System.out.println(y2);

        LinearEquation equat1 = new LinearEquation(x1,y1,x2,y2);
        equat1.slope();
    }
}