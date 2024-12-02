package pdf.real;

import java.util.List;

public interface IRealEstateApp {
	public void addList(IRealEstateListing listing);
	public void removeListing(int listingID);
	public void updateListing(IRealEstateListing listing);
	public List<IRealEstateListing> getlistings();
	public List<IRealEstateListing> getListingsByLocation(String location);
	public List<IRealEstateListing> getListingsByPriceRange(int minPrice,int maxPrice);
}