package pdfDsa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class StockBuySell { 
	public static List<Long> getNetProfit(List<String> events){
		  Map<String,Integer> potfolio=new HashMap<>();
		  long profit=0;
		  List<Long> res=new ArrayList<>();
		  for(String event:events) {
			  String[] words=event.split(" ");
		switch(words[0]) {
			 case "BUY":
				  String stock=words[1];
				  int quantity= Integer.parseInt(words[2]);
				  potfolio.put(stock, potfolio.getOrDefault(stock, 0)+1);
				  break;
			case "SELL":
				 stock=words[1];
				 quantity= Integer.parseInt(words[2]);
				 potfolio.getOrDefault(stock, potfolio.getOrDefault(stock, 0)-1);
				 break;
			case "CHANGE":
				stock=words[1];
				int priceChange= Integer.parseInt(words[2]);
				profit += priceChange * potfolio.getOrDefault(stock, 0);
				break;
			case "Query":
				res.add(profit);
				break;
		  } 
		  } 
	  }

}
