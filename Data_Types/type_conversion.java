package Data_Types;

class type_conversion
{
    public static void main(String[] args) {

        byte b = 127;
        System.out.println(b);
        
        int a =b;
        System.out.println(a);
        
        int a1 =257;
        //int a1 = 12 // here the 257 is out f range and getting converted after the modulo's remainder
        byte k = (byte)a1;
        System.out.println(k);
        
        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);

        // Type promotion , bcz  we are perming the operatin on byte and
        //here the byte limit excedes and it gets promoted in int if you are storing it in int
        byte a2 = 10;
        byte b1= 30;
        int res = a2*b1;
        System.out.println(res);


        
    }
    
}

// Type Conversion:
/*
 
*byte b =127;
 int a = 256;
 b=a;
 --- It will not work ,
 But a =b ;
 ---- I  will work , bcz type of a is int bcz here we are widing the b size 
 
###########//
# cating expilict :
b= byte(a);
b= (byt)a;

####2.
float f = 5.6f;
int x =int(f);

byte b =127;
int a =257;
b= (byte)a;

 */