package WeekThirteen;


public class BoundedStack {
    private Object[] array;
    private int size=0;
// one line: Object[] array= new Object[maxSize]
    public BoundedStack(int maxSize){
        array=new Object[maxSize];
    }

    public void push(Object item){
        if(size==array.length){
            System.out.println("STack Overflow-- cannot add to full stack.");
        }else{
            array[size++]=item;
        }
    }

    }
