import java.util.Scanner;

public class Assignment_1_4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Judul Film :\n>") ;
        String kalimat = sc.nextLine().toLowerCase();
        sc.close();
        String[] hasil = kalimat.split(" ");
        upper(hasil);
            }

    public static void upper(String[]hasil) {
        for (int i = 0; i < hasil.length;i++){
            String hurufAwal = hasil[i].substring(0, 1);
            hurufAwal = hurufAwal.toUpperCase();
            String sisaKata = hasil[i].substring(1); 
            String fix = hurufAwal + sisaKata; 
            System.out.print(fix + " ");
        
        }
           
    }
    
}
