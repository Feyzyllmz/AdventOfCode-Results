import java.io.*;
import java.util.Scanner;

public class PartTwo {
    public static void main(String[] args) throws IOException {
        FileInputStream fstream = new FileInputStream("puzzleInput.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        File file = new File("puzzleInput.txt");
        Scanner scanner = new Scanner(file);

        int current = 0;
        int max = 0;
        int second = 0;
        int third = 0;
        int total = 0;
        String strLine;
        while ((strLine = br.readLine()) != null) {
            if (strLine.isEmpty()) {
                if(current>max){
                    int temp = second;
                    second=max;
                    third=temp;
                    max = current;
                }

                else if (current>second){
                    third=second;
                    second = current;
                }
                else if(current> third)
                    third = current ;
                current = 0;
            } else {
                current = current + Integer.parseInt(strLine);
            }
        }
        total = max + second + third;
        System.out.println(total);
        System.out.println(max);
        System.out.println(second);
        System.out.println(third);
        br.close();
    }
}