package Operators;

// # Airthmetic Operators


class operators{
public static void main(String a[])
{
    System.out.println("Operator");
    int num1 =7;
    int num2 =8;
    int num3 =6;
    int n =3;
    int result = num1+num2;
    int mul = num1*num2;
    int div = num1/num2;
    System.out.println(result);
    System.out.println(mul);
    System.out.println(div); // only get the Quotient for modulos %

    int num = num1+2;
    num3 *= 8;
    System.out.println(num);
    System.out.println(num3);
    
    ++n;
    // n++;  
    System.out.println(n);

    int n1 =2;
    int res1 = n1++; 
    // it gives 2 , post increament , but the res1 is assign without increament ,
    //so gives 2 
    //int res1 = ++n1;       // it gives 3 , pre increament 
    System.out.println(res1);
 
    //instantiating and obj for the rl_op method
    relational_op rl_comp = new relational_op();
    rl_comp.rl_op();

}
}
/*
 here the diff b/w post and pre increament when we assign an fetch the value
 they behave differently when we do post icreament the values is first fetch and then increment 
 in thwe pre incremanet value is fetched then increament so it gives 3
*/


// Relational Operators

/*
1. < , > , == , !=
2. if 7<5---> f (output is boolean )
*/

class relational_op
{
    void rl_op()
    {
        System.out.println("Re");
        int x =6;
        int y = 5;
        boolean comp = x<=y;
        //boolean comp = x>=y;
        System.out.println(comp);
    }
}

// Logical Operator
/*
1. AND: 
2. OR:  


 */