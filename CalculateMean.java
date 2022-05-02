import java.text.DecimalFormat;
import java.util.Arrays;

public class MeanValue {
    public static double meanValue(double[] data) {
        double mean = 0;

        for(int i = 0; i < data.length; i++){
            mean += data[i];
        }
        mean = mean/data.length;

        return mean;
    }
  
    public static void main(String[] args) {
        try {
            String m = args[0];
            }
            catch(Exception e){
                System.out.println("Usage: java MeanValue <values...>");
                System.exit(-89);
            }

        double[] input = new double[args.length];
        for(int i = 0; i < args.length; i++){
            input[i] = Double.parseDouble(args[i]);
        }
        double mean = meanValue(input);
        DecimalFormat f = new DecimalFormat("##.###");
        System.out.printf("Mean value = " + f.format(mean));
    }
    
}