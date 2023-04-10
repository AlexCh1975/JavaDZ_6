import java.util.*;

public class Main {
    public static void main(String[] args){
        HashSet<Noutbook> nout = new HashSet<>();
        nout.add(new Noutbook("asus754", 8, 1000,
                "windows 10", "black"));
        nout.add(new Noutbook("acer", 16, 500,
                "windows 11", "silver"));
        nout.add(new Noutbook("lenovo", 8, 500,
                "Linux Ubuntu", "wite"));
        nout.add(new Noutbook("dell", 16, 750,
                "windows 10", "black"));
        nout.add(new Noutbook("apple", 32, 1000,
                "macOS", "silver"));
        nout.add(new Noutbook("HUAWEI", 32, 1000,
                "windows 11", "wite"));
        nout.add(new Noutbook("MSI", 16, 500,
                "Linux Ubuntu", "black"));

        Map<Integer, Integer> laptop = new HashMap<>();
        HashSet<Noutbook> result = new HashSet<>();
        laptop = input();

        result = Noutbook.find(laptop, nout);
    
        if (result.isEmpty()) 
            System.out.println("По вашему запросу ничего не найдено!");
        for (Noutbook i: result){
            i.getNoutbook();
        }
        
        // for (Noutbook i: result){
        //     i.getNoutbook("lenovo");
        // }
    }

    public static Map<Integer, Integer> input(){
        Map<Integer, Integer> requestedLaptop = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер ОЗУ (G): ");
        int ozu = sc.nextInt();
        requestedLaptop.put(1, ozu);
        System.out.print("Введите размер Жесткого диска (G): ");
        int hardDiskCapacity = sc.nextInt();
        requestedLaptop.put(2, hardDiskCapacity);
        
        sc.close();
        return requestedLaptop;
   }
}