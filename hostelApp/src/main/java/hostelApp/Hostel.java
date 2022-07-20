package hostelApp;

import java.util.ArrayList;

public class Hostel {
	private Address address;
	private Employee employee;
	ArrayList<Guest> guests;
	private ArrayList<Room> rooms = new ArrayList<Room>();
	private String name;
	private String homePageAdress;
	private String description;
	private String inaugurationDate;
	private int contact;
	
	
	public void addRoom(Room room) {
		rooms.add(room);
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public ArrayList<Guest> getGuests() {
		return guests;
	}


	public void setGuests(ArrayList<Guest> guests) {
		this.guests = guests;
	}


	public ArrayList<Room> getRooms() {
		return rooms;
	}


	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHomePageAdress() {
		return homePageAdress;
	}


	public void setHomePageAdress(String homePageAdress) {
		this.homePageAdress = homePageAdress;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getInaugurationDate() {
		return inaugurationDate;
	}


	public void setInaugurationDate(String inaugurationDate) {
		this.inaugurationDate = inaugurationDate;
	}


	public int getContact() {
		return contact;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}
	
	
}
