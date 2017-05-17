import java.util.ArrayList;
import java.util.List;

public class Airplane {
	
	List<Seat> seats;
	
	public Airplane()
	{
		this.seats = new ArrayList<Seat>(); 
		
		//create first class seats
		for(int row=1; row<=5; row++){
			for(int column=-2; column<=2; column++){
				if(column != 0){
					seats.add(new Seat(false, true, row, column));	
				}
			}
		}
		
		//create economy class seats
		for(int row=6; row<=20; row++){
			for(int column=-3; column<=3; column++){
				if(column != 0){
					seats.add(new Seat(false, false, row, column));	
				}
			}
		}		
	}

	public int TotalSeats()
	{
		return seats.size();
	}

	public void AddPassenger(boolean firstClass, int together, int column) throws Exception
	{
		for(int i=0; i<seats.size(); i++)
		{
			Seat currentSeat = seats.get(i);
			if(!currentSeat.isAssigned() && currentSeat.isFirstClass() == firstClass)
			{
				if(together == 1 && Math.abs(currentSeat.getColumn()) == Math.abs(column))
				{
					currentSeat.setAssigned(true);
					break;
				}
				else if(together == 2)
				{
					Seat companionSeat = seats.stream()
							.filter(
									(newSeat) -> 
										(!newSeat.isAssigned())
										&&
										(newSeat.getRow() == currentSeat.getRow())
										&&
										(newSeat.getColumn() == currentSeat.getColumn()+1)
										)
							.findFirst()
							.orElse(null);
					
					if(companionSeat != null)
					{
						currentSeat.setAssigned(true);
						companionSeat.setAssigned(true);
						break;
					}
				}
				else if(together == 3)
				{
					Seat companionSeat1 = seats.stream()
							.filter(
									(newSeat) -> 
										(!newSeat.isAssigned())
										&&
										(newSeat.getRow() == currentSeat.getRow())
										&&
										(newSeat.getColumn() == currentSeat.getColumn()+1)
										)
							.findFirst()
							.orElse(null);
					
					Seat companionSeat2 = seats.stream()
							.filter(
									(newSeat) -> 
										(!newSeat.isAssigned())
										&&
										(newSeat.getRow() == currentSeat.getRow())
										&&
										(newSeat.getColumn() == currentSeat.getColumn()+2)
										)
							.findFirst()
							.orElse(null);
					
					if((companionSeat1 != null) && (companionSeat2 != null))
					{
						currentSeat.setAssigned(true);
						companionSeat1.setAssigned(true);
						companionSeat2.setAssigned(true);
						break;
					}
				}
			}
			if(i == seats.size()-1)
				throw new Exception("No match found.");
		}
	}
}
