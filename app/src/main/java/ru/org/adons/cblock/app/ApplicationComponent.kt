package ru.org.adons.cblock.app

import android.content.Context
import com.squareup.sqlbrite.BriteContentResolver
import dagger.Component
import ru.org.adons.cblock.data.DaoSession
import javax.inject.Singleton

/**
 * Provide application scope dependencies (Context, Preferences, DaoSession)
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun context(): Context

    fun preferences(): Preferences

    fun resolver(): BriteContentResolver

    fun daoSession(): DaoSession

    fun blockManager(): BlockManager

}
