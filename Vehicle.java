record Vehicle(String Name,String Type,String color, int Mileage){
	
	Vehicle(){
		this("car","Suv","Maroon",25);
	}
		public static void main(String[] args){
		Vehicle v = new Vehicle("car", "Suv", "Maroon", 25);

		Vehicle v1= new Vehicle("Motorcycles", "Activa", "Red", 45);

		System.out.println(v);
		System.out.println(v1);
}
}