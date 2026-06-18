package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g18 {
    public final h42 a;
    public final d6a b = new d6a(new wn6(this, 12));

    public g18(h42 h42Var) {
        this.a = h42Var;
        wh0 wh0VarF = f();
        wh0VarF.getClass();
        ((Number) ah1.S(hc3.a, new oh0(wh0VarF, null, 1))).intValue();
    }

    public final Boolean a(String str) {
        str.getClass();
        wh0 wh0VarF = f();
        wh0VarF.getClass();
        return (Boolean) ah1.S(hc3.a, new qh0(wh0VarF, str, null, 0));
    }

    public final Double b(String str) {
        hc3 hc3Var = hc3.a;
        str.getClass();
        jt1 jt1Var = null;
        try {
            wh0 wh0VarF = f();
            wh0VarF.getClass();
            return (Double) ah1.S(hc3Var, new qh0(wh0VarF, str, jt1Var, 1));
        } catch (Exception unused) {
            wh0 wh0VarF2 = f();
            wh0VarF2.getClass();
            if (((Float) ah1.S(hc3Var, new qh0(wh0VarF2, str, jt1Var, 2))) != null) {
                return Double.valueOf(r5.floatValue());
            }
            return null;
        }
    }

    public final Float c(String str) {
        hc3 hc3Var = hc3.a;
        str.getClass();
        jt1 jt1Var = null;
        try {
            wh0 wh0VarF = f();
            wh0VarF.getClass();
            return (Float) ah1.S(hc3Var, new qh0(wh0VarF, str, jt1Var, 2));
        } catch (Exception unused) {
            wh0 wh0VarF2 = f();
            wh0VarF2.getClass();
            Double d = (Double) ah1.S(hc3Var, new qh0(wh0VarF2, str, jt1Var, 1));
            if (d != null) {
                return Float.valueOf((float) d.doubleValue());
            }
            return null;
        }
    }

    public final Integer d(String str) {
        str.getClass();
        wh0 wh0VarF = f();
        wh0VarF.getClass();
        return (Integer) ah1.S(hc3.a, new qh0(wh0VarF, str, null, 3));
    }

    public final Long e(String str) {
        str.getClass();
        wh0 wh0VarF = f();
        wh0VarF.getClass();
        return (Long) ah1.S(hc3.a, new qh0(wh0VarF, str, null, 4));
    }

    public final wh0 f() {
        return (wh0) this.b.getValue();
    }

    public final String g(String str, String str2) {
        str.getClass();
        wh0 wh0VarF = f();
        wh0VarF.getClass();
        return (String) ah1.S(hc3.a, new vh0(wh0VarF, str, str2, null, 0));
    }

    public final String h(String str) {
        str.getClass();
        wh0 wh0VarF = f();
        wh0VarF.getClass();
        return (String) ah1.S(hc3.a, new qh0(wh0VarF, str, null, 5));
    }

    public final void i(String str, float f) {
        String str2;
        float f2;
        str.getClass();
        try {
            wh0 wh0VarF = f();
            wh0VarF.getClass();
            str2 = str;
            f2 = f;
            try {
                ah1.S(hc3.a, new sh0(wh0VarF, str2, f2, null, 1));
            } catch (Exception unused) {
                wh0 wh0VarF2 = f();
                wh0VarF2.getClass();
                ah1.S(hc3.a, new rh0(wh0VarF2, str2, f2, null, 1));
            }
        } catch (Exception unused2) {
            str2 = str;
            f2 = f;
        }
    }

    public final void j(String str, String str2) throws Throwable {
        str.getClass();
        str2.getClass();
        wh0 wh0VarF = f();
        wh0VarF.getClass();
        ah1.S(hc3.a, new vh0(wh0VarF, str, str2, null, 1));
    }
}
