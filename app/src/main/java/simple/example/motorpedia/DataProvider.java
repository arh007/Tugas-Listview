package simple.example.motorpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.motorpedia.model.Honda;
import simple.example.motorpedia.model.Motor;
import simple.example.motorpedia.model.Suzuki;
import simple.example.motorpedia.model.Yamaha;

public class DataProvider {
    private static List<Motor> motors = new ArrayList<>();

    private static List<Honda> initDataHonda(Context ctx) {
        List<Honda> hondas = new ArrayList<>();
        hondas.add(new Honda("CB150 Verza", "150CC",
                "Honda GL15B1DF atau Honda Verza 150 adalah sepeda motor yang diproduksi oleh AHM Indonesia, sepeda motor ini merupakan salah satu sepeda motor sport yang dibekali mesin 150 cc SOHC bersilinder tunggal dan telah mengadopsi sistem suplai bahan bakar PGM-FI", R.drawable.honda1));
        hondas.add(new Honda("PCX", "150CC",
                "Honda PCX adalah motor keluaran Honda yang ditujukan bagi segmen motor premium skutik. Ketika motor matic sedang marak digandrungi oleh masyarakat Indonesia disamping memberikan kemudahan bagi para pengendara pemula, maka berbagai desain motor matic yang elegan telah pula menjadi salah satu preferensi konsumen di tanah air.", R.drawable.honda2));
        hondas.add(new Honda("CBR150R", "150CC",
                "Honda CB150R StreetFire adalah sebuah sepeda motor sport bermesin 150 cc yang diproduksi oleh Astra Honda Motor di Indonesia sejak tahun 2012.", R.drawable.honda3));
        hondas.add(new Honda("CBR250RR", "250CC",
                "Honda CBR250RR tersedia dalam pilihan mesin Petrol di Indonesia Sport baru dari Honda hadir dalam 6 varian. Bicara soal spesifikasi mesin Honda CBR250RR, ini ditenagai dua pilihan mesin Petrol berkapasitas 249.7 cc. CBR250RR tersedia dengan transmisi Manual tergantung variannya. CBR250RR adalah Sport 2 seater dengan panjang 2060 mm, lebar 724 mm, wheelbase 1389 mm. serta ground clearance 145 mm.", R.drawable.honda4));
        hondas.add(new Honda("CRF150L", "150CC",
                "Honda CRF150L adalah motor CRF seri 150 cc dual-sport yang dibuat oleh Astra Honda Motor, anak perusahaan Honda di Indonesia. Diluncurkan pada November 2017. Ini berbagi mesin 149 cc 4-tak SOHC SOHC 4-silinder berpendingin udara dengan motor standar Verza.", R.drawable.honda5));
        hondas.add(new Honda("CRF250 Rally", "250CC",
                "Honda CRF250Rally tersedia dalam pilihan mesin Petrol di Indonesia Off Road baru dari Honda hadir dalam 2 varian. Bicara soal spesifikasi mesin Honda CRF250Rally, ini ditenagai dua pilihan mesin Petrol berkapasitas 249.6 cc. CRF250Rally tersedia dengan transmisi Manual tergantung variannya. CRF250Rally adalah Off Road 2 seater dengan panjang 2210 mm, lebar 900 mm, wheelbase 1455 mm. serta ground clearance 270 mm. ", R.drawable.honda6));
        hondas.add(new Honda("Monkey", "150CC",
                "Seri Honda Z atau Monkey Bike adalah sederetan minibike buatan Honda. Walaupun penunjukan model resmi Honda biasanya Z50A, Z50J, Z50M, Z50R, dan ZB50.", R.drawable.honda7));
        hondas.add(new Honda("ADV", "150CC",
                "Honda ADV150 dibekali mesin berteknologi eSP, silinder tunggal, 4-tak SOHC, pendingin cairan dengan teknologi injeksi bahan bakar PGM-FI. Dengan kapasitas mesin 149,3 cc, tenaga yang mampu dihasilkan mencapai 14,4 Hp pada 8.500 rpm dan torsi 13,8 Nm di putaran 6.500 rpm.", R.drawable.honda8));
        hondas.add(new Honda("CB150X", "150CC",
                "Honda CB150X StreetFire adalah sebuah sepeda motor sport bermesin 150 cc yang diproduksi oleh Astra Honda Motor di Indonesia sejak tahun 2012.", R.drawable.honda9));
        hondas.add(new Honda("CT125", "125CC",
                "Honda CT125 tersedia dalam pilihan mesin Petrol di Indonesia Moped baru dari Honda hadir dalam 2 varian. Bicara soal spesifikasi mesin Honda CT125, ini ditenagai dua pilihan mesin Petrol berkapasitas 124.89 cc. CT125 tersedia dengan transmisi Manual tergantung variannya. CT125 adalah Moped 1 seater dengan panjang 1960 mm, lebar 805 mm, wheelbase 1255 mm. serta ground clearance 165 mm.", R.drawable.honda10));
        return hondas;
    }

