import java.io.*;
import java.util.Scanner;

public class PartOne {
    public static void main(String[] args) throws IOException {
        FileInputStream fstream = new FileInputStream("puzzleInput.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        File file = new File("puzzleInput.txt");
        Scanner scanner = new Scanner(file);

        int current = 0;
        int max = 0;
        String strLine;
        while ((strLine = br.readLine()) != null) {
            if (strLine.isEmpty()) {
                if(current>max){
                    max = current;
                }
                current = 0;
            } else {
                current = current + Integer.parseInt(strLine);
            }
        }
        System.out.println(max);
        br.close();
    }
}