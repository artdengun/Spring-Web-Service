# Belajar Spring Web Services

----------------
## TAHAP AWAL ##
----------------


 1. Membuat File 
	
```java
	     
        GroupId     : com.paytech.siup
        Artifact    : Aplikasi-Siup
        description : ini adalah aplikasi siup


```

## Penjelasan

* GroupId 	-> Menyatakan Software House Yang membuat aplikasi
* Artifact	-> Menyatakan Nama Aplikasi Yang dibuat
* Description	-> Menyatakan Keterangan Aplikasi Yang dibuat


 2. Depedency  Awal 

```java
		Spring-web

```

## Penjelasan

* Spring-web	-> Package/library Awal yang dibutuhkan Untuk Spring Web

 3. Membuat Controller

```java

		@Controller
		public class WaktuController {

		@GetMapping("/waktu")
		@ResponseBody
			public String sekarang(){
			SimpleDateFormat formatwaktu = new SimpleDateFormat("EEEE, dd MMMM yyyy",new Locale("id","ID"));
			return formatwaktu.format(new Date());

			}
		

```

## Penjelasan

* @Controller			-> Class yang menyatakan Bahwa File ini sebagai Controller Proses
* public class WaktuController	-> Menyatakan Nama File Dari Class yang digunakan
* @GetMapping("/waktu")		-> Menghandle Url
* @ResponseBody			-> Langsung menampilkan output tanpa membutuhkan file lain (HTML template)
* return 			-> Mengembalikan nilai yang dituju

```java
		public String sekarang(){
			SimpleDateFormat formatwaktu = new SimpleDateFormat("EEEE, dd MMMM yyyy",new Locale("id","ID"));
			return formatwaktu.format(new Date());

			}

```
* Membuat Object sekarang dengan Menggunakan library SimpleDateFormat(library tanggal ) Untuk Menampilkan waktu 
  Jam, hari, bulan, dan tahun 

 4. Membuat Controller Untuk Json 

```java

		 
    @GetMapping("/appinfo")
    @ResponseBody
    public Map<String, String> info(@RequestParam String nama){
        Map<String, String> data = new LinkedHashMap<>();
        
        data.put("application.name", "Aplikasi SIUP");
        data.put("application.version","1.0.0");
        data.put("last.update", "2020-05-10");
        data.put("author", nama);       
        return data;
    }
}

```
*Panggil Json Lewat URl

```
	http://localhost:8080/appinfo?nama=DeniGunawan
```

*Agar Supaya Rapih gunakan perintah  Dibawah dan letakan pada application.properties

```
spring.jackson.serialization.indent_output=true

```
## Penjelasan

* public class WaktuController	-> Menyatakan Nama File Dari Class yang digunakan
* @GetMapping("/appinfo")	-> Menghandle url
* @ResponseBody			-> Langsung menampilkan output tanpa membutuhkan file lain (HTML template)
* Map				-> assosiative array yang ada di java yang memiliki key dan value
* @RequestParam			-> Menghandle inputan dari External
* data.put			-> Meletakan/ menempelkan Nilai yang ingin kita tampilkan
* LinkedHashMap 		-> Salah satu agar Json Terurut Sesuai Dengan TREE yang ada di put.
* nama				-> mengembalikan nilai nama yang diinput dan menampilkan di author
* return 			-> Mengembalikan nilai yang dituju
* http://localhost:8080/appinfo?nama=DeniGunawan  -> Input Json dengan cara manual 
* spring.jackson.serialization.indent_output=tru  -> agar Json Lebih rapih  ( Letakan di application.properties)

-----------------
## TAHAP KEDUA ##
-----------------

## WEB SERVICE KONFIGURASI

 1. Buat File Yang Dibutuhkan	


```
<kelurahan>
      <id>123</id>
      <kode>JKT001</kode>
      <nama>DUREN SAWIT</nama>
      <kodepos>14000</kodepos>
      </kelurahan>

      <kelurahan id='123' kode='JKT001' nama="DUREN SAWIT> </kelurahan>
      <daftarKelurahanRequest>
        <pencarian>
          <nama>Cili</nama>
        </pencarian>
      </daftarKelurahanRequest>
    <daftarKelurahanResponse> 
        <daftarKelurahan>
            <kelurahan>
                <id>123</id>
                <kode>JKT001</kode>
                <nama>Duren Sawit</nama>
                <kodepos>124896</kodepos>
            </kelurahan>
            <kelurahan>
                <id>124</id>
                <kode>JKT002</kode>
                <nama>Duren Sawit</nama>
                <kodepos>124896</kodepos>
            </kelurahan>
            <kelurahan>
                <id>124</id>
                <kode>JKT003</kode>
                <nama>Duren Sawit</nama>
                <kodepos>124896</kodepos>
            </kelurahan>
        </daftarKelurahan>
    <daftarKelurahanResponse>

    private kelurahan {
        private String id;
        private String kode;
        private String nama;
        private String kodepos;

    }	
```
