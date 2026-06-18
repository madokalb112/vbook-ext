package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sl implements bi5 {
    public final Context a;
    public final String b;

    public sl(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.bi5
    public final Object a(jt1 jt1Var) throws IOException {
        InputStream inputStreamOpenInputStream = this.a.getContentResolver().openInputStream(Uri.parse(this.b));
        try {
            inputStreamOpenInputStream.getClass();
            byte[] bArrD0 = p7c.d0(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            return bArrD0;
        } finally {
        }
    }

    @Override // defpackage.bi5
    public final String b() {
        return this.b;
    }

    @Override // defpackage.bi5
    public final String getName() {
        Cursor cursorQuery;
        Uri uri = Uri.parse(this.b);
        if (lc5.Q(uri.getScheme(), "content")) {
            try {
                cursorQuery = this.a.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            } catch (Throwable unused) {
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                        string.getClass();
                        cursorQuery.close();
                        return string;
                    }
                    cursorQuery.close();
                } finally {
                }
            }
        }
        String lastPathSegment = uri.getLastPathSegment();
        return lastPathSegment != null ? bw9.t0('/', lastPathSegment, lastPathSegment) : "unknown";
    }
}
