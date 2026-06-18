package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cr1 implements s25 {
    public final Context a;
    public final Uri b;
    public final String c;

    public cr1(Context context, Uri uri) {
        context.getClass();
        this.a = context;
        this.b = uri;
        String string = uri.toString();
        string.getClass();
        this.c = string;
    }

    @Override // defpackage.s25
    public final il9 a() throws FileNotFoundException {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = this.b;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            return tu1.l0(inputStreamOpenInputStream);
        }
        throw new FileNotFoundException("Unable to open stream. uri='" + uri + '\'');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cr1.class != obj.getClass()) {
            return false;
        }
        cr1 cr1Var = (cr1) obj;
        return lc5.Q(this.a, cr1Var.a) && this.b.equals(cr1Var.b);
    }

    @Override // defpackage.s25
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentImageSource('" + this.b + "')";
    }
}
