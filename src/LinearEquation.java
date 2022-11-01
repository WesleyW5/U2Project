public class LinearEquation{
        /* Instance Variables */
        private int x1;
        private int y1;
        private int x2;
        private int y2;

        public LinearEquation(int X1, int Y1, int X2, int Y2) {
            x1 = X1;
            y1 = Y1;
            x2 = X2;
            y2 = Y2;
        }


            public double distance () {
                double dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

                return roundedToHundredth(dis);
            }

            public double yIntercept () {
               double intercept = y1 - slope() * x1;
               return intercept;
            }

            public double slope () {
                    return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
                }


            public String equation () {
                int numerator = y2 - y1;
                int denominator = x2 - x1;

                String slope = numerator + "/" + denominator;

                if ((numerator / denominator) % 1 == 0) {
                    int wholeSlope = numerator / denominator;
                    if (yIntercept() == 0) {
                        return "y = " + wholeSlope + "x";
                    } else if(yIntercept() < 0){
                        return "y = " + wholeSlope + " - " + Math.abs(yIntercept());
                    }
                    return "y = " + wholeSlope + "x" + " + " + yIntercept();

                }

                if (numerator < 0 && denominator < 0) {
                    slope = Math.abs(numerator) + "/" + Math.abs(denominator);
                } else if (numerator < 0 && denominator > 0) {
                    slope = numerator + "/" + Math.abs(denominator);
                } else if (numerator > 0 && denominator < 0) {
                    slope = "-" + numerator + "/" + Math.abs(denominator);
                }


                if (yIntercept() > 0) {
                    return "y = " + slope + "x" + " + " + yIntercept();
                } else if(yIntercept() == 0){
                    return "y = " + slope + "x";
                } else
                    return "y = " + slope + "x" + " - " + Math.abs(yIntercept());
                }

            public String coordinateForX ( double xValue){
                return "xValue = " + xValue + " Coordinates: " + xValue + ", " + (xValue * slope() + yIntercept()) ;
            }

            public double roundedToHundredth ( double toRound){
            double temp = toRound * 100;
            double temp2 = Math.round(temp);
            return temp2 / 100 ;
            }

            public String lineInfo () {
                return "Original Coordinates: (" + x1 + ", " + y1 + ")" + "    (" + x2 + ", " + y2 + ")" + "\n" + "Equation: " + equation() + "\n" + "Slope: " + slope() + "\n" + "Y-intercept: " + yIntercept() + "\n" + "Distance: " + distance();
            }


}


