package pdf.real;

import java.util.List;

public interface IRealEstateListing {
	public int getID();
	public void setID(int ID);
	
	public String getTitle();
	public void setTitle(String title);
	
	public String getDescription();
	public void setDescription(String description);
	
	public int getPrice();
	public void setPrice(int price);
	
	public String getLocation();
	public void setLocation(String location);
}
