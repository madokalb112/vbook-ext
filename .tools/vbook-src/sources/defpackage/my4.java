package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class my4 {
    public final ng a;
    public final long b;
    public final rd2 c;

    public my4(ng ngVar) {
        this.a = ngVar;
        Bitmap bitmap = ngVar.a;
        long width = (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L);
        this.b = width;
        this.c = new rd2(1, lw1.f(0L, width));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my4) && this.a == ((my4) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageBitmapSrc(data=" + this.a + ")";
    }
}
