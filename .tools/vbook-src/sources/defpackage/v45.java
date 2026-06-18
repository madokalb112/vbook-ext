package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v45 extends r45 {
    @Override // defpackage.r45
    public final r45 a(Object obj) {
        b(obj);
        return this;
    }

    public final void f(Object... objArr) {
        int length = objArr.length;
        lx1.A(length, objArr);
        d(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public final hh8 g() {
        this.c = true;
        return a55.h(this.b, this.a);
    }
}
