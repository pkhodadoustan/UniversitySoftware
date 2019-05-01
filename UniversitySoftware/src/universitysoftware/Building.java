package universitysoftware;

import java.util.ArrayList;

public class Building {
	protected int bldNum;
	protected String bldName;
	protected ArrayList<Room> rmList;
	
	public Building() {
		bldNum = 0;
	}
	
	public Building(int rn, String name, ArrayList<Room> rlist) {
		bldNum = rn;
		bldName = name;
		rmList = rlist;
	}
	
	public void setBldNum(int newBN) {bldNum = newBN;}
	public int getBldNum() {return bldNum;}
	
	public void setBldName(String newName) {bldName = newName;}
	public String getBldName() {return bldName;}
	
	public void addRoom(int index, Room r) {
		if(index >= 0 && index < rmList.size())
			rmList.add(index,r);
		else
			rmList.add(r);
	}
	
	public void removeRoom(int index) {
            rmList.remove(index);
	}
}