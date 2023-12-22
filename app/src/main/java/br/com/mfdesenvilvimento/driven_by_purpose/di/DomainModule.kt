package br.com.mfdesenvilvimento.driven_by_purpose.di

import br.com.mfdesenvilvimento.driven_by_purpose.data.repository.CommentsRepositoryImpl
import br.com.mfdesenvilvimento.driven_by_purpose.domain.repository.CommentsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindsCommentsRepositoryImpl(
        commentsRepositoryImpl: CommentsRepositoryImpl
    ): CommentsRepository
}