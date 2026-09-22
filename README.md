# Sistem Katalog Produk Enterprise

Aplikasi konsol sederhana berbasis Java dan Maven untuk mengelola data katalog produk, mencakup pencarian produk, manajemen stok, dan penanganan *exception*.

---

## 🛠️ Prasyarat Sistem
* **Java Development Kit (JDK)**: Versi 17 atau yang lebih baru
* **Apache Maven**: Versi 3.8+
* **IDE**: Visual Studio Code / IntelliJ IDEA / Eclipse

---

## 📁 Struktur Proyek

```text
catalog-product/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── budiluhur/
│                   ├── Application.java               # Main Class / Entry Point
│                   ├── Product.java                   # Model Data Produk
│                   ├── ProductRepository.java         # Repository / Logic Data Produk
│                   └── ProductNotFoundException.java  # Custom Exception Handling
├── pom.xml                                            # Konfigurasi Maven Project
└── README.md                                          # Dokumentasi Proyek
