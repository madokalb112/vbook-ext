package defpackage;

import com.google.android.gms.internal.mlkit_language_id_common.zzhy;
import com.google.android.gms.internal.mlkit_language_id_common.zzhz;
import com.google.android.gms.internal.mlkit_language_id_common.zziu;
import com.google.android.gms.internal.mlkit_language_id_common.zzli;
import com.google.android.gms.internal.mlkit_language_id_common.zzll;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z16 implements ib4 {
    public final /* synthetic */ int a;

    @Override // defpackage.ib4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                x16 x16Var = new x16(new nu(0, false));
                b72.c(x16Var);
                yn2.u(x16Var, '-');
                b72.f(x16Var);
                yn2.u(x16Var, '-');
                z62.g(x16Var);
                return new y16(x16Var.build());
            case 1:
                x16 x16Var2 = new x16(new nu(0, false));
                b72.c(x16Var2);
                b72.f(x16Var2);
                z62.g(x16Var2);
                return new y16(x16Var2.build());
            case 2:
                i26 i26Var = new i26(new nu(0, false));
                o0 o0Var = (o0) a26.a.getValue();
                o0Var.getClass();
                if (o0Var instanceof y16) {
                    i26Var.e(((y16) o0Var).a);
                }
                yn2.m(i26Var, new kb4[]{new rv5(12)}, new rv5(13));
                b36 b36Var = (b36) c36.a.getValue();
                b36Var.getClass();
                i26Var.d(b36Var.a);
                return new j26(i26Var.build());
            case 3:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 4:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay. AnimatedContentScope in OverlayScenes are no-op.");
            case 5:
                fn1 fn1Var = t26.a;
                return null;
            case 6:
                fn1 fn1Var2 = u26.a;
                return null;
            case 7:
                ur9 ur9Var = w26.a;
                return bv4.H;
            case 8:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 9:
                nu nuVar = new nu(0, false);
                a36 a36Var = new a36(nuVar);
                jj7 jj7Var = jj7.a;
                nuVar.c(new je0(new op4(jj7Var)));
                yn2.u(a36Var, ':');
                nuVar.c(new je0(new jh6(jj7Var)));
                yn2.m(a36Var, new kb4[]{new rv5(14)}, new rv5(15));
                return new b36(a36Var.build());
            case 10:
                bbc bbcVar = new bbc(27);
                try {
                    return !(n46.c().b() instanceof f17) ? new ub7(bbcVar) : new ub7(new rg2(Class.forName("android.util.Log"), bbcVar));
                } catch (ClassNotFoundException unused) {
                    return new ub7(bbcVar);
                }
            case 11:
                return new qa7("com.reader.app.ui.screen.auth.LoginRoute", j56.INSTANCE, new Annotation[0]);
            case 12:
                return dk9.x("");
            case 13:
                return dk9.x("");
            case 14:
                return dk9.x(Boolean.FALSE);
            case 15:
                return new i76();
            case 16:
                Float fValueOf = Float.valueOf(0.5f);
                yl5 yl5Var = new yl5(fValueOf);
                am5 am5Var = (am5) lh6.b().a(am5.class);
                sfc sfcVar = am5Var.b;
                sfcVar.getClass();
                zzli zzliVar = am5Var.a;
                bm5 bm5Var = new bm5(yl5Var, sfcVar, zzliVar, (Executor) am5Var.c.a.get());
                zzhz zzhzVar = new zzhz();
                zzhzVar.zzc(bm5Var.s);
                zziu zziuVar = new zziu();
                zziuVar.zzf(bm5.R(fValueOf));
                zzhzVar.zze(zziuVar.zzi());
                zzliVar.zzc(zzll.zzg(zzhzVar, 1), zzhy.zzx);
                ((sfc) bm5Var.e.get()).b.incrementAndGet();
                return bm5Var;
            case 17:
                return new qa7("com.reader.app.ui.MainRoute", s76.INSTANCE, new Annotation[0]);
            case 18:
                return 4;
            case 19:
                ur9 ur9Var2 = s96.a;
                return Boolean.FALSE;
            case 20:
                return new q96(dd1.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), new xbb(), new i99(), rv6.a);
            case 21:
                return hc3.a;
            case 22:
                return dk9.x(Boolean.FALSE);
            case 23:
                return dk9.x(0);
            case 24:
                return dk9.x(Boolean.TRUE);
            case 25:
                return dk9.x(Boolean.TRUE);
            case 26:
                return new l7(false, "", 0, 0, 0, "", "", "");
            case 27:
                return new fn2();
            case 28:
                return new kn2("", false, false);
            default:
                return new gn2(false, null);
        }
    }

    public /* synthetic */ z16(int i) {
        this.a = i;
    }
}
