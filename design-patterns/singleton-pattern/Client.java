public class Client{

    public static void main(String[] args){
//        Singleton1 s1 = Singleton1.getInstance("jdbc:mysql://localhost:3306/app", 1);
//        Singleton1 s2 = Singleton1.getInstance("ignored", 2);
//
//        System.out.println(s1);
//        System.out.println("Same instance: " + (s1 == s2));

        //Let's break it

//        Thread t1= new Thread(()-> System.out.println(Singleton1.getInstance("dekho break kiya kya ",3)));
//        Thread t2= new Thread(()-> System.out.println(Singleton1.getInstance("dekho break kiya kya ",34)));
//        Thread t3= new Thread(()-> {
//            System.out.println(Singleton1.getInstance("is baar break karega kya",5));
//        });
//        t1.start();
//        t2.start();
//
//
//
//        t3.start();


        Thread t1= new Thread(()-> System.out.println(Singleton2.getInstance("dekho break kiya kya ",3)));
        Thread t2= new Thread(()-> System.out.println(Singleton2.getInstance("dekho break kiya kya ",34)));
        Thread t3= new Thread(()-> {
            System.out.println(Singleton2.getInstance("is baar break karega kya",5));
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
