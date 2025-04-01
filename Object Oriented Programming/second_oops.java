// Getter and Setter


public class second_oops {

    private int roll_no;       
    private String name;

    private String emailid;


    public void setA(int a){         // Setter - Set the value

        roll_no =a;   // Public       PUBLIC + PRIVATE  = PUBLIC 
    }
    public int  getA(){    // Getter - Read the value

        return roll_no;
    }

    

    public void SetB(String b){

        name = b;

    }

    public String getB(){

        return name;
    }



    public void setC(String c){

        emailid =c;
    }

    public String getC(){
        return emailid;
    }



    








    public static void main(String[] args) {

        second_oops obj = new second_oops();

        obj.setA(30);
        System.out.println("rOLL nO : "+obj.getA());


       obj.SetB("Basit");
       System.out.println("Name : "+obj.getB());

       obj.setC("basitdurrani@gmail.com");
       System.out.println("Email ID:"+ obj.getC());

       



    //    obj.setA(21);
    //    System.out.println(obj.getA());

    //    obj.SetB("Jeevesh");
    //    System.out.println(obj.getB());




        

        
    }
    
}
