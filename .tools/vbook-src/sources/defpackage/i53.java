package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i53 implements jy4 {
    public final Drawable a;

    public i53(Drawable drawable) {
        this.a = drawable;
    }

    public final int d() {
        return tjb.a(this.a);
    }

    public final int e() {
        return tjb.b(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i53) && lc5.Q(this.a, ((i53) obj).a);
    }

    public final long f() {
        Drawable drawable = this.a;
        long jB = ((long) tjb.b(drawable)) * 4 * ((long) tjb.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    public final boolean g() {
        return false;
    }

    public final void h(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
