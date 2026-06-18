package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nda implements ib4 {
    public final /* synthetic */ int a;

    public /* synthetic */ nda(int i) {
        this.a = i;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return j39.g(6, "", 0L);
            case 1:
                return j39.g(6, "", 0L);
            case 2:
                return dk9.x(Boolean.FALSE);
            case 3:
                return bcb.a;
            case 4:
                return new ea5(0L);
            case 5:
                return new ea5(0L);
            case 6:
                return bk2.a;
            case 7:
                return new p8b();
            case 8:
                return dk9.x(Float.valueOf(0.0f));
            case 9:
                return dk9.x(Float.valueOf(0.6666667f));
            case 10:
                throw new IllegalStateException("No TextToSpeechColorSchemeState provided");
            case 11:
                return pu1.w("tts_settings");
            case 12:
                return j39.g(6, "", 0L);
            case 13:
                return dk9.x(Boolean.FALSE);
            case 14:
                return dk9.x(Boolean.FALSE);
            case 15:
                return dk9.x(Boolean.FALSE);
            case 16:
                return new se6(20);
            case 17:
                m39[] m39VarArr = new m39[0];
                if (bw9.a0("kotlinx.datetime.TimeBased")) {
                    gp.l("Blank serial names are prohibited");
                    return null;
                }
                b91 b91Var = new b91("kotlinx.datetime.TimeBased");
                e66 e66Var = e66.a;
                b91Var.a("nanoseconds", e66.b);
                return new p39("kotlinx.datetime.TimeBased", qw9.c, b91Var.c.size(), fw.O0(m39VarArr), b91Var);
            case 18:
                throw new IllegalStateException("Toast not initialized");
            case 19:
                return dk9.x(Boolean.FALSE);
            case 20:
                rj7 rj7Var = a0b.a;
                return Boolean.TRUE;
            case 21:
                rt8 rt8Var = e0b.e;
                return Boolean.TRUE;
            case 22:
                return new c3b(d3b.a(0.0f, 0.0f));
            case 23:
                return dk9.x(Boolean.FALSE);
            case 24:
                return dk9.x("");
            case 25:
                return dk9.x("100");
            case 26:
                return dk9.x("2000");
            case 27:
                return dk9.x("1");
            case 28:
                return dk9.x("detect_auto");
            default:
                return dk9.x(Boolean.FALSE);
        }
    }
}
