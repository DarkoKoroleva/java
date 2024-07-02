public class Main {
    public static void main(String[] args) {
        int[] f = new int [12];
        for (int i = 0; i < 12; i++) {
            f[i] = 3 + 2*i;
        }

        double[] x = new double[15];
        for (int i = 0; i < 15; i++) {
            x[i] = (Math.random() * 14 ) - 6;
        }

        double[][] h = new double[12][15];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 15; j++) {
                switch (f[i]) {
                    case 19:
                        h[i][j] = Math.pow(Math.atan(0.2 * (x[j] + 1) / 14.0), 0.25/ (Math.asin(Math.exp(-Math.abs(x[j]))) - 1)); //делит ли / целочисленно
                        break;
                    case 5, 9, 11, 13, 17, 23:
                        h[i][j] = Math.cos(Math.cos(Math.pow(x[j], 1.0/3)));
                        break;
                    default:
                        double p =  Math.asin(Math.exp(Math.pow ( - Math.pow( 4.0 / Math.abs(x[j]), x[j]), 1.0/3) ));
                        double s = 0.25 - Math.pow( Math.pow( Math.pow(x[j], x[j]-0.75), 1.0/3) , 3 + Math.cos(Math.pow(x[j], 1.0/3)));
                        h[i][j] = Math.pow(s, p);
                        break;
                }
                System.out.printf(String.format("%.4f", h[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }
}