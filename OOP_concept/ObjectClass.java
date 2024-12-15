package OOP_concept;

class Laptop {
    String model;
    int price;

    public String toString()
    {
        return model + " : " + price;
    }
    
    public boolean equals(Laptop that)  // using the this equals method insted of built in .equals
    {
        return (this.model.equals(that.model) && this.price == that.price);
        
    }


// Source action autmoatic generated equal and the toString method


// @Override
// public String toString() {
//     return "Laptop [model=" + model + ", price=" + price + "]";
// }



// @Override
// public int hashCode() {
//     final int prime = 31;
//     int result = 1;
//     result = prime * result + ((model == null) ? 0 : model.hashCode());
//     result = prime * result + price;
//     return result;
// }

// @Override
// public boolean equals(Object obj) {
//     if (this == obj)
//         return true;
//     if (obj == null)
//         return false;
//     if (getClass() != obj.getClass())
//         return false;
//     Laptop other = (Laptop) obj;
//     if (model == null) {
//         if (other.model != null)
//             return false;`
//     } else if (!model.equals(other.model))
//         return false;
//     if (price != other.price)
//         return false;
//     return true;
// }

// ----------------------------------------------------------------------------------------------------------//

}

public class ObjectClass {
    public static void main(String[] args) {
    
        Laptop objA = new Laptop();
        objA.model = "HP Pavilion";
        objA.price = 92300;

        Laptop objB = new Laptop();
        objB.model = "HP Pavilion";
        objB.price = 92300;

        System.out.println(objA);
        // Every time you try to call or print the that it call the .toString() Method
        
        System.out.println(objA.toString()); 
         // it resturn thr hash code of the value , if the class is not implemented in the name of the it

        
         // comparing the two object of the class 
        //boolean result = objA == objB;
        boolean result = objA.equals(objB);

        System.out.println(result);

    }
}


