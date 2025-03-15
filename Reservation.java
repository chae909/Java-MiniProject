import java.time.LocalDateTime;
import java.lang.System;

public class Reservation {
    // 필드
    // 고객, 예약 ID, 방, 체크인 날짜, 체크아웃 날짜
    private Customer customer;
    private int reservID;
    private Room room;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int members;
    private int visitCount;
    private static int nextReservID = 00001; // 예약 ID 자동 증가를 위한 정적 변수

    public Reservation() {
        // default생성자
    }

    // 생성자
    public Reservation(Customer customer, int reservID, Room room, LocalDateTime startDate, LocalDateTime endDate) {
        this.customer = customer;
        this.reservID = reservID;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.members = 0;
        this.visitCount = 0;
    }

    // 오퍼레이션
    // 예약추가
    public void addReserve(Customer customer, Room room, int members, LocalDateTime startDate, LocalDateTime endDate) {
        this.customer = customer;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.room.setFull(true); // 방이 예약되었음을 표시
        this.members = members;
        this.visitCount++;
        this.reservID = nextReservID++; // 예약 ID 자동 생성
    }

    public void printReserv() {
    	System.out.println(this);
    }

    @Override
	public String toString() {
		long days = java.time.Duration.between(startDate, endDate).toDays();
		int totalPrice = room.getPrice()*(int)days;
		return "예약 ID: " + reservID + ", 고객: " + customer.getName() + ", 방: " + room.getRoomID() + ", 체크인: " + startDate + ", 체크아웃: " + endDate + ", 총 가격: " + totalPrice + "원";
	}

	public void deleteReserv() {
		if (room != null) room.setFull(false);
        this.customer = null;
        this.room = null;
        this.startDate = null;
        this.endDate = null;
    }

    // Getters and Setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getReservID() {
        return reservID;
    }

    public void setReservID(int reservID) {
        this.reservID = reservID;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }
}
