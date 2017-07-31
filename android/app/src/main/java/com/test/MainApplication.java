package com.test;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

import android.app.Application;
import android.content.Context;

import java.lang.Thread;

import android.util.Log;

public class MainApplication extends Application implements ReactApplication {

    public static MainApplication instace;
    private static Context mContext;

//  @Override
//  public void onCreate() {
//    super.onCreate();
//    SoLoader.init(this, /* native exopackage */ false);
//  }

    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage()
            );
        }
    };

    public static MainApplication getIntance() {
        return instace;
    }

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        instace = this;
        SoLoader.init(this, /* native exopackage */ false);

    }

    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }


}
