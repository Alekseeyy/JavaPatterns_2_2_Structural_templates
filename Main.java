package Структурные_шаблоны_2_Facade;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("101", "111"));
        System.out.println(bins.mult("111", "101"));
    }
}
