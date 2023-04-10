import java.util.*;

public class Noutbook {
    private String name;
    private Integer ozu;
    private Integer hardDiskCapacity;
    private String operatingSystem;
    private String color;

    public Noutbook(String name, int ozu, int hardDiskCapacity,
                String operatingSystem, String color){
        this.name = name;
        this.ozu = ozu;
        this.hardDiskCapacity = hardDiskCapacity;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public Integer getOzu(){
        return this.ozu;
    }
    public Integer getHardDiskCapacity(){
        return this.hardDiskCapacity;
    }

    public static HashSet<Noutbook> find(Map<Integer, Integer> laptop, HashSet<Noutbook> nout){
        HashSet<Noutbook> result = new HashSet<>();
        for (Noutbook el: nout){
            if (el.getOzu().equals(laptop.get(1)) && 
                el.getHardDiskCapacity().equals(laptop.get(2))){
                result.add(el);
            } 
        }
        return result;
    }

    public void getNoutbook(String name){
        if (this.name == name){
            System.out.println("----------------------------");
            System.out.printf("Name: %s\nozu: %d\nhardDiskCapacity: %d\noperationSystem: %s\ncolor: %s\n", this.name, this.ozu,
                                this.hardDiskCapacity, this.operatingSystem, this.color);
            System.out.println("----------------------------");
        }
    }

    
    public void getNoutbook(){
        System.out.println("----------------------------");
        System.out.printf("Name: %s\nozu: %d\nhardDiskCapacity: %d\noperationSystem: %s\ncolor: %s\n", this.name, this.ozu,
                                this.hardDiskCapacity, this.operatingSystem, this.color);
        System.out.println("----------------------------");
    }
}