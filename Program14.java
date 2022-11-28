//file streams
import java.io.*;
class Program14{
        public static void main(String args[]){
                try{
                        FileInputStream fin=new FileInputStream("sample.txt");
                        FileOutputStream fout=new FileOutputStream("copy.txt");
                        int i;
                        while((i=fin.read())!=-1){
                                System.out.print((char) i);
                                fout.write(i);
                        }
                        fin.close();
                        fout.close();
                }
                catch(FileNotFoundException e){
                        System.out.println(e.getMessage());
                }
                catch(IOException e){
                        System.out.println(e.getMessage());
                }
        }
}        
