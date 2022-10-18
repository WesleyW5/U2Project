import java.util.Scanner;

class LinearEquationRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1 in this format: (x, y)");
        String coord1 = scan.nextLine();

        int x1;
        int y1;
        int y2;
        int x2;

        if (coord1.length() == 6 ){
            String tempx1 = coord1.substring(1, 2);
            String tempy1 = coord1.substring(4, 5);
             x1 = Integer.parseInt(tempx1);
             y1 = Integer.parseInt(tempy1);
        } else if(coord1.length() == 8){
            String tempx1 = coord1.substring(1,3);
            String tempy1 = coord1.substring(4,6);
             x1 = Integer.parseInt(tempx1);
             y1 = Integer.parseInt(tempy1);
        } else{
            System.out.println("Incorrect format");
        }

        // not working because it doesn't take into account the length of two digit + numbers.



        System.out.println("Enter coordinate 2 in this format: (x, y)");
        String coord2 = scan.nextLine();
        String tempx2 = coord2.substring(1,2);
        String tempy2 = coord2.substring(4,5);
        int x2 = Integer.parseInt(tempx2);
        int y2 = Integer.parseInt(tempy2);
        System.out.println(coord1.length());

        LinearEquation equat1 = new LinearEquation(x1, y1, x2, y2);





    }
}