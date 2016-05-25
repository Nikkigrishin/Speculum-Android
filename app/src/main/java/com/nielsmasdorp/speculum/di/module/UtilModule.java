package com.nielsmasdorp.speculum.di.module;

import com.nielsmasdorp.speculum.util.WeatherIconGenerator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Niels Masdorp (NielsMasdorp)
 */
@Module
public class UtilModule {

    @Provides
    @Singleton
    public WeatherIconGenerator provideWeatherIconGenerator() {

        return new WeatherIconGenerator();
    }
}