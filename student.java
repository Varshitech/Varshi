record student(int RollNo, String Name, int Age, String Gender, int TotalMarks){
	student(){
	this(1, "pandu", 21, "Female", 550);}
	public static void main(String[] args){
		student std= new student(1, "pandu", 21, "Female", 550);
		student std1= new student(2, "sunny", 18, "Male", 450);
		student std2= new student(3, "janu", 19, "Female", 350);
		System.out.println(std);
		System.out.println(std1);
		System.out.println(std2);
	}
}