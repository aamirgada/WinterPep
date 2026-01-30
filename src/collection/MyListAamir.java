package collection;

class MyArrayAamir {

    int capacity = 8;
    int arr[] = new int[capacity];

    void resize(){

    }

    void addListelements(int element){
        //logic
        for(int i=0; i<capacity - 1; i++){
            arr[i] = element;
            if(arr.length == capacity){
                resize();
            }
        }
    }

    void removeElements(){

    }

//    private int[] arr;
//    private int size;
//
//    public MyArrayAamir(int capacity) {
//        arr = new int[capacity];
//        size = 0;
//    }
//
//    // add
//    public void add(int value) {
//        if (size == arr.length) {
//            System.out.println("Array is full");
//            return;
//        }
//        arr[size++] = value;
//    }
//
//    // get
//    public int get(int index) {
//        if (index < 0 || index >= size)
//            throw new IndexOutOfBoundsException();
//        return arr[index];
//    }
//
//    // delete by index
//    public void delete(int index) {
//        if (index < 0 || index >= size) {
//            System.out.println("Invalid Index");
//            return;
//        }
//
//        for (int i = index; i < size - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        size--;
//    }
//
//    // display
//    public void display() {
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
}
