// import java.util.*;
// public class functioncallingitself {
//     public static void main(String[] args) {
//         ajay(1);
//     }

//     public static void ajay(int n) {
//         if(n==10) return;
//         System.out.println("Shibu");
//         ajay(n + 1);
//     }
// }
import java.util.*;
public class functioncallingitself {
    public static void main(String[] args) {
        ajay(5);
    }

    public static void ajay(int n) {
        if(n==0) return;
        System.out.println(n);
        ajay(n -1);
    }
}
