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
  
  
  
## Tutorial 2
### What I have learned today
1. Cobalah untuk menambahkan sebuah resep dengan mengakses link berikut:
http://localhost:8080/resep/add?noResep=1&namaDokter=Papa%20APAP&namaPasien=Quanta%20F
asilkom&catatan=Semangat
Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi
Hal yang terjadi adalah munculnya whitelabel error. Hali ni dapat terjadi karena view add-resep belum kita buat
                                                                                                                                                                                      
2. Menurut kamu anotasi @Autowired pada class Controller tersebut merupakan implementasi dari konsep apa? 
Dan jelaskan secara singkat cara kerja @Autowired tersebut dalam konteks service dan controller yang telah kamu buat  

@Autowired merupakanfitur component-scan yang disediakan oleh Spring Framework. Anotasi ini mengimplementasi Inversion of Control 
tugasnya untuk melihat isi package, lalu
mengecek setiap class yang memiliki anotasi :
-@Repository
-@Service
-@Controller
-@Component
Setelah ditemukan, maka akan dilakukan inisiasi atau inject semua dependency yang dibutuhkan.
@Autowired dalam konteks ini menambahkan variabel dari ResepService ke dalam Controller

3. Cobalah untuk menambahkan sebuah resep dengan mengakses link berikut:
http://localhost:8080/resep/add?noResep=1&namaDokter=Papa%20APAP&namaPasien=Quanta%20F
asilkom Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi.
Akan ada whitelabel error lagi, karena parameter dari variabel 'catatan' tidak ada isiniya.

5: Tambahkan 1 contoh resep lainnya sesukamu. Lalu cobalah untuk mengakses http://localhost:8080/resep/viewall , 
apa yang akan ditampilkan? Sertakan juga bukti screenshotmu.
Link http://localhost:8080/resep/add?noResep=10052000&namaDokter=Mama%20AMAM&namaPasien=Muhammad%20Fiqri%20Adrian&catatan=AyoAyoAyo

Link Gambar : https://drive.google.com/file/d/1v4zggm_SqZtuDyghQpJ0AgV2llNeKkE-/view?usp=sharing

 
### What I did not understand
- Masih banyak error yang saya temui tadi, namun setelah mengetik ulang saya dapat mengatasinya. Sebelumnya saya tidak mengetahui 
kenapa error tersebut muncul, kemungkinan karena adanya typo.


## Tutorial 3
### What I have learned today
1. Pada class ResepDb , terdapat method findByNoResep , apakah kegunaan dari method tersebut?
    findByNoResep adalah query creation method yang berasal dari  resepModel. Method ini berguna untuk menyaring Key dari table resep yang
    sudah dibuat.
2. Pada class ResepController , jelaskan perbedaan method addResepFormPage dan addResepSubmit ?
    addResepFormPage adalah method yang digunakan ketika user baru hendak membuat suatu resep. Method ini menggunakan request method
    bertipe Get yang digunakan untuk mendapatkan data data yang akan diisikan oleh user. Sedangkan addResepSubmit adalah method yang
    digunakan ketika user akan men-submit data resep yang telah dimasukkan form kedalam database resep, method ini menggunakan 
    request method Post.
3. Jelaskan kegunaan dari JPA Repository !
    JPA repository adalah standar untuk menggunakan object java pada relational database.
4. Sebutkan dan jelaskan di bagian kode mana sebuah relasi antara ResepModel dan ObatModel dibuat?
    ResepModel dan ObatModel 'menjalin' relasi pada package model. Disini terdapat hubungan karena pada ObatModel terdapat accessor dan mutator
    untuk memanggil resepModel. Selain itu hubungan keduanya juga terdapat pada proses update obat. Update obat membutuhkan ResepModel agar ketika
    melakukan update noResep tidak bernilai null.
5. Jelaskan kegunaan FetchType.LAZY, CascadeType.ALL , dan FetchType.EAGER !
    FetchType.LAZY -->  Hibernate tidak men-load semua collecton object ( child ) saat object parent di-fetch. Collection object (child) hanya 
    di-load jika secara eksplisit dibutuhkan via getter method. Default fetching (@OneToMany, @ManyToMany)
    FetchType.EAGER --> Hibernate men-load semua collection object ( child ) sesaat setelah object parent di-fetch. Default fetching (@OneToOne, @ManyToOne.)
    CascadeType.ALL --> Semua operasi cascade akan diterapkan pada entitas terkait, Operasi cascade yang Terkait (DETACH, MERGE, PERSIST, REFRESH, REMOVE).
 
### What I did not understand
- Saya masih harus banyak belajar mengenai proses update dan delete pada database ini, karena masih banyak mengalami error.


## Tutorial 4
### What I have learned today
1. Jelaskan perbedaan th:include dan th:replace!
th:insert dan th:replace sama sama berguna untuk fragment inclusion perbedaannya adalah 
pada th:insert akan memasukkan fragment yang diinginkan ke dalam host tag dan langsung berperan sebagai bodynya. 
Sedangkan th:replace akan mengganti host tag dengan fragment yang kita inginkan

