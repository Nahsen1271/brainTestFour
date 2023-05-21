package com.unicoGames.brainTest4.stepDefinitions;

import com.unicoGames.brainTest4.pages.AllPages;
import com.unicoGames.brainTest4.utilities.DriverManager;
import com.unicoGames.brainTest4.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import static com.unicoGames.brainTest4.utilities.DriverManager.appiumDriver;


public class GameStepDefs {

    private static Logger LOG = LogManager.getLogger("GameStepDefs.class");
    AllPages allPages =new AllPages();
    @Given("Gamer can open the game and can click setting button")
    public void gamer_can_open_the_game_and_can_click_setting_button() {
        allPages.gamePages().buttonSettingsGamePlay().click();
        ReusableMethods.waitForSecond(3);
        allPages.gamePages().buttonHome().click();
        ReusableMethods.waitForSecond(3);
        allPages.gamePages().buttonSettings().click();
        ReusableMethods.waitForSecond(3);
    }


    @Given("Gamer can click the language selection button")
    public void gamer_can_click_the_language_selection_button() {

        ReusableMethods.waitForSecond(1);
        allPages.gamePages().LanguageSelectButton().click();
        ReusableMethods.waitForSecond(3);
        List<String> languages = new ArrayList<>(); // Check the languages
        Arrays.stream(allPages.gamePages().LanguagesText()).forEach(x-> languages.add(x.getText()));
        System.out.println(languages);
        ReusableMethods.waitForSecond(1);

    }
    @Given("Gamer can choose a language")
    public void gamer_can_choose_a_language() {

        allPages.gamePages().selectDeutsch().click();
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().languageCloseButton().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer checks if the language is selected")
    public void gamer_checks_if_the_language_is_selected() {

        String selected= allPages.gamePages().soundText().getText();
        Assert.assertEquals(selected,"TON");
        ReusableMethods.waitForSecond(1);

    }

    @Given("Gamer gets all the text on the settings page and check them")
    public void gamer_gets_all_the_text_on_the_settings_page_and_check_them() {
        String settingsTitle= allPages.gamePages().settingsTitle().getText();
        String soundText= allPages.gamePages().soundText().getText();
        String musicText= allPages.gamePages().musicText().getText();
        String notificationText= allPages.gamePages().notificationText().getText();
        String languageText= allPages.gamePages().languageText().getText();

        System.out.println("settingsTitle = " + settingsTitle);
        System.out.println("soundText = " + soundText);
        System.out.println("musicText = " + musicText);
        System.out.println("notificationText = " + notificationText);
        System.out.println("languageText = " + languageText);

        Assert.assertFalse(settingsTitle.isEmpty());
        Assert.assertFalse(soundText.isEmpty());
        Assert.assertFalse(musicText.isEmpty());
        Assert.assertFalse(notificationText.isEmpty());
        Assert.assertFalse(languageText.isEmpty());
    }

    @Given("Tasters check the support button")
    public void tasters_check_the_support_button() {
        allPages.gamePages().support().click();
        ReusableMethods.waitForSecond(1);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(1);

    }
    @Given("Tasters check the share button")
    public void tasters_check_the_share_button() {
        allPages.gamePages().ShareButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the Twitter button")
    public void tasters_check_the_twitter_button() {
        allPages.gamePages().twitterButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the Tiktok button")
    public void tasters_check_the_tiktok_button() {
        allPages.gamePages().TiktokButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the Instagram button")
    public void tasters_check_the_instagram_button() {
        allPages.gamePages().instagramButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the Facebook button")
    public void tasters_check_the_facebook_button() {
        allPages.gamePages().facebookButton().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the PP button")
    public void tasters_check_the_pp_button() {
        allPages.gamePages().PrivacyPolicy().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Tasters check the ToU button")
    public void tasters_check_the_to_u_button() {
        allPages.gamePages().TermsOfUse().click();
        ReusableMethods.waitForSecond(3);
        appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
    }
    @Given("Gamer can choose Turkish language")
    public void gamer_can_choose_turkish_language() {

        allPages.gamePages().selectTurkish().click();
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().languageCloseButton().click();
        ReusableMethods.waitForSecond(1);
    }
    @Given("Gamer checks if Turkish is selected")
    public void gamer_checks_if_turkish_is_selected() {

        String selected= allPages.gamePages().soundText().getText();
        Assert.assertEquals(selected,"SES");
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().backButton().click();

    }
    @Given("Gamer can click the shop button on the home page")
    public void gamer_can_click_the_shop_button_on_the_home_page() {
        allPages.gamePages().buttonCoin().click();
        ReusableMethods.waitForSecond(1);
        System.out.println("allPages.gamePages().shopTitle().getText() = " + allPages.gamePages().shopTitle().getText());
       // allPages.gamePages().removeAdsBut().click();
       // List<String> InAppButtons = new ArrayList<>(); // Check the languages
        //Arrays.stream(allPages.gamePages().getAllTitlesShop()).forEach(x-> InAppButtons.add(x.getText()));
        //System.out.println(InAppButtons);
        //ReusableMethods.waitForSecond(1);
    }

    @Given("Gamer can click the removeAds button and assert the price")
    public void gamer_can_click_the_remove_ads_button_and_assert_the_price() {

    }
    @Given("Gamer can click the supreme pack button and assert the price")
    public void gamer_can_click_the_supreme_pack_button_and_assert_the_price() {

    }
    @Given("Gamer can click the brain Pack button and assert the price")
    public void gamer_can_click_the_brain_pack_button_and_assert_the_price() {

    }
    @Given("Gamer can click the starter pack button and assert the price")
    public void gamer_can_click_the_starter_pack_button_and_assert_the_price() {

    }
    @Given("Gamer can click the more offers")
    public void gamer_can_click_the_more_offers() {
        allPages.gamePages().buttonMoreOffers().click();
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().backButtonShop().click();
        ReusableMethods.waitForSecond(1);
        allPages.gamePages().CloseButton().click();
    }
    @Given("Gamer can click the some bulb packs buttons and assert the prices")
    public void gamer_can_click_the_some_bulb_packs_buttons_and_assert_the_prices() {

    }
    @Given("Gamer can click the some gems packs buttons and assert the prices")
    public void gamer_can_click_the_some_gems_packs_buttons_and_assert_the_prices() {

    }

    @Given("Gamer can click the Customization button on the home page")
    public void gamer_can_click_the_customization_button_on_the_home_page() {
        allPages.gamePages().customization().click();
        ReusableMethods.waitForSecond(2);
    }
    @Given("Gamer can buy a cloth for Lily")
    public void gamer_can_buy_a_cloth_for_lily() {

        allPages.gamePages().redCloth().click();
        ReusableMethods.waitForSecond(3);
        allPages.gamePages().buttonBuy().click();
        ReusableMethods.waitForSecond(2);
    }
    @Given("Gamer can click next button and check DrWorry Page open")
    public void gamer_can_click_next_button_and_check_dr_worry_page_open() {
        allPages.gamePages().buttonNext().click();
        ReusableMethods.waitForSecond(2);
        System.out.println("Dr.Worry : " + allPages.gamePages().lockedText().getText());
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonNext().click();
        ReusableMethods.waitForSecond(2);
    }
    @Given("Gamer can click next button and check Jenny Page open")
    public void gamer_can_click_next_button_and_check_jenny_page_open() {
        System.out.println("Jenny : " + allPages.gamePages().lockedText().getText());
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().cstmBackButton().click();
        ReusableMethods.waitForSecond(2);
    }
    @Given("Gamer can click the levels button on the home page")
    public void gamer_can_click_the_levels_button_on_the_home_page() {
        allPages.gamePages().Levels().click();
        ReusableMethods.waitForSecond(2);
    }
    @Given("Gamer checks next button works properly")
    public void gamer_checks_next_button_works_properly() {
        allPages.gamePages().nextPageLevels().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().nextPageLevels().click();
        ReusableMethods.waitForSecond(2);
    }
    @Given("Gamer checks check previous button works properly")
    public void gamer_checks_check_previous_button_works_properly() {
        allPages.gamePages().nextPreviousPage().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().nextPreviousPage().click();
        ReusableMethods.waitForSecond(2);
    }
    @Given("Gamer can click level one")
    public void gamer_can_click_level_one() {
        allPages.gamePages().levelButton().click();
        ReusableMethods.waitForSecond(2);
    }
    @Given("Gamer checks hint button works and skip the levels")
    public void gamer_checks_hint_button_works_and_skip_the_levels() {
        allPages.gamePages().buttonHints().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonHintsPopup().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonHintsPopup().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonSkip().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().skipButtonPopup().click();
        ReusableMethods.waitForSecond(2);
    }
    @Given("Gamer checks levelend buttons work")
    public void gamer_checks_levelend_buttons_work() {

        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonThumbsUp().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonThumbsDown().click();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonShare().click();
        ReusableMethods.waitForSecond(2);
     //   appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(3);
        allPages.gamePages().buttonRemoveAds().click();
        ReusableMethods.waitForSecond(2);
     //   appiumDriver.navigate().back();
        ReusableMethods.waitForSecond(2);
        allPages.gamePages().buttonNext().click();
        String coinText = allPages.gamePages().coinText().getText();
        int coinNumber = Integer.parseInt(coinText);
        System.out.println(coinNumber);
        while (coinNumber > 25) {
            allPages.gamePages().buttonSkip().click();
            ReusableMethods.waitForSecond(3);
            allPages.gamePages().skipButtonPopup().click();
            ReusableMethods.waitForSecond(7);
            allPages.gamePages().buttonNext().click();
            String coinNumberText =allPages.gamePages().coinText().getText();
            coinNumber= Integer.parseInt(coinNumberText);
        }
    }
    @Given("Gamer can click the rewarded")
    public void gamer_can_click_the_rewarded() throws Exception {
         allPages.gamePages().buttonRewarded().click();
         ReusableMethods.waitForSecond(7);
         if(!allPages.gamePages().buttonRewarded().isEnabled()){
             methodTearDownRewarded();
         }
    }
    public void methodTearDownRewarded() throws Exception {

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String target = System.getProperty("user.dir") + File.separator + "test_output" + File.separator + "ScreenShots_" + date + ".png";
        new DriverManager().getAltDriver().getPNGScreenshot(target);
        ReusableMethods.killBrainTest3();
        ReusableMethods.waitForSecond(5);
      //  ReusableMethods.runBrainTest3();


    }
}
