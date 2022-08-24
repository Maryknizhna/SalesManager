public class Main  {
    public static void main(String[] args) {
        long medium = (4 + 5 + 6 + 7)/4;
        SalesManager salesManager = new SalesManager(new long[]{3,4,5,6,7,8});

        System.out.println("Наибольшее кол-во: " + salesManager.max());
        System.out.println("Среднее кол-во продаж: " + medium);
    }
}


