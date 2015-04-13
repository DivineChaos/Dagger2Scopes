/**
 * Copyright (C) 2015 android10.org. All rights reserved.
 *
 * @author Fernando Cejas (the android10 coder)
 */
package com.github.jorgecastilloprz.dagger2scopes.android.di;

import com.github.jorgecastilloprz.dagger2scopes.android.di.scopes.ActivityScope;
import com.github.jorgecastilloprz.dagger2scopes.android.ui.animator.ToolbarAnimator;
import com.github.jorgecastilloprz.dagger2scopes.android.ui.animator.ToolbarAnimatorImpl;
import com.github.jorgecastilloprz.dagger2scopes.domain.interactors.ChangeBookmarkGameStatus;
import com.github.jorgecastilloprz.dagger2scopes.domain.interactors.ChangeBookmarkGameStatusImpl;
import com.github.jorgecastilloprz.dagger2scopes.domain.model.GameCatalog;
import com.github.jorgecastilloprz.dagger2scopes.domain.model.LucasArtCatalog;
import com.github.jorgecastilloprz.dagger2scopes.domain.repository.GameRepository;
import com.github.jorgecastilloprz.dagger2scopes.domain.repository.GameRepositoryImpl;
import com.github.jorgecastilloprz.dagger2scopes.presentation.GameDetailsPresenter;
import com.github.jorgecastilloprz.dagger2scopes.presentation.GameDetailsPresenterImpl;
import dagger.Module;
import dagger.Provides;

/**
 * Dagger module that provides user related collaborators.
 */
@Module public class GameDetailsModule {

  @Provides @ActivityScope GameDetailsPresenter provideGameDetailsPresenter(
      GameDetailsPresenterImpl presenter) {
    return presenter;
  }

  @Provides @ActivityScope ChangeBookmarkGameStatus provideChangeBookmarkStatusInteractor(
      ChangeBookmarkGameStatusImpl interactor) {
    return interactor;
  }

  @Provides @ActivityScope ToolbarAnimator provideToolbarAnimator(ToolbarAnimatorImpl animator) {
    return animator;
  }
}
