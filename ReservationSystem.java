import java.lang.System;

public class ReservationSystem {
    private Reservation reservID;
    private Room room;

    public void checkIn() {
        System.out.println("�����ȣ " + reservID.getReservID() + "�� üũ�� �Ϸ�.");
        System.out.println("�� ��ȣ�� " + room.getRoomID() + "�Դϴ�. ��ſ� �ð� �Ǽ���!");
    }

    public void checkOut() {
        System.out.println("�����ȣ " + reservID.getReservID() + "�� üũ�ƿ� �Ϸ�.");
        System.out.println(reservID.getVisitCount() + "��° �湮�̹Ƿ� ���� �̿���� " + getGrade(reservID.getVisitCount()) + " ����Դϴ�.");
        System.out.println("�߰� ������ �ʿ��Ͻʴϱ�?");
        room.setFull(false);
    }

    private String getGrade(int visitCount) {
        if (visitCount == 1) {
            return "�ű԰�";
        } else if (visitCount == 2) {
            return "��湮��";
        } else {
            return "�ܰ��";
        }
    }
}
