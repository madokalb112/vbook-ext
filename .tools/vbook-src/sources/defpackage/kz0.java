package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kz0 implements Map.Entry, ii5 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;
    public final /* synthetic */ fi5 d;

    public kz0(kr9 kr9Var) {
        this.d = kr9Var;
        Map.Entry entry = (Map.Entry) kr9Var.c;
        entry.getClass();
        this.b = entry.getKey();
        Map.Entry entry2 = (Map.Entry) kr9Var.c;
        entry2.getClass();
        this.c = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (((String) this.c).equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
            case 0:
                return (String) this.c;
            default:
                return this.b;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.c;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.a) {
            case 0:
                return this.b.hashCode() ^ ((String) this.c).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.a;
        fi5 fi5Var = this.d;
        switch (i) {
            case 0:
                obj.getClass();
                Object obj2 = this.b;
                this.b = obj;
                mz0 mz0Var = (mz0) fi5Var;
                int iA = mz0Var.a((String) this.c);
                if (iA >= 0) {
                    mz0Var.b[iA] = obj;
                }
                return obj2;
            default:
                kr9 kr9Var = (kr9) fi5Var;
                jk9 jk9Var = (jk9) kr9Var.d;
                if (jk9Var.f().d != kr9Var.b) {
                    gp.d();
                    return null;
                }
                Object obj3 = this.c;
                jk9Var.put(this.b, obj);
                this.c = obj;
                return obj3;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((String) this.c) + '=' + this.b;
            default:
                return super.toString();
        }
    }

    public kz0(mz0 mz0Var, String str, Object obj) {
        this.d = mz0Var;
        this.c = str;
        this.b = obj;
    }
}
