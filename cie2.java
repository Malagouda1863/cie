package cie1;

public class cie1 {
    public static void main(String[] args) {
        int a=10,b=20;
        //logical operators
        if(a==0 && b == 0){
            System.out.println("Both integers are zero");

        }else{
            System.out.println("integers are not zero");

        }

        if(a==0 || b ==0){
            System.out.println("BOne of the int is zero");

        }else{
            System.out.println("Both integers are not zero");

        }

        if( a != 0){
            System.out.println("integer"+ a +" is not equal to zero");

        }else{
            System.out.println("integers a zero");

        }
         if (a<b){
            System.out.println("b is greater t6han a ");

         }else{
            System.out.println("a is greater than b");

         }

         if(a>=b){
            int sum = a-b;
            System.out.println("The result of substraction is"+ sum);
        
         }
         System.out.println("This is from master branch");
    }
}
