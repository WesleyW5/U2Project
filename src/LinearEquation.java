public class LinearEquation{
        /* Instance Variables */
        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public LinearEquation(int x1, int y1, int x2, int y2) {

        }


            public double distance () {
                double dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

                return roundedToHundredth(dis);
            }

            public double yIntercept () {
                double intercept = roundedToHundredth(y1 - x1 * Math.abs(slope()));
                return x1 + intercept;
            }

            public double slope () {
                return roundedToHundredth((y2 - y1) / (x2 - x1));
            }

            public String equation () {
                return "y = " + "-" + Math.abs(slope()) + "x" + " + " + " yIntercept";
            }

            public String coordinateForX ( double xValue){
                return "xValue = " + xValue + "Coordinates: " + xValue + ", " + xValue * slope();
            }

            public double roundedToHundredth ( double toRound){

                return Math.round(toRound * 100) / 100;
            }

            public String lineInfo () {
                return "Original Coordinates: " + x1 + ", " + y1 + "  " + x2 + ", " + y2 + "\n" + "Linear Equation: " + equation() + "\n" + "Slope: " + slope() + "\n" + "Y-intercept: " + yIntercept() + "\n" + "Distance: " + distance();
            }



}


