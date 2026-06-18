package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t6b implements as2 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    @Override // defpackage.as2
    public final Object a(CharSequence charSequence, String str) {
        charSequence.getClass();
        return e(charSequence, 0, charSequence.length(), str);
    }

    @Override // defpackage.as2
    public final Object b(int i, int i2, String str) {
        str.getClass();
        return d(str, i, i2 + i);
    }

    @Override // defpackage.as2
    public final Object c(CharSequence charSequence) {
        charSequence.getClass();
        return f(charSequence, 0, charSequence.length());
    }

    @Override // defpackage.as2
    public final void clear() {
        this.a.clear();
        this.b.clear();
    }

    public final Object d(CharSequence charSequence, int i, int i2) {
        if (charSequence.length() == 0) {
            throw null;
        }
        char cCharAt = charSequence.charAt(i);
        if (i == i2 - 1) {
            return this.a.get(Character.valueOf(cCharAt));
        }
        t6b t6bVar = (t6b) this.b.get(Character.valueOf(cCharAt));
        if (t6bVar != null) {
            return t6bVar.d(charSequence, i + 1, i2);
        }
        return null;
    }

    public final Object e(CharSequence charSequence, int i, int i2, Object obj) {
        if (charSequence.length() == 0) {
            throw null;
        }
        char cCharAt = charSequence.charAt(i);
        if (i == i2 - 1) {
            return this.a.put(Character.valueOf(cCharAt), obj);
        }
        Character chValueOf = Character.valueOf(cCharAt);
        HashMap map = this.b;
        t6b t6bVar = (t6b) map.get(chValueOf);
        if (t6bVar == null) {
            t6bVar = new t6b();
            map.put(Character.valueOf(cCharAt), t6bVar);
        }
        return t6bVar.e(charSequence, i + 1, i2, obj);
    }

    public final Object f(CharSequence charSequence, int i, int i2) {
        char cCharAt = charSequence.charAt(i);
        if (i == i2 - 1) {
            return this.a.remove(Character.valueOf(cCharAt));
        }
        t6b t6bVar = (t6b) this.b.get(Character.valueOf(cCharAt));
        if (t6bVar != null) {
            return t6bVar.f(charSequence, i + 1, i2);
        }
        return null;
    }

    @Override // defpackage.as2
    public final int size() {
        return this.b.size();
    }
}
