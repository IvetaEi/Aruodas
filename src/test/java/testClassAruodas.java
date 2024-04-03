import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class testClassAruodas {
    public static boolean assertEquals(String actual, String expected) {
        return actual.equals(expected);
    }
    public static String TC1generateRandomEmailTC4() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }
        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }
    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();

        // Generate username part
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }

        // Adding '@' symbol
        email.append("@");

        // Selecting random domain
        String randomDomain = domains[random.nextInt(domains.length)];
        email.append(randomDomain);

        return email.toString();
    }

    @Test
    public void TS1AruodasTC1() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();//"Registruotis"
        driver.findElement(By.id("userName")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("password")).sendKeys("12345Asdfg");
        driver.findElement(By.id("registerButton")).click();
    }

    @Test
    public void TS1AruodasTC2() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();//"Registruotis"
        driver.findElement(By.id("userName")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("registerButton")).click();
    }

    @Test
    public void TS1AruodasTC3() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();//"Registruotis"
        driver.findElement(By.id("userName")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("12345Asdfg");
        driver.findElement(By.id("registerButton")).click();
    }

    @Test
    public void TS1AruodasTC4() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();//"Registruotis"
        driver.findElement(By.id("userName")).sendKeys(TC1generateRandomEmailTC4());
        driver.findElement(By.id("password")).sendKeys("12345Asdfg");
        driver.findElement(By.id("registerButton")).click();
    }

    @Test
    public void TS1AruodasTC5() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();//"Registruotis"
        driver.findElement(By.id("userName")).sendKeys(""+generateRandomEmail());
        driver.findElement(By.id("password")).sendKeys("12345Asdfg");
        driver.findElement(By.id("registerButton")).click();
    }

    @Test
    public void TS1AruodasTC6() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();//"Registruotis"
        driver.findElement(By.id("userName")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("registerButton")).click();
    }

    @Test
    public void TS1AruodasTC7() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();//"Registruotis"
        driver.findElement(By.id("userName")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("password")).sendKeys("12345As");
        driver.findElement(By.id("registerButton")).click();
    }

    @Test
    public void TS1AruodasTC8() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();//"Registruotis"
        driver.findElement(By.id("userName")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("password")).sendKeys("12345 Asdfg");
        driver.findElement(By.id("registerButton")).click();
    }

    @Test
    public void TS2AruodasTC1() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("userName")).sendKeys("qwe123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345Asdfg");
        driver.findElement(By.id("loginAruodas")).click();
    }

    @Test
    public void TS2AruodasTC2() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("userName")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("loginAruodas")).click();
    }

    @Test
    public void TS2AruodasTC3() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("userName")).sendKeys("");
        driver.findElement(By.id("password")).sendKeys("12345Asdfg");
        driver.findElement(By.id("loginAruodas")).click();
    }

    @Test
    public void TS2AruodasTC4() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("userName")).sendKeys("qwe123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.id("loginAruodas")).click();
    }

    @Test
    public void TS3AruodasTC1() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("userName")).sendKeys("qwe123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345Asdfg");
        driver.findElement(By.id("loginAruodas")).click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/a")).click();//"Įdėkite skelbimą"
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[1]")).click();//Objekto tipas - Butas
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[1]")).click();//Veiksmas - Pardavimui

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/span")).click();//Savivaldybė
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[8]")).click();//Palanga
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/input[2]")).click();//Gatvė
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement streetButton = driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/span[2]"));
        streetButton.click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[5]/li[6]")).click();//Ajerų g.

        driver.findElement(By.id("fieldFAreaOverAll")).sendKeys("30");//Plotas
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[15]/div/div[2]/div[2]")).click();//Kambarių sk.
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div[1]/span[2]/span")).click();//Aukšto mygtukas
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div[1]/span[2]/ul/li[3]")).click();//Aukštas
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div[2]/span[1]/span")).click();//Aukšto iš mygtukas
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div[2]/span[1]/ul/li[9]")).click();//Aukštų sk.
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[17]/div[1]/span[1]/span/input")).sendKeys("1999");//Statybos metai
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[18]/div/div[1]/div[2]")).click();//Pastato tipas
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[19]/div/div[1]/div[2]")).click();//Įrengimas
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[21]/div/div[2]/label/span")).click();//Šildymas
        driver.findElement(By.id("priceField")).sendKeys("1000");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[48]/span[1]/input")).sendKeys("+37064857423");//Telefono nr.
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[52]/span[1]/div/div/label/span")).click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("submitFormButton")).click();
    }

    @Test
    public void TS4AruodasTC1() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("userName")).sendKeys("qwe123@gmail.com");
        driver.findElement(By.id("password")).sendKeys("12345Asdfg");
        driver.findElement(By.id("loginAruodas")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]")).click();//Mano aruodas
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/ul/li[10]/a")).click();//Atsijungti
    }

    @Test
    public void TS5AruodasTC1() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/ul/li[1]")).click();//Paieška
        driver.findElement(By.id("display_FRegion")).click();//Savivaldybė
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/ul/li[10]/label")).click();//Akmenės r.
        driver.findElement(By.id("input_FAreaOverAllMin")).sendKeys("30");//Plotas nuo
        driver.findElement(By.id("input_FAreaOverAllMax")).sendKeys("50");//Plotas iki
        driver.findElement(By.id("quickValue_FRoomNum_2")).click();//Kambariai
        driver.findElement(By.id("display_text_FHouseState")).click();//Įrengimas
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[2]/div[3]/div/div/div/ul/li[1]/label")).click();//Įrengtas
        driver.findElement(By.id("buttonSearchForm")).click();//Ieškoti
    }

    @Test
    public void TS6AruodasTC1() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

       driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/ul/li[5]/a")).click();//Butų vertės skaičiuoklė
        driver.findElement(By.id("address")).sendKeys("Maironio");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("address")).click();
        driver.findElement(By.id("address")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("street_number")).sendKeys("5");
        driver.findElement(By.id("street_number")).click();
        driver.findElement(By.id("area")).sendKeys("35");
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[1]/div/div[2]/div[3]/span/span")).click();//Pastato tipas mygtukas
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[1]/div/div[2]/div[3]/span/ul/li[2]")).click();//Blokinis
        driver.findElement(By.id("roomNumTitle")).sendKeys("1");//Kambarių sk.
        driver.findElement(By.id("year")).sendKeys("2000");
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[1]/div/div[3]/div[3]/span/span")).click();//Įrengimas
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[1]/div/div[3]/div[3]/span/ul/li[2]")).click();//Dalinė apdaila
        driver.findElement(By.id("floorTitle")).sendKeys("5");
        driver.findElement(By.id("houseHeightTitle")).sendKeys("6");
        driver.findElement(By.id("email")).sendKeys("qwe123@gmail.com");
        driver.findElement(By.id("submitEvaluateButton")).click();
    }

    @Test
    public void TS7AruodasTC1() {
        String ntName = "Švenčionių m., žemės ūkio paskirties sklypas";
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div")).click();//"Prisijungti"
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();//"Registruotis"
        driver.findElement(By.id("userName")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("password")).sendKeys("12345Asdfg");
        driver.findElement(By.id("registerButton")).click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/ul/li[1]/a")).click();//Paieška
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[3]/div[1]/div[2]/div[1]/div/a/img")).click();//Random skelbimas
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[4]/div/div[5]/div[1]")).click();//Įsiminti
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[10]/div/div[10]/div/div/div[2]/div/div/a[2]")).click();//"Nesutinku"
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[4]/div/div[1]")).click();//Grįžti
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[2]/div/div/ul/li[2]/span")).click();//Įsiminti skelbimai
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/div/a/img")).click();//Skelbimas prie įsimintinų

        WebElement ntText = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div[5]/h1"));
        Assert.assertEquals(ntText.getText(),ntName);

    }

}

