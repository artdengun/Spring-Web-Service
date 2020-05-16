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

#Penjelasan 

* GroupId 	-> Menyatakan Software House Yang membuat aplikasi
* Artifact	-> Menyatakan Nama Aplikasi Yang dibuat
* Description	-> Menyatakan Keterangan Aplikasi Yang dibuat


 2. Depedency  Awal 

```java
		Spring-web

```

#Penjelasan

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

#Penjelasan

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

#Penjelasan

* public class WaktuController	-> Menyatakan Nama File Dari Class yang digunakan
* @GetMapping("/appinfo")	-> Menghandle url
* @ResponseBody			-> Langsung menampilkan output tanpa membutuhkan file lain (HTML template)
* Map				-> assosiative array yang ada di java yang memiliki key dan value

* return 			-> Mengembalikan nilai yang dituju

```

*Panggil Json Lewat URl

```
	http://localhost:8080/appinfo?nama=DeniGunawan
```

*Agar Supaya Rapih gunakan perintah  Dibawah dan letakan pada application.properties

```
spring.jackson.serialization.indent_output=true

```



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
		}

```



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
		}

```
