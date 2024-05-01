package com.squareup.picasso3.provider;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;

import static android.support.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
public final class PicassoContentProvider extends ContentProvider {
  @SuppressLint("StaticFieldLeak")
   static Context context;

  @Override public boolean onCreate() {
    context = getContext();
    return true;
  }

   @Override
  public Cursor query(@NonNull Uri uri,  String[] projection,  String selection,
       String[] selectionArgs,  String sortOrder) {
    return null;
  }

   @Override public String getType(@NonNull Uri uri) {
    return null;
  }

   @Override public Uri insert(@NonNull Uri uri,  ContentValues values) {
    return null;
  }

  @Override public int delete(@NonNull Uri uri,  String selection,
       String[] selectionArgs) {
    return 0;
  }

  @Override public int update(@NonNull Uri uri,  ContentValues values,
       String selection,  String[] selectionArgs) {
    return 0;
  }
}
