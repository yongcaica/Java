import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class Test3 {
    public static void main(String[] args){
        //创建了一个List的集合对象，并放入了俩个字符串对象
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        for(String str: list){
            System.out.println(str);
        }
        /*
        Iterator<String> it = list.iterator(); //get the iterator of list
        //call iterator's hasNext method, judge whether there is next element
        while(it.hasNext()) {
            //move down the subscript and return the current element
            System.out.println(it.next());
        }
        */
    }
}

/*
然后通过iterator()方法得到迭代器。iterator()方法是由Iterable接口规定的，ArrayList对该方法提供了具体的实现，在迭代器Iteartor接口中，有以下3个方法：

1.hasNext() 该方法英语判断集合对象是否还有下一个元素，如果已经是最后一个元素则返回false
2.next() 把迭代器的指向移到下一个位置，同时，该方法返回下一个元素的引用
3.remove()  从迭代器指向的Collection中移除迭代器返回的最后一个元素，该操作使用的比较少。

注意：从Java5.0开始，迭代器可以被foreach循环所替代，但是foreach循环的本质也是使用Iterator进行遍历的。
！
 */
