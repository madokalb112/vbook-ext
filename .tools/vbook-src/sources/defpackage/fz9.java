package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fz9 extends ea9 implements dr9 {
    @Override // defpackage.dr9
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.t;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.u + ((long) ((int) ((p() + ((long) this.w)) - this.u)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.t;
            objArr.getClass();
            f(Integer.valueOf(((Number) objArr[((int) ((this.u + ((long) ((int) ((p() + ((long) this.w)) - this.u)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
