package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gb0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gb0(dk7 dk7Var, boolean z, sw8 sw8Var) {
        this.a = 3;
        this.d = dk7Var;
        this.b = z;
        this.c = sw8Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        float fMax;
        float fIntBitsToFloat;
        int i = this.a;
        int i2 = 0;
        heb hebVar = heb.a;
        boolean z = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                uf2 uf2Var = (uf2) obj3;
                ((yw2) obj).getClass();
                ra0 ra0VarB = kl8.b(30, new ik((a07) obj2, 5), z);
                if (uf2Var.a.contains(ra0VarB)) {
                    gp.j("Callback is already registered");
                } else {
                    uf2Var.a = e11.Y(uf2Var.a, ra0VarB);
                    ra0VarB.b = e11.Y(ra0VarB.b, uf2Var.d);
                    uf2Var.a();
                }
                return new kb0(0, uf2Var, ra0VarB);
            case 1:
                xi xiVar = (xi) obj3;
                a07 a07Var = (a07) obj2;
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                if (!z) {
                    a07Var.setValue(f);
                    xiVar.a(fFloatValue);
                }
                return hebVar;
            case 2:
                zk7 zk7Var = (zk7) obj3;
                vx1 vx1Var = (vx1) obj2;
                n29 n29Var = (n29) obj;
                if (z) {
                    wn4 wn4Var = new wn4(1, vx1Var, zk7Var);
                    ni5[] ni5VarArr = l29.a;
                    n29Var.a(u19.y, new n3((String) null, wn4Var));
                    n29Var.a(u19.A, new n3((String) null, new wn4(2, vx1Var, zk7Var)));
                } else {
                    wn4 wn4Var2 = new wn4(3, vx1Var, zk7Var);
                    ni5[] ni5VarArr2 = l29.a;
                    n29Var.a(u19.z, new n3((String) null, wn4Var2));
                    n29Var.a(u19.B, new n3((String) null, new wn4(4, vx1Var, zk7Var)));
                }
                return hebVar;
            case 3:
                dk7 dk7Var = (dk7) obj3;
                sw8 sw8Var = (sw8) obj2;
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                dk7 dk7Var2 = dk7.a;
                if (dk7Var != dk7Var2) {
                    if (z) {
                        tc tcVar = sw8Var.i;
                        if (tcVar != null) {
                            tcVar.a(r43Var.p0().x());
                        }
                    } else {
                        tc tcVar2 = sw8Var.h;
                        if (tcVar2 != null) {
                            tcVar2.a(r43Var.p0().x());
                        }
                    }
                    if (z) {
                        fMax = Math.min(Float.intBitsToFloat((int) (r43Var.f() >> 32)), (sw8Var.e() + Float.intBitsToFloat((int) (r43Var.f() >> 32))) - sw8Var.c);
                        fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var.f() >> 32));
                    } else {
                        fMax = Math.max(0.0f, sw8Var.e() - sw8Var.c);
                        fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var.f() >> 32));
                    }
                    float f2 = 1.0f - (fMax / fIntBitsToFloat);
                    float f3 = 0.85f * f2;
                    float f4 = f3 < 0.2f ? 0.18f * f3 * 5.0f : 0.18f;
                    float f5 = 1.0f - f4;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r43Var.f() & 4294967295L)) / Float.intBitsToFloat((int) (r43Var.f() >> 32));
                    float f6 = (fIntBitsToFloat2 - 1.0f) / 2.0f;
                    tc tcVar3 = dk7Var != dk7Var2 ? z ? sw8Var.h : sw8Var.j : null;
                    if (tcVar3 != null) {
                        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (r43Var.f() >> 32));
                        while (i2 < iIntBitsToFloat) {
                            float fIntBitsToFloat3 = i2 / Float.intBitsToFloat((int) (r43Var.f() >> 32));
                            double dSin = (Math.sin(((double) (fIntBitsToFloat3 - f2)) * 6.283185307179586d) + 1.100000023841858d) * ((double) f4);
                            float f7 = (fIntBitsToFloat3 * f5) - f3;
                            int i3 = i2;
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (r43Var.f() >> 32)) * fIntBitsToFloat3;
                            float f8 = f5;
                            double dIntBitsToFloat = ((double) ((((Float.intBitsToFloat((int) (r43Var.f() & 4294967295L)) * f4) * f3) * fIntBitsToFloat2) - f6)) * dSin;
                            fy0 fy0VarX = r43Var.p0().x();
                            long jM = ((long) t96.M(fIntBitsToFloat4)) << 32;
                            long jIntBitsToFloat = 4294967296L | (((long) ((int) Float.intBitsToFloat((int) (r43Var.f() & 4294967295L)))) & 4294967295L);
                            int iM = t96.M(Float.intBitsToFloat((int) (r43Var.f() >> 32)) * f7);
                            float f9 = fIntBitsToFloat2;
                            long j = ((long) iM) << 32;
                            r43 r43Var2 = r43Var;
                            long j2 = j | (((long) (-t96.L(dIntBitsToFloat))) & 4294967295L);
                            long jL = 4294967296L | (((long) t96.L((2.0d * dIntBitsToFloat) + ((double) Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L))))) & 4294967295L);
                            fy0VarX.getClass();
                            ng ngVar = tcVar3.a;
                            if (ngVar != null) {
                                ngVar.a.prepareToDraw();
                                fy0VarX.a(ngVar, jM, jIntBitsToFloat, j2, jL, tcVar3.b);
                            }
                            f5 = f8;
                            r43Var = r43Var2;
                            i2 = i3 + 1;
                            fIntBitsToFloat2 = f9;
                        }
                        r43 r43Var3 = r43Var;
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (r43Var3.f() >> 32)) * (f5 - f3);
                        y91 y91VarP0 = r43Var3.p0();
                        long jG = y91VarP0.G();
                        y91VarP0.x().i();
                        try {
                            lp8.E((lp8) y91VarP0.b, fIntBitsToFloat5, 0.0f, 2);
                            List list = ef9.a;
                            float f10 = ef9.b;
                            r43.G0(r43Var3, js8.p(list, r43Var3.k0(f10), 8), 0L, (((long) Float.floatToRawIntBits(r43Var3.k0(f10))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (r43Var3.f() & 4294967295L)))) & 4294967295L), 0.0f, (s43) null, (qc1) null, 0, Token.FUNCTION);
                        } finally {
                            j39.s(y91VarP0, jG);
                        }
                    }
                }
                return hebVar;
            default:
                m6a m6aVar = (m6a) obj3;
                ((yw2) obj).getClass();
                if (((Boolean) ((br9) obj2).getValue()).booleanValue()) {
                    m6aVar.e(k6a.c);
                }
                return new xma(z, m6aVar);
        }
    }

    public /* synthetic */ gb0(m6a m6aVar, br9 br9Var, boolean z) {
        this.a = 4;
        this.d = m6aVar;
        this.c = br9Var;
        this.b = z;
    }

    public /* synthetic */ gb0(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.d = obj;
        this.c = obj2;
    }
}
