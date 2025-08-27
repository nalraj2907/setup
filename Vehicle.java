public class Vehicle {
    
    void run(){
        System.out.println("runing");

    }
    
}
class bike extends Vehicle{
    void run(){
        super.run();
        System.out.println("bike runing");
    }


}class main{
    public static void main(String[] args){
        bike obj =new bike();
        obj.run();
        //Circle obj1 =new Circle();
        //obj1.draw();
        

    }
    
}
