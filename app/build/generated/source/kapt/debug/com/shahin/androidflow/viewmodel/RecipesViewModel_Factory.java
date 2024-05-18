// Generated by Dagger (https://dagger.dev).
package com.shahin.androidflow.viewmodel;

import android.app.Application;
import com.shahin.androidflow.Utlis.DataStoreRepository;
import com.shahin.androidflow.repository.RecipesRepository;
import com.shahin.androidflow.roomDB.dao.FoodRecipeDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipesViewModel_Factory implements Factory<RecipesViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<RecipesRepository> postRepositoryProvider;

  private final Provider<FoodRecipeDao> foodRecipeDaoProvider;

  private final Provider<DataStoreRepository> dataStoreRepositoryProvider;

  public RecipesViewModel_Factory(Provider<Application> applicationProvider,
      Provider<RecipesRepository> postRepositoryProvider,
      Provider<FoodRecipeDao> foodRecipeDaoProvider,
      Provider<DataStoreRepository> dataStoreRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.postRepositoryProvider = postRepositoryProvider;
    this.foodRecipeDaoProvider = foodRecipeDaoProvider;
    this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
  }

  @Override
  public RecipesViewModel get() {
    return newInstance(applicationProvider.get(), postRepositoryProvider.get(), foodRecipeDaoProvider.get(), dataStoreRepositoryProvider.get());
  }

  public static RecipesViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<RecipesRepository> postRepositoryProvider,
      Provider<FoodRecipeDao> foodRecipeDaoProvider,
      Provider<DataStoreRepository> dataStoreRepositoryProvider) {
    return new RecipesViewModel_Factory(applicationProvider, postRepositoryProvider, foodRecipeDaoProvider, dataStoreRepositoryProvider);
  }

  public static RecipesViewModel newInstance(Application application,
      RecipesRepository postRepository, FoodRecipeDao foodRecipeDao,
      DataStoreRepository dataStoreRepository) {
    return new RecipesViewModel(application, postRepository, foodRecipeDao, dataStoreRepository);
  }
}
