package com.unicoGames.brainTest4.pages.android;

import com.alttester.AltDriver;
import com.alttester.AltObject;
import com.alttester.Commands.FindObject.AltFindObjectsParams;
import com.alttester.Commands.FindObject.AltWaitForObjectsParams;
import com.alttester.Commands.InputActions.AltSwipeParams;

public class GamePages extends BasePage {

    public void swipeMethod(AltObject APoint, AltObject bPoint){ //Aynı
        altDriver.swipe(new AltSwipeParams.Builder(APoint.getScreenPosition(),bPoint.getScreenPosition()).withDuration(2).build());
    }
    public AltObject buttonSettings(){ //ButtonSettings
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonSettings").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);//
    }

    public AltObject languageCloseButton(){ // closeButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "closeButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);//
    }
    public AltObject soundText(){//SoundText
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SoundText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject musicText(){ // MusicText
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "MusicText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject notificationText(){ //NotificationText
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "NotificationText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject languageText(){// LanguageText
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LanguageText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);

    }

    public AltObject support(){ // SupportButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SupportButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);

    }
    public AltObject LanguageSelectButton(){ // LanguageButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LanguageButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }

    public AltObject [] LanguagesText(){ // aynı
        AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Text").
                isEnabled(true).build();
        return altDriver.findObjects(par);
    }

    public AltObject selectDeutsch(){//aynı
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "DE").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);// /Canvas/TutorialPopUp/Panel/Window/NoButton/Text (TMP) (1)
    }
    public AltObject selectTurkish(){//aynı
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TR").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject backButton(){ // Back
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Back").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }

    public AltObject twitterButton(){ // TwitterButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TwitterButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject instagramButton(){ // InstagramButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "InstagramButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject TiktokButton(){ // TiktokButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TiktokButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject facebookButton(){ // FacebookButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "FacebookButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject settingsTitle(){// TitleText
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TitleText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(50).build();
        return altDriver.waitForObject(params);
    }
    public AltObject PrivacyPolicy(){ // Privacy
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Privacy").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject ShareButton(){// ShareButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ShareButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject coinText(){// CoinText coin number
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "CoinText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonCoin(){// Shop button - Shop from Homa
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonCoin").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }

    public AltObject TermsOfUse(){ // Terms
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Terms").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }

// Shop
public AltObject shopTitle(){
    AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "TitleText").
            isEnabled(true).build();
    AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
    return altDriver.waitForObject(params);
}
    public AltObject allTitles(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Header").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject [] getAllTitlesShop(){ // aynı
        AltFindObjectsParams par = new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Header").
                isEnabled(true).build();
        return altDriver.findObjects(par);
    }
    public AltObject removeAdsBut(){ // BackButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.ID,"-6014").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// -6014
    }

    public AltObject backButtonShop(){ // BackButton
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME,"BackButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);// -6014
    }
    public AltObject CloseButton(){ //CloseButton (ShopReturnRewarded)
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "CloseButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(9).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonMoreOffers(){ // More Offer
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonMoreOffers").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject BulbPacksText(){ // BulbPacksText
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "BulbPacksText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject GemPacksText(){ // GemPacksText
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "GemPacksText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject customization(){ // Customization -- Levels
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Customization").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonNext(){ // Customization -- Levels
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonNext").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject redCloth(){ // Customization - Red Cloth
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "red").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);// LockedText
    }
    public AltObject buttonBuy(){ // Customization - Buy Red Cloth button
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonBuy").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject lockedText(){ // Customization - Locked Text for Dr.Worry and Jenny
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LockedText").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject cstmBackButton(){ // Customization - BackButton to Home Page
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "BackButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject Levels(){ // Levels
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "Levels").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject nextPageLevels(){ // Levels page next
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "NextPage").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject nextPreviousPage(){ // Levels page Previous
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "PreviousPage").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }
    public AltObject levelButton(){ // Levels Button on the levels page
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LevelButton (1)").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(5).build();
        return altDriver.waitForObject(params);
    }



    // levels locations
    public AltObject buttonHints(){ // Hint Button on the GamePage
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonHints").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);// ButtonHints
    }
    public AltObject buttonHintsPopup(){ // Hint Popups Buttons on the GamePage
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "HintBoxLocked(Clone)").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);// ButtonHints
    }
    public AltObject buttonSkip(){ // Skip Button on the GamePage
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonSkip").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);// ButtonHints
    }
    public AltObject skipButtonPopup(){ // Skip Button on the Pop up (Gameplay Screen)
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "SkipButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonThumbsUp(){ // LevenEnd Screen like button
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonThumbsUp").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonThumbsDown(){ // LevenEnd Screen dislike button
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonThumbsDown").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonShare(){ // LevenEnd Screen share button
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonShare").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonRemoveAds(){ // LevenEnd Screen RemoveAds button
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonRemoveAds").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonSettingsGamePlay(){ // Game Play Screen Setting button
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonSettingsGamePlay").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonRewarded(){ // LevelEnd Rewarded button
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonRewarded").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);
    }
    public AltObject buttonHome(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "ButtonHome").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);
    }
    public AltObject LanguageButton(){
        AltFindObjectsParams par=new AltFindObjectsParams.Builder(AltDriver.By.NAME, "LanguageButton").
                isEnabled(true).build();
        AltWaitForObjectsParams params = new AltWaitForObjectsParams.Builder(par).withTimeout(15).build();
        return altDriver.waitForObject(params);//
    }



}
