# Tugas Day 1: SpringBoot

## Deskripsi Tugas
1. Buat project baru di Spring Initializer
2. Buka di IDE
3. Buat model class Product (id, name)
4. Buat contoh List Product dan buat output JSON dari list product tersebut

## Pengerjaan Tugas
1. Membuat project baru di Spring Initializer dengan konfigurasi sebagai berikut.
   ![image](https://github.com/lianadara/Tugas_Multipolar/assets/106791473/6cb11491-195d-4267-8c04-3049ce5bff49)

2. Membuka folder yang telah didownload dari Spring Initializer di IDE
    ![image](https://github.com/lianadara/Tugas_Multipolar/assets/106791473/f236ba12-b8ec-43de-b70b-9e88950c97c3)

3. Membuat class Products serta melakukan deklarasi variabel id dan name dengan modifier Private.
   Pengaturan modifier Private di dalam suatu class yaitu untuk enkapsulasi, melindungi data, serta memungkinkan pengelolaan yang lebih aman dan terkontrol.
   
   ![image](https://github.com/lianadara/Tugas_Multipolar/assets/106791473/fff14a42-725c-46f3-a598-1eaa092441ac)

5. Membuat class Product Controller, untuk menangani permintaan HTTP dan memberikan respons.
   ![image](https://github.com/lianadara/Tugas_Multipolar/assets/106791473/2550148a-a4b7-45af-aaee-7c682d904723)

   - @RestController dan @RequestMapping("/api") merupakan anotasi yang menandakan bahwa class ini adalah REST Controller yang akan menangani permintaan API yang datang pada endpoint /api.
   - Method products() adalah handler yang akan merespons permintaan GET pada endpoint /api/products. Method ini mengembalikan daftar produk dalam bentuk JSON.

6. Output yang diperoleh saat menjalankan URL http://localhost:8080/api/products.
   
   ![image](https://github.com/lianadara/Tugas_Multipolar/assets/106791473/753b14f4-c44a-475d-b0af-7858d7ef0c83)
