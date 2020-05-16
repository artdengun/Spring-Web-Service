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

 2. Depedency  Awal 

```java
		Spring-web

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
		

```

 3. Membuat Controller Untuk Json 

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

Panggil Json

```
	http://localhost:8080/appinfo?nama=DeniGunawan
```

## Agar Supaya Rapih gunakan perintah  Dibawah dan letakan pada application properties

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
