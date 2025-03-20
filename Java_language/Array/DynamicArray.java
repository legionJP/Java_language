package Array;

public class DynamicArray {
    
    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity)
    {
        this.capacity= capacity;
        this.length = 0;
        this.arr = new int[this.capacity];

    }

    // get the value at the ith index
    public int get(int i){
        return arr [i];
    }

    // insert the value n at the i-th index
    public void set(int i, int n)
    {
        arr[i]=n;

    }

    // insert the n at the last pos of the array
    public void pushback(int n){
        if (length==capacity){
            resize();
        }
        arr[length]=n;
        length++;
    }

    public int popback(){
        if (length>0){
            length--;
        }
        return arr[length];
    }
    // resize the array with the double capacity
    public void resize(){
        capacity = 2*capacity;
        int[] newArr = new int[capacity];
        for(int i=0;i<=length;i++){
            newArr[i]=arr[i];

        }
        arr = newArr;
    }
    public int getSize(){
        return length;
    }
    public int getCapacity(){
        return capacity;
    }
    
}