2. Jelaskan apa fungsi dari th:object!
th:object adalah fitur local variable definition pada thymeleaf. 
th:object digunakan untuk menentukan objek yang akan dihubungkan dengan data formulir yang dikirimkan. 
Penggunaannya bisa dengan menggunakan asterisk syntax (*) pada objek yang diinginkan.

3. Jelaskan perbedaan dari * dan $ pada saat penggunaan th:object! Kapan harus dipakai?
Asterisk syntax (*) mengevaluasi ekspresi pada objek yang dipilih sedangkan dollar syntax ($) mengevaluasi ekpresi pada variable.
* akan lebih baik digunakan ketika kita hanya ingin memilih beberapa object yang ada, 
sedangkan $ digunakan untuk mengoperasikan keseluruhan variable.

4. Bagaimana kamu menyelesaikan latihan nomor 3?
Latihan no 3 saya selesaikan dengan menambahkan suatu tag bold pada file fragment.html. Tag bold ini terletak didalam tag navbar, dan di styling
rata kanan.
```
    <b th:text="${title}" style="text-align:right;"></b>
```
Lalu pada setiap page yang akan memanggil fragment ini saya tambahkan beberapa variable
```
    <nav th:replace="fragments/fragment :: navbar(title = '<Judul title>')"></nav>
```
Judul title dapat kita sesuaikan dengan title terkait


### What I did not understand
- Saya masih harus banyak belajar mengenai flexible layout dan juga hal hal terkait latihan no 4


## Tutorial 5
### What I have learned today
1. Apa itu Postman? Apa kegunaannya?
Postman adalah sebuah collaboration platform untuk API Develpoment. Melalui Postman programmer bisa create, share, test
dan mendokumentasikan API yang mereka miliki. Beberapa hal yang bisa dilakukan oleh Postman adalah :
- API Client
- Automated Testing
- Design & Mock
- Documentation
- Monitors
- Workspace

2. Jelaskan fungsi dari anotasi @JsonIgnoreProperties dan @JsonProperty.
@JsonIgnorProperties digunakan pada Class untuk meng-ignore kolom selama serialization dan deserialization.
Properti yang memiliki anotasi ini tidak akan dipetakan ke konten JSON.
@JsonProperty digunakan untuk menandai metode getter/setter yang akan digunakan dengan properti JSON

3. Apa kegunaan attribut WebClient?
Webclient adalah interface yang bekerja dengan client. WebClient bisa melakukan hal berikut :
- Create an instance
- make a request
- handle the response
Pada tutorial kali ini kita menggunakan webClient pada ResepRestServiceImpl dan ObatRestServiceImpl untuk mengambil API.

4. Apa itu ResponseEntity dan BindingResult? Apa kegunaannya?
ResponseEntity digunakan untk mewakili seluruh respons HTTP, mulai dari Status Code, headers, dan body nya.
Kita bisa melakukan konfigurasi terkait HTTP melalui ResponseEntity ini. Untuk menggunakannya kita perlu melakukan return diakhir.
Pada tutorial ini kita menggunakan beberap ResponseEntity, seperti :
- HttpStatusnya Bad Request
- HttpStatusnya OK
- HttpStatusnya Not found

BindingResult adalah interface yang menyimpan hasil validasi dan binding. BindingResult
harus digunkaan setelah objek yang divalidasi atau Spring gagal untuk memvalidasi objek tersebut dan melakukan
Throw suatu Exception 

## Tutorial 6
### What I have learned today
1. Jelaskan secara singkat perbedaan Otentikasi dan Otorisasi ! Di bagian mana (dalam kode yang telah anda
buat) konsep tersebut diimplementasi?
 - Otentikasi → Proses untuk memastikan bahwa suatu user itu sudah terdaftar atau belum didalam sistem. Implementasinya pada 
 Tutorial ini adalah pada bagian Login, jika user dan password tersebut ada didalam database, maka user tersebut sudah terotentikasi. 
 Jika tidak maka user tersebut belum terotentikasi
 - Otorisasi → Proses untuk memastikan bahwa suatu user berhak atau memiliki akses terhadap suatu resource pada sistem.
 Implementasinya ada pada proses addUser ataupun addObat, yang hanya beberapa jenis user (role) yang dapat mengakses fitur tersebut
 Untuk mengatur siapa saja yang terotorisasi, bisa di lakukan pada class WebSecurityConfig
 
2. Apa itu BCryptPasswordEncoder ? Jelaskan secara singkat cara kerjanya!
BCryptPasswordEncoder → class yang bisa diimport untuk melakukan encode terhadap suatu password.
Cara kerjanya adalah dengan memanggil class nya, lalu tinggal lakukan encode terhadap password yang kita inginkan.

3. Jelaskan secara singkat apa itu UUID beserta penggunaannya!
UUID → Identifier unik untuk setiap data. Biasanya direpresentasikan dengan 32 hexadecimal character.
Penggunaannya ada pada UserModel.java untuk membuat ID, sehingga akan terjamin setiap id yang dibuat unik dan terjamin aman
karena terdiri dari 32 hexadecimal character

