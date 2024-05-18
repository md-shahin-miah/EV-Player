// Generated by Dagger (https://dagger.dev).
package com.shahin.androidflow.repository;

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
public final class FavRepositoryImpl_Factory implements Factory<FavRepositoryImpl> {
  private final Provider<FoodRecipeDao> foodRecipeDaoProvider;

  public FavRepositoryImpl_Factory(Provider<FoodRecipeDao> foodRecipeDaoProvider) {
    this.foodRecipeDaoProvider = foodRecipeDaoProvider;
  }

  @Override
  public FavRepositoryImpl get() {
    return newInstance(foodRecipeDaoProvider.get());
  }

  public static FavRepositoryImpl_Factory create(Provider<FoodRecipeDao> foodRecipeDaoProvider) {
    return new FavRepositoryImpl_Factory(foodRecipeDaoProvider);
  }

  public static FavRepositoryImpl newInstance(FoodRecipeDao foodRecipeDao) {
    return new FavRepositoryImpl(foodRecipeDao);
  }
}