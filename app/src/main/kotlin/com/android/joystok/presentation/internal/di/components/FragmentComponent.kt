package com.android.joystok.presentation.internal.di.components

import com.android.joystok.presentation.internal.di.module.FragmentModule
import com.android.joystok.presentation.internal.di.scope.PerFragment
import dagger.Component

/**
 * Created by Fauzi Arnami on 9/17/17.
 */

@PerFragment
@Component(dependencies = arrayOf(ApplicationComponent::class), modules = arrayOf(FragmentModule::class))
interface FragmentComponent {
//    fun inject(topicMainFragment: TopicMainFragment)
}