public class array_print {
    public static void main(String[] args){
        int [] marks={100,80,90,67,44};
        //dsplaying all the elements in array
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);

        }
        System.out.println("quiz print marks in reverse order");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("printing array element by for-each loop");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
