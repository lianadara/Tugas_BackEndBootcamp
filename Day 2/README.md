# Langkah-Langkah Membuat API dengan SpringBoot
1. Membuat project di Spring Initializer.
2. Membuka project yang telah didownload.
3. Di file resources/application.properties, dituliskan sebagai berikut.
   spring.data.mongodb.uri=mongodb://localhost:27017/{nama_database_di_mongoDBCompass}
5. Membuat package controller, service, repository, dan domain.
6. Di package controller, dibuat class CustomerController. File ini yang menghandle request dan respons.
7. Di package service, dibuat class CustomerService.
8. Di package repository, dibuat class interface CustomerRepository.
9. Di package domain, dibuat class Customer. File ini berisi deklarasi dari berbagai field yang dibutuhkan.