4. Apa kegunaan class UserDetailsServiceImpl.java ? Mengapa harus ada class tersebut padahal kita sudah
memiliki class UserRoleServiceImpl.java ?
UserDetailServiceImpl.java berguna untuk otentikasi user. Class ini akan meng-extend UserDetailsService dari
Spring Security


## Tutorial 7
### What I have learned today
1. Jelaskan apa yang Anda lakukan di latihan dalam satu paragraf per-soal. Berikan screenshot sebagai ilustrasi
dari apa yang Anda jelaskan.
Nomor 1 → Saya menambahkan if-else condition pada file Item/index.js

![alt text](https://github.com/mfiqria/tutorial-apap/blob/feat/tutorial-7-frontend/1.png?raw=true)

If-else tersebut berguna untuk menampilkan checkbox, jika item tersebut telah terceklis, maka js akan menampilkan
item dengan checkbox yang terceklis, namun jika tidka maka tidak akan menampilkan input checkbox

Nomor 2 → Saya membuat function handleDeleteItem yang
![alt text](https://github.com/mfiqria/tutorial-apap/blob/feat/tutorial-7-frontend/2.png?raw=true)
![alt text](https://github.com/mfiqria/tutorial-apap/blob/feat/tutorial-7-frontend/2b.png?raw=true)

Tapi, tombol tersebut tetap ada walaupun list favorite tidak ada isinya. Saya menggunakan method splice untuk menghapus isi array yang ada.

Nomor 3 → Saya mengubah fungsi handleItemClick menjadi handleItemClickKiri dan handleItemClickKanan, dengan kode berikut
![alt text](https://github.com/mfiqria/tutorial-apap/blob/feat/tutorial-7-frontend/3a.png?raw=true) 
![alt text](https://github.com/mfiqria/tutorial-apap/blob/feat/tutorial-7-frontend/3b.png?raw=true)
pada List Movies saya menggunakan fungsi handleItemClickKiri, saya hanya menggunakan satu if, yaitu jika diklik maka akan menambahkan ke daftar favorit list
pada My Favorites saya menggunakan fungsi handleItemClickKanan, saya menggunakan codingan yang sama dengan codingan handleItemClick awal, karena ketika sudah 
diklik sekali, maka ketika diklik lagi, item tersebut akan di splice/delete dari list.

Nomor 4 → Saya membuat fungsi handleTampilkanFavorite, yang berperan sebagai toggle.
![alt text](https://github.com/mfiqria/tutorial-apap/blob/feat/tutorial-7-frontend/4.png?raw=true) 
![alt text](https://github.com/mfiqria/tutorial-apap/blob/feat/tutorial-7-frontend/4b.png?raw=true) 
![alt text](https://github.com/mfiqria/tutorial-apap/blob/feat/tutorial-7-frontend/4c.png?raw=true)
Disini saya juga menggunakan if-else condition, dimana jika toggle off, maka favorite tidak akan ditampilkan.,
jika toggle on, maka favorite akan ditampilkan. Dengan menggunakan state.tampilkan sebagai variabelnya.

Nomor 5 → Saya membuat file component baru bernama EmptyState yang akan menghandle jika list favorite kosong.
Component ini akan di import di app.js
![alt text](https://github.com/mfiqria/tutorial-apap/blob/feat/tutorial-7-frontend/5.png?raw=true)
Penggunaannya juga berdekatan dengan toggle favorite. Jika toggle on, namun tidak ada list favorite, maka component akan
ditampilkan

2. Menurut pemahaman kamu selama pengerjaan tutorial ini, apa perbedaan antara state dan props ?
Setelah googling, saya mengetahui bahwa props adalah sejenis parameter dalam function, bisa juga
sebagai property dari suatu class. Props adalah variabel yang read-only dan hanya digunakan untuk
komunikasi data component induknya. Sedangkan state adalah juga data dari component dan tidak dapat diakses
oleh component lain. Dalam kegunaannya props untuk komunikasi antar component sedangkan state untuk
komunikasi data internal (hanya component tersebut)

3. Apa keuntungan menggunakan component (e.g. List, Item) di React? Berikan contohnya!
Dengan menggunakan component, developer akan dimudahkan dalam membagi UI menjadi bagian bagian tersendiri. Component bisa
dianggap seperti function, karena dapat dioper satu sama lain untuk digunakan di tempat lain
Contohnya pada file list.js, disini kita melakukan import dari component Item, selain itu
pada App.js kita melakukan import 2 component yaitu list.js dari List dan EmptyState.js


4. Menurut kamu, apa saja kelebihan menggunakan React dalam pengembangan web?
Menurut saya, kelebihan dari React adalah :
- React tergolong lebih ringan untuk diproses, flexible, dan mudah di integrasikan
- SEO-friendly
- Easy for testing and debugging
- Proses rendering react cukup cepat.

5. Menurut kamu, apa saja kekurangan menggunakan React dalam pengembangan web?
Menurut saya, kekurangan dari React adalah :
- Susah dipelajari, memerlukan banyak latihan dan pengetahuan yang dalam menggunakannya sesuai konsep MVC
- Berfokus kepada tampilan saja, yang mana bertentangan dengan prinsip MVC
- Dokumentasi yang sulit dipahami bagi orang awam