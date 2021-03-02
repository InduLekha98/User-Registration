public class FindMax
{
    public static void main(String[] args)
    {
        Integer[] integerArr= {1,2,3};
        Float[] floatArr= {10f,20f,30f,};
        String[] stringArr= {"Apple","Peach","Banana"};
        printArr(integerArr);
        printArr(floatArr);
        printArr(stringArr);
        maxFind(integerArr);
        maxFind(floatArr);
        findmaxString(stringArr);




    }

    public static<E>void printArr(E[] element)
    {
        for(E i : element )
            System.out.print(i+" ");
        System.out.println();
    }

    public static  <T extends  Comparable <T>> void maxFind(T[] element)
    {
        T max=element[0];
        for(T i:element)
        {
            if(i.compareTo(max)> 0)
            {
                max=i;
            }
        }System.out.println(max+" ");
    }

    public static <T extends Comparable<T>> void findmaxString(T[] elements) {
        T max = elements[0];
        for (T i : elements)
        {
            if (Integer.valueOf(i.toString().length()).compareTo(Integer.valueOf(max.toString().length())) > 0)
            {
                max = i;
            }
        }
        System.out.println("the maximum value in array is " + max);
    }
}
