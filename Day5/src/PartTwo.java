import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PartTwo {
    public static void main(String[] args) {
        Stack stk1 = new Stack(500);
        stk1.push("W");
        stk1.push("M");
        stk1.push("L");
        stk1.push("F");

        Stack stk2 =new Stack(500) ;
        stk2.push("B");
        stk2.push("Z");
        stk2.push("V");
        stk2.push("M");
        stk2.push("F");

        Stack stk3 = new Stack(500);
        stk3.push("H");
        stk3.push("V");
        stk3.push("R");
        stk3.push("S");
        stk3.push("L");
        stk3.push("Q");

        Stack stk4 = new Stack(500);
        stk4.push("F");
        stk4.push("S");
        stk4.push("V");
        stk4.push("Q");
        stk4.push("P");
        stk4.push("M");
        stk4.push("T");
        stk4.push("J");

        Stack stk5 = new Stack(500);
        stk5.push("L");
        stk5.push("S");
        stk5.push("W");

        Stack stk6 = new Stack(500);
        stk6.push("F");
        stk6.push("V");
        stk6.push("P");
        stk6.push("M");
        stk6.push("R");
        stk6.push("J");
        stk6.push("W");

        Stack stk7 = new Stack(500);
        stk7.push("J");
        stk7.push("Q");
        stk7.push("C");
        stk7.push("P");
        stk7.push("N");
        stk7.push("R");
        stk7.push("F");


        Stack stk8 = new Stack(500);
        stk8.push("V");
        stk8.push("H");
        stk8.push("P");
        stk8.push("S");
        stk8.push("Z");
        stk8.push("W");
        stk8.push("R");
        stk8.push("B");

        Stack stk9 = new Stack(500);
        stk9.push("B");
        stk9.push("M");
        stk9.push("J");
        stk9.push("C");
        stk9.push("G");
        stk9.push("H");
        stk9.push("Z");
        stk9.push("W");

        try
        {
            File file=new File("puzzleInput.txt");
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            StringBuffer sb=new StringBuffer();
            String line;
            while((line=br.readLine())!=null)
            {
                int move=0;
                int from =0;
                int to=0;
                String parts[] = line.split(" ");
                move=Integer.parseInt(parts[1]);
                from=Integer.parseInt(parts[3]);
                to=Integer.parseInt(parts[5]);


                Stack tempStk = new Stack(move);
                for(int i=0; i<move ; i++){
                    if(from==1){
                        String temp = stk1.pop();
                        tempStk.push(temp);
                    }else if(from==2){
                        String temp = stk2.pop();
                        tempStk.push(temp);
                    }else if(from==3){
                        String temp = stk3.pop();
                        tempStk.push(temp);
                    }else if(from==4){
                        String temp = stk4.pop();
                        tempStk.push(temp);
                    }else if(from==5){
                        String temp = stk5.pop();
                        tempStk.push(temp);
                    }else if(from==6){
                        String temp = stk6.pop();
                        tempStk.push(temp);
                    }else if(from==7){
                        String temp = stk7.pop();
                        tempStk.push(temp);
                    }else if(from==8){
                        String temp = stk8.pop();
                        tempStk.push(temp);
                    }else if(from==9){
                        String temp = stk9.pop();
                        tempStk.push(temp);
                    }
                }
                for(int i =0; i<move; i++){
                    if(to==1){
                        stk1.push(tempStk.pop());
                    }else if(to==2){
                        stk2.push(tempStk.pop());
                    }else if(to==3){
                        stk3.push(tempStk.pop());
                    }else if(to==4){
                        stk4.push(tempStk.pop());
                    }else if(to==5){
                        stk5.push(tempStk.pop());
                    }else if(to==6){
                        stk6.push(tempStk.pop());
                    }else if(to==7){
                        stk7.push(tempStk.pop());
                    }else if(to==8){
                        stk8.push(tempStk.pop());
                    }else if(to==9){
                        stk9.push(tempStk.pop());
                    }
                }
                sb.append(line);
                sb.append("\n");

            }
            System.out.print(stk1.pop());
            System.out.print(stk2.pop());
            System.out.print(stk3.pop());
            System.out.print(stk4.pop());
            System.out.print(stk5.pop());
            System.out.print(stk6.pop());
            System.out.print(stk7.pop());
            System.out.print(stk8.pop());
            System.out.print(stk9.pop());
            fr.close();
            //System.out.println(sb.toString());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}