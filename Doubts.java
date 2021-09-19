package doubts;
import java.util.Scanner;

public class Doubts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch(fruit){
            case "mango" :
                System.out.println("Yellow fruit");
                String department = sc.next();
                switch(department) {
                    case "company":
                        System.out.println("Call the company manager");
                        break;
                    case "Marketing sector":
                        System.out.println("Call the marketing manager");
                        break;
                    default:
                        System.out.println("Call the consumer care");
                }
                break;
            case "orange" :
                System.out.println("Orange fruit");
                break;
            case "apple" :
                System.out.println("Red fruit");
                break;
            default :
                System.out.println("Not a fruit");
        }
        String s1 = "3";
        int s2 = 3;
        System.out.println(s1+s2);
        System.out.println(s1+(s2+3));
        //Multiple if statements are used when conditions are to be checked irrespective of the above if conditions becoming true or false.
        //Here, each condition is checked and can be executed if true.
        int a = 10;
        if(a>5){
            System.out.println("dfsfds");
        }
        if(a>6){
            System.out.println("sdfdfsdfs");
        }
        if(a>7){
            System.out.println("sfsdfdfs");
        }
        else{
            System.out.println("sdfjidfsi");
        }
    }
}












