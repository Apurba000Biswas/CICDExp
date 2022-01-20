package com.bs.apurba.cicdexp;

import androidx.appcompat.app.AppCompatDelegate;

public class ThemeUtility {

    public static final String LIGHT = "light";
    public static final String DARK = "dark";
    public static final String AUTO = "auto";

    public ThemeUtility(){
    }

    public void applyTheme(String theme){
        switch (theme){
            case LIGHT:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                break;
            case DARK:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                break;
            default:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                break;
        }
    }

}
