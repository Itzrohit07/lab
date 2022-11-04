import java .util.*;
public class Thclass {
    public void loadList(Integer startNumber,Integer lastNumber){
        ArrayList<Integer>L=new ArrayList<>();
        for(int i=startNumber;i<=lastNumber;i++){
            L.add(i);
        }
    }

    public static void main(String[] args) {
        Thclass sc=new Thclass();
        long startTime=System.currentTimeMillis();
        sc.loadList(0,10000000);
        long lastTime=System.currentTimeMillis();
        long responcetime=lastTime-startTime;
        System.out.println("time taken for Exicution is:"+responcetime);
    }
}
