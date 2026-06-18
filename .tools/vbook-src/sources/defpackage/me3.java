package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class me3 implements oi5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public me3(oi5 oi5Var, int i) {
        this.a = i;
        switch (i) {
            case 2:
                oi5Var.getClass();
                wv wvVar = new wv(oi5Var, 0);
                this.b = wvVar;
                this.c = fx1.q("androidx.compose.runtime.SnapshotStateList", (uv) wvVar.c);
                break;
            default:
                me3 me3Var = new me3(oi5Var, 2);
                this.b = me3Var;
                this.c = fx1.q("androidx.navigation3.runtime.NavBackStack", (a3c) me3Var.c);
                break;
        }
    }

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Enum r5 = (Enum) obj;
                r5.getClass();
                Enum[] enumArr = (Enum[]) obj2;
                int iR0 = fw.r0(r5, enumArr);
                if (iR0 != -1) {
                    md2Var.K(e(), iR0);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                String strA = e().a();
                String string = Arrays.toString(enumArr);
                string.getClass();
                sb.append(" is not a valid enum ");
                sb.append(strA);
                sb.append(", must be one of ");
                sb.append(string);
                throw new u39(sb.toString());
            case 1:
                md2Var.W((me3) obj2, ((u27) obj).a);
                return;
            default:
                hk9 hk9Var = (hk9) obj;
                hk9Var.getClass();
                md2Var.W((wv) obj2, hk9Var);
                return;
        }
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                int iU = yd2Var.u(e());
                if (iU >= 0 && iU < enumArr.length) {
                    return enumArr[iU];
                }
                throw new u39(iU + " is not among valid " + e().a() + " enum values, values size is " + enumArr.length);
            case 1:
                return new u27((hk9) yd2Var.d((me3) obj));
            default:
                List list = (List) yd2Var.d((wv) obj);
                hk9 hk9Var = new hk9();
                hk9Var.addAll(fc1.Z0(list));
                return hk9Var;
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        switch (this.a) {
        }
        return (a3c) this.c;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + e().a() + '>';
            default:
                return super.toString();
        }
    }

    public me3(String str, Enum[] enumArr) {
        this.a = 0;
        enumArr.getClass();
        this.b = enumArr;
        this.c = new d6a(new y6(28, this, str));
    }
}
