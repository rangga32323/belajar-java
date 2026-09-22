package com.budiluhur;

import com.budiluhur.catalog.model.Product;
import com.budiluhur.catalog.repository.ProductRepository;

public class Application {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("  SISTEM KATALOG PRODUK ENTERPRISE v1.0 ");
        System.out.println("=========================================");

        ProductRepository repo = new ProductRepository();

        // Menambahkan data produk ke repository
        repo.addProduct(new Product("P01", "Mouse Wireless Silent", 175000.0));
        repo.addProduct(new Product("P02", "Keyboard Mechanical", 450000.0));

        System.out.println("\n--- Daftar Semua Produk ---");
        for (Product p : repo.findAll()) {
            System.out.println(p);
        }

        System.out.println("\n--- Cari Produk Berdasarkan ID ---");
        try {
            Product found = repo.findById("P01");
            System.out.println("Ditemukan: " + found);

            // Menguji penanganan exception jika ID tidak ada
            repo.findById("P99");
        } catch (ProductNotFoundException e) {
            System.out.println("Status Error: " + e.getMessage());
        }
    }
}