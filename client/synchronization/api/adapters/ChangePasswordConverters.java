package com.server.auditor.ssh.client.synchronization.api.adapters;

import com.server.auditor.ssh.client.database.models.GroupDBModel;
import com.server.auditor.ssh.client.database.models.HostDBModel;
import com.server.auditor.ssh.client.database.models.IdentityDBModel;
import com.server.auditor.ssh.client.database.models.KnownHostsDBModel;
import com.server.auditor.ssh.client.database.models.ProxyDBModel;
import com.server.auditor.ssh.client.database.models.RuleDBModel;
import com.server.auditor.ssh.client.database.models.SnippetDBModel;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.database.models.SshCertificateDBModel;
import com.server.auditor.ssh.client.database.models.SshKeyDBModel;
import com.server.auditor.ssh.client.database.models.TagDBModel;
import com.server.auditor.ssh.client.database.models.config.SshRemoteConfigDBModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.EntityChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.GroupChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.HostChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.IdentityChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.KnownHostChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.PackageChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.ProxyChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.RuleChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.SnippetChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.SshCertificateChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.SshKeyChangePasswordModel;
import com.server.auditor.ssh.client.synchronization.api.models.changepassword.TagChangePasswordModel;
import hg.f;

/* JADX INFO: loaded from: classes4.dex */
public class ChangePasswordConverters {

    public interface ConverterToApi<T, Ta extends EntityChangePasswordModel> {
        Ta toApiModel(T t10);
    }

    public static class GroupConverter implements ConverterToApi<GroupDBModel, GroupChangePasswordModel> {
        public GroupChangePasswordModel.SshConfig toSshConfigApiModel(SshRemoteConfigDBModel sshRemoteConfigDBModel) {
            if (sshRemoteConfigDBModel.getIdOnServer() > 0) {
                return new GroupChangePasswordModel.SshConfig(sshRemoteConfigDBModel.getEnvironmentVariables());
            }
            return null;
        }

        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public GroupChangePasswordModel toApiModel(GroupDBModel groupDBModel) {
            SshRemoteConfigDBModel itemByLocalId;
            GroupChangePasswordModel.SshConfig sshConfig = null;
            if (groupDBModel.getIdOnServer() <= 0) {
                return null;
            }
            Long sshConfigId = groupDBModel.getSshConfigId();
            if (sshConfigId != null && (itemByLocalId = f.p().S().getItemByLocalId(sshConfigId.longValue())) != null) {
                sshConfig = new GroupChangePasswordModel.SshConfig(itemByLocalId.getEnvironmentVariables());
            }
            return new GroupChangePasswordModel(groupDBModel.getIdOnServer(), groupDBModel.getTitle(), sshConfig, Boolean.valueOf(groupDBModel.isShared()), groupDBModel.getVaultKeyId().getId());
        }
    }

    public static class HostConverter implements ConverterToApi<HostDBModel, HostChangePasswordModel> {
        public HostChangePasswordModel.SshConfig toSshConfigApiModel(SshRemoteConfigDBModel sshRemoteConfigDBModel) {
            if (sshRemoteConfigDBModel.getIdOnServer() > 0) {
                return new HostChangePasswordModel.SshConfig(sshRemoteConfigDBModel.getEnvironmentVariables());
            }
            return null;
        }

        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public HostChangePasswordModel toApiModel(HostDBModel hostDBModel) {
            SshRemoteConfigDBModel itemByLocalId;
            HostChangePasswordModel.SshConfig sshConfig = null;
            if (hostDBModel.getIdOnServer() <= 0) {
                return null;
            }
            Long sshConfigId = hostDBModel.getSshConfigId();
            if (sshConfigId != null && (itemByLocalId = f.p().S().getItemByLocalId(sshConfigId.longValue())) != null) {
                sshConfig = new HostChangePasswordModel.SshConfig(itemByLocalId.getEnvironmentVariables());
            }
            return new HostChangePasswordModel(hostDBModel.getAddress(), hostDBModel.getTitle(), hostDBModel.getOsModelType().toString(), hostDBModel.getIdOnServer(), hostDBModel.getInteractionDate(), hostDBModel.getBackspaceType(), sshConfig, hostDBModel.isShared(), hostDBModel.getVaultKeyId().getId());
        }
    }

    public static class IdentityConverter implements ConverterToApi<IdentityDBModel, IdentityChangePasswordModel> {
        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public IdentityChangePasswordModel toApiModel(IdentityDBModel identityDBModel) {
            if (identityDBModel.getIdOnServer() > 0) {
                return new IdentityChangePasswordModel(identityDBModel.getUsername(), identityDBModel.getTitle(), identityDBModel.getPassword(), Boolean.valueOf(identityDBModel.isVisible()), identityDBModel.getIdOnServer(), Boolean.valueOf(identityDBModel.isShared()), identityDBModel.getVaultKeyId().getId());
            }
            return null;
        }
    }

