package SingletonPattern;

public class Singleton {
    private static Singleton instance = new Singleton();
    private  Singleton(){
    };
    public  static Singleton getInstance(){
        return instance;
    }
    public void build(){
        System.out.println("This is a map");
    }

}
