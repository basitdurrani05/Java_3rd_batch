// Method Overloading  - Naam ek kaam alag alag

// Same name but different operation perform.

public class ninth {


    void rajveer(){

        System.out.println("Home - Son");
    }


    void rajveer(String a){

        System.out.println("Company : "+a);
    }

    void rajveer(String a,String b){

        System.out.println("College : "+a+" "+b);
    }


    
    



    public static void main(String[] args) {

        ninth sc = new ninth();

        sc.rajveer();
        sc.rajveer("Software Engineer");
        sc.rajveer("Student","Friend");


        

    }
    
}
