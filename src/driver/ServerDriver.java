package driver;

import data.hotelinfodata.HotelInfoDataImpl;
import data.roominfodata.RoomInfoDataImpl;
import dataservice.hotelinfodataservice.HotelInfoDataService;
import dataservice.roominfodataservice.RoomInfoDataService;

/**
 * 驱动的总测试入口
 * @author 王凡
 *
 */
public class ServerDriver {
	public static void main(String[] args) {
	
		HotelInfoDataService hotelInfoDataService = new HotelInfoDataImpl();
		HotelInfoDataService_Driver hotelInfoDataService_Driver= new HotelInfoDataService_Driver();
		hotelInfoDataService_Driver.drive(hotelInfoDataService);
		
		RoomInfoDataService roomInfoDataService = new RoomInfoDataImpl();
		RoomInfoDataService_Driver roomInfoDataService_Driver = new RoomInfoDataService_Driver();
		roomInfoDataService_Driver.drive(roomInfoDataService);
	}
}
