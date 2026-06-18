package defpackage;

import android.database.Cursor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class re {
    public final Cursor a;

    public re(Cursor cursor) {
        cursor.getClass();
        this.a = cursor;
    }

    public final Boolean a(int i) {
        Cursor cursor = this.a;
        if (cursor.isNull(i)) {
            return null;
        }
        return Boolean.valueOf(cursor.getLong(i) == 1);
    }

    public final Double b() {
        Cursor cursor = this.a;
        if (cursor.isNull(19)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(19));
    }

    public final Long c(int i) {
        Cursor cursor = this.a;
        if (cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i));
    }

    public final String d(int i) {
        Cursor cursor = this.a;
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    public final va8 e() {
        return new va8(Boolean.valueOf(this.a.moveToNext()));
    }
}
