import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dataset {
    ArrayList<Double> data = new ArrayList<Double>();

    public Dataset(String filename) throws IOException{
        Scanner scanner = new Scanner(new File(filename)); 
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            data.add((Double) Double.parseDouble(line));
        }
    }

    public int size(){
        return data.size();
    }
    
    public double meanValue() throws ArithmeticException{
        double total = 0;
        if (size() == 0){
            throw new ArithmeticException();
        }
        for(int i = 0; i < size(); i++){
            total += data.get(i);
        }
        total = total / data.size();
        return total;
    }
}
