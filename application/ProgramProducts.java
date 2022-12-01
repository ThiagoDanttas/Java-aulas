import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProducts {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        List<Product> list = new ArrayList<>();

        for(int i = 0; i < n; i++){

            System.out.println("Product #" + i + "data");
            System.out.print("Common, used or imported (c/u/i) ?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if(ch == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if (ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            }
        }



        sc.close();

    }

}
