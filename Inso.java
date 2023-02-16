import java.util.Scanner;

public class Inso {
    public static void main(String[] args) {
//         int A = 2;
//        if(A == 2){
//            System.out.println("Hôm Nay là thứ 2");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ 2 -8 ");
        int number = scanner.nextInt();
        System.out.println("Số Bạn Nhập là : " + number);

        switch (number){
            case 2 :
                System.out.println("Hôm nay là thứ 2");
                break;
            case 3:
                System.out.println("Hôm này là thứ 3");
                break;
            case 4:
                System.out.println("Hôm nay là thứ 4");
                break;
            case 5:
                System.out.println("Hôm này là thứ 5");
                break;
            case 6:
                System.out.println("Hôm nay là thứ 6");
            case 7 :
                System.out.println("Hôm nay là thứ 7");
                break;
            case 8:
                System.out.println("Hôm nay là Chủ Nhật");
            default:
                System.out.println("Đề nghị bạn nhập lại");
        }
    }
}
