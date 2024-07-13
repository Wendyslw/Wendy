public class Example1{
    public static void main(String args[]){
        int score=60;
 
        if (score <= 39){
            System.out.println("F");
        }else if (score <= 59){
            System.out.println("C");
        }else if (score <= 79){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
 
        System.out.println("End");
    }
}