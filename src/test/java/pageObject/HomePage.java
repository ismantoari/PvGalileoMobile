package pageObject;

import org.openqa.selenium.By;

public class HomePage {

    public static By searchBox = By.xpath("(//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View)[1]");
    public static By searchIcon = By.xpath("(//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View)[2]");
    public static By notificationIcon = By.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView");
    public static By profileIcon = By.xpath("//android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]");
    public static By homeIcon = By.xpath("//android.widget.ImageView[@content-desc=\"Home\"]");
    public static By exploreIcon = By.xpath("//android.widget.ImageView[@content-desc=\"Explore\"]");
    public static By unlockIcon = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
    public static By voucherIcon = By.xpath("//android.widget.ImageView[@content-desc=\"Voucher\"]");
    public static By reservationIcon = By.xpath("//android.widget.ImageView[@content-desc=\"Reservation\"]");





}
