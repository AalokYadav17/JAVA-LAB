class palindrome{
    public static void main (String args[]){
        int num=121;
        int original = num;
        int reverse=0;
        int lastdigit;
        while(num>0){
            lastdigit=num%10;
            reverse=reverse *10 + lastdigit;
            num=num/10;
        }
        if(original==reverse)
        System.out.println("The number is palindrome"+reverse);
        else {
            System.out.println("The number is not palindrome"+original);
        
        }
    }
}