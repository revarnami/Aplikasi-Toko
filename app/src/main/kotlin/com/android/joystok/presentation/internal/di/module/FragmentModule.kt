package com.android.joystok.presentation.internal.di.module

import android.support.v4.app.Fragment
import com.android.joystok.presentation.internal.di.scope.PerFragment
import dagger.Module
import dagger.Provides

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@Module
class FragmentModule(private val baseFragment: Fragment) {
    /**
     * Expose the activity to dependents in the graph.
     */
    @Provides
    @PerFragment
    fun provideFragment(): Fragment {
        return this.baseFragment
    }
}