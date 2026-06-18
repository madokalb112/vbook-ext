package org.mozilla.javascript.ast;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class BigIntLiteral extends AstNode {
    private BigInteger bigInt;
    private String value;

    public BigIntLiteral(int i, String str) {
        super(i);
        this.type = 89;
        setValue(str);
        setLength(str.length());
    }

    @Override // org.mozilla.javascript.Node
    public BigInteger getBigInt() {
        return this.bigInt;
    }

    public String getValue() {
        return this.value;
    }

    @Override // org.mozilla.javascript.Node
    public void setBigInt(BigInteger bigInteger) {
        this.bigInt = bigInteger;
    }

    public void setValue(String str) {
        assertNotNull(str);
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        String strMakeIndent = makeIndent(i);
        BigInteger bigInteger = this.bigInt;
        return tw2.n(strMakeIndent, bigInteger == null ? "<null>" : tw2.n(bigInteger.toString(), "n"));
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public BigIntLiteral(int i) {
        super(i);
        this.type = 89;
    }

    public BigIntLiteral(int i, int i2) {
        super(i, i2);
        this.type = 89;
    }

    public BigIntLiteral() {
        this.type = 89;
    }

    public BigIntLiteral(int i, String str, BigInteger bigInteger) {
        this(i, str);
        setBigInt(bigInteger);
    }
}
