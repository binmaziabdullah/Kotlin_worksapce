package kotlinBasics;


public class JavaWithKotlin {

    public static void main(String[]args){

        System.out.println("calling kotlin function from java class");
        int sum = CustomizeKotlinFileName.areaOfRectangle(5,10);
        System.out.println("Area of rectangle is =>"+sum);
    }

    public static void areaOfRectangle(int l,int b){
        System.out.println("Area of rectangle is => "+l*b);
    }

}
