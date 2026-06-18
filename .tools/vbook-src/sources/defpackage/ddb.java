package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ddb extends wc0 {
    public final int e;
    public final byte[] f;
    public final DatagramPacket s;
    public Uri t;
    public DatagramSocket u;
    public MulticastSocket v;
    public InetAddress w;
    public boolean x;
    public int y;

    public ddb() {
        super(true);
        this.e = 8000;
        byte[] bArr = new byte[2000];
        this.f = bArr;
        this.s = new DatagramPacket(bArr, 0, 2000);
    }

    public final void close() {
        this.t = null;
        MulticastSocket multicastSocket = this.v;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.w;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.v = null;
        }
        DatagramSocket datagramSocket = this.u;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.u = null;
        }
        this.w = null;
        this.y = 0;
        if (this.x) {
            this.x = false;
            b();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cdb */
    public final long e(g42 g42Var) throws cdb {
        Uri uri = g42Var.a;
        this.t = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.t.getPort();
        d();
        try {
            this.w = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.w, port);
            if (this.w.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.v = multicastSocket;
                multicastSocket.joinGroup(this.w);
                this.u = this.v;
            } else {
                this.u = new DatagramSocket(inetSocketAddress);
            }
            this.u.setSoTimeout(this.e);
            this.x = true;
            l(g42Var);
            return -1L;
        } catch (IOException e) {
            throw new cdb(2001, e);
        } catch (SecurityException e2) {
            throw new cdb(2006, e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cdb */
    public final int read(byte[] bArr, int i, int i2) throws cdb {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.y;
        DatagramPacket datagramPacket = this.s;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.u;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.y = length;
                a(length);
            } catch (SocketTimeoutException e) {
                throw new cdb(2002, e);
            } catch (IOException e2) {
                throw new cdb(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.y;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f, length2 - i4, bArr, i, iMin);
        this.y -= iMin;
        return iMin;
    }

    public final Uri t() {
        return this.t;
    }
}
