package com.unicoGames.brainTest4.pages;

import com.unicoGames.brainTest4.pages.android.*;


public class AllPages {

    public AllPages(){
    }


    private LevelPages levelPages;
    private HomePage homePage;


    private GamePages gamePages;



    public LevelPages levelPages(){
        if (levelPages == null){
            levelPages = new LevelPages();
        }
        return levelPages;
    }


    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }
        return homePage;
    }


    public GamePages gamePages(){
        if (gamePages == null){
            gamePages = new GamePages();
        }
        return gamePages;
    }

}
