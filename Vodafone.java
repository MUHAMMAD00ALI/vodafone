package vodafone;

public class Vodafone {

    public static void main(String[] args) {
                                                                        ////////////////////////////// first branch //////////////////////////////
        CustomerServices FYM001 = new CustomerServices("FYM001", "10 Gamal AbdelNasser street, Fayoum, Egypt", "Ahmed Ali", 4, 4);
        SinglyLinkedList<Employee> f1 = new SinglyLinkedList<>();
        Employee e1 = new Employee(1000, "Mohamed El-sayed", "melsayed@vodafon.egy", "20292010111111", "+201001001001", "10/10/1995 ", "10, Gamal AbdelNasser street, Fayoum, Egypt", "FYM001");
        f1.addFirst(e1);
        Manager m1 = new Manager("Internet banking department", 999, "Ahmed Ali", "aali@vodafon.egy", "20292010222222", "+201000000000", "01/10/1990", "11, Gamal AbdelNasser,street, Fayoum, Egypt", "FYM001");
        FYM001.setM(m1);
        FYM001.setEm(f1);//Singly linked list
                                                                                                    //// customers////
        LinkedQueue<Customer> customers1 = new LinkedQueue<>();
        Customer c1 = new Customer("Mohamed Maher", "21346578945012", "+201099999999");
        Customer c2 = new Customer("MarcoAbdallah", "12345678910203", "+201095555666");
        Customer c3 = new Customer("Mohamed Salem", "20292010000777", "+201099999111");
        customers1.enqueue(c1);
        customers1.enqueue(c2);
        customers1.enqueue(c3);
        Window win1= new Window(1);
        win1.setEmp(e1);
        win1.setCusomers(customers1);
        SinglyLinkedList<Window> windowsOfFYM001 = new SinglyLinkedList<>();
        windowsOfFYM001.addFirst(win1);
        FYM001.setWin(windowsOfFYM001);
        
                                                                     ////////////////////////////// second branch //////////////////////////////
        CustomerServices FYM002 = new CustomerServices("FYM002", "105 Governorate street, Dalla, Fayoum, Egypt", "Sara Hussein", 3, 3);
        SinglyLinkedList<Employee> f2 = new SinglyLinkedList<>();
        Employee e2 = new Employee(110, "Hoda Mohamad", "hmohamad@vodafon.egy", "20292010111199", "+201021001991", "4/8/1994", "102 Governorate street, Dalla, Fayoum, Egypt", "FYM002");
        f2.addFirst(e2);
        Manager m2 = new Manager("Internet banking department", 111, "Sara Hussein", "shussein@vodafon.egy", "20292010000000", "+20101000000", "01/01/1990", "11 Governorate street, Dalla, Fayoum, Egypt", "FYM002");
        FYM002.setM(m2);
        FYM002.setEm(f2);//Singly linked list
                                                                                                 //// customers ////
        LinkedQueue<Customer> customers2 = new LinkedQueue<>();
        Customer c4 = new Customer("Suzan Ahmed", "12345678910123", "+201099999444");
        Customer c5 = new Customer("Moataz Ahmed", "20292010000727", "+201099999000");
        Customer c6 = new Customer("Seif Eldein Taha", "20292010000774", "+201099999777");
        customers2.enqueue(c4);
        customers2.enqueue(c5);
        customers2.enqueue(c6);
        Window win2= new Window(1);
        win2.setEmp(e2);
        win2.setCusomers(customers1);
        SinglyLinkedList<Window> windowsOfFYM002 = new SinglyLinkedList<>();
        windowsOfFYM002.addFirst(win2);
        FYM001.setWin(windowsOfFYM002);
                                                                     /////*****///////////////////////// End /////////////////////////*****/////

    }

}
