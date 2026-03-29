public class Singleton1{

    private final String url;
    private final int id;
    private static Singleton1 instance = null;

    private Singleton1(String url, int id){
        this.url = url;
        this.id = id;
    }

    public static Singleton1 getInstance(String url, int id){
        if (instance == null) {
            instance = new Singleton1(url, id);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton1{" +
                "url='" + url + '\'' +
                ", id=" + id +
                '}';
    }
}
