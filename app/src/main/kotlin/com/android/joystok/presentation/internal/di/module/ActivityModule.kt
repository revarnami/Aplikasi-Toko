package com.android.joystok.presentation.internal.di.module

import android.app.Activity
import com.android.joystok.presentation.internal.di.scope.PerActivity
import dagger.Module
import dagger.Provides

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module
class ActivityModule(private val baseActivity: Activity) {
    /**
     * Expose the activity to dependents in the graph.
     */
    @Provides
    @PerActivity
    internal fun provideActivity(): Activity {
        return this.baseActivity
    }
}