    private static List<Yamaha> initDataYamaha(Context ctx) {
        List<Yamaha> yamahas = new ArrayList<>();
        yamahas.add(new Yamaha("YZF R15 MONSTER ENERGY", "155CC",
                "Motor yang satu ini menggunakan Mesin dengan kapasitas 155 cc, dengan 6 percepatan, serta memiliki 4 Katup. Performa lain pada motor ini dilengkapi Variable Valve Actuation (VVA) sehingga menjadikan gerakan atau torsi Merata di setiap perputaran pada mesinnya.", R.drawable.yamaha1));
        yamahas.add(new Yamaha("YZF R15", "155CC ",
                "Yamaha R15 pertama kali diperkenalkan pada 2014 silam. Indonesia beruntung menjadi negara yang dijadikan tempat peluncuran motor ini secara global. Indonesia juga yang menjadi basis produksi R15 sampai sekarang untuk Asia Tenggara. ", R.drawable.yamaha2));
        yamahas.add(new Yamaha("WR 155 R", "155CC",
                "Yamaha Indonesia telah meluncurkan motor trail di segmen 155 cc, yaitu WR155 R. Motor ini dinilai menjadi pesaing kuat Kawasaki KLX 150 dan Honda CRF 150L. ", R.drawable.yamaha3));
        yamahas.add(new Yamaha("XSR 155", "155CC",
                "Yamaha mengambil langkah yang tepat dengan menghadirkan XSR 155 pada Desember 2019. Motor tersebut mendapat respons yang sangat positif dari konsumen di Indonesia. Momen peluncurannya cukup tepat, di saat perkembangan dunia motor custom terus meningkat", R.drawable.yamaha4));
        yamahas.add(new Yamaha("MT25", "250CC",
                "Yamaha MT 25 merupakan salah satu naked bike terbaru Yamaha yang pertama kali diperkenalkan pada 2015 silam. Menggunakan basis Yamaha R15, MT 25 diyakini sebagai langkah kuda Yamaha untuk bisa mendominasi pasar motor sport di Indonesia, dengan menyediakan menyediakan varian naked pada motor sport mereka. ", R.drawable.yamaha5));
        yamahas.add(new Yamaha("VIXION R", "155CC",
                "Yamaha V-Ixion awal kehadirannnya pada kisaran tahun 2007 menjadi yang pertama motor sport kelas 150 cc mengadopsi sistem suspensi belakang tunggal atau mono. Ini yang membuat nya berkesan sport.u ", R.drawable.yamaha6));
        yamahas.add(new Yamaha("VIXION MONSTER ENERGY", "155CC",
                "Vixion juga mendapat balutan livery Monster Yamaha MotoGP Edition, hanya saja untuk versi standarnya. Jadi basis yang digunakan adalah Vixion dengan mesin 150 cc, bukan 155 cc dengan variable valve actuation (VVA) atau Vixion R. ", R.drawable.yamaha7));
        yamahas.add(new Yamaha("XABRE", "155CC",
                "Yamaha Xabre adalah sebuah sepeda motor sport bermesin 150 cc dari pabrikan Yamaha. Sepeda motor ini pertama kali diperkenalkan di Thailand pada bulan Desember 2015. Sepeda motor ini kemudian diperkenalkan di Indonesia pada bulan Januari 2016, lalu di Filipina dan Vietnam pada bulan Agustus 2016.", R.drawable.yamaha8));
        yamahas.add(new Yamaha("BYSON F1", "155CC",
                "Yamaha juga memiliki motor sport murah bernama “Yamaha Byson”. Harganya lebih murah dibandingkan Xabre ataupun Vixion, karena dibanderol dibawah 25 Juta Rupiah. Walaupun murah, namun masbro akan mendapatkan mesin 150cc yang bertenaga dan responsif.", R.drawable.yamaha9));
        yamahas.add(new Yamaha("NMAX 155 CONNECTED", "155CC",
                "Yamaha NMAX adalah sebuah skuter yang bertransmisi otomatis yang diproduksi oleh Yamaha di Indonesia sejak tahun 2015. Skuter ini diluncurkan secara resmi pada tanggal 7 Februari 2015 di Sirkuit Sentul, Bogor. ", R.drawable.yamaha10));
        return yamahas;
    }

