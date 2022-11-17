record Employee(int RollNo,String Name, int Age,String gender,int Totalmarks){
Employee(){
this(1,"pandu",21,"Female",550);}
 public static void main(String[] args){
Employee e= new Employee(1,"pandu",21,"Female",550);
Employee e1= new Employee(2,"sunny",18,"male",450);
System.out.println(e);
System.out.println(e1);
	   }
}