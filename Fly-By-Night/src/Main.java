import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		
		Airplane boeing = new Airplane();
		
		while(true)
		{
			/*
			Application should take three commands: add passengers,
			show seating and quit.
			*/
			System.out.println("1. Add passengers");
			System.out.println("2. Show seating");
			System.out.println("3. Quit");
			System.out.println("Enter your choice: ");
			
			
			
			//System.out.println(boeing.TotalSeats());
			//System.exit(0);
			
			
			Scanner scan = new Scanner(System.in);
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1: 
					System.out.println("First class (0) or economy (1)?");
					int opt1 = scan.nextInt();
					boolean fClass;
					if(opt1 == 0)
						fClass = true;
					else
						fClass = false;
					
					System.out.println("Passengers traveling together? (FC: 1-2, E:1-3)");
					int opt2 = scan.nextInt();
					
					int opt3 = -1;
					
					if(opt2 == 1)
					{
						System.out.println("Seat preference? (1: aisle | 2: center | 3: window)");
						opt3 = scan.nextInt();
					}
					
					try
					{
						boeing.AddPassenger(fClass, opt2, opt3);
						System.out.println("Passenger added.");
					}
					catch(Exception ex)
					{
						System.out.println(ex.toString());
					}
					break;
				
				case 2:
					for(int i=1; i<21; i++)
					{
						int currentRow = i;
						List<Seat> seatsInRow = (List<Seat>) boeing.seats.stream()
								.filter((seat) -> seat.getRow() == currentRow)
								.collect(Collectors.toList());
						
						for (int j=0; j<seatsInRow.size(); j++)
						{
							if(seatsInRow.get(j).isAssigned())
								System.out.print("O ");
							else
								System.out.print("X ");
						}
						System.out.println("");
					}
					break;
				
				case 3:
					System.exit(0);
			}
		}
	}
}
	