    private static List<Suzuki> initDataSuzuki(Context ctx) {
        List<Suzuki> suzukis = new ArrayList<>();
        suzukis.add(new Suzuki("GIXXER SF 250","250CC",
                "Suzuki Indonesia telah memasarkan sport touring berfairing 250 cc yaitu Suzuki Gixxer SF 250.", R.drawable.suzuki1));
        suzukis.add(new Suzuki("GXS-S150", "150CC",
                "Suzuki GSX S150 adalah motor sport naked bermesin 4 tak berkapasitas mesin 150 cc silinder tunggal DOHC 4 klep. Dirakit di Tambun, Kabupaten Bekasi, Indonesia oleh PT Suzuki Indomobil Sales sejak tahun 2016.", R.drawable.suzuki2));
        suzukis.add(new Suzuki("GXS150 BANDIT", "150CC",
                "Suzuki GSX 150 Bandit adalah motor Street 2 seater Tersedia dengan harga Rp 27,3 Juta. Suzuki GSX 150 Bandit tersedia dalam 1 varian dan 4 warna. Ini juga tersedia dalam pilihan transmisi 6-Kecepatan Manual. ", R.drawable.suzuki3));
        suzukis.add(new Suzuki("ALL NEW SATRIA F150", "150CC",
                "All New Satria F150 kini tampil makin futuristik dan sporty dengan desain body yang aerodinamis. Semakin agresif menaklukan semua tantangan di jalan.", R.drawable.suzuki4));
        suzukis.add(new Suzuki("NEX II", "150CC",
                "NEX II adalah motor matic terbaru yang stylish dengan desain yang modern dan futuristik. NEX II mengusung mesin 115cc FI dengan teknologi SEP (Suzuki Eco Performance) yang memberikan keuntungan konsumsi bahan bakar. NEX II juga memiliki fitur Suzuki Easy Start System yang memudahkan dalam menyalakan mesin.", R.drawable.suzuki5));
        suzukis.add(new Suzuki("ADDRESS F1", "125CC",
                "Model baru ini merupakan pilihan tambahan dari Suzuki Address FI yang telah eksis sebelumnya. Skutik multifungsi bermesin 113cc yang irit dan bertenaga tersebut kini dilengkapi dengan 10 pilihan warna aksesoris panel bodi menarik dan penuh gaya yang dapat disesuaikan dengan jiwa dan karakter muda-mudi masa kini.", R.drawable.suzuki6));
        suzukis.add(new Suzuki("NEX CROSSOVER", "150CC",
                "NEX Crossover adalah motor matic terbaru dengan tampilan fresh pada handle bar dan seat cover, dan tetap mempertahankan teknologi SEP (Suzuki Eco Performance) pada mesin 115cc FI. NEX Crossover juga dilengkapi dengan Digital Speedometer yang membuat tampilan makin futuristik dan memberikan kemudahan dalam membaca informasi. ", R.drawable.suzuki7));
        suzukis.add(new Suzuki("ADDRESS PLAYPUL", "125CC",
                "Ngomongin skuter matik (skutik) yang memiliki banyak pilihan warna, Suzuki Address adalah salah satunya.", R.drawable.suzuki8));
        suzukis.add(new Suzuki("NEW SMASH F1", "125CC",
                "Suzuki kembali melahirkan New Smash FI dengan mempertahankan keunggulan performa, ketangguhan serta konsumsi bahan bakar yang irit dengan tagline baru ‘Tarikannya Dahsyat!.", R.drawable.suzuki9));
        suzukis.add(new Suzuki("GSX-R150", "150CC",
                "Suzuki GSX-R 150 adalah ikon dan penerus tradisi motor sport performa tinggi yang mengusung kecanggihan teknologi. Suzuki menerapkan prinsip filosofi terbaik ketika mengembangkan GSX-R sejak pertama kali, dan masih dipertahankan setiap Suzuki mengembangkan dan menciptakan model generasi berikutnya.", R.drawable.suzuki10));
        return suzukis;
    }

    private static void initAllMotors(Context ctx) {
        motors.addAll(initDataHonda(ctx));
        motors.addAll(initDataYamaha(ctx));
        motors.addAll(initDataSuzuki(ctx));
    }

    public static List<Motor> getAllMotor(Context ctx) {
        if (motors.size() == 0) {
            initAllMotors(ctx);
        }
        return  motors;
    }

    public static List<Motor> getMotorsByTipe(Context ctx, String merek) {
        List<Motor> motorsByType = new ArrayList<>();
        if (motors.size() == 0) {
            initAllMotors(ctx);
        }
        for (Motor h : motors) {
            if (h.getMerek().equals(merek)) {
                motorsByType.add(h);
            }
        }
        return motorsByType;
    }

}
