public class R_1_6 {
    public int sumOdd(int n){
        int total = 0;
        for(int j=0;j<=n;j++){
            if((j & 1)==1){
                total += j;
            }
        }
        return total;
    }

    //another solution
    public int sumOdd1(int n){
        int total =0;
        for(int j=1;j<=n;j+=2){
            total += j;
        }
        return total;
    }
}
