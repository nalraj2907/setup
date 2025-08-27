 class D{
    final int a=23;
    void e(int a){
        a=this.a;
    System.out.println(this.a);    }
 }
 class Final {
    public static void main(String[] args) {
        D obj =new D();
        obj.e(45);
            
        }
    }
    

