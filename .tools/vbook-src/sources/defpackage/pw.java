package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pw implements s25 {
    public final Context a;
    public final String b;
    public final String c;

    public pw(Context context, String str) {
        context.getClass();
        this.a = context;
        this.b = str;
        this.c = "file:///android_asset/".concat(str);
    }

    @Override // defpackage.s25
    public final il9 a() throws IOException {
        InputStream inputStreamOpen = this.a.getAssets().open(this.b);
        inputStreamOpen.getClass();
        return tu1.l0(inputStreamOpen);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pw.class != obj.getClass()) {
            return false;
        }
        pw pwVar = (pw) obj;
        return lc5.Q(this.a, pwVar.a) && this.b.equals(pwVar.b);
    }

    @Override // defpackage.s25
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ky0.s(this.b, "')", new StringBuilder("AssetImageSource('"));
    }
}
