package ume;

/**
 * Created by umebayashi yasutaka on 2014/04/17.
 */
public class FizzBuzz {
    public static void func(){
        for(int i=0; i<20; i++){
            if(i%15==0){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }

    }
}
