public class R_1_7 {
    public int sumSquare(int n){
        int total = 0;
        for(int j=0;j<=n;j++)
            total += Math.sqrt(j);
        return total;
    }

    //another solution
    public int sumSquare1(int n){
        int total = 0;
        for(int j=0;j<=n;j++)
            total += j*j;
        return total;
    }
}
