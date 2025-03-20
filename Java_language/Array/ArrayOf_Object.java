package Array;

class Students{
    int rollno;
    String name;
    int  marks;   //instance var bcz belongs to class
}

public class ArrayOf_Object {
    public static void main(String a[])
    {
        int nums[] = new int[6];
        nums[0]=4;
        nums[1]=2;
        nums[2]=3;
        nums[3]=5;
        nums[4]=8;
        nums[5]=9;

        for(int i=0; i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }

        //Objects of the Students

        Students s1 =new Students();
        s1.rollno =1;
        s1.name = "New1";
        s1.marks = 21;

        Students s2 =new Students();
        s2.rollno =2;
        s2.name = "New2";
        s2.marks = 22;

        Students s3 =new Students();
        s3.rollno =3;
        s3.name = "New3";
        s3.marks = 24;

        //Creatring the array of students

        Students students[]= new Students[3] ;
        students[0]=s1; 
        students[1]=s2;
        students[2]=s3;  
        // creating the array which holds the students refrences but not the object

        for(int i=0; i<students.length;i++)
        {
            System.out.println(students[i].name + ", "+ "Mraks: "+ students[i].marks);
        }

        //Enhanced for-loop or for each
        for(Students stud : students)  // here type of stud is Students like in bleow n type is int
        {
            System.out.println(stud.name + ": " + stud.marks);
        }


        // Enhanced For Loop Theory :

        for(int n: nums)   // nums give the value for loop and store it n, the one 
        {
            System.out.println(n);
        }
    }
}


// Draw Backs Of Array
/*
 * Array in java is object and creats inside the heap memory and 
 * takes the space continuously and can't expand the size it is fixed
 * Consume the lot of the time 
 * 
 * Solution  is Object if want to store diff type of var 
 * 
 * Collection can be improved to enhance the use case of the arrays
 */