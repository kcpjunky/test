package ume;

/**
 * Created by umebayashi yasutaka on 2014/04/17.
 */
public class PrimeNumber {
    public static void func(){
        boolean flag;
        System.out.println("prime:" + 1);
        System.out.println("prime:" + 2);
        for(int i=3;i<100;i++){
            flag = false;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    System.out.println("not prime:" + i);
                    flag = true;
                    break;
                }
            }
            if(flag == true){

            }else{
                System.out.println("prime:" + i);
            }
        }
    }
}
