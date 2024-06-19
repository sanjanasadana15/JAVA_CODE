Bpublic class casting19JUNE {
    public static void main(String[] args) {
        //Casting

        double price = 100.00;
        double finalPrice = price +18;
        System.out.println(finalPrice);


        /* int p = 100; 
         * int fP= p+18.0; //Casting error : Java implictly does not allow the double to be stored in int
         * In the above we are trying to store the double(18.0 ) into the int
        */

        /* Explicit Casting  */
        int p=100;
        int fP = p +(int)18.0;
        System.out.println(fP);

        int p1=100;
        int fP2= p1+(int)18.8;
        System.out.println(fP2);


        /* Constants */

        final float PI=3.14F;
        

        /*Operators  */
        /*Arithmetic Operator */
        int a=1;
        int b=2;
        int sum = a+b;
        System.out.println(sum);
        int diff=b-a;
        System.out.println(diff);
        int mul=a*b;
        System.out.println(mul);
        double c=1;
        double d=2;
        double div=c/d;
        System.out.println(div);
        double e=5;
        double f=3;
        double modulo=e%f;
        System.out.println(modulo);

    }
}
