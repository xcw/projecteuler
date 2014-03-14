package euler;


public class Multiples35
{

    private boolean multiple3(int num){
        boolean m3 = false;
        if(num>1000 && num<0){
            return false;
        }
        m3 = (num%3==0);
        return m3;
    }


    private boolean multiple5(int num){
        boolean m5 = false;
        if(num>1000 && num<0){
            return false;
        }
        m5 = (num%5==0);
        return m5;
    }


    public static void main(String[] args)
    {
        Multiples35 m35 = new Multiples35();
        int sum = 0;
        for(int i=0; i<=1000; i++){
            if (m35.multiple3(i)||m35.multiple5(i))
            {
                sum+=i;
            }
        }
        System.out.println("The sum of the multiples of 3 or 5 in [0,1000] is: "+sum);
    }

}



