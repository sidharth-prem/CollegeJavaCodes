//Sum and Average
import java.io.*;
class Program16{
        public static void main(String args[]){
                try{
                        Integer sum=0;                  
                        FileReader fr=new FileReader("num.txt");
                        BufferedReader br=new BufferedReader(fr);
                        String sr=br.readLine();
                        String arr[]=sr.split("\\s+");
                        for(String i:arr){
                                sum=sum+Integer.parseInt(i);                   
                        }
                        fr.close();
                        float avg=(sum/arr.length);
                        System.out.println("Sum of numbers in string is: "+sum);
                        System.out.println("Average of numbers in string is: "+avg);
                }
                catch(FileNotFoundException e){
                        System.out.println(e.getMessage());
                }
                catch(IOException e){
                        System.out.println(e.getMessage());
                }
        }
}        
