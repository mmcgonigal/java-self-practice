public class Data_type {
    public static void main (String[] args){


        double a = 10.4;
        double b = 7.3;
        double c = 16.7;

        System.out.println((a + b+ c )/3);

        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        };
        int d = 200;
        //%n = change the lane,
        System.out.printf("%n %d " , d ); //200 -->decimal integer
        System.out.printf("%n %f", 200.1); //200.100000 -->  a float
        System.out.printf("%.12f%n", 200.1);//after decimal point, there are 12 digits. so : 200.100000000000
        System.out.printf("%n %h", d); //c8 --> %h --> Hex String 16진수
        System.out.printf("%n %c" , 'd'); //d
        System.out.printf("%n %o", d); //310  --> %o --> octal 8진수
        System.out.printf("%n %s","Mina");// Mina --> String
        System.out.printf("%n %c %n", 'G'); // G -->char value

        long n =  461012; //_ --> a char space.
        System.out.printf("%d%n", n);//461012
        System.out.printf("%08d%n",n);//00461012
        System.out.printf("%+8d%n",n);//_+461012
        System.out.printf("%,8d%n",n);//_461,012
        System.out.printf("%+,8d%n",n);//+461,012 -->special character doesn't have an order

        double pi = Math.PI;
        System.out.printf("%f%n",pi); //3.141593
        System.out.printf("%.3f%n",pi);//3.142 // rounded up
        System.out.printf("%10.3f%n",pi);//______3.142
        System.out.printf("%-10.3f%n",pi);//3.142

        String name = "John Doe";
        System.out.println(name);

        String subString = name.substring(0 ,3); // starting point 0 , how many
        String subString2 = name.substring(2, 4);//
        System.out.println(subString);//J
        System.out.println(subString2);//hn












    }


}
