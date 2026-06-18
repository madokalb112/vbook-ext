package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l55 implements j55 {
    public final m62 a;
    public final ov3 b;

    public l55(m62 m62Var, ov3 ov3Var) {
        this.a = m62Var;
        this.b = ov3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203  */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r59v0, types: [bi5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.bi5 r59, defpackage.kt1 r60) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l55.a(bi5, kt1):java.lang.Object");
    }

    public final Object b(String str, Map map, kt1 kt1Var) {
        ov3 ov3Var = this.b;
        a82 a82Var = (a82) ov3Var.a.b.T(str).e();
        if (a82Var == null) {
            gp.l("Book not found");
            return null;
        }
        Object objH = ov3Var.a(zn7.f(zn7.f(qu1.Z(gx3.a), str), a82Var.j).a.s()).h(str, map, kt1Var);
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        if (objH != xx1Var) {
            objH = hebVar;
        }
        return objH == xx1Var ? objH : hebVar;
    }

    public final Object c(String str, Map map, qt0 qt0Var) {
        ov3 ov3Var = this.b;
        a82 a82Var = (a82) ov3Var.a.b.T(str).e();
        if (a82Var != null) {
            return ov3Var.a(zn7.f(zn7.f(qu1.Z(gx3.a), str), a82Var.j).a.s()).g(map, qt0Var);
        }
        gp.l("Book not found");
        return null;
    }
}
