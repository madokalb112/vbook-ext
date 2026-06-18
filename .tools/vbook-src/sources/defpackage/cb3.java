package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class cb3 implements ab3 {
    public String a;

    public cb3(String str, int i) {
        switch (i) {
            case 1:
                str.getClass();
                this.a = str;
                break;
            default:
                this.a = str;
                break;
        }
    }

    public static CharSequence d(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(d(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.a);
                    sb.append(d(it.next()));
                }
            }
        } catch (IOException e) {
            gp.i(e);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    @Override // defpackage.ab3
    public boolean h(CharSequence charSequence, int i, int i2, pbb pbbVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        pbbVar.c = (pbbVar.c & 3) | 4;
        return false;
    }

    @Override // defpackage.ab3
    public Object c() {
        return this;
    }
}
