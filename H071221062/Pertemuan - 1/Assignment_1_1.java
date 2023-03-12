public class Assignment_1_1 {

    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(System.in); // unutk membaca input dari user
            System.out.print("NIM : "); // inputan user yang memiliki variabel NIM
            String NIM = sc.nextLine(); // membaca input dari user
            System.out.print("SOAL : No."); // inputan user yang memiliki variabel tersebut
            int angka = Integer.parseInt(NIM.substring(NIM.length() - 3));
            // fungsi Integer.ParseInt untuk mengubah tipedata string menjadi integer
            // untuk mengambil 3 nilai terakhir terhadap sebuah string

            System.out.println(angka % 7 == 0 ? 7 : angka % 7);
            // jika 3 nilai terakhir inputan modulu 7 == 0 akan mengembalikan nilai 7
            // jika tidak maka mengembalikan nilai modulu tersebut
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
