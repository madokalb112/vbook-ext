package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzap {
    public static final String zza(ContentResolver contentResolver) {
        Cursor cursorQuery = contentResolver.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
            return "";
        }
        String strValueOf = String.valueOf(Long.parseLong(cursorQuery.getString(1)));
        cursorQuery.close();
        return strValueOf;
    }
}
