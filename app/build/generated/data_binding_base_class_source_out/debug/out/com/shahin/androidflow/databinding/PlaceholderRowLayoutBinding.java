// Generated by view binder compiler. Do not edit!
package com.shahin.androidflow.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.shahin.androidflow.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PlaceholderRowLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View view;

  @NonNull
  public final View view2;

  @NonNull
  public final View view3;

  @NonNull
  public final View view4;

  @NonNull
  public final View view5;

  @NonNull
  public final View view6;

  private PlaceholderRowLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull View view,
      @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5,
      @NonNull View view6) {
    this.rootView = rootView;
    this.view = view;
    this.view2 = view2;
    this.view3 = view3;
    this.view4 = view4;
    this.view5 = view5;
    this.view6 = view6;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PlaceholderRowLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PlaceholderRowLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.placeholder_row_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PlaceholderRowLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      id = R.id.view3;
      View view3 = ViewBindings.findChildViewById(rootView, id);
      if (view3 == null) {
        break missingId;
      }

      id = R.id.view4;
      View view4 = ViewBindings.findChildViewById(rootView, id);
      if (view4 == null) {
        break missingId;
      }

      id = R.id.view5;
      View view5 = ViewBindings.findChildViewById(rootView, id);
      if (view5 == null) {
        break missingId;
      }

      id = R.id.view6;
      View view6 = ViewBindings.findChildViewById(rootView, id);
      if (view6 == null) {
        break missingId;
      }

      return new PlaceholderRowLayoutBinding((ConstraintLayout) rootView, view, view2, view3, view4,
          view5, view6);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
