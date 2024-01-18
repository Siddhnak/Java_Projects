import java.net.http.HttpHeaders;
import java.util.Arrays;

public class Main {

    public static void callGetAllUsersApi(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList());

    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}