import java.util.LinkedList;
public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("JAVA");
        list.add("C++");
        list.add("PHP");
        
        System.out.println("vi du vè phuong thuc addAll(");

        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA: " + listA);
        showList(listA);

        System.out.println("vi du ve phuong thuc retainAll()");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.println("listA: ");
        showList(listA);

        System.out.println("vi du su dung phương thuc removeAll()");
        list.removeAll(listB);
        System.out.println("list:");
        showList(list);
    }
    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.println("\t"+ obj + ",");
        }
        System.out.println();
    }
}
