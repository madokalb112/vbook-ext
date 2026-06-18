package org.mozilla.javascript.ast;

import defpackage.xv5;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class LetNode extends Scope {
    private AstNode body;
    private int lp;
    private int rp;
    private VariableDeclaration variables;

    public LetNode() {
        this.lp = -1;
        this.rp = -1;
        this.type = Token.LETEXPR;
    }

    public AstNode getBody() {
        return this.body;
    }

    public int getLp() {
        return this.lp;
    }

    public int getRp() {
        return this.rp;
    }

    public VariableDeclaration getVariables() {
        return this.variables;
    }

    public void setBody(AstNode astNode) {
        this.body = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    public void setLp(int i) {
        this.lp = i;
    }

    public void setParens(int i, int i2) {
        this.lp = i;
        this.rp = i2;
    }

    public void setRp(int i) {
        this.rp = i;
    }

    public void setVariables(VariableDeclaration variableDeclaration) {
        assertNotNull(variableDeclaration);
        this.variables = variableDeclaration;
        variableDeclaration.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sbV = xv5.v(makeIndent(i), "let (");
        printList(this.variables.getVariables(), sbV);
        sbV.append(") ");
        AstNode astNode = this.body;
        if (astNode != null) {
            sbV.append(astNode.toSource(i));
        }
        return sbV.toString();
    }

    @Override // org.mozilla.javascript.ast.Scope, org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.variables.visit(nodeVisitor);
            AstNode astNode = this.body;
            if (astNode != null) {
                astNode.visit(nodeVisitor);
            }
        }
    }

    public LetNode(int i) {
        super(i);
        this.lp = -1;
        this.rp = -1;
        this.type = Token.LETEXPR;
    }

    public LetNode(int i, int i2) {
        super(i, i2);
        this.lp = -1;
        this.rp = -1;
        this.type = Token.LETEXPR;
    }
}
