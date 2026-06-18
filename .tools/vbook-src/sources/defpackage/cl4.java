package defpackage;

import android.content.Context;
import android.os.Build;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cl4 {
    public static final e18 b = new e18("fire-global");
    public static final e18 c = new e18("fire-count");
    public static final e18 d = new e18("last-used-date");
    public final pd5 a;

    public cl4(Context context, String str) {
        this.a = new pd5(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            pd5 pd5Var = this.a;
            pd5Var.getClass();
            for (Map.Entry entry : ((Map) ah1.S(hc3.a, new l64(pd5Var, (jt1) null, 10))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new f80(((e18) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                pd5 pd5Var2 = this.a;
                ve veVar = new ve(jCurrentTimeMillis, 5);
                pd5Var2.getClass();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized e18 c(pz6 pz6Var, String str) {
        for (Map.Entry entry : pz6Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return i12.f0(((e18) entry.getKey()).a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(pz6 pz6Var, String str) {
        try {
            e18 e18VarC = c(pz6Var, str);
            if (e18VarC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) yn2.C(pz6Var, e18VarC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                pz6Var.d(e18VarC);
            } else {
                pz6Var.f(e18VarC, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
