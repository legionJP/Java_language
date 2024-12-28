package Data_Types;

class data_types
{
public static  void main (String a[])
{   int num = 3;
    int num1 = 6;
    int res = num+num1;
    System.out.println(num);   
    System.out.println(5+3);
    System.out.println(res);  

    example variExample = new example();
    variExample.variables();

    lit litExample = new lit();
    litExample.litexample();

}

}

// Data types:

/* 
1. Primitive Data Types: Integr, Float, Char, Boolean
2. Non- Primitive:

Primitive Data Types: 
Integer: - int- 4byte , long -8bytes
short - 2bytes, byte - 1 byte : 2^7 to 2^7-1--> -128 to 128

2. Float: float : 4bytes, double: 8 bytes , here by default it is double
double num ==5.6
float num = 5.6f

3. Char: 2bytes -- it follows the UNICODE ---> char c ='k', 
here double quote is for string

4.Boolean: True, Flase  keyword { not the (0,1)}
bool b= true; 
# default value assigned to the var of bollean types is : False
*/

class example{
    void variables(){
        int n1 = 9;
        byte b =123;
        short sh= 555;
        long l = 5867l; //long
        float f = 5.8f;
        char c = 'k';
        boolean bl = true;
       // System.out.println("Variables");
    }
}

// 3. Literal: 

class lit{
    void litexample()
    {   
        int numb = 0b101;
        System.out.println(numb);

        int numc = 1_00_00_000;
        System.out.println(numc);

        double numd = 12e10;
        System.out.println(numd);
        
        char c1 = 'a';
        c1++;
        System.out.println(c1);
        
    }
}