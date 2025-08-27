 public class Person {
    Person(){
        String name="nalraj";
        System.out.println(name);

    }
    
}
class employee extends Person{
     employee(){
        super();
}
        
    }
    
class main{
    public static void main(String[] args) {
        employee obj =new employee();    
    }
}