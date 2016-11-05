package driver;

import PO.HotelPO;
import dataservice.hotelinfodataservice.HotelInfoDataService;

public class HotelInfoDataService_Driver {
	public void drive(HotelInfoDataService hotelInfoDataService) {
	hotelInfoDataService.addHotel(new HotelPO());
	hotelInfoDataService.modifyHotel(new HotelPO());
	hotelInfoDataService.deleteHotel("0001");
	hotelInfoDataService.getHotelList();
	hotelInfoDataService.getHotelList("0001");
	hotelInfoDataService.getHotelInfo("0001");
	}
	
}
