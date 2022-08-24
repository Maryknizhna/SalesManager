public class Main  {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{3,4,5,6,7,8});
        int medium = (4 + 5 + 6 + 7)/4;
        System.out.println("Наибольшее кол-во: " + salesManager.max());
        System.out.println("Среднее кол-во продаж: " + medium);
    }
}


