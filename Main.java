import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("�޴��� �����ϼ���:");
            System.out.println("1. �� ���� �Է�");
            System.out.println("2. �� ����");
            System.out.println("3. ���� ���� ���");
            System.out.println("4. üũ��");
            System.out.println("5. üũ�ƿ�");
            System.out.println("6. �� ���� ����");
            System.out.println("7. ����");

            String menu = sc.nextLine();

            switch (menu) {
                case "1":
                    
                    break;
                case "2":
                    
                    break;
                case "3":
                   
                    break;
                case "4":
                  
                    break;
                case "5":
                    
                    break;
                case "6":
                    
                    break;
                case "7":
                    System.out.println("���α׷��� �����մϴ�.");
                    System.out.println();
                    return;
                default:
                    System.out.println("�߸��� �����Դϴ�. �ٽ� �õ��ϼ���.");
            }
        }
    }
}