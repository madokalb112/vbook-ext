package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k76 extends n0 implements fsa {
    public static final s00 c = new s00(28);
    public final Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k76() {
        super(c);
        if (i12.M() == null) {
            gp.j("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
            throw null;
        }
        Map mapH = i12.M().h();
        this.b = mapH;
    }

    public static void A(Map map) {
        if (map == null) {
            if (i12.M() != null) {
                i12.M().clear();
                return;
            } else {
                gp.j("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
                return;
            }
        }
        if (i12.M() != null) {
            i12.M().f(map);
        } else {
            gp.j("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
    }

    @Override // defpackage.fsa
    public final void A0(Object obj) {
        A((Map) obj);
    }

    @Override // defpackage.fsa
    public final Object j0() {
        if (i12.M() == null) {
            gp.j("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
            return null;
        }
        Map mapH = i12.M().h();
        A(this.b);
        return mapH;
    }
}
