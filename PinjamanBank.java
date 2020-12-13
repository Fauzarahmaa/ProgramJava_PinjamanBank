 /**
 * @param args the command line arguments
 */
import java.util.Scanner;

public class PinjamanBank {
 
 	public static void main(String[] args) {
 // TODO code application logic here
 		int pinjam=0, bnykpnjman, bunga, bnykangsuran, angsuran, bnykBunga, totalXbunga, pembayaran,angsuranPERBULAN; 
    long noReg;
 		Scanner sn= new Scanner(System.in);
 		System.out.println("-------------------------------------------------------");
 		System.out.println("-------------SELAMAT DATANG DI DANA PINJAM-------------");
 		System.out.println("-------------------------------------------------------");
 // identitas peminjam
 		String namaDepan, namaBelakang, alamatRumah, noHP, alamatEmail, pekerjaan, yesNO;
 		System.out.println("SILAHKAN ISI IDENTITAS ANDA DENGAN BENAR");

 		System.out.print("No. KTP : ");
    long noKTP= new Scanner(System.in).nextLong();
    System.out.print("Nama Depan: ");
		namaDepan= sn.nextLine();
 		System.out.print("Nama Belakang: ");
		namaBelakang= sn.nextLine();
    System.out.print("Alamat Rumah: ");
    alamatRumah= sn.nextLine();
		System.out.print("Pekerjaan: ");
		pekerjaan= sn.nextLine();
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
					System.out.println("Anda Dapat Mengangsur Cicilan paling lama 6 Bulan");
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
 					}else {System.out.println("Lama Angsuran Tidak Valid Silahkan Isi 1-6 Bulan"); }
 					//
 				}else {System.out.println("Dana Yang Ingin Anda Pinjam Tidak Valid Silahkan Isi Kembali");}

			}
// diatas user udah milih banyak pinjaman dan aplikasi sudah menentukan bunga nya
			//proses memilih angsuran




		// ini else terakhir, kalo mau buat kode diatas else ini
			}else {System.out.println("Maaf Penghasilan Perbulan Anda Belum Mencapai Minumum Penghasilan Untuk Dapat Meminjam");}

 		
	
 	}
 
}