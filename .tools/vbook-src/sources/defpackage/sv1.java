package defpackage;

import android.os.Build;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sv1 implements vv8 {
    public final /* synthetic */ int a;
    public final Object b;

    public sv1(String str) {
        this.a = 0;
        str.getClass();
        this.b = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.vv8
    public final Object b(String str, Object[] objArr, jt1 jt1Var) {
        fg5 fg5VarK;
        mf5 mf5Var;
        switch (this.a) {
            case 0:
                String str2 = (String) this.b;
                if (!str.equals("Cookie_set")) {
                    if (!str.equals("Cookie_get")) {
                        return null;
                    }
                    uv1.a.getClass();
                    String cookie = ((qe) tv1.a()).b.getCookie(str2);
                    return cookie == null ? "" : cookie;
                }
                Object objP0 = fw.p0(0, objArr);
                String string = objP0 != null ? objP0.toString() : null;
                String str3 = string != null ? string : "";
                uv1.a.getClass();
                ((qe) tv1.a()).b.setCookie(str2, str3);
                return heb.a;
            case 1:
                if (!"Log_log".equals(str)) {
                    return null;
                }
                String strValueOf = String.valueOf(fw.p0(0, objArr));
                kb4 kb4Var = (kb4) this.b;
                if (kb4Var != null) {
                    kb4Var.invoke(strValueOf);
                }
                if (pu.a()) {
                    e46 e46Var = e46.b;
                    k89 k89Var = k89.b;
                    if (e46Var.a.a.compareTo(k89Var) <= 0) {
                        e46Var.a(k89Var, "Log", strValueOf, (Throwable) null);
                    }
                }
                return Boolean.TRUE;
            case 2:
                wa2 wa2Var = (wa2) this.b;
                if (!"LocalConfig_getItem".equals(str)) {
                    return null;
                }
                Object obj = objArr[0];
                obj.getClass();
                String str4 = (String) obj;
                fg5 fg5VarC = xf5.c(wa2Var.s);
                if (fg5VarC.containsKey(str4)) {
                    mf5 mf5Var2 = (mf5) fg5VarC.get(str4);
                    if (mf5Var2 != null) {
                        return i12.G(mf5Var2);
                    }
                    return null;
                }
                Map map = wa2Var.q;
                if (!map.containsKey(str4) || (fg5VarK = i12.K(xf5.b(map.get(str4)))) == null || (mf5Var = (mf5) fg5VarK.get("default")) == null) {
                    return null;
                }
                return i12.G(mf5Var);
            default:
                switch (str.hashCode()) {
                    case -357549953:
                        if (str.equals("UserAgent_chrome")) {
                            return "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36";
                        }
                        return null;
                    case 116250676:
                        if (!str.equals("UserAgent_system")) {
                            return null;
                        }
                        if (!((cp0) this.b).a()) {
                            ((ph) kr2.a.getValue()).getClass();
                            kr2.d();
                            kr2.a();
                            String str5 = Build.VERSION.RELEASE;
                            str5.getClass();
                            return "Mozilla/5.0 (Linux; Android " + str5 + "; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Mobile Safari/537.36";
                        }
                        return "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36";
                    case 184783114:
                        if (!str.equals("UserAgent_android")) {
                            return null;
                        }
                        kr2.d();
                        kr2.a();
                        String str6 = Build.VERSION.RELEASE;
                        str6.getClass();
                        return "Mozilla/5.0 (Linux; Android " + str6 + "; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Mobile Safari/537.36";
                    case 1062238248:
                        if (str.equals("UserAgent_ios")) {
                            return "Mozilla/5.0 (iPhone; CPU iPhone OS 18_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/18.5 Mobile/15E148 Safari/604.1";
                        }
                        return null;
                    default:
                        return null;
                }
        }
    }

    public /* synthetic */ sv1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public sv1(wa2 wa2Var) {
        this.a = 2;
        wa2Var.getClass();
        this.b = wa2Var;
    }
}
