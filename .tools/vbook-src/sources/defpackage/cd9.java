package defpackage;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cd9 implements Comparator {
    public static final /* synthetic */ cd9 b = new cd9(23);
    public final /* synthetic */ int a;

    public /* synthetic */ cd9(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return t1c.O(Long.valueOf(((zv5) obj2).I), Long.valueOf(((zv5) obj).I));
            case 1:
                return t1c.O(Long.valueOf(((zv5) obj2).I), Long.valueOf(((zv5) obj).I));
            case 2:
                return t1c.O(Long.valueOf(((zv5) obj2).I), Long.valueOf(((zv5) obj).I));
            case 3:
                return t1c.O(Float.valueOf(((ok9) obj).j), Float.valueOf(((ok9) obj2).j));
            case 4:
                return t1c.O((w16) ((Map.Entry) obj).getKey(), (w16) ((Map.Entry) obj2).getKey());
            case 5:
                return t1c.O(Long.valueOf(((oc8) obj2).c), Long.valueOf(((oc8) obj).c));
            case 6:
                return t1c.O(Integer.valueOf(((zv5) obj2).u), Integer.valueOf(((zv5) obj).u));
            case 7:
                return t1c.O(Long.valueOf(((oz9) obj).a), Long.valueOf(((oz9) obj2).a));
            case 8:
                return t1c.O(((b9a) obj).a, ((b9a) obj2).a);
            case 9:
                return t1c.O(((d9a) obj).a, ((d9a) obj2).a);
            case 10:
                return t1c.O(Boolean.valueOf(((cla) obj).c), Boolean.valueOf(((cla) obj2).c));
            case 11:
                return t1c.O(Integer.valueOf(((v78) obj2).c), Integer.valueOf(((v78) obj).c));
            case 12:
                return t1c.O(Integer.valueOf(((v78) obj2).c), Integer.valueOf(((v78) obj).c));
            case 13:
                return t1c.O(Integer.valueOf(((t5b) obj).c), Integer.valueOf(((t5b) obj2).c));
            case 14:
                return t1c.O(Integer.valueOf(((ata) obj2).a.a), Integer.valueOf(((ata) obj).a.a));
            case 15:
                return t1c.O(Long.valueOf(((bp2) obj).i), Long.valueOf(((bp2) obj2).i));
            case 16:
                return t1c.O(Long.valueOf(((bp2) obj2).i), Long.valueOf(((bp2) obj).i));
            case 17:
                return t1c.O(Long.valueOf(((bp2) obj).i), Long.valueOf(((bp2) obj2).i));
            case 18:
                return t1c.O(Long.valueOf(((bp2) obj).i), Long.valueOf(((bp2) obj2).i));
            case 19:
                return t1c.O(Long.valueOf(((bp2) obj).i), Long.valueOf(((bp2) obj2).i));
            case 20:
                return t1c.O(Boolean.valueOf(((cla) obj).c), Boolean.valueOf(((cla) obj2).c));
            case 21:
                return t1c.O(((r4c) obj).a, ((r4c) obj2).a);
            case 22:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
