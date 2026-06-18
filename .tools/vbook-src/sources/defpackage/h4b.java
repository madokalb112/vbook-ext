package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h4b extends o1a implements bc4 {
    public final /* synthetic */ int a;
    public /* synthetic */ boolean b;
    public /* synthetic */ String c;
    public /* synthetic */ String d;
    public /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4b(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                String str = this.c;
                String str2 = this.d;
                String str3 = this.e;
                e11.e0(obj);
                return y86.P(new xl7("show_raw", String.valueOf(z)), new xl7("engine_id", str), new xl7("from_language", str2), new xl7("to_language", str3));
            default:
                boolean z2 = this.b;
                String str4 = this.c;
                String str5 = this.d;
                String str6 = this.e;
                e11.e0(obj);
                return y86.P(new xl7("show_raw", String.valueOf(z2)), new xl7("engine_id", str4), new xl7("from_language", str5), new xl7("to_language", str6));
        }
    }

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 5;
        Boolean bool = (Boolean) obj;
        switch (i) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                h4b h4bVar = new h4b(i2, 0, (jt1) obj5);
                h4bVar.b = zBooleanValue;
                h4bVar.c = (String) obj2;
                h4bVar.d = (String) obj3;
                h4bVar.e = (String) obj4;
                return h4bVar.invokeSuspend(hebVar);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                h4b h4bVar2 = new h4b(i2, 1, (jt1) obj5);
                h4bVar2.b = zBooleanValue2;
                h4bVar2.c = (String) obj2;
                h4bVar2.d = (String) obj3;
                h4bVar2.e = (String) obj4;
                return h4bVar2.invokeSuspend(hebVar);
        }
    }
}
