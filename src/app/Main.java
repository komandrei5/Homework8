package app;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.add("Hello");
        list.add("World");
        int size = list.size();
        System.out.println("Size: " + size);
        MyList.printArray(list.getArray());
        list.delete(1);
        MyList.printArray(list.getArray());
        size = list.size();
        System.out.println("Size: " + size);
        System.out.println(list.get(0));
        list.add("!!!!");
        list.add("!!!!");
        list.add("!!!!");
        MyList.printArray(list.getArray());
        list.delete(3);
        list.delete("!!!!");
        MyList.printArray(list.getArray());
    }
}
