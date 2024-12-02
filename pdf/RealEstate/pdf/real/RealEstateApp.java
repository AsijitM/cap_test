package pdf.real;

import java.util.ArrayList;
import java.util.List;

public class RealEstateApp implements IRealEstateApp{
	private List<IRealEstateListing> listings;
	public RealEstateApp(){
		listings=new ArrayList<>();
	}

	@Override
	public void addList(IRealEstateListing listing) {
		// TODO Auto-generated method stub
		listings.add(listing);
	}

	@Override
	public void removeListing(int listingID) {
		// TODO Auto-generated method stub
		for(IRealEstateListing l:listings) {
		if(l.getID()==listingID) {
			listings.remove(l);
		 }else {
			System.out.println("listingId not found");
		}
		}

		
	}

	@Override
	public void updateListing(IRealEstateListing listing) {
		// TODO Auto-generated method stub
		for(IRealEstateListing l:listings) {
			if(l.getID()==listing.getID()) {
				l.setTitle(listing.getTitle());
				l.setDescription(listing.getDescription());
				l.setPrice(listing.getPrice());
				l.setLocation(listing.getLocation());
				break;
			}
		}
	}

	@Override
	public List<IRealEstateListing> getlistings() {
		// TODO Auto-generated method stub
		return listings;
	}

	@Override
	public List<IRealEstateListing> getListingsByLocation(String location) {
		// TODO Auto-generated method stub
		List<IRealEstateListing> get=new ArrayList<>();
		for(IRealEstateListing l:listings) {
			if(l.getLocation().equals(location)) {
				get.add(l);
			}
		}
		return get;
	}

	@Override
	public List<IRealEstateListing> getListingsByPriceRange(int minPrice, int maxPrice) {
		// TODO Auto-generated method stub
		List<IRealEstateListing> get=new ArrayList<>();
		for(IRealEstateListing l:listings) {
			if(l.getPrice()>=minPrice && l.getPrice()<=maxPrice) {
				get.add(l);
			}
		}
		return get;
	}

}
