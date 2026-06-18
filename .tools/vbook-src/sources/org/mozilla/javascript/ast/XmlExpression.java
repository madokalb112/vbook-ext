package org.mozilla.javascript.ast;

import defpackage.j39;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class XmlExpression extends XmlFragment {
    private AstNode expression;
    private boolean isXmlAttribute;

    public XmlExpression(int i, AstNode astNode) {
        super(i);
        setExpression(astNode);
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public boolean isXmlAttribute() {
        return this.isXmlAttribute;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    public void setIsXmlAttribute(boolean z) {
        this.isXmlAttribute = z;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return j39.A(makeIndent(i), "{", this.expression.toSource(i), "}");
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }

    public XmlExpression(int i) {
        super(i);
    }

    public XmlExpression(int i, int i2) {
        super(i, i2);
    }

    public XmlExpression() {
    }
}
