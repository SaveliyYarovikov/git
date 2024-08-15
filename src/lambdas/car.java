package lambdas;

public interface car {
    public default void move(){
        System.out.println("gas");
    }

}
