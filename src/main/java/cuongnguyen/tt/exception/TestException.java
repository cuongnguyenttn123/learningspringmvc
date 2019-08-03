package cuongnguyen.tt.exception;

import java.util.Random;

public class TestException {
    public static void main(String[] args){
        Random random = new Random();
        Integer index = random.nextInt(100);
        try{
            int a = 10/0;
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("test complete");

    }

    public static void inPutAge(int tmp) throws NullPointException, AgeLessException {
        if (tmp == 0){
            throw new NullPointException("equal 0");
        }
        else if (tmp < 18){

            throw new AgeLessException("Less age 18");
        }
        System.out.println("You might 18 age");
    }
}
