package com.minwook.mytriphistory.di.component;

import android.app.Application;
import android.content.Context;

import com.minwook.mytriphistory.Application.MyApplication;
import com.minwook.mytriphistory.DAO.Content;
import com.minwook.mytriphistory.di.module.AppModule;
import com.minwook.mytriphistory.di.module.ContentModule;
import com.minwook.mytriphistory.di.module.ContentsPresentModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ContentModule.class, ContentsPresentModule.class})
public interface AppComponent {
    void inject(MyApplication initApplication);

    Content getFindItemsInteractor();

    Application getApplication();
}