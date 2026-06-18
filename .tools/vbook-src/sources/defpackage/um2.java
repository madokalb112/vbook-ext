package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class um2 implements ym2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm2 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ um2(xm2 xm2Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = xm2Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    public final ScheduledFuture a(final gi8 gi8Var) {
        int i = this.a;
        final Runnable runnable = this.c;
        final xm2 xm2Var = this.b;
        switch (i) {
            case 0:
                final int i2 = 0;
                return xm2Var.b.scheduleAtFixedRate(new Runnable() { // from class: vm2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        final gi8 gi8Var2 = gi8Var;
                        final Runnable runnable2 = runnable;
                        xm2 xm2Var2 = xm2Var;
                        switch (i3) {
                            case 0:
                                final int i4 = 0;
                                xm2Var2.a.execute(new Runnable() { // from class: tm2
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        int i5 = i4;
                                        gi8 gi8Var3 = gi8Var2;
                                        Runnable runnable3 = runnable2;
                                        switch (i5) {
                                            case 0:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    ((zm2) gi8Var3.a).j(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    ((zm2) gi8Var3.a).j(e2);
                                                    return;
                                                }
                                            default:
                                                zm2 zm2Var = (zm2) gi8Var3.a;
                                                try {
                                                    runnable3.run();
                                                    zm2Var.i((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    zm2Var.j(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i5 = 2;
                                xm2Var2.a.execute(new Runnable() { // from class: tm2
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        int i52 = i5;
                                        gi8 gi8Var3 = gi8Var2;
                                        Runnable runnable3 = runnable2;
                                        switch (i52) {
                                            case 0:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    ((zm2) gi8Var3.a).j(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    ((zm2) gi8Var3.a).j(e2);
                                                    return;
                                                }
                                            default:
                                                zm2 zm2Var = (zm2) gi8Var3.a;
                                                try {
                                                    runnable3.run();
                                                    zm2Var.i((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    zm2Var.j(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i6 = 1;
                                xm2Var2.a.execute(new Runnable() { // from class: tm2
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        int i52 = i6;
                                        gi8 gi8Var3 = gi8Var2;
                                        Runnable runnable3 = runnable2;
                                        switch (i52) {
                                            case 0:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    ((zm2) gi8Var3.a).j(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    ((zm2) gi8Var3.a).j(e2);
                                                    return;
                                                }
                                            default:
                                                zm2 zm2Var = (zm2) gi8Var3.a;
                                                try {
                                                    runnable3.run();
                                                    zm2Var.i((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    zm2Var.j(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, this.d, this.e, this.f);
            default:
                final int i3 = 2;
                return xm2Var.b.scheduleWithFixedDelay(new Runnable() { // from class: vm2
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        final gi8 gi8Var2 = gi8Var;
                        final Runnable runnable2 = runnable;
                        xm2 xm2Var2 = xm2Var;
                        switch (i32) {
                            case 0:
                                final int i4 = 0;
                                xm2Var2.a.execute(new Runnable() { // from class: tm2
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        int i52 = i4;
                                        gi8 gi8Var3 = gi8Var2;
                                        Runnable runnable3 = runnable2;
                                        switch (i52) {
                                            case 0:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    ((zm2) gi8Var3.a).j(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    ((zm2) gi8Var3.a).j(e2);
                                                    return;
                                                }
                                            default:
                                                zm2 zm2Var = (zm2) gi8Var3.a;
                                                try {
                                                    runnable3.run();
                                                    zm2Var.i((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    zm2Var.j(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final int i5 = 2;
                                xm2Var2.a.execute(new Runnable() { // from class: tm2
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        int i52 = i5;
                                        gi8 gi8Var3 = gi8Var2;
                                        Runnable runnable3 = runnable2;
                                        switch (i52) {
                                            case 0:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    ((zm2) gi8Var3.a).j(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    ((zm2) gi8Var3.a).j(e2);
                                                    return;
                                                }
                                            default:
                                                zm2 zm2Var = (zm2) gi8Var3.a;
                                                try {
                                                    runnable3.run();
                                                    zm2Var.i((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    zm2Var.j(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i6 = 1;
                                xm2Var2.a.execute(new Runnable() { // from class: tm2
                                    @Override // java.lang.Runnable
                                    public final void run() throws Exception {
                                        int i52 = i6;
                                        gi8 gi8Var3 = gi8Var2;
                                        Runnable runnable3 = runnable2;
                                        switch (i52) {
                                            case 0:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e) {
                                                    ((zm2) gi8Var3.a).j(e);
                                                    throw e;
                                                }
                                            case 1:
                                                try {
                                                    runnable3.run();
                                                    return;
                                                } catch (Exception e2) {
                                                    ((zm2) gi8Var3.a).j(e2);
                                                    return;
                                                }
                                            default:
                                                zm2 zm2Var = (zm2) gi8Var3.a;
                                                try {
                                                    runnable3.run();
                                                    zm2Var.i((Object) null);
                                                    return;
                                                } catch (Exception e3) {
                                                    zm2Var.j(e3);
                                                    return;
                                                }
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, this.d, this.e, this.f);
        }
    }
}
