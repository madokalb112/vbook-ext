package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nn2 implements a39 {
    public final CharSequence a;
    public final int b;
    public final yb4 c;

    public nn2(CharSequence charSequence, int i, yb4 yb4Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = yb4Var;
    }

    @Override // defpackage.a39
    public final Iterator iterator() {
        return new mn2(this);
    }
}
