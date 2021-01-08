import java.util.Scanner;

public class PinjamanBank{
	public static void main(String[] args) {
		int pinjam=0, bnykpnjman, bunga, bnykangsuran, angsuran, 
		bnykBunga, totalXbunga, pembayaran, angsuranPERBULAN;
		long noReg;
    	String pilih, noKTP, namaDepan, namaBelakang, alamatRumah, noHP, alamatEmail, pekerjaan, yesNO;

    	Scanner sn = new Scanner(System.in);
    	do{
    		System.out.println("Apakah anda yakin ingin masuk ke dana pinjam?");
    		System.out.println("1. yakin");
    		System.out.println("2. Tidak");
    		pilih = sn.next();
    			if(pilih.equals("1")){
    				System.out.println("============ISI IDENTITAS============");
    					do{
    					System.out.print("No. KTP (16 karakter): ");
    					noKTP= sn.next();
                            if(!noKTP.matches("[a-zA-Z.]+") && noKTP.length() == 16){
    						    do{
    							   System.out.print("Nama Depan: ");
								   namaDepan= new Scanner(System.in).nextLine();
                                }while (!namaDepan.matches("[a-zA-Z.]+"));
                                do{
                                    System.out.print("Nama Belakang: ");
                                    namaBelakang= new Scanner(System.in).nextLine();
                                }while(!namaBelakang.matches("[a-zA-Z.]+"));

                                do{
                                    System.out.print("No. Handphone: ");
                                    noHP= sn.next();
                                }while(noHP.matches("[a-zA-Z.]+") || !noHP.matches("[a-zA-Z.]+") && noHP.length() !=12);
                                System.out.print("Alamat Rumah: ");
                                alamatRumah= new Scanner(System.in).nextLine();
                                do{
                                    System.out.print("Pekerjaan: ");
                                    pekerjaan= new Scanner(System.in).nextLine();
                                }while (!pekerjaan.matches("[a-zA-Z.]+"));
    System.out.print("Besar Penghasilan perbulan: ");
    int gaji= sn.nextInt();
    // tentuin banyaknya pinjaman
      if (gaji >= 1000000) {
        if (gaji >= 1000000 && gaji < 5000000 ) {
          System.out.println("Anda Dapat Meminjam Dana 1.000.000 hingga 9.999.999");
          System.out.println("Silahkan Masukan Banyak Pinjaman Anda:");
          bnykpnjman = sn.nextInt();
          // ini proses dana ke input dan nentuin jumlah bunga
            if (bnykpnjman >= 1000000 && bnykpnjman< 10000000){
              pinjam += bnykpnjman;
              bunga= 5;
              //ini buat bikin banyak angsuran
              System.out.println("Anda Dapat Mengangsur Cicilan paling lama 6 Bulan");
              System.out.println("Silahkan Masukan Lamanya Angsuran:");
              bnykangsuran = sn.nextInt();
              // rincian yang sudah dikali bunga
                if (bnykangsuran >= 1 && bnykangsuran <= 6) {
                  bnykBunga= pinjam*bunga/100;
                  totalXbunga= pinjam+bnykBunga;
                  angsuran = bnykangsuran;
                  System.out.println("Nama: " +namaDepan +" " +namaBelakang);
                  System.out.println("No. KTP: "+ noKTP);
                  System.out.println("Alamat Rumah: "+ alamatRumah);
                  System.out.println("Pekerjaan: "+pekerjaan);
                  System.out.println("Ingin Meminjam Dana Sebesar:"+ pinjam);
                  System.out.println("Besaran Bunga Perbulan: "+ bunga + "%" );
                        // JUMLAH CICILAN PER BULAN

                  System.out.print("Apakah Anda Sudah mengisi Data dengan Benar dan Ingin Melanjutkan Meminjam Dana? (Yes/No)");
                  yesNO = sn.next();
                    if (yesNO.equalsIgnoreCase("Yes")) {
                       angsuranPERBULAN = pinjam/bnykangsuran;
                          for(int i=0; i<bnykangsuran; i++){
                                pembayaran = angsuranPERBULAN + (pinjam * bunga / 100);
                                  System.out.println("Pembayaran bulan ke-"+(i+1)+" = "+pembayaran);
                                pinjam = pinjam - angsuranPERBULAN;
                            }
                          // MINTA NOMER REKENING
                          System.out.println("Masukan Rekening Anda:");
                          noReg= sn.nextLong();
                          System.out.println("DATA ANDA SEDANG DI PROSES DANA AKAN CAIR DALAM WAKTU 3-4 HARI \n SILAHKAN KOMFIRMASI JIKA SUDAH MENDAPAT SMS PENCAIRAN DANA DARI PIHAK KAMI");
                    }else if (yesNO.equalsIgnoreCase("No")) {
                      System.out.println("Terima Kasih Sudah Menggunakan Program Kami");
                      System.exit(0);
                }else {
                  System.out.println("Masukan Tidak Valid");}
                }else {System.out.println("Lama Angsuran Tidak Valid Silahkan Isi 1-6 Bulan"); }
          //
        }else {System.out.println("Dana Yang Ingin Anda Pinjam Tidak Valid Silahkan Isi Kembali");}
      }else if (gaji >= 5000000 && gaji < 10000000 ) {
        System.out.println("Anda Dapat Meminjam Dana 1.000.000 hingga 19.999.999");
        System.out.println("Silahkan Masukan Banyak Pinjaman Anda:");
        bnykpnjman = sn.nextInt();
        if (bnykpnjman >= 1000000 && bnykpnjman< 20000000) {
          pinjam += bnykpnjman;
          bunga= 7;
          //ini buat bikin banyak angsuran
          System.out.println("Anda Dapat Mengangsur Cicilan paling lama 12 Bulan");
          System.out.println("Silahkan Masukan Lamanya Angsuran:");
          bnykangsuran = sn.nextInt();
          // rincian yang sudah dikali bunga
          if (bnykangsuran >= 1 && bnykangsuran <= 12) {
            bnykBunga= pinjam*bunga/100;
            totalXbunga= pinjam+bnykBunga;
            angsuran = bnykangsuran;
            System.out.println("==================DATA DIRI=====================");
            System.out.println("Nama: " +namaDepan +" " +namaBelakang);
            System.out.println("No. KTP: "+ noKTP);
            System.out.println("Alamat Rumah: "+ alamatRumah);
            System.out.println("Pekerjaan: "+pekerjaan);
            System.out.println("Ingin Meminjam Dana Sebesar:"+ pinjam);
            System.out.println("Besaran Bunga Perbulan: "+ bunga + "%" );
                        // JUMLAH CICILAN PER BULAN
            System.out.print("Apakah Anda Sudah mengisi Data dengan Benar dan Ingin Melanjutkan Meminjam Dana? (Yes/No)");
            yesNO = sn.next();
            if (yesNO.equalsIgnoreCase("Yes")) {
                angsuranPERBULAN = pinjam/bnykangsuran;
                for(int i=0; i<bnykangsuran; i++){
                      pembayaran = angsuranPERBULAN + (pinjam * bunga / 100);
                      System.out.println("Pembayaran bulan ke-"+(i+1)+" = "+pembayaran);
                      pinjam = pinjam - angsuranPERBULAN;
                  }
                  // MINTA NOMER REKENING
                  System.out.println("Masukan Rekening Anda:");
                  noReg= sn.nextLong();
                  System.out.println("DATA ANDA SEDANG DI PROSES DANA AKAN CAIR DALAM WAKTU 3-4 HARI \n SILAHKAN KOMFIRMASI JIKA SUDAH MENDAPAT SMS PENCAIRAN DANA DARI PIHAK KAMI");
            }else if (yesNO.equalsIgnoreCase("No")) {
              System.out.println("Terima Kasih Sudah Menggunakan Program Kami");
              System.exit(0);
            }else {
              System.out.println("Masukan Tidak Valid");
            }
          }else {System.out.println("Lama Angsuran Tidak Valid Silahkan Isi 1-6 Bulan"); }
          //
        }else {System.out.println("Dana Yang Ingin Anda Pinjam Tidak Valid Silahkan Isi Kembali");}
      }else if (gaji >= 10000000 && gaji < 20000000 ) {
        System.out.println("Anda Dapat Meminjam Dana 2.000.000 hingga 39.999.999");
        System.out.println("Silahkan Masukan Banyak Pinjaman Anda:");
        bnykpnjman = sn.nextInt();
        if (bnykpnjman >= 1000000 && bnykpnjman < 40000000) {
          pinjam += bnykpnjman;
          bunga= 8;
          //ini buat bikin banyak angsuran
          System.out.println("Anda Dapat Mengangsur Cicilan paling lama 6 Bulan");
          System.out.println("Silahkan Masukan Lamanya Angsuran:");
          bnykangsuran = sn.nextInt();
          // rincian yang sudah dikali bunga
          if (bnykangsuran >= 1 && bnykangsuran <= 15) {
            bnykBunga= pinjam*bunga/100;
            totalXbunga= pinjam+bnykBunga;
            angsuran = bnykangsuran;
            System.out.println("Nama: " +namaDepan +" " +namaBelakang);
            System.out.println("No. KTP: "+ noKTP);
            System.out.println("Alamat Rumah: "+ alamatRumah);
            System.out.println("Pekerjaan: "+pekerjaan);
            System.out.println("Ingin Meminjam Dana Sebesar:"+ pinjam);
            System.out.println("Besaran Bunga Perbulan: "+ bunga + "%" );
                        // JUMLAH CICILAN PER BULAN
            System.out.print("Apakah Anda Sudah mengisi Data dengan Benar dan Ingin Melanjutkan Meminjam Dana? (Yes/No)");
            yesNO = sn.next();
            if (yesNO.equalsIgnoreCase("Yes")) {
                angsuranPERBULAN = pinjam/bnykangsuran;
                for(int i=0; i<bnykangsuran; i++){
                      pembayaran = angsuranPERBULAN + (pinjam * bunga / 100);
                      System.out.println("Pembayaran bulan ke-"+(i+1)+" = "+pembayaran);
                      pinjam = pinjam - angsuranPERBULAN;
                  }
                  // MINTA NOMER REKENING
                  System.out.println("Masukan Rekening Anda:");
                  noReg= sn.nextLong();
                  System.out.println("DATA ANDA SEDANG DI PROSES DANA AKAN CAIR DALAM WAKTU 3-4 HARI \nSILAHKAN KOMFIRMASI JIKA SUDAH MENDAPAT SMS PENCAIRAN DANA DARI PIHAK KAMI");
            }else if (yesNO.equalsIgnoreCase("No")) {
              System.out.println("Terima Kasih Sudah Menggunakan Program Kami");
              System.exit(0);
            }else {
              System.out.println("Masukan Tidak Valid");
            }
          }else {System.out.println("Lama Angsuran Tidak Valid Silahkan Isi 1-6 Bulan"); }
          //
        }else {System.out.println("Dana Yang Ingin Anda Pinjam Tidak Valid Silahkan Isi Kembali");}
      }else if (gaji >= 20000000 && gaji < 50000000 ) {
        System.out.println("Anda Dapat Meminjam Dana 1.000.000 hingga 99.999.999");
        System.out.println("Silahkan Masukan Banyak Pinjaman Anda:");
        bnykpnjman = sn.nextInt();
        if (bnykpnjman >= 1000000 && bnykpnjman < 100000000) {
          pinjam += bnykpnjman;
          bunga= 9;
          //ini buat bikin banyak angsuran
          System.out.println("Anda Dapat Mengangsur Cicilan paling lama 6 Bulan");
          System.out.println("Silahkan Masukan Lamanya Angsuran:");
          bnykangsuran = sn.nextInt();
          // rincian yang sudah dikali bunga
          if (bnykangsuran >= 1 && bnykangsuran <= 20) {
            bnykBunga= pinjam*bunga/100;
            totalXbunga= pinjam+bnykBunga;
            angsuran = bnykangsuran;
            System.out.println("Nama: " +namaDepan +" " +namaBelakang);
            System.out.println("No. KTP: "+ noKTP);
            System.out.println("Alamat Rumah: "+ alamatRumah);
            System.out.println("Pekerjaan: "+pekerjaan);
            System.out.println("Ingin Meminjam Dana Sebesar:"+ pinjam);
            System.out.println("Besaran Bunga Perbulan: "+ bunga + "%" );
                        // JUMLAH CICILAN PER BULAN
            System.out.print("Apakah Anda Sudah mengisi Data dengan Benar dan Ingin Melanjutkan Meminjam Dana? (Yes/No)");
            yesNO = sn.next();
            if (yesNO.equalsIgnoreCase("Yes")) {
                angsuranPERBULAN = pinjam/bnykangsuran;
                for(int i=0; i<bnykangsuran; i++){
                      pembayaran = angsuranPERBULAN + (pinjam * bunga / 100);
                      System.out.println("Pembayaran bulan ke-"+(i+1)+" = "+pembayaran);
                      pinjam = pinjam - angsuranPERBULAN;
                  }
                  // MINTA NOMER REKENING
                  System.out.println("Masukan Rekening Anda:");
                  noReg= sn.nextLong();
                  System.out.println("DATA ANDA SEDANG DI PROSES DANA AKAN CAIR DALAM WAKTU 3-4 HARI \n SILAHKAN KOMFIRMASI JIKA SUDAH MENDAPAT SMS PENCAIRAN DANA DARI PIHAK KAMI");
            }else if (yesNO.equalsIgnoreCase("No")) {
              System.out.println("Terima Kasih Sudah Menggunakan Program Kami");
              System.exit(0);
            }else {
              System.out.println("Masukan Tidak Valid");
            }
          }else {System.out.println("Lama Angsuran Tidak Valid Silahkan Isi 1-6 Bulan"); }
          //
        }else {System.out.println("Dana Yang Ingin Anda Pinjam Tidak Valid Silahkan Isi Kembali");}
      }else if (gaji >= 50000000 ) {
        System.out.println("Anda Dapat Meminjam Dana 1.000.000 hingga 500.000.000");
        System.out.println("Silahkan Masukan Banyak Pinjaman Anda:");
        bnykpnjman = sn.nextInt();
        if (bnykpnjman >= 1000000 && bnykpnjman <= 500000000) {
          pinjam += bnykpnjman;
            bunga= 10;
            //ini buat bikin banyak angsuran
          System.out.println("Anda Dapat Mengangsur Cicilan paling lama 24 bulan ");
          System.out.println("Silahkan Masukan Lamanya Angsuran:");
          bnykangsuran = sn.nextInt();
          // rincian yang sudah dikali bunga
          if (bnykangsuran >= 1 && bnykangsuran <= 24) {
            bnykBunga= pinjam*bunga/100;
            totalXbunga= pinjam+bnykBunga;
            angsuran = bnykangsuran;
            System.out.println("Nama: " +namaDepan +" " +namaBelakang);
            System.out.println("No. KTP: "+ noKTP);
            System.out.println("Alamat Rumah: "+ alamatRumah);
            System.out.println("Pekerjaan: "+pekerjaan);
            System.out.println("Ingin Meminjam Dana Sebesar:"+ pinjam);
            System.out.println("Besaran Bunga Perbulan: "+ bunga + "%" );
                        // JUMLAH CICILAN PER BULAN
            System.out.print("Apakah Anda Sudah mengisi Data dengan Benar dan Ingin Melanjutkan Meminjam Dana? (Yes/No)");
            yesNO = sn.next();
            if (yesNO.equalsIgnoreCase("Yes")) {
                angsuranPERBULAN = pinjam/bnykangsuran;
                for(int i=0; i<bnykangsuran; i++){
                      pembayaran = angsuranPERBULAN + (pinjam * bunga / 100);
                      System.out.println("Pembayaran bulan ke-"+(i+1)+" = "+pembayaran);
                      pinjam = pinjam - angsuranPERBULAN;
                  }
                  // MINTA NOMER REKENING
                  System.out.println("Masukan Rekening Anda:");
                  noReg= sn.nextLong();
                  System.out.println("DATA ANDA SEDANG DI PROSES DANA AKAN CAIR DALAM WAKTU 3-4 HARI \n SILAHKAN KOMFIRMASI JIKA SUDAH MENDAPAT SMS PENCAIRAN DANA DARI PIHAK KAMI");
            }else if (yesNO.equalsIgnoreCase("No")) {
              System.out.println("Terima Kasih Sudah Menggunakan Program Kami");
              System.exit(0);
            }else {
              System.out.println("Masukan Tidak Valid");
            }
          }else {System.out.println("Lama Angsuran Tidak Valid Silahkan Isi 1-24 Bulan"); }
          //
        }else {System.out.println("Dana Yang Ingin Anda Pinjam Tidak Valid Silahkan Isi Kembali");}

      }
      }else {System.out.println("Maaf Penghasilan Perbulan Anda Belum Mencapai Minumum Penghasilan Untuk Dapat Meminjam");}

                                       						    
                            }else if(noKTP.matches("[a-zA-Z.]+") || !noKTP.matches("[a-zA-Z.]+") && noKTP.length() != 16) System.out.println("no ktp harus 16 karakter dan angka");
    					}while(noKTP.matches("[a-zA-Z.]+") || !noKTP.matches("[a-zA-Z.]+") && noKTP.length() != 16);
    				//}while();
    				
    			}
    			else if(pilih.equals("2")){ System.out.println("Thank You"); break;}
    		    else if(!pilih.equals("1") || !pilih.equals("2")) System.out.println("Pilih menu yang ada");

    	}while(!pilih.equals("1"));
    		
	}
}