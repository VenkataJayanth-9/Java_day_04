public class Main {
    public static void main(String[] args)
    {
        Customer venkata = new Customer("Jayanth", "Jayanth@gmail");
        System.out.println(venkata.getName());
        System.out.println(venkata.getEmail());

        Customer cu1 = new Customer();
        System.out.println(cu1.getName());
        System.out.println(cu1.getEmail());
    }
}
