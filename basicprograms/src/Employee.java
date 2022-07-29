class Address {
    String state, city, country;

     Address(String state, String city, String country) {
        this.state = state;
        this.city = city;
        this.country = country;
    }
}
    public class Employee{
        int id;
        String name;
        Address address;

        public Employee(int id,String name,Address address)
        {
            this.id = id;
            this.name = name;
            this.address = address;
        }
        void display()
        {
            System.out.println(id +" "+ name);
            System.out.println(address.state +" "+address.city +" "+address.country);
        }
        public static void main(String[] args){
            Address address1 = new Address("U.p","Lko","India");
            Address address2 = new Address("U.p","Noida","India");

            Employee e1 = new Employee(79,"Priyanshu",address1);
            Employee e2 = new Employee(103,"Shivangi",address2);

            e1.display();
            e2.display();
        }
}

