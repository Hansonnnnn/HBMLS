package driver;

import PO.RoomInfoPO;
import dataservice.roominfodataservice.RoomInfoDataService;

public class RoomInfoDataService_Driver{
	public void drive(RoomInfoDataService roomInfoDataService) {
		roomInfoDataService.addRoom(new RoomInfoPO());
		roomInfoDataService.deleteRoom("0001");
		roomInfoDataService.modifyRoom(new RoomInfoPO());
		roomInfoDataService.modifyRoomState("0001", "USING");
		roomInfoDataService.getRoomList("0001");
		roomInfoDataService.getRoomInfo("0001");
		
		
	}

}
