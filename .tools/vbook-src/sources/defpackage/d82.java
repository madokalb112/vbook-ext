package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class d82 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ d82(int i, String str, long j) {
        this.a = i;
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) throws Exception {
        cr8 cr8VarP0;
        int i = this.a;
        heb hebVar = heb.a;
        String str = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                rj rjVar = (rj) obj;
                rjVar.getClass();
                rjVar.j(0, Long.valueOf(j));
                rjVar.g(1, str);
                return hebVar;
            case 1:
                rj rjVar2 = (rj) obj;
                rjVar2.getClass();
                rjVar2.j(0, Long.valueOf(j));
                rjVar2.g(1, str);
                return hebVar;
            case 2:
                rj rjVar3 = (rj) obj;
                rjVar3.getClass();
                rjVar3.j(0, Long.valueOf(j));
                rjVar3.g(1, str);
                return hebVar;
            case 3:
                rj rjVar4 = (rj) obj;
                rjVar4.getClass();
                rjVar4.j(0, Long.valueOf(j));
                rjVar4.g(1, str);
                return hebVar;
            case 4:
                rj rjVar5 = (rj) obj;
                rjVar5.getClass();
                rjVar5.j(0, Long.valueOf(j));
                rjVar5.g(1, str);
                return hebVar;
            case 5:
                rj rjVar6 = (rj) obj;
                rjVar6.getClass();
                rjVar6.j(0, Long.valueOf(j));
                rjVar6.g(1, str);
                return hebVar;
            case 6:
                rj rjVar7 = (rj) obj;
                rjVar7.getClass();
                rjVar7.j(0, Long.valueOf(j));
                rjVar7.g(1, str);
                return hebVar;
            case 7:
                wq8 wq8Var = (wq8) obj;
                wq8Var.getClass();
                cr8VarP0 = wq8Var.P0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    cr8VarP0.n(1, j);
                    cr8VarP0.V(2, str);
                    cr8VarP0.J0();
                    int iX = qx1.x(wq8Var);
                    cr8VarP0.close();
                    return Integer.valueOf(iX);
                } finally {
                }
            default:
                wq8 wq8Var2 = (wq8) obj;
                wq8Var2.getClass();
                cr8VarP0 = wq8Var2.P0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    cr8VarP0.n(1, j);
                    cr8VarP0.V(2, str);
                    cr8VarP0.J0();
                    return hebVar;
                } finally {
                }
        }
    }
}
