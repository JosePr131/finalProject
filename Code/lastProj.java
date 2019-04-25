package lastProj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class lastProj {
	public static void main(String[] args) {

	}
	
	public static String test1()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		WebElement booking = driver.findElement(By.linkText("Bookings"));
		booking.click();
		
		String expected = "Bookings ‹ joseprieto — WordPress";
		String actual = driver.getTitle().toString();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
		
		
	}
	
	public static String test2()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		WebElement booking = driver.findElement(By.linkText("Bookings"));
		booking.click();
		WebElement newBooking = driver.findElement(By.linkText("Add booking"));
		newBooking.click();
		
		
		
		String expected = "Add new booking ‹ joseprieto — WordPress";
		String actual = driver.getTitle().toString();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	public static String test3()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		WebElement booking = driver.findElement(By.linkText("Bookings"));
		booking.click();
		WebElement newBooking = driver.findElement(By.linkText("Add booking"));
		newBooking.click();
		
		driver.findElement(By.xpath("//*[@id=\"publishing-action\"]/input")).click();
		
		String expected = "Booking updated.";
		String actual = driver.findElement(By.xpath("//*[@id=\"message\"]/p")).getText();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	
	public static String test4()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		WebElement booking = driver.findElement(By.linkText("Bookings"));
		booking.click();
		WebElement newBooking = driver.findElement(By.linkText("Add booking"));
		newBooking.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Click on processing
		driver.findElement(By.xpath("//*[@id=\"awebooking-booking-data\"]/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"awebooking-booking-data\"]/div/div/div/div[2]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]")).click();
		
		//Choose arrival time
		driver.findElement(By.xpath("//*[@id=\"awebooking-booking-data\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"awebooking-booking-data\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div/div[2]/div/div[5]\n")).click();
		
		//Customer note
		driver.findElement(By.xpath("//*[@id=\"customer_note\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_note\"]")).sendKeys("None at the moment");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement custName = driver.findElement(By.id("customer_first_name"));
		custName.sendKeys("John");
		
		WebElement custLast = driver.findElement(By.id("customer_last_name"));
		custLast.sendKeys("Doe");
		
		WebElement custCompany = driver.findElement(By.id("customer_company"));
		custCompany.sendKeys("SMUD");
		
		WebElement custAddress = driver.findElement(By.id("customer_address"));
		custAddress.sendKeys("6821 Lemon Hill DR.");
		
		WebElement custCity = driver.findElement(By.id("customer_city"));
		custCity.sendKeys("Sacramento");
		
		WebElement custState = driver.findElement(By.id("customer_state"));
		custState.sendKeys("CA");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Choose country
		driver.findElement(By.xpath("//*[@id=\"awebooking-booking-data\"]/div/div/div/div[2]/div[3]/div[2]/div/div[9]/div/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"awebooking-booking-data\"]/div/div/div/div[2]/div[3]/div[2]/div/div[9]/div/div[2]/div/div[2]/div/div[237]")).click();
		
		WebElement custZIP = driver.findElement(By.id("customer_postal_code"));
		custZIP.sendKeys("95820");
		
		WebElement custPhone = driver.findElement(By.id("customer_phone"));
		custPhone.sendKeys("(555)555-5555");
		
		WebElement custEmail = driver.findElement(By.id("customer_email"));
		custEmail.sendKeys("example@gmail.com");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((JavascriptExecutor) driver).executeScript("scroll(0, -1000);");
		driver.findElement(By.xpath("//*[@id=\"publishing-action\"]/input")).click();
		
		String expected = "Booking updated.";
		String actual = driver.findElement(By.xpath("//*[@id=\"message\"]/p")).getText();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	///////////////////////Diagram 2 //////////////////
	
	
	public static String test5()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		
		String expected = "Room Types ‹ joseprieto — WordPress";
		String actual = driver.getTitle().toString();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	public static String test6()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a")).click();

		
		String expected = "Add new room type ‹ joseprieto — WordPress";
		String actual = driver.getTitle().toString();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	public static String test7()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Add room name
		driver.findElement(By.xpath("//*[@id=\"post-title-0\"]")).sendKeys("Example");
		
		//Add number of rooms
		driver.findElement(By.xpath("//*[@id=\"js-rooms-list\"]/div/select")).click();
		
		//Max Occupancy
		driver.findElement(By.xpath("//*[@id=\"maximum_occupancy\"]")).sendKeys("25");
		
		//Adults
		driver.findElement(By.xpath("//*[@id=\"number_adults\"]")).click();
		
		//Children
		driver.findElement(By.xpath("//*[@id=\"number_children\"]")).click();
		
		//Infants
		driver.findElement(By.xpath("//*[@id=\"number_infants\"]")).click();
		
		//Set up Pricing
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		driver.findElement(By.xpath("//*[@id=\"awebooking-room-type-data\"]/div/div/div/div/div[1]/ul/li[2]/a")).click();
		
		//Rack Rate
		driver.findElement(By.xpath("//*[@id=\"rack_rate\"]")).sendKeys("$100");
		
		//Min LOS
		driver.findElement(By.xpath("//*[@id=\"rate_min_los\"]")).sendKeys("12 days");
		
		//Max LOS
		driver.findElement(By.xpath("//*[@id=\"rate_max_los\"]")).sendKeys("30 days");
		
		//Services
		driver.findElement(By.xpath("//*[@id=\"rate_services-selectized\"]")).sendKeys("Free Breakfast");
		
		//Inclusions
		driver.findElement(By.xpath("//*[@id=\"rate_inclusions_0\"]")).sendKeys("Shuttle");
		driver.findElement(By.xpath("//*[@id=\"room-type-pricing\"]/div[4]/div/div/div[2]/p/button")).click();
		
		//Policies
		driver.findElement(By.xpath("//*[@id=\"rate_policies_0\"]")).sendKeys("Shuttle");
		driver.findElement(By.xpath("//*[@id=\"room-type-pricing\"]/div[5]/div/div/div[2]/p/button")).click();
		
		
		String expected = "Add new room type ‹ joseprieto — WordPress";
		String actual = driver.getTitle().toString();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	public static String test8()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Add room name
		driver.findElement(By.xpath("//*[@id=\"post-title-0\"]")).sendKeys("Room 1");
		
		//Add number of rooms
		driver.findElement(By.xpath("//*[@id=\"js-rooms-list\"]/div/select")).click();
		
		//Max Occupancy
		driver.findElement(By.xpath("//*[@id=\"maximum_occupancy\"]")).sendKeys("10");
		
		//Adults
		driver.findElement(By.xpath("//*[@id=\"number_adults\"]")).click();
		
		//Children
		driver.findElement(By.xpath("//*[@id=\"number_children\"]")).click();
		
		//Infants
		driver.findElement(By.xpath("//*[@id=\"number_infants\"]")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Set up Pricing
		((JavascriptExecutor) driver).executeScript("scroll(0, 1000);");
		driver.findElement(By.xpath("//*[@id=\"awebooking-room-type-data\"]/div/div/div/div/div[1]/ul/li[2]/a")).click();
		
		//Rack Rate
		driver.findElement(By.xpath("//*[@id=\"rack_rate\"]")).sendKeys("$100");
		
		//Min LOS
		driver.findElement(By.xpath("//*[@id=\"rate_min_los\"]")).sendKeys("12");
		
		//Max LOS
		driver.findElement(By.xpath("//*[@id=\"rate_max_los\"]")).sendKeys("30");
		
		//Services
		driver.findElement(By.xpath("//*[@id=\"rate_services-selectized\"]")).sendKeys("Free Breakfast");
		
		//Inclusions
		driver.findElement(By.xpath("//*[@id=\"rate_inclusions_0\"]")).sendKeys("Shuttle");
		driver.findElement(By.xpath("//*[@id=\"room-type-pricing\"]/div[4]/div/div/div[2]/p/button")).click();
		
		//Policies
		driver.findElement(By.xpath("//*[@id=\"rate_policies_0\"]")).sendKeys("NO REFUNDS");
		driver.findElement(By.xpath("//*[@id=\"room-type-pricing\"]/div[5]/div/div/div[2]/p/button")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Area Size
		driver.findElement(By.xpath("//*[@id=\"awebooking-room-type-data\"]/div/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"area_size\"]\n")).sendKeys("40");
				
		//Beds
		driver.findElement(By.xpath("//*[@id=\"beds_repeat\"]/div/div[1]/div[1]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"room-type-rooms\"]/div[3]/div/div/div[2]/p/button")).click();
				
		//Bedrooms
		driver.findElement(By.xpath("//*[@id=\"bedrooms\"]")).click();
				
		//Amenity
		driver.findElement(By.xpath("//*[@id=\"hotel_amenity-add-toggle\"]")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		//Media
		driver.findElement(By.xpath("//*[@id=\"awebooking-room-type-data\"]/div/div/div/div/div[1]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"room-type-description\"]/div[3]/div/div/div[2]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"__wp-uploader-id-2\"]/div[1]/button/span")).click();
				
		//Publish
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[3]/div/div/div[1]/div/button")).click();
				
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String expected = "Published";
		String actual = driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[3]/div/div/div[1]")).getText();
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	public static String test9()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		driver.findElement(By.className("row-title")).click();
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String expected = "Edit room type ‹ joseprieto — WordPress";
		String actual = driver.getTitle().toString();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	
	
	
	
	public static String test10()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		driver.findElement(By.className("row-title")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"awebooking-room-type-data\"]/div/div/div/div/div[1]/ul/li[3]/a")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0, 10000);");
		
		
		String expected = "Edit room type ‹ joseprieto — WordPress";
		String actual = driver.getTitle().toString();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	public static String test11()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		driver.findElement(By.className("row-title")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"awebooking-room-type-data\"]/div/div/div/div/div[1]/ul/li[3]/a")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0, 10000);");
		driver.findElement(By.xpath("//*[@id=\"in-hotel_amenity-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]")).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[2]/div[1]/div/div"));
		
	
		String expected = "Page updated.\n" + 
				"View room type";
		String actual = driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[2]/div[1]/div/div")).getText();
		System.out.println(actual);
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	public static String test12()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		driver.findElement(By.className("row-title")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"awebooking-room-type-data\"]/div/div/div/div/div[1]/ul/li[2]/a")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0, 10000);");
		
	
		String expected = "Edit room type ‹ joseprieto — WordPress";
		String actual = driver.getTitle().toString();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	
	public static String test13()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		driver.findElement(By.className("row-title")).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"awebooking-room-type-data\"]/div/div/div/div/div[1]/ul/li[2]/a")).click();
		((JavascriptExecutor) driver).executeScript("scroll(0, 10000);");
		driver.findElement(By.xpath("//*[@id=\"rate_services-selectized\"]")).sendKeys("Free Stuff");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[1]/div[2]/button[2]")).click();

		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	
		String expected = "Page updated.\n" + 
				"View room type";
		String actual = driver.findElement(By.xpath("//*[@id=\"editor\"]/div/div/div/div[2]/div[1]/div/div")).getText();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	public static String test14()
	{
		System.setProperty("webdriver.chrome.driver","/Users/joseprieto/eclipse-workspace/FinalProj/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/wordpress/wp-admin/admin.php?awebooking=/about");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Login to wordpress
		WebElement username = driver.findElement(By.id("user_login"));
		WebElement password = driver.findElement(By.id("user_pass"));
		WebElement login = driver.findElement(By.id("wp-submit"));
		username.sendKeys("josepr1996");
		password.sendKeys("14oI6000");
		login.click();
		
		driver.findElement(By.xpath("//*[@id=\"menu-posts-room_type\"]/a/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"cb-select-all-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"bulk-action-selector-bottom\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"bulk-action-selector-bottom\"]/option[3]")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"doaction2\"]")).click();
		
		
			
		String expected = "Room Types ‹ joseprieto — WordPress";
		String actual = driver.getTitle().toString();
		
		if(expected.equals(actual))
		{
			return "Test Success!";
		}
		else
		{
			return "Test Fail!";
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
