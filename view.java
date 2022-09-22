import java.util.ArrayList;
import java.util.TreeMap;

/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
* Создать множество ноутбуков.
* Реализовать методы фильтрации-сортировки ноутбуки их первоначального множества и вывести проходящие по условиям. 
Сделать так, как мы обсуждали на семинаре (M - V - C) */
public class view {

    public static void main(String[] args) {
        TreeMap<Integer, ArrayList<String>> base = new TreeMap<>();
        LaptopShop notebookShop = new LaptopShop();

        Laptop notebook1 = new Laptop("Samsung", "17'", "i7", "silver", "80 990");
        base.put(1, notebookShop.laptopList(notebook1));
        System.out.println(base);
        Laptop notebook2 = new Laptop("Acer", "14'", "i5", "black", "40 590");
        base.put(2, notebookShop.laptopList(notebook2));
        System.out.println(base);
        Laptop notebook3 = new Laptop("Asus", "13'", "i3", "grey", "39 990");
        base.put(3, notebookShop.laptopList(notebook3));
        System.out.println(base);

        notebookShop.getLaptop(base, "silver");
        notebookShop.getLaptop(base, "13'");
        notebookShop.getLaptop(base, "Acer");
        //notebookShop.getLaptop(base, "Apple");
    }
}