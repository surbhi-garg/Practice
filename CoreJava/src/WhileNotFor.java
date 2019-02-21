public class WhileNotFor {
    public static void main(String[] args) {
        int s=0,t=1;
        int i=0,j;
        while(i<10)
        {
            s+=i;
            j=i;
            while(j>0)
            {
                t*=(j-1);
                j--;
            }
            s*=t;
            System.out.println("T is"+t);
            i++;
        }
        System.out.println("S is"+s);
    }
}
