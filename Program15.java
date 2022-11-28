//File Reader/writer
import java.io.*;
class Program15{
        public static void main(String args[]){
                try{
                        FileWriter fw=new FileWriter("paste.txt");
                        FileReader fr=new FileReader("abc.txt");
                        BufferedReader br=new BufferedReader(fr);
                        String s;
                        while((s=br.readLine())!=null)
                                fw.write(s);
                        fr.close();
                        fw.close();
                }
                catch(FileNotFoundException e){
                        System.out.println(e.getMessage());
                }
                catch(IOException e){
                        System.out.println(e.getMessage());
                }
        }
}        
                 
