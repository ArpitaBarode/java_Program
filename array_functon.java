public class array_functon {
    static void printarray(){
        //int arr[];
       // arr=new int[10];
        int [] arr={24,5,7,2,4};
        for(int i=0;i<arr.length;i++){
            System.out.println("array elements are:"+arr[i]);
        }
    }
    static void max(){
        int [] arr={24,5,7,266,4};
        int max=0;
        for( int j=0;j<arr.length;j++){
            if(arr[j]>max)
                max=arr[j];

        }
        System.out.println("maximum:"+max);
    }
    static int min(int [] arr){
      //  int [] arr={24,5,7,2,4};
        int min=arr[0];
        for(int k=0;k<arr.length;k++){
            if(min>arr[k])
            {
                min=arr[k];
            }
        }

        System.out.println("minmun:"+min);
        return min;
    }
    static void sort(int [] arr){
        int temp = 0;
        for(int a=0;a<=arr.length-2;a++){
            for(int b=0;b<=arr.length-2-a;b++){
                if(arr[b]>arr[b+1])
                temp=arr[b];
                arr[b]=arr[b+1];
                arr[b+1]=temp;
            }
        }


    }

    public static void main(String [] args){
        int [] arr={2,56,4,2};
        printarray();
        max();
        min(arr);
        sort(arr);
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

}
