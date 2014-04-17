package ume;

/**
 * Created by umebayashi yasutaka on 2014/04/17.
 */
public class Heihoukon {
    public static void func(int n){
        Double ans;
        int tmp = 0;
        for(int i =1 ; i < n; i++){
            if(i*i<n){
              //Do nothing
            }else if(i == n){
                tmp = i;
                break;
            }else{
                tmp = i-1;
                break;
            }
        }
        System.out.print(tmp);
    }
}
