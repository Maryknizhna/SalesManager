public class Main  {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{3,4,5});
        System.out.println("Наибольшее кол-во: " + salesManager.max());
    }
}


