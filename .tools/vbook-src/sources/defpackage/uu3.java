package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uu3 extends m95 {
    public final Field c;

    public uu3(Field field) {
        this.c = field;
    }

    @Override // defpackage.m95
    public final Member t0() {
        return this.c;
    }

    @Override // defpackage.m95
    public final m95 u0(Object obj) {
        s0(obj);
        return this;
    }

    public final Object v0() throws IllegalAccessException {
        Field field = this.c;
        Field field2 = field != null ? field : null;
        if (field2 != null && !field2.isAccessible()) {
            field2.setAccessible(true);
        }
        Object obj = field.get(this.b);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
