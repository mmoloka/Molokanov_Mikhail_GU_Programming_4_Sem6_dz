import java.util.ArrayList;
import java.util.TreeMap;

public class LaptopShop {

    public ArrayList<String> laptopList(Laptop notebook) {

        ArrayList<String> laptopList = new ArrayList<>();
        laptopList.add(notebook.brand);
        laptopList.add(notebook.diagonal);
        laptopList.add(notebook.processor);
        laptopList.add(notebook.color);
        laptopList.add(notebook.price);

        return laptopList;
    }

    public void getLaptop(TreeMap<Integer, ArrayList<String>> dataBasebase, String parametr) {
         for (var item : dataBasebase.entrySet()) {
            ArrayList<String> laptop = item.getValue();
            if(laptop.contains(parametr)) System.out.println(laptop);
            //else System.out.println("Ноутбука с таким параметром не найдено");
        }
    }
}