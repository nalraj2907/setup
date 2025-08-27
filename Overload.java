class D{
    int k=99;
    void e(){
        System.out.println("cpp "+ k);
    }
}

class F extends D{
    int k=33;
    void e(){
        super.e();
        System.out.println("fpp "+ super.k);
        
    }
}
class Overload {
    public static void main(String []args){
        F obj=new F();
        obj.e();
        // D ob=new D();
        // ob.e();
    }
}
