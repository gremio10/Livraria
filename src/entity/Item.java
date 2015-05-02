package entity;

public class Item 
{
	private int id = 0, stock;
	private String name;
	
	public int getId() 
	{
		return id;
	}

	public void setId( int id ) 
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName( String name )
	{
		this.name = name;
	}
		
	public int getStock()
	{
		return stock;
	}

	public void setStock( int stock )
	{
		this.stock = stock;
	}

	public String toString()
	{
		StringBuilder result = new StringBuilder();
		
		result.append( String.format( "| %-2s ", this.getId() ) );
		result.append( String.format( "| %-180s ", this.getName() ) );
		
		return result.toString();
	}
	
	public String toStringCart()
	{
		StringBuilder result = new StringBuilder();
		
		result.append( String.format( "| %-2s ", this.getId() ) );
		result.append( String.format( "| %-40s |%n", this.getName() ) );
		
		return result.toString();
	}
}