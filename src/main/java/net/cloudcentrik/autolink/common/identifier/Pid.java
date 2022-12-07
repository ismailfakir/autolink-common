package net.cloudcentrik.autolink.common.identifier;

import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@ToString
public class Pid {

    private final String domain;
    private final String uniqueId;

    private Pid(String domain, UUID uid){
        this.domain = domain;
        this.uniqueId = uid.toString().replace("-","");
    }

    public static final Pid create(String domain) {
        return new Pid(domain,UUID.randomUUID());
    }

    public String getDomain() {
        return domain;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public static final Pid create() {
        return new Pid("autolink",UUID.randomUUID());
    }


}
