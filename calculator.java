class calculator {
   public static int add(int a, int b){
      System.out.println(a+b);
   }
   public static int sub(int a, int b){
      System.out.println(a-b);
   }
   public static int mul(int a, int b){
      System.out.println(a*b);
   }
   public static int div(int a, int b){
      System.out.println(a/b);
   }
   public static void main(String [] args) {
     System.out.println("Welcome to calculator");
     add(2,4);
     sub(4,8);
     mul(7,6);
     div(2/4);
   }
   
}