import java.util.Scanner;

public class ikininkatlaritoplama {
    public static void main(String[] args){

        // Tek sayı girilene kadar 2nin katı olan sayıları toplama

        int a, top = 0;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Sayiyi giriniz : ");
            a = inp.nextInt();
            if(a % 2 == 0){
                top += a;
            }
        } while (a % 2 == 0);

        System.out.print("Toplam : " + top);
    }
}
