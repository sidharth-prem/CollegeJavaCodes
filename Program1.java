class Employee
{
        private String name;
        private int age;
        private int phone;
        private String address;
        private float salary;
                
        public void setName(String name)
        {
                this.name=name;
        }
        public void setAge(int age)
        {
                this.age=age;
        }
        public void setPhone(int phone)
        {
                this.phone=phone;
        }
        public void setAddress(String address)
        {
                this.address=address;
        }
        public void setSalary(float salary)
        {
                this.salary=salary;
        }
        
        public String getName()
        {
                return name;
        }
        public int getAge()
        {
                return age;
        }
        public int getPhone()
        {
                return phone;
        }
        public String getAddress()
        {
                return address;
        }
        public float getSalary()
        {
                return salary;
        }
        public void print_Salary(float salary)
        {
        System.out.println("Salary is: "+salary);
        }
}

class Officer extends Employee
{
        private String special;
        public void setSpecial(String special)
        {
                this.special=special;
        }
        public String getSpecial()
        {
                return special;
        }
}
       
class Manager extends Employee
{
        private String dept;
        public void setDept(String dept)
        {
                this.dept=dept;
        }
        public String getDept()
        {
                return dept;
        }              
}

class Program1
{
        public static void main(String args[])
        {
                Officer o= new Officer();
                Manager m= new Manager();
                //Officer
                System.out.println("Officer Detais:\n");
                o.setName("Leo");
                o.setAge(35);
                o.setPhone(35436);
                o.setAddress("Argentina");
                o.setSalary(54580);
                o.setSpecial("Striker");
                System.out.println(o.getName());
                System.out.println(o.getAge());
                System.out.println(o.getPhone());
                System.out.println(o.getAddress());
                System.out.println(o.getSalary());
                System.out.println(o.getSpecial());
                //Manager
                System.out.println("Manager Detais:\n");
                o.setAge(35);
                m.setName("Leo");
                m.setAge(35);
                m.setPhone(35436);
                m.setAddress("Argentina");
                m.setSalary(54580);
                m.setDept("Football");
                System.out.println(m.getName());
                System.out.println(m.getAge());
                System.out.println(m.getPhone());
                System.out.println(m.getAddress());
                System.out.println(m.getSalary());
                System.out.println(m.getDept());
                
        }
}  
        
  
