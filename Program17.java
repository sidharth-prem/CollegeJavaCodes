//Serialization
import java.io.*;
class Person implements Serializable{
        private String name;
        private int age;
        public Person(String name,int age){
                this.name=name;
                this.age=age;
        }
        public void display(){
                System.out.println(name+age);
        }
}

class Program17{
        public static void main(String args[]){
                try{
                        Person p=new Person("Sidhu",19);
                        FileOutputStream fout=new FileOutputStream("Student.txt");
                        ObjectOutputStream obj=new ObjectOutputStream(fout);
                        obj.writeObject(p);//Writing an object
                        fout.close();
                }
                catch(IOException e){
                        System.out.println(e.getMessage());
                }
        }
}
