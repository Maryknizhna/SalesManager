public class Main  {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{3,4,5});
        System.out.println("Наибольшее кол-во: " + salesManager.max());
    }
}


