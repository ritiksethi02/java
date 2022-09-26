import java.util.ArrayList;
import java.util.Scanner;

public class exercise
{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<String> List = new ArrayList<>(); boolean found = true;

            while(found == true)
            {
                String str = sc.nextLine();
                if(str.equals("XDONE") || str.equals("xdone"))
                {
                    found = false;      List.add(str);
                }    else{
                    List.add(str);
                }
            }
            System.out.println(List);
        }
    }
}