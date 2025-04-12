class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String num1Rev = new StringBuilder(num1).reverse().toString();
        String num2Rev = new StringBuilder(num2).reverse().toString();

        int m = num1Rev.length();
        int n = num2Rev.length();
        int[] result = new int[m + n + 1];

        for(int i=0; i<m; i++){
            int digit1 =num1Rev.charAt(i)-'0';
            for(int j=0; j<n; j++){
                int digit2 = num2Rev.charAt(j)-'0';
                int product = digit1*digit2;
                result[i+j] += product;
            }
        }
        for(int k=0; k<result.length; k++){
            int carry = result[k]/10;
            result[k] %= 10;
            if(k+1<result.length){
                result[k+1] += carry;
            }
        }
        int maxDigitIndex = result.length - 1;
        while (maxDigitIndex >= 0 && result[maxDigitIndex] == 0) {
            maxDigitIndex--;
        }
        if (maxDigitIndex < 0) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = maxDigitIndex; i >= 0; i--) {
            sb.append(result[i]);
        }
        
        return sb.toString();
    }
}