import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n " +
                "1 - Бренд \n " +
                "2 - Модель \n " +
                "3 - Цвет \n " +
                "4 - ОЗУ \n " +
                "5 - ЖМД \n " +
                "6 - Выход \n ");
        Integer select = Integer.valueOf(input.next());
        while (select != 6){
            if (select == 1){
                System.out.println("Введите наименование Бренда: ");
                String inputBrand = input.next();
                System.out.println(findBrand((ArrayList<Laptop>) Laptops(),inputBrand));
            }
            if (select == 2){
                System.out.println("Введите наименование Модели: ");
                String inputModel = input.next();
                System.out.println(findModel((ArrayList<Laptop>) Laptops(),inputModel));
            }
            if (select == 3){
                System.out.println("Введите Цвет: ");
                String inputColor = input.next();
                System.out.println(findColor((ArrayList<Laptop>) Laptops(),inputColor));
            }
            if (select == 4){
                System.out.println("Введите минимальное значение ОЗУ: ");
                Integer inputOZU = Integer.valueOf(input.next());
                System.out.println(findOzu((ArrayList<Laptop>) Laptops(),inputOZU));
            }
            if (select == 5){
                System.out.println("Введите минимальное значение ЖМД: ");
                Integer inputZMD = Integer.valueOf(input.next());
                System.out.println(findZmd((ArrayList<Laptop>) Laptops(),inputZMD));
            }
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n " +
                    "1 - Бренд \n " +
                    "2 - Модель \n " +
                    "3 - Цвет \n " +
                    "4 - ОЗУ \n " +
                    "5 - ЖМД \n " +
                    "6 - Выход \n ");
            select = Integer.valueOf(input.next());
        }
    }
    public static List<Laptop> Laptops(){
        Laptop laptop1 = new Laptop("HP","4A3U4EA","silver",8,500);
        Laptop laptop2 = new Laptop("Acer","Aspire 3","blue",4,250);
        Laptop laptop3 = new Laptop("Samsung","NP950XED-KA1US","black",16,1000);
        Laptop laptop4 = new Laptop("Toshiba","SATELLITE PRO C50","red",8,1000);
        Laptop laptop5 = new Laptop("Apple","Air 13","silver",8,250);

        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop5);

        return laptopList;
    }
    public static List<String> findBrand(ArrayList<Laptop> list, String brand){
        List<String> brandList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).brand.equals(brand)){
                brandList.add(list.get(i).brand + " " +
                        list.get(i).model + " " +
                        list.get(i).color + " " +
                        list.get(i).ozu + " ОЗУ " +
                        list.get(i).zmd + "GB");
            }
        }
        return brandList;
    }
    public static List<String> findModel(ArrayList<Laptop> list, String model){
        List<String> modelList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).model.equals(model)){
                modelList.add(list.get(i).brand + " " +
                        list.get(i).model + " " +
                        list.get(i).color + " " +
                        list.get(i).ozu + " ОЗУ " +
                        list.get(i).zmd + "GB");
            }
        }
        return modelList;
    }
    public static List<String> findColor(ArrayList<Laptop> list, String color){
        List<String> colorList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).color.equals(color)){
                colorList.add(list.get(i).brand + " " +
                        list.get(i).model + " " +
                        list.get(i).color + " " +
                        list.get(i).ozu + " ОЗУ " +
                        list.get(i).zmd + "GB");
            }
        }
        return colorList;
    }
    public static List<String> findOzu(ArrayList<Laptop> list, Integer ozu){
        List<String> ozuList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).ozu >= ozu){
                ozuList.add(list.get(i).brand + " " +
                        list.get(i).model + " " +
                        list.get(i).color + " " +
                        list.get(i).ozu + " ОЗУ " +
                        list.get(i).zmd + "GB");
            }
        }
        return ozuList;
    }
    public static List<String> findZmd(ArrayList<Laptop> list, Integer zmd){
        List<String> zmdList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).zmd >= zmd){
                zmdList.add(list.get(i).brand + " " +
                        list.get(i).model + " " +
                        list.get(i).color + " " +
                        list.get(i).ozu + " ОЗУ " +
                        list.get(i).zmd + "GB");
            }
        }
        return zmdList;
    }
}