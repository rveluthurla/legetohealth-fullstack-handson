package Day3;

public class MovieMain {
	
	public static void main(String[] args) {
		Movie m1 = new Movie("83", "Deepika");
		Movie m2 = new Movie("Hero", "Ravi", "anil", 165, 2020, "Action");
		// Movie m3= new Movie(); // compile time error since v r not hvng default
		// constructor
		System.out.println(m2.showDetails());
		System.out.println("----------------------------------");
		System.out.println(Movie.getMovieCount());
		System.out.println("--------------------------------------");
		System.out.println(m2.getMovieID());
		System.out.println("-------------------------------");
		SpecialMovie sm = new SpecialMovie("rebal", "Prabhas", "raj", 164, 2010, "Action", "Dolby", "VFX");
		System.out.println(sm);
		System.out.println();
		
		
		
	}

}