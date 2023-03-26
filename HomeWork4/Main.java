package HomeWork4;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();

        array.add(1);
        array.add(4);
        array.add(21);
        array.add(45);
        array.add(15);
        array.add(42);

        array.set(2,23);
        array.remove(0);

//        System.out.println(array.contains(23));
//        System.out.println(array.getIndexElement(45));
        System.out.println(array.summ(Integer::sum));
//        System.out.println(array.multy());
//        System.out.println(array.get(1));
//        System.out.println(array.getMax());
//        System.out.println(array.getMin());
//        System.out.println(array.getLength());

        array.bubbleSort();

        array.print();
    }


}
