
public class Seat 
{
	
	private boolean assigned;
	private boolean firstClass;
	private int row;
	private int column;
	
	
	public Seat(boolean assigned, boolean firstClass, int row, int column) 
	{
		this.assigned = assigned;
		this.firstClass = firstClass;
		this.row = row;
		this.column = column;
	}


	public boolean isAssigned() {
		return assigned;
	}


	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}


	public boolean isFirstClass() {
		return firstClass;
	}


	public void setFirstClass(boolean firstClass) {
		this.firstClass = firstClass;
	}


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getColumn() {
		return column;
	}


	public void setColumn(int column) {
		this.column = column;
	}
	
	
	
	
}
