// Generated by Dagger (https://dagger.dev).
package com.shahin.androidflow.fragments;

import com.shahin.androidflow.roomDB.database.FoodDatabase;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipesFragment_MembersInjector implements MembersInjector<RecipesFragment> {
  private final Provider<FoodDatabase> dbProvider;

  public RecipesFragment_MembersInjector(Provider<FoodDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  public static MembersInjector<RecipesFragment> create(Provider<FoodDatabase> dbProvider) {
    return new RecipesFragment_MembersInjector(dbProvider);
  }

  @Override
  public void injectMembers(RecipesFragment instance) {
    injectDb(instance, dbProvider.get());
  }

  @InjectedFieldSignature("com.shahin.androidflow.fragments.RecipesFragment.db")
  public static void injectDb(RecipesFragment instance, FoodDatabase db) {
    instance.db = db;
  }
}
