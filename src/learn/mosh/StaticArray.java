package learn.mosh;

public class StaticArray {
    int[] array;
    int count;
    public StaticArray(int length){
        array = new int[length];
    }

    public int indexOf(int num){
        for(int i = 0; i < count; i++){
            if(array[i] == num){
                System.out.println("The number " + num + " is at index " + i);
                return i;
            }
        }
        System.out.println("The number isn't in the array");
        return -1;
    }
    public void remove(int index){
        if(index < 0 || index >= count){
            System.out.println("The maximum number of indexes exedded." +
                    " you want to remove unexisting element."
            );
        }
        for(int i = index; i < count -1; i++){
            array[i] = array[i+1];
        }
        count --;
    }

    public void print(){
        System.out.println("The size of the array is "+count);
        for(int i = 0; i < count; i++){
            System.out.println(array[i]);
        }
    }

    public void insert(int num){
        if(array.length == count){
            int[] newArray = new int[count * 2];
            for(int i=0; i< count; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[count++] = num;
    }

    public static void main(String[] args){
        StaticArray array = new StaticArray(9);
        array.insert(23);
        array.insert(20);
        array.insert(10);
        array.insert(30);
        array.remove(1);
        array.indexOf(29);
        array.print();
    }
}
