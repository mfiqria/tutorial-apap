# Tutorial APAP

## Authors 
* **Muhammad Fiqri Adrian** - *1806190973* - *APAP B*

---
## Tutorial 1
### What I have learned today
### Github
1. Apa itu Issue Tracker? Apa saja masalah yang dapat diselesaikan dengan Issue Tracker?
   Mengutip perkataan dari Tom Preston-Werner, Co-Founder & Former CEO github :
    > "It gives us great pleasure to announce our integrated issue tracking system!"
                                                                                                                                                                                                                                                                                                                                                    
   Yang dapat saya simpulkan adalah : Issue Tracker ini berguna untuk meng-handle masalah masalah yang timbul ketika akan "ngoding" sesuatu
   Hal-hal yang dapat di-handle oleh Issue Tracking adalah :
   1. Membuat issue dan menambahkan *labels*, selain itu juga bisa meng-*assign* issue tersebut ke *user* yang kita inginkan
   2. Mencari, mengurutkan, dan memfilter issue.
   3. Menentukan issue yang ingin diprioritaskan dan menyelesaikannya.
   4. Meng-*close* issue yang sudah selesai ditangani
                                                                                                                                                                                      
2. Apa perbedaan dari git merge dan git merge --squash?
   git merge berguna untuk *menggabungkan* branch yang ada pada git. Sehingga branch yang tersisa hanyalah branch master.
   git merge ini memerlukan persetujuan, jadi sebelum branch branch nya di-*merge*, maka akan muncul merge request, nah merge request ini
   dapat di approve oleh Developer yang memiliki *permission*
   Sedangkan git merge --squash berguna untuk *menggabungkan* beberapa branch dan commit menjadi ***satu*** commit sekaligus 

3. Apa keunggulan menggunakan Version Control System seperti Git dalam pengembangan suatu
   aplikasi?
   *Version Control System* (VCS) adalah infrastruktur yang sangat bermanfaat dalam pengembangan aplikasi, terutama yang bersifat kolaboratif.
   Jadi setiap collaborator yang ada dapat menuliskan *codingan* mereka dan mengabungkannya ke VCS ini (git). VCS juga memberikan opsi *revert*
   jika terjadi suatu masalah. Keunggulan lainnya adalah dengan mengembangkan aplikasi menggunakan VCS ini adalah kita dapat melihat dan mengawasi setiap
   perubahan yang terjadi pada aplikasi yang kita buat.

### Spring
4. Apa itu library & dependency?
   Library menurut saya adalah suatu kumpulan *code* yang telah dibuat oleh programmer, yang nantinya dapat digunakan oleh programmer lainnya
   dengan menggunakan import. Biasanya library ini terkumpul didalam suatu module atau package.
   Sedangkan dependency atau lebih sering dikenal dependency injection dalam pemrograman adalah cara bagaimana suatu objek dibentuk ketika terdapat objek lain yang membutuhkan

5. Mengapa kita menggunakan Maven? Apakah ada alternatif dari Maven?
   Maven adalah salah satu Java Build Tools yang memudahkan programmer dalam mengembangkan aplikasi secara kolaboratif. Dengan menggunakan Maven maka
   project yang dibuat oleh programmer dapat dibuka melalui berbagai macam IDE. Maven menggunakan konsep Project Object Model yang berisi informasi 
   dan konfigurasi yang digunakan Maven untuk membuat project. Alternatif lain dari Maven ada banyak, salah satunya adalah ***Ant***

6. Selain untuk pengembangan web, apa saja yang bisa dikembangkan dengan Spring framework?
   Selain untuk membuat web, Spring Framework juga dapat digunakan untuk mengembangkan aplikasi enterprise (sejalan dengan mata kuliah APAP). Selain itu
   Spring Framework juga bisa digunakan untuk mengembangkan aplikasi keamanan dna aplikasi yang berkaitan dengan Big Data.

7. Apa perbedaan dari @RequestParam dan @PathVariable? Kapan sebaiknya menggunakan @RequestParam atau @PathVariable?
   ***@RequestParam*** adalah anotasi dari Spring yang digunakan untuk nge-*bind* paramater yang direquest ke method parameter. 
   @RequestParam lebih berguna pada aplikasi web tradisional di mana data sebagian besar diteruskan dalam query.
   Sedangkan, ***@PathVariable*** adalah anontasi dari Spring yang menunjukkan bahwa method parameter harus terikat ke URI template
   @PathVariable lebih cocok untuk layanan web RESTful di mana URL berisi nilai-nilai, dan banyak menggunakan method GET, PUT, POST

### What I did not understand
- Saya masih kurang tahu apa saja jenis jenis file yang ada terkait penggunaan git ini, seperti docs, feat.
  Mungkin saya akan dapat memahaminya lebih lanjut jika lebih banyak searching.