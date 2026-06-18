package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d11 implements kz9, xd5 {
    public final List a;

    public /* synthetic */ d11(List list) {
        this.a = list;
    }

    public int b(long j) {
        return j < 0 ? 0 : -1;
    }

    public long e(int i) {
        fx1.G(i == 0);
        return 0L;
    }

    @Override // defpackage.xd5
    public Object l(String str, Object[] objArr) {
        objArr.getClass();
        return ah1.S(hc3.a, new ug(this.a, str, objArr, null, 13));
    }

    public List m(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    public int p() {
        return 1;
    }
}
