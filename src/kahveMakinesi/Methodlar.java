package kahveMakinesi;

import java.util.Scanner;

public class Methodlar {
    static Scanner scan = new Scanner(System.in);

    public static void kahveSecimi() {

        kahveleriListele();
    }

    private static void kahveleriListele() {
    }


    public static void anaMenu() {


        System.out.println("************************");
        System.out.println("-----Kahve Makinesi-----");
        System.out.println("************************");
        System.out.println("1.Türk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n" +
                "4.Americano\n" + "5.Cappicino\n" + "6.Cıkıs");
        System.out.println("************************");
        System.out.println("Lutfen seciminizi yapınız");

        String input = scan.nextLine();
        Kahve secilenKahve = new Kahve();

        switch (input) {
            case "1":
               secilenKahve.setKahveTuru("Türk Kahvesi");
                break;
            case "2":
                secilenKahve.setKahveTuru("Filtre Kahve");
                break;
            case "3":
                secilenKahve.setKahveTuru("Espresso");
                break;
            case "4":
               secilenKahve.setKahveTuru("Americano");
                break;
            case "5":
                secilenKahve.setKahveTuru("Cappicino");
                break;
            case "6":
                System.out.println("Gule gule");
                break;
            default:
                System.out.println("Hatalı giris yaptınız");

        }

        if (!input.equals("6")) {
            System.out.println(secilenKahve.getKahveTuru() + " sectiniz");
            System.out.println("");
            sutEkle(secilenKahve);
            sekerEkle(secilenKahve);
            bardakBoyuSec(secilenKahve);
            System.out.println("******************");
            System.out.println("Kahveniz istediginiz gibi hazırlanıyor");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(secilenKahve.getKahveTuru() + " " + secilenKahve.getBardakBoyu() + " ile hazırlanmıstır");

        }

    }

    private static void bardakBoyuSec(Kahve secilenKahve) {

        System.out.println("Lutfen bardak boyu seciniz");
        System.out.println("Kucuk için 1 / orta boy için 2/ buyuk boy için 3'e basınız");
        String secim= scan.nextLine();
        if (secim.equals("1")){
            System.out.println("Kucuk boy bardak secilmiştir");
            secilenKahve.setBardakBoyu("Kucuk Boy");
        }else if (secim.equals("2")){
            System.out.println("Orta boy bardak secilmiştir");
            secilenKahve.setBardakBoyu("Orta Boy");
        }else if (secim.equals("3")){
            System.out.println("Buyuk boy bardak secilmiştir");
            secilenKahve.setBardakBoyu("Buyuk Boy");
        }else System.out.println("Hatalı giris yaptınız");

    }

    private static void sekerEkle(Kahve secilenKahve) {
        System.out.println("Ne kadar seker olsun");
        System.out.println("Az seker için 1 e bas/ Orta için 2'ye basınız / Çok için 3'e bas");
        String secim= scan.nextLine();
        if (secim.equals("1")){
            System.out.println("Az seker eklenmistir");
            secilenKahve.setSeker(1);
        }else if (secim.equals("2")){
            System.out.println("Orta seker eklenmistir");
            secilenKahve.setSeker(2);
        }else if (secim.equals("3")){
            System.out.println("Çok seker eklenmistir");
            secilenKahve.setSeker(3);
        }else System.out.println("Hatalı giris yaptınız");



    }

    private static void sutEkle(Kahve secilenKahve) {

        if (secilenKahve.getKahveTuru().equals("Türk Kahvesi")||secilenKahve.getKahveTuru().equals("Filtre Kahve")){

            System.out.println("Turk kahvesine sut eklenemez");
            System.out.println("Sut isterseniz 1 e bas/ istemezseniz 2'ye basınız");
            String secim= scan.nextLine();
            if (secim.equals("1")){
                System.out.println("Sutunuz eklenmistir");
            }else System.out.println("Sut eklenmemistir");

        }else {
            System.out.println("Ne kadar sut olsun");
            System.out.println("Az sut için 1 e bas/ Orta için 2'ye basınız / Çok için 3'e bas");
            String secim= scan.nextLine();
            if (secim.equals("1")){
                System.out.println("Az sut eklenmistir");
                secilenKahve.setSutMiktari(100);
            }else if (secim.equals("2")){
                System.out.println("Orta sut eklenmistir");
                secilenKahve.setSutMiktari(150);
            }else if (secim.equals("3")){
                System.out.println("Çok sut eklenmistir");
                secilenKahve.setSutMiktari(200);
            }else System.out.println("Hatalı giris yaptınız");
        }




    }
}
