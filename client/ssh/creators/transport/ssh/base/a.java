package com.server.auditor.ssh.client.ssh.creators.transport.ssh.base;

import com.crystalnix.termius.libtermius.SshClient;
import com.crystalnix.termius.libtermius.wrappers.options.SshOptions;
import com.server.auditor.ssh.client.models.ChainingHost;
import com.server.auditor.ssh.client.models.proxy.Proxy;
import gm.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements b {
    protected SshClient.IAgentOptions mAgentOptions;
    protected ChainingHost mChainingHost;
    protected Proxy mProxy;
    protected SshOptions mSshOptions;

    protected a(SshOptions sshOptions) {
        this.mSshOptions = sshOptions;
    }

    public void setAgentOptions(SshClient.IAgentOptions iAgentOptions) {
        this.mAgentOptions = iAgentOptions;
    }

    public void setChainingHost(ChainingHost chainingHost) {
        this.mChainingHost = chainingHost;
    }

    public void setProxy(Proxy proxy) {
        this.mProxy = proxy;
    }
}
