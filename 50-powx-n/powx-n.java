class Solution {
    public double myPow(double x, int n) {
        double p = 1;
        long neg = n;
       if(x==0){
        return 0;
       } 
       if(n==0){
        return 1;
       }
       if(n<0){
        x = 1 / x;
        neg = -neg;
       }
       while(neg>0){
        if((neg & 1) == 1){
            p = p * x;
        }
        x = x*x;
        neg>>=1;
       }
       return p;
    }
}