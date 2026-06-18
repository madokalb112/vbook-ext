package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hf5 implements xc3 {
    public static final ff5 f;
    public static final ff5 g;
    public final HashMap a;
    public final HashMap b;
    public final ef5 c;
    public boolean d;
    public static final ef5 e = new ef5(0);
    public static final gf5 h = new gf5();

    /* JADX WARN: Type inference failed for: r0v1, types: [ff5] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ff5] */
    static {
        final int i = 0;
        f = new ukb() { // from class: ff5
            @Override // defpackage.wc3
            public final void encode(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((vkb) obj2).add((String) obj);
                        break;
                    default:
                        ((vkb) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new ukb() { // from class: ff5
            @Override // defpackage.wc3
            public final void encode(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((vkb) obj2).add((String) obj);
                        break;
                    default:
                        ((vkb) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public hf5() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    @Override // defpackage.xc3
    public final xc3 registerEncoder(Class cls, ja7 ja7Var) {
        this.a.put(cls, ja7Var);
        this.b.remove(cls);
        return this;
    }
}
