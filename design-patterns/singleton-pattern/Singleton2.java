import java.util.concurrent.locks.ReentrantLock;

public class Singleton2 {

    private final String url;
    private final int id;
    private static Singleton2 instance = null;
    private static ReentrantLock lock=new ReentrantLock();

    private Singleton2(String url, int id){
        this.url = url;
        this.id = id;
    }

    public static Singleton2 getInstance(String url, int id){
        if (instance == null) {
            lock.lock();
            System.out.println("creating new instance");
            if(instance==null)
            instance = new Singleton2(url, id);
            lock.unlock();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton2{" +
                "url='" + url + '\'' +
                ", id=" + id +
                '}';
    }

}
