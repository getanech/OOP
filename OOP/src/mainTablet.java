public class mainTablet {
    public static void main(String[] args) {
        Tablet tablet = new Tablet("Samsung","galaxy", 'W',12.0,4200);
        Tablet tablet1 = new Tablet("Samsung","galaxy",'H',16.0,4300);
        boolean result = tablet1.isSame(tablet);
        System.out.println(result);
    }
}
