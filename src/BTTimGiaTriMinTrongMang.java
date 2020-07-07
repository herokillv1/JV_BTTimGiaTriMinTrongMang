import java.util.Scanner;

public class BTTimGiaTriMinTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size mảng : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println();
        System.out.println("Mảng vừa tạo : ");
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*30);
            System.out.print(array[i]+"\t");
        }

        int min = array[0];
        for (int i=0;i<array.length;i++){
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println();
        System.out.println("Số nhỏ nhất trong mảng là : ");
        System.out.print(min);
    }
}
