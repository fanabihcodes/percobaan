package org.app.uts.npm255;

import java.util.List;
import org.app.uts.npm255.model.Kursus;
import org.app.uts.npm255.repo.KursusRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectUts43A87006180255Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectUts43A87006180255Application.class, args);
	}
        
        @Bean
        public CommandLineRunner getAllKursusRepository(KursusRepository repo){
            return a -> {
                List<Kursus> list = repo.findAll();
                System.out.format("%-15s %-30s %-20s %-20s %25s \n","Kursus ID","Nama",
                            "Durasi","Instruktur","Kategori");
                System.out.println("-----------------------------------------------------"
                           +"-------------------");
                list.forEach(c ->{
                    System.out.format("%-15s %-30s %-20s %-20s %25s\n",
                            c.getKursusID(),c.getNama(),
                            c.getDurasi(),c.getInstruktur(),c.getKategori());
                });
            };
        }
        
        
        public CommandLineRunner getByIdKursus(KursusRepository repo){
            return a ->{
                Kursus kur = repo.findById("KUR002").orElse(null);
                kur.getNama();
                System.out.println("Data Kursus KUR002 ditemukan "+kur.getNama());
            };
        }
        
        
        public CommandLineRunner insertKursus(KursusRepository repo){
            return a -> {
                try {
                    Kursus kur = new Kursus();
                    kur.setKursusID("KUR002");
                    kur.setNama("Pelatihan Program Java");
                    kur.setDurasi(320);
                    kur.setInstruktur("Bambang Wibisono, S.Kom");
                    kur.setKategori("Komputer");
                    repo.save(kur);
                    System.out.println("Berhasil Menyimpan!");
                } catch (Exception e) {
                    System.out.println("Gagal Menyimpan!!!");
                    System.out.println("Error : "+e.getMessage());
                }
            };
        }
        
        
        public CommandLineRunner updateKursus(KursusRepository repo){
            return a -> {
                Kursus kur = repo.findById("KUR001").orElse(null);
                kur.setNama("Pemrograman Java 2");
                repo.save(kur);
                System.out.println("Data Kursus KUR001 ditemukan "+kur.getNama());
            };
        }
        
        
        public CommandLineRunner deleteKursus(KursusRepository repo){
            return a -> {
                Kursus kur = repo.findById("KUR001").orElse(null);
                kur.getNama();
                repo.delete(kur);
                System.out.println("Data Kursus KUR001 sudah dihapus ");
            };
        }

}