    public static class KnownHostConverter implements ConverterToApi<KnownHostsDBModel, KnownHostChangePasswordModel> {
        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public KnownHostChangePasswordModel toApiModel(KnownHostsDBModel knownHostsDBModel) {
            return new KnownHostChangePasswordModel(knownHostsDBModel.getHostname(), knownHostsDBModel.getPublicKey(), knownHostsDBModel.getIdOnServer(), Boolean.valueOf(knownHostsDBModel.isShared()), knownHostsDBModel.getVaultKeyId().getId());
        }
    }

    public static class PackageConverter implements ConverterToApi<SnippetPackageDBModel, PackageChangePasswordModel> {
        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public PackageChangePasswordModel toApiModel(SnippetPackageDBModel snippetPackageDBModel) {
            if (snippetPackageDBModel.getIdOnServer() > 0) {
                return new PackageChangePasswordModel(snippetPackageDBModel.getLabel(), snippetPackageDBModel.getIdOnServer(), Boolean.valueOf(snippetPackageDBModel.isShared()), snippetPackageDBModel.getVaultKeyId().getId());
            }
            return null;
        }
    }

    public static class ProxyConverter implements ConverterToApi<ProxyDBModel, ProxyChangePasswordModel> {
        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public ProxyChangePasswordModel toApiModel(ProxyDBModel proxyDBModel) {
            return new ProxyChangePasswordModel(proxyDBModel.getType(), proxyDBModel.getHost(), Integer.valueOf(proxyDBModel.getPort()), proxyDBModel.getIdOnServer(), Boolean.valueOf(proxyDBModel.isShared()), proxyDBModel.getVaultKeyId().getId());
        }
    }

    public static class RuleConverter implements ConverterToApi<RuleDBModel, RuleChangePasswordModel> {
        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public RuleChangePasswordModel toApiModel(RuleDBModel ruleDBModel) {
            if (ruleDBModel.getIdOnServer() > 0) {
                return new RuleChangePasswordModel(ruleDBModel.getLabel(), ruleDBModel.getType(), ruleDBModel.getBoundAddress(), ruleDBModel.getHost(), Integer.valueOf(ruleDBModel.getLocalPort()), Integer.valueOf(ruleDBModel.getRemotePort()), ruleDBModel.getIdOnServer(), Boolean.valueOf(ruleDBModel.isShared()), ruleDBModel.getVaultKeyId().getId());
            }
            return null;
        }
    }

    public static class SnippetConverter implements ConverterToApi<SnippetDBModel, SnippetChangePasswordModel> {
        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public SnippetChangePasswordModel toApiModel(SnippetDBModel snippetDBModel) {
            if (snippetDBModel.getIdOnServer() > 0) {
                return new SnippetChangePasswordModel(snippetDBModel.getTitle(), snippetDBModel.getExpression(), Boolean.valueOf(snippetDBModel.getCloseAfterRunDefault()), snippetDBModel.getIdOnServer(), Boolean.valueOf(snippetDBModel.isShared()), snippetDBModel.getVaultKeyId().getId());
            }
            return null;
        }
    }

    public static class SshCertificateConverter implements ConverterToApi<SshCertificateDBModel, SshCertificateChangePasswordModel> {
        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public SshCertificateChangePasswordModel toApiModel(SshCertificateDBModel sshCertificateDBModel) {
            if (sshCertificateDBModel.getIdOnServer() > 0) {
                return new SshCertificateChangePasswordModel(sshCertificateDBModel.getMaterial(), sshCertificateDBModel.getIdOnServer(), Boolean.valueOf(sshCertificateDBModel.isShared()), sshCertificateDBModel.getVaultKeyId().getId());
            }
            return null;
        }
    }

    public static class SshKeyConverter implements ConverterToApi<SshKeyDBModel, SshKeyChangePasswordModel> {
        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public SshKeyChangePasswordModel toApiModel(SshKeyDBModel sshKeyDBModel) {
            return new SshKeyChangePasswordModel(sshKeyDBModel.getLabel(), sshKeyDBModel.getPassphrase(), sshKeyDBModel.getPrivateKey(), sshKeyDBModel.getPublicKey(), sshKeyDBModel.getIdOnServer(), Boolean.valueOf(sshKeyDBModel.isShared()), sshKeyDBModel.getVaultKeyId().getId());
        }
    }

    public static class TagConverter implements ConverterToApi<TagDBModel, TagChangePasswordModel> {
        @Override // com.server.auditor.ssh.client.synchronization.api.adapters.ChangePasswordConverters.ConverterToApi
        public TagChangePasswordModel toApiModel(TagDBModel tagDBModel) {
            if (tagDBModel.getIdOnServer() > 0) {
                return new TagChangePasswordModel(tagDBModel.getTitle(), tagDBModel.getIdOnServer(), Boolean.valueOf(tagDBModel.isShared()), tagDBModel.getVaultKeyId().getId());
            }
            return null;
        }
    }
}
