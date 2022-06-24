import java.util.*;

public class Sort {
    public static void main(String[] args) {

        int list1, node1 = 0, list2, node2 = 0;

        Scanner scanner = new Scanner(System.in);
        Iterator<Integer> iterator;


        Set<Integer> listInteger = new HashSet<>();


        System.out.println("Enter the number of elements in the list 01");
        list1 = scanner.nextInt();

        System.out.println("Enter the values of elements in the list");
        for(int i = 0; i < list1; i++) {
            System.out.println("Enter elements number " + i + " : ");
            node1 = scanner.nextInt();
            listInteger.add(node1);
        }
        System.out.println("List Integer 1 : " + listInteger);



        System.out.println("Enter the number of elements in the list 02");
        list2 = scanner.nextInt();

        System.out.println("Enter the valus of elements in the list");
        for(int i =0 ; i < list2; i++) {
            System.out.println("Enter elements number " + i + " : ");
            node2 = scanner.nextInt();
            listInteger.add(node2);
        }

        System.out.println("___________________________________");
        System.out.println("List Integer 1 + 2 : " + listInteger);

        TreeSet sortList  = new TreeSet<>(listInteger);
        System.out.println("List Integer after sort is : " + sortList);


    }
}